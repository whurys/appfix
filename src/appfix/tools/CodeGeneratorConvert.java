package appfix.tools;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import quickfix.DataDictionary;
import quickfix.Field;
import quickfix.FieldMap;
import quickfix.FieldNotFound;
import quickfix.Group;
import quickfix.Message;
import quickfix.field.MsgType;

public class CodeGeneratorConvert {

	private static List<Class> listClass;
	private static final String GETTERS = "public quickfix.field.";

//	public static void main(String[] args) throws Exception {
//
//		listClass = new ArrayList<>();
//		listClass.add(quickfix.fix44.MarketDataRequest.class);
//
//		for (Class cl : listClass) {
//
//			System.out.println("package appfix.model.message;");
//			System.out.println("import quickfix.FieldMap;");
//			System.out.println("import quickfix.Field;");
//			System.out.println("import quickfix.FieldNotFound;");
//			System.out.println("import quickfix.Group;");
//			System.out.println("import java.util.List;");
//			System.out.println("import java.util.ArrayList;");
//			System.out.println("import java.util.Iterator;");
//
//			String nameClass = cl.getSimpleName() + "Converter";
//
//			System.out.println("public class " + nameClass + "{"); // Start  Class
//
//			String methodName = cl.getSimpleName();
//			System.out.println(
//					"public static " + methodName + " fromMessageToModel(FieldMap fieldMap) throws FieldNotFound {");
//
//			scriptClass(cl);
//
//			System.out.println("return " + lowerFirstLetter(methodName) + ";");
//			System.out.println("}");
//
//			System.out.println("}  // End Class " + nameClass); // End Models
//		}
//
//	}

	private static void scriptClass(Class clazz) {

		Map<String, String> mapAttributes = getterAttributs(clazz);

		System.out.println(clazz.getSimpleName() + " " + lowerFirstLetter(clazz.getSimpleName()) + " =  new "
				+ clazz.getSimpleName() + "();");

		System.out.println(
				"Iterator<Field<?>> fieldIterator = fieldMap.iterator();while (fieldIterator.hasNext()) {Field<?> field = (Field<?>) fieldIterator.next();");

		System.out.println("switch (field.getTag()) {");
		generateScriptFields(mapAttributes, lowerFirstLetter(clazz.getSimpleName()));
		System.out.println("}");

		System.out.println("}");

		if (hasMoreGroup(clazz)) { //

			generateGroupSwitch(clazz);

		}

	}

	public static String replacePackage(String className) {
		return className.replace("quickfix.fix44.", "appfix.model.message.").replace("$", ".");
	}

	public static void generateGroupSwitch(Class clazz) {

		for (int i = 0; i < clazz.getDeclaredClasses().length; i++) {
			String nameClass = clazz.getDeclaredClasses()[i].getSimpleName();
			String listName = "list" + nameClass;
			String finalClassName = clazz.getDeclaredClasses()[i].getName();
			System.out.println("List<" + replacePackage(finalClassName) + "> " + listName + " = new ArrayList<>();");
		}
		System.out.println("Iterator<?> groupsKeys" + clazz.getSimpleName() + " = fieldMap.groupKeyIterator();");
		System.out.println("while (groupsKeys" + clazz.getSimpleName() + ".hasNext()) {");
		System.out.println("int groupCountTag" + clazz.getSimpleName() + " = ((Integer) groupsKeys" + clazz.getSimpleName() + ".next()).intValue();"); 
		System.out.println("Group g"+ clazz.getSimpleName() + " = new Group(groupCountTag" + clazz.getSimpleName() + ", 0); ");
		System.out.println("int i"+ clazz.getSimpleName() + " = 1;");
		System.out.println("while (fieldMap.hasGroup(i"+ clazz.getSimpleName() + ", groupCountTag" + clazz.getSimpleName() + ")) {");
		System.out.println("fieldMap.getGroup(i"+ clazz.getSimpleName() + ", g"+ clazz.getSimpleName() + ");switch (groupCountTag"+clazz.getSimpleName() + ") {");

		for (int i = 0; i < clazz.getDeclaredClasses().length; i++) {

			Class classGroup = clazz.getDeclaredClasses()[i];
			Map<String, String> mapAttributesGroup = getterAttributs(classGroup);
			System.out.println("case quickfix.field." + classGroup.getSimpleName() + ".FIELD:");
			System.out.println(replacePackage(classGroup.getName()) + " " + lowerFirstLetter(classGroup.getSimpleName()) + " = new " + replacePackage(classGroup.getName()) + "();");
			System.out.println("Iterator<Field<?>> fieldIterator" + classGroup.getSimpleName() + " = g"+ clazz.getSimpleName() + ".iterator();");

			System.out.println("while (fieldIterator" + classGroup.getSimpleName() + ".hasNext()) {"
					+ "Field<?> field = (Field<?>) fieldIterator" + classGroup.getSimpleName()
					+ ".next();switch (field.getTag()) {");

			generateScriptGroups(mapAttributesGroup, lowerFirstLetter(classGroup.getSimpleName()) + "", "g"+ clazz.getSimpleName());

			System.out.println("}}");

			if (hasMoreGroup(classGroup)) { // recursive method
				generateGroupSwitch(classGroup);
			}

			String nameClass = clazz.getDeclaredClasses()[i].getSimpleName();
			String listName = "list" + nameClass;
			System.out.println(listName + ".add(" + lowerFirstLetter(classGroup.getSimpleName()) + ");");
			System.out.println("break;");

		}

		System.out.println("}// End of Switch Case Groups");
		System.out.println("i"+ clazz.getSimpleName() +"++;");
		System.out.println("}}");

		for (int i = 0; i < clazz.getDeclaredClasses().length; i++) {
			String nameClass = clazz.getDeclaredClasses()[i].getSimpleName();
			String listName = "list" + nameClass;
			System.out.println(lowerFirstLetter(clazz.getSimpleName()) + ".set" + upperFirstLetter(listName) + "("
					+ listName + ");");
		}

	}

