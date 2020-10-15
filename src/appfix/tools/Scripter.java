package appfix.tools;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
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

import edu.emory.mathcs.backport.java.util.Arrays;
import quickfix.DataDictionary;
import quickfix.FieldNotFound;
import quickfix.Message;

public class Scripter {

	private static final Gson gson = new Gson();
	private static final String OBJECT = "model";
	private static Map<Integer, String> tagToNameMap = new HashMap<>();
	private static List<Class> listClass;
	private static final String GETTERS = "public quickfix.field.";

	static int k = 0;

	public static void main(String[] args) {

		listClass = new ArrayList<>();
		listClass.add(quickfix.fix44.MarketDataRequest.class);

		for (Class cl : listClass) {

			String nameClass = cl.getSimpleName();
			System.out.println("package appfix.model.message;");
			System.out.println("import java.util.List;");
			System.out.println("public class " + nameClass + " {"); // Start Model Class

			scriptClass(cl);

			System.out.println("}  // End Class " + nameClass); // End Model Class
		}
		
		
//		Map<String,String> mapAttributes = getterAttributs(listClass.get(0));
		
		// Generate fields (attributes) from Fix Message to Java Class Model
		// generateScriptFields(groupGetters);

		// Generate scripts of conversion from Message to Java class Convert
//		 generateScriptConvertMessageToObjectFields(mapAttributes);

		// Generate scripts for conversion from Java Object in Converter to Message
		// generateScriptConvertObjectToMessage(groupGetters);

	}

	/**
	 * Scripter class
	 * 
	 * @param clazz
	 */
	private static void scriptClass(Class clazz) {

		Map<String, String> mapAttributes = getterAttributs(clazz);

		generateScriptFields(mapAttributes);
		generateScriptForGetterSetter(mapAttributes);

		if (clazz.getDeclaredClasses() != null && clazz.getDeclaredClasses().length > 0) { // Start nested Model Classes
			for (int i = 0; i < clazz.getDeclaredClasses().length; i++) {

				String nameClass = clazz.getDeclaredClasses()[i].getSimpleName();

				String listName = "list" + nameClass;
				System.out.println("private List<" + nameClass + "> " + listName + ";");
				System.out.println("public List<" + nameClass + "> get" + upperFirstLetter(listName) + "() {return "
						+ listName + ";}");
				System.out.println("public void set" + upperFirstLetter(listName) + "(List<" + nameClass + "> "
						+ listName + ") {this." + listName + " = " + listName + ";}");

				System.out.println("public static class " + nameClass + "{"); // Start Model Class

				scriptClass(clazz.getDeclaredClasses()[i]);

				System.out.println("}  // End Class " + nameClass); // End Model Class
			}
		} // End nested model classes

	}

	private static Map<String, String> getterAttributs(Class cl) {

		Map<String, String> map = new TreeMap<>();

		Method[] methods = getAccessibleMethods(cl);
		for (int i = 0; i < methods.length; i++) {

			String method = methods[i].toString();

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

				if (p.contains(".")) {
					p = p.substring(p.lastIndexOf(".") + 1);
				}

				String type = p.trim();
				String var = clazz.getSimpleName();

				map.put(var, type); // var name of variables and type {String, char, int, double, etc}
			}

		}
		return map;
	}

	public static void generateScriptFields(Map<String, String> mapAttributes) {
		mapAttributes.forEach((key, value) -> {
			System.out.println("private " + value + " " + key + ";");
		});
	}

	public static void generateScriptForGetterSetter(Map<String, String> mapAttributes) {
		mapAttributes.forEach((var, type) -> {
			System.out.println("public " + type + " get" + var + "() {return " + var + ";}");
			System.out.println("public void set" + var + "(" + type + "  " + lowerFirstLetter(var) + ") {this." + var
					+ " = " + lowerFirstLetter(var) + ";}");
		});
	}

	/*
	 * End of Scripter classes
	 * 
	 * @param groupGetters
	 */

	
	public static void generateScriptConvertObjectToMessage(Map<String, String> groupGetters) {
		groupGetters.forEach((key, value) -> {

			if (value.equals("String")) {
				System.out.println("if (" + OBJECT + ".get" + key + "() != null && !" + OBJECT + ".get" + key
						+ "().isEmpty()){message.set(new quickfix.field." + key + "(" + OBJECT + ".get" + key
						+ "()));} //for String type");
			}
			if (value.equals("Char")) {
				System.out.println(
						"if (Character.isWhitespace(" + OBJECT + ".get" + key + "())) {message.set(new quickfix.field."
								+ key + "(" + OBJECT + ".get" + key + "()));} // for Char type");
			}

			if (value.equals("int")) {
				System.out.println("if (" + OBJECT + ".get" + key + "() != 0) {message.set(new quickfix.field." + key
						+ "(" + OBJECT + ".get" + key + "()));} //for int");
			}

			if (value.equals("LocalDateTime")) {
				System.out.println("if (" + OBJECT + ".get" + key + "() != null) {message.set(new quickfix.field." + key
						+ "(" + OBJECT + ".get" + key + "()));} // for LocalDateTime");
			}

			if (value.equals("double")) {
				System.out.println("if (" + OBJECT + ".get" + key + "() != 0.0) {message.set(new quickfix.field." + key
						+ "(" + OBJECT + ".get" + key + "()));} // for double");
			}

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

	public static void getSuperClass(String className) throws IllegalArgumentException, IllegalAccessException {

		Class<?> superClass = null;
		try {
			superClass = Class.forName(className).getSuperclass();
			System.out.println(superClass.getCanonicalName());

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static List<String> getNameNestedClass(String className) {
		Class<?>[] explicitClasses = null;
		List<String> list = new ArrayList<>();
		try {
			explicitClasses = Class.forName(className).getDeclaredClasses();
			if (explicitClasses != null && explicitClasses.length > 0) {
				for (int i = 0; i < explicitClasses.length; i++) {
					list.add(explicitClasses[i].getCanonicalName());
				}
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

	public static List<Class> getNestedClass(String canonicalNameClass) {
		Class<?>[] explicitClasses = null;
		List<Class> list = new ArrayList<>();
		try {
			explicitClasses = Class.forName(canonicalNameClass).getDeclaredClasses();
			if (explicitClasses != null && explicitClasses.length > 0) {
				for (int i = 0; i < explicitClasses.length; i++) {
					list.add(explicitClasses[i]);
				}
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void getTagsFromNestedClass(String className)
			throws IllegalArgumentException, IllegalAccessException {

		Field field;
		try {
			field = Class.forName("quickfix.fix44.MarketDataRequest$NoRelatedSym").getDeclaredField("ORDER");
			field.setAccessible(true);
			System.out.println(Arrays.toString((int[]) field.get(field.getName())) + " " + field.getName());

		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
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
		return str.substring(0, 1).toLowerCase() + str.substring(1);
	}

	public static String upperFirstLetter(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

}