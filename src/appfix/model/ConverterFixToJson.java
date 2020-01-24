package appfix.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import quickfix.FieldNotFound;
import quickfix.Message;

public class ConverterFixToJson {

	private static final Gson gson = new Gson();

	private static Map<Integer, String> tagToNameMap = new HashMap<>();

	private static final String FIX_40 = "fix40";
	private static final String FIX_41 = "fix41";
	private static final String FIX_42 = "fix42";
	private static final String FIX_43 = "fix43";
	private static final String FIX_44 = "fix44";
	private static final String FIX_50 = "fix50";

	private static final Class CLASS_FIX40_EXECUTION = quickfix.fix40.ExecutionReport.class;
	private static final Class CLASS_FIX40_EMAIL = quickfix.fix40.Email.class;

	private static final Class CLASS_FIX40 = quickfix.fix40.NewOrderSingle.class;
	private static final Class CLASS_FIX41 = quickfix.fix41.NewOrderSingle.class;
	private static final Class CLASS_FIX42 = quickfix.fix42.NewOrderSingle.class;
	private static final Class CLASS_FIX43 = quickfix.fix43.NewOrderSingle.class;
	private static final Class CLASS_FIX44 = quickfix.fix44.NewOrderSingle.class;
	private static final Class CLASS_FIX50 = quickfix.fix50.NewOrderSingle.class;

	private static List<Class> listNewOrderSingle;

//	private static final String IS_SET = "public boolean quickfix.fix42.NewOrderSingle.isSet(quickfix.field.";
//	private static final String SETTERS = "public void quickfix.fix42.NewOrderSingle.set(quickfix.field.";
	private static final String GETTERS = "public quickfix.field.";

	static int k = 0;

	public static void main(String[] args) {

		listNewOrderSingle = new ArrayList<>();

//		listNewOrderSingle.add(quickfix.fix40.NewOrderSingle.class);
//		listNewOrderSingle.add(quickfix.fix41.NewOrderSingle.class);
//		listNewOrderSingle.add(quickfix.fix42.NewOrderSingle.class);
//		listNewOrderSingle.add(quickfix.fix43.NewOrderSingle.class);
//		listNewOrderSingle.add(quickfix.fix44.NewOrderSingle.class);
		listNewOrderSingle.add(quickfix.fix50.NewOrderSingle.class);

//    	getTagToNameMap("quickfix.field").forEach((k,v)-> System.out.println(k+" : "+v));
//    	
//    	getTagToNameMap("quickfix.field").forEach((key,value)-> tagToNameMap.put(key, value));
//    	
//    	Message message = new quickfix.fix42.NewOrderSingle();
//		System.out.println(message);
//		System.out.println(ConverterFixToJson.fix2Json(message));

		Set<String> setGroupIsSet = new HashSet<>();
		Set<String> setGroupSetters = new HashSet<>();
		Set<String> setGroupGetters = new TreeSet<>();

		Map<String, String> groupGetters = new TreeMap<>();

		for (Class cl : listNewOrderSingle) {

			Method[] methods = getAccessibleMethods(cl);
			for (int i = 0; i < methods.length; i++) {

				String method = methods[i].toString();

				// System.out.println(method);

//				if (method.startsWith(IS_SET)) {
//					Class[] parameters = methods[i].getParameterTypes();
//					for (Class clazz : parameters) {
//						setGroupIsSet.add(clazz.getName());
//					}
//				}
				//
//				if (method.startsWith(SETTERS)) {
//					Class[] parameters = methods[i].getParameterTypes();
//					for (Class clazz : parameters) {
//						setGroupSetters.add(clazz.getName());
//					}
//				}

				if (method.startsWith(GETTERS)) {
					Class clazz = methods[i].getReturnType();

					Constructor[] constructors = clazz.getConstructors();
					String p = "";
					for (int c = 0; c < constructors.length; c++) {

						Class[] parameters = constructors[c].getParameterTypes();
						for (Class type : parameters) {
							p += type.getName() + "  ";
						}
					}

					setGroupGetters.add(clazz.getSimpleName());
					if (p.contains(".")) {
						p = p.substring(p.lastIndexOf(".") + 1);
					}

					groupGetters.put(clazz.getSimpleName(), p.trim());
				}

			}

		}

		// System.out.println("setGroupGetters = " + setGroupGetters.size());

		// k=0;

		groupGetters.forEach((key, value) -> {
			// k++;
			//System.out.println("private "+value+" "+key+";");
			
//			if (value.equals("String")) {
//				System.out.println("if (order.get"+key+"() != null && !order.get"+key+"().isEmpty()){message.set(new quickfix.field."+key+"(order.get"+key+"()));} //for String type");
//			}
//			if (value.equals("Char")) {
//				System.out.println("if (Character.isWhitespace(order.get"+key+"())) {message.set(new quickfix.field."+key+"(order.get"+key+"()));} // for Char type");
//			}
//
//			if (value.equals("int")) {
//				System.out.println("if (order.get"+key+"() != 0) {message.set(new quickfix.field."+key+"(order.get"+key+"()));} //for int");
//			}
//
//			if (value.equals("LocalDateTime")) {
//				System.out.println("if (order.get"+key+"() != null) {message.set(new quickfix.field."+key+"(order.get"+key+"()));} // for LocalDateTime");
//			}
//
//			if (value.equals("double")) {
//				System.out.println("if (order.get"+key+"() != 0.0) {message.set(new quickfix.field."+key+"(order.get"+key+"()));} // for double");
//			}
			String field = lowerFirstLetter(key);
	
			System.out.println("quickfix.field."+key+" "+ field + " = "+ "new quickfix.field."+key+"();"+" if(message.isSet("+field+")) {try {message.get("+field+");order.set"+key+"("+field+".getValue());} catch (FieldNotFound ex) {}}");
			
		});

		

	}

	public static Method[] getAccessibleMethods(Class clazz) {
		List<Method> result = new ArrayList<Method>();
		while (clazz != null) {
			for (Method method : clazz.getDeclaredMethods()) {
				int modifiers = method.getModifiers();
				if (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers)) {
					result.add(method);
				}
			}
			clazz = clazz.getSuperclass();
		}
		return result.toArray(new Method[result.size()]);
	}

	

	public static String fix2Json(Message message) {
		JsonObject jsonObject = new JsonObject();

		quickfix.Message.Header header = message.getHeader();
		Iterator<quickfix.Field<?>> headerIterator = header.iterator();
		while (headerIterator.hasNext()) {
			quickfix.Field<?> field = headerIterator.next();

			String name = tagToNameMap.get(field.getTag());
			if (name == null) {
				name = String.valueOf(field.getTag());
			}
			try {
				jsonObject.addProperty(name, header.getString(field.getTag()));
			} catch (FieldNotFound fieldNotFound) {
				// ignore, should not happen
			}
		}

		Iterator<quickfix.Field<?>> bodyIterator = message.iterator();
		while (bodyIterator.hasNext()) {
			quickfix.Field<?> field = bodyIterator.next();

			String name = tagToNameMap.get(field.getTag());
			if (name == null) {
				name = String.valueOf(field.getTag());
			}
			try {
				jsonObject.addProperty(name, message.getString(field.getTag()));
			} catch (FieldNotFound fieldNotFound) {
				// ignore, should not happen
			}
		}

		jsonObject.addProperty("RawData", message.toString());

		return gson.toJson(jsonObject);
	}
	
	
	public static String lowerFirstLetter(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
}