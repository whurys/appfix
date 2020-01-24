package appfix.model;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import quickfix.field.Account;


public class DynamicallyInstance {

	public static void main(String[] args) throws Exception {
		List<String> parameters = new ArrayList<>();
		parameters.add("Karlos");

		
		Account account = new Account("wendel fffff");
		
		Class c = Class.forName(account.getClass().getName());
		
		Account account2 = (Account) instantiate(parameters, Account.class.getName());
		

		System.out.println(account.getValue());
		System.out.println(account2.getValue());
		System.out.println(instantiate(parameters, c.getName()));
		
	}
	
	static Object instantiate(List<String> args, String className) throws Exception {
	    // Load the class.
	    Class<?> clazz = Class.forName(className);

	    // Search for an "appropriate" constructor.
	    for (Constructor<?> ctor : clazz.getConstructors()) {
	        Class<?>[] paramTypes = ctor.getParameterTypes();

	        // If the arity matches, let's use it.
	        if (args.size() == paramTypes.length) {

	            // Convert the String arguments into the parameters' types.
	            Object[] convertedArgs = new Object[args.size()];
	            for (int i = 0; i < convertedArgs.length; i++) {
	                convertedArgs[i] = convert(paramTypes[i], args.get(i));
	            }

	            // Instantiate the object with the converted arguments.
	            return ctor.newInstance(convertedArgs);
	        }
	    }

	    throw new IllegalArgumentException("Don't know how to instantiate " + className);
	}

	/**
	 * The values are provided as Strings, but your object will store them as
	 * double, long, int, etc. So we need a function that parses a String into the
	 * appropriate target type:
	 * 
	 * @param target
	 * @param s
	 * @return
	 */
	static Object convert(Class<?> target, String s) {
		if (target == Object.class || target == String.class || s == null) {
			return s;
		}
		if (target == Character.class || target == char.class) {
			return s.charAt(0);
		}
		if (target == Byte.class || target == byte.class) {
			return Byte.parseByte(s);
		}
		if (target == Short.class || target == short.class) {
			return Short.parseShort(s);
		}
		if (target == Integer.class || target == int.class) {
			return Integer.parseInt(s);
		}
		if (target == Long.class || target == long.class) {
			return Long.parseLong(s);
		}
		if (target == Float.class || target == float.class) {
			return Float.parseFloat(s);
		}
		if (target == Double.class || target == double.class) {
			return Double.parseDouble(s);
		}
		if (target == Boolean.class || target == boolean.class) {
			return Boolean.parseBoolean(s);
		}
		throw new IllegalArgumentException("Don't know how to convert to " + target);
	}

}
