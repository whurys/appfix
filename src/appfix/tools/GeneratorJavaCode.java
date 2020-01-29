package appfix.tools;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.google.gson.Gson;

public class GeneratorJavaCode {

	private static final Gson gson = new Gson();

	private static Map<Integer, String> tagToNameMap = new HashMap<>();

	private static List<Class> listNewOrderSingle;

	private static final String GETTERS = "public quickfix.field."; // "public quickfix"

	public static void main(String[] args) {

		listNewOrderSingle = new ArrayList<>();
		// listNewOrderSingle.add(appfix.model.Header.class);
		listNewOrderSingle.add(quickfix.fix42.NewOrderSingle.class);

		Map<String, String> groupGetters = new TreeMap<>();

		for (Class cl : listNewOrderSingle) {

			Method[] methods = getAccessibleMethods(cl);

			System.out.println(methods.length);

			for (int i = 0; i < methods.length; i++) {

				String method = methods[i].toString();

				// System.out.println( method );

//				if (method.contains(GETTERS)) {
//					Class clazz = methods[i].getReturnType();
//					groupGetters.put(clazz.getSimpleName(), clazz.getCanonicalName());
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

					if (p.contains(".")) {
						p = p.substring(p.lastIndexOf(".") + 1);
					}

					groupGetters.put(clazz.getSimpleName(), p.trim());
				}

			}

		}

		// Print code
		printCodeToMessageGeneral(groupGetters);

	}

	private static void printCodeToBean(Map<String, String> map) {

		map.forEach((key, value) -> {
			System.out.println("private " + value + " " + key + ";");
		});

	}

	private static void printCodeToConvertSpecific(Map<String, String> map) {

		map.forEach((key, value) -> {
			String field = lowerFirstLetter(key);
			System.out.println("quickfix.field." + key + " " + field + " = " + "new quickfix.field." + key + "();"
					+ " if(message.isSet(" + field + ")) {try {message.get(" + field + ");order.set" + key + "(" + field
					+ ".getValue());} catch (FieldNotFound ex) {}}");

		});

	}

	private static void printCodeToConvertGeneral(Map<String, String> map) {

		map.forEach((key, value) -> {
			String field = lowerFirstLetter(key);
			System.out.println("quickfix.field." + key + " " + field + " = " + "new quickfix.field." + key + "();"
					+ " if(message.isSetField(" + field + ")) {try {message.getField(" + field + ");order.set" + key
					+ "(" + field + ".getValue());} catch (FieldNotFound ex) {}}");
		});

	}
	
	private static void printCodeToMessageSpecific(Map<String, String> map) {

		map.forEach((key, value) -> {
			if (value.equals("String")) {
				System.out.println("if (order.get" + key + "() != null && !order.get" + key
						+ "().isEmpty()){message.set(new quickfix.field." + key + "(order.get" + key
						+ "()));} //for String type");
			}
			if (value.equals("Char")) {
				System.out
						.println("if (Character.isWhitespace(order.get" + key + "())) {message.set(new quickfix.field."
								+ key + "(order.get" + key + "()));} // for Char type");
			}

			if (value.equals("int")) {
				System.out.println("if (order.get" + key + "() != 0) {message.set(new quickfix.field." + key
						+ "(order.get" + key + "()));} //for int");
			}

			if (value.equals("LocalDateTime")) {
				System.out.println("if (order.get" + key + "() != null) {message.set(new quickfix.field." + key
						+ "(order.get" + key + "()));} // for LocalDateTime");
			}

			if (value.equals("double")) {
				System.out.println("if (order.get" + key + "() != 0.0) {message.set(new quickfix.field." + key
						+ "(order.get" + key + "()));} // for double");
			}
		});

	}
	
	private static void printCodeToMessageGeneral(Map<String, String> map) {

		map.forEach((key, value) -> {
			if (value.equals("String")) {
				System.out.println("if (order.get" + key + "() != null && !order.get" + key
						+ "().isEmpty()){message.setField(new quickfix.field." + key + "(order.get" + key
						+ "()));} //for String type");
			}
			if (value.equals("Char")) {
				System.out
						.println("if (Character.isWhitespace(order.get" + key + "())) {message.setField(new quickfix.field."
								+ key + "(order.get" + key + "()));} // for Char type");
			}

			if (value.equals("int")) {
				System.out.println("if (order.get" + key + "() != 0) {message.setField(new quickfix.field." + key
						+ "(order.get" + key + "()));} //for int");
			}

			if (value.equals("LocalDateTime")) {
				System.out.println("if (order.get" + key + "() != null) {message.setField(new quickfix.field." + key
						+ "(order.get" + key + "()));} // for LocalDateTime");
			}

			if (value.equals("double")) {
				System.out.println("if (order.get" + key + "() != 0.0) {message.setField(new quickfix.field." + key
						+ "(order.get" + key + "()));} // for double");
			}
		});

	}
	
	


	public static String lowerFirstLetter(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
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

}