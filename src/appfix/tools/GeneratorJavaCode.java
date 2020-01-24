package appfix.tools;

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

	private static final String GETTERS = "public quickfix.field.";


	public static void main(String[] args) {

		listNewOrderSingle = new ArrayList<>();
		listNewOrderSingle.add(quickfix.fix44.Message.class);

		Map<String, String> groupGetters = new TreeMap<>();

		for (Class cl : listNewOrderSingle) {

			Method[] methods = getAccessibleMethods(cl);
			
			System.out.println(methods.length);
			
			
			for (int i = 0; i < methods.length; i++) {

				String method = methods[i].toString();
				
				System.out.println( method );

				if (method.contains(GETTERS)) {
					Class clazz = methods[i].getReturnType();
					groupGetters.put(clazz.getSimpleName(), clazz.getCanonicalName());
				}

			}

		}

		groupGetters.forEach((key, value) -> {
			System.out.println(value+" "+key+";");
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


}