	public static void generateScriptFields(Map<String, String> mapAttributes, String modelName) {
		mapAttributes.forEach((fieldName, fieldType) -> {
			System.out.println("case quickfix.field." + fieldName + ".FIELD:" + modelName + ".set" + fieldName
					+ "(fieldMap.get" + upperFirstLetter(fieldType) + "(field.getTag()));break;");
		});
	}

	public static void generateScriptGroups(Map<String, String> mapAttributes, String modelName, String g) {
		mapAttributes.forEach((fieldName, fieldType) -> {
			System.out.println("case quickfix.field." + fieldName + ".FIELD:" + modelName + ".set" + fieldName
					+ "("+g+".get" + upperFirstLetter(fieldType) + "(field.getTag()));break;");
		});
	}

	public static boolean hasMoreGroup(Class clazz) {
		return clazz.getDeclaredClasses() != null && clazz.getDeclaredClasses().length > 0;
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

	


	public static void main(String[] args) throws Exception {

		listClass = new ArrayList<>();
		listClass.add(quickfix.fix44.MarketDataRequest.class);

		for (Class cl : listClass) {

			System.out.println("public static "+cl.getName()+" fromModel(appfix.model.message."+cl.getSimpleName()+" "+lowerFirstLetter(cl.getSimpleName())+") {");
			
			System.out.println(cl.getName()+" message = new "+cl.getName()+"();");
			
			scriptConvertModel(cl);

			System.out.println("return message;");
			System.out.println("}");

		}

	}

	
	private static void scriptConvertModel(Class clazz) {

		Map<String, String> mapAttributes = getterAttributs(clazz);

		generateScriptConvertModelToMessage(mapAttributes, lowerFirstLetter(clazz.getSimpleName()),"message");

		if (hasMoreGroup(clazz)) { //
			
			Class[] classes = clazz.getDeclaredClasses();
			
			for (Class cl : classes) {
				
				Map<String, String> mapAttributesGroup = getterAttributs(cl);
				
				String type = "appfix.model.message."+clazz.getSimpleName()+"."+cl.getSimpleName();
				String list = "list"+cl.getSimpleName();
				System.out.println("List<"+type+"> "+ list+" = "+lowerFirstLetter(clazz.getSimpleName())+".get"+upperFirstLetter(list)+"();");
				
				System.out.println("for("+type+" "+lowerFirstLetter(cl.getSimpleName())+":"+list+") {");
				
				String group = "group"+cl.getSimpleName();
				
				System.out.println(clazz.getName()+"."+cl.getSimpleName()+" "+ group + " = new "+clazz.getName()+"."+cl.getSimpleName()+"();");
					
					generateScriptConvertModelToMessage(mapAttributesGroup, lowerFirstLetter(cl.getSimpleName()), group);
				
				System.out.println("message.addGroup("+group+");");
				System.out.println("}");
			}
		}

	}

	
	public static void generateScriptConvertModelToMessage(Map<String, String> groupGetters, String OBJECT, String group) {
		groupGetters.forEach((key, value) -> {
		
			if (value.equals("String")) {
				System.out.println("if ("+OBJECT+".get" + key + "() != null && !"+OBJECT+".get" + key
						+ "().isEmpty()){"+group+".set(new quickfix.field." + key + "("+OBJECT+".get" + key
						+ "()));} //for String type");
			}
			if (value.equals("Char")) {
				System.out
						.println("if (!Character.isWhitespace("+OBJECT+".get" + key + "())) {"+group+".set(new quickfix.field."
								+ key + "("+OBJECT+".get" + key + "()));} // for Char type");
			}

			if (value.equals("int")) {
				System.out.println("if ("+OBJECT+".get" + key + "() != 0) {"+group+".set(new quickfix.field." + key
						+ "("+OBJECT+".get" + key + "()));} //for int");
			}

			if (value.equals("LocalDateTime")) {
				System.out.println("if ("+OBJECT+".get" + key + "() != null) {"+group+".set(new quickfix.field." + key
						+ "("+OBJECT+".get" + key + "()));} // for LocalDateTime");
			}

			if (value.equals("double")) {
				System.out.println("if ("+OBJECT+".get" + key + "() != 0.0) {"+group+".set(new quickfix.field." + key
						+ "("+OBJECT+".get" + key + "()));} // for double");
			}

		});
	}
	
	
	
	
	
	public static String lowerFirstLetter(String str) {
		return str.substring(0, 1).toLowerCase() + str.substring(1);
	}

	public static String upperFirstLetter(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

}