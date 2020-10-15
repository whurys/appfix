package appfix.tools;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.TreeMap;

public class Inspector {

	private static final String FIELD = "quickfix.field.";

	public static void main(String[] args) {
		Map<String, String> map = getFieldsAndValues("AdvSide");
		map.forEach((k, v) -> System.out.println(k + " : " + v));

	}

	public static Map<String, String> getFieldsAndValues(String className) {

		Map<String, String> mapFieldAndValue = new TreeMap<>();

		Class<?> clazz = null;
		try {
			clazz = Class.forName(FIELD + className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			if (!field.getName().equals("serialVersionUID") && !field.getName().equals("FIELD")) {
				try {
					mapFieldAndValue.put(field.getName(), String.valueOf(field.get(field.getName())));
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}

		return mapFieldAndValue;
	}

}
