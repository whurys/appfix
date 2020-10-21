package appfix.tools;

import java.util.Iterator;

import quickfix.ConfigError;
import quickfix.DataDictionary;
import quickfix.Field;
import quickfix.FieldMap;
import quickfix.FieldNotFound;
import quickfix.Group;
import quickfix.Message;
import quickfix.field.MsgType;

public class FixPrinter {
	
	public void prettyPrinting(Message message) throws FieldNotFound, ConfigError {
		
		DataDictionary dd = new DataDictionary("FIX44.xml");
		
		String msgType = message.getHeader().getString(MsgType.FIELD);
		System.out.println(msgType);
		printFieldMap("", message);

	}

	private void printFieldMap(String prefix, FieldMap fieldMap) throws FieldNotFound {

		Iterator<Field<?>> fieldIterator = fieldMap.iterator();
		while (fieldIterator.hasNext()) {
			Field<?> field = (Field<?>) fieldIterator.next();
			String value = fieldMap.getString(field.getTag());
			System.out.println(prefix + field.getTag() + ": " + value);
		}

		Iterator<?> groupsKeys = fieldMap.groupKeyIterator();
		while (groupsKeys.hasNext()) {
			int groupCountTag = ((Integer) groupsKeys.next()).intValue();
			System.out.println(prefix + groupCountTag + ": count = " + fieldMap.getInt(groupCountTag));
			Group g = new Group(groupCountTag, 0);
			int i = 1;
			while (fieldMap.hasGroup(i, groupCountTag)) {
				if (i > 1) {
					System.out.println(prefix + "  ----");
				}
				fieldMap.getGroup(i, g);
				printFieldMap(prefix + "  ", g);
				i++;
			}
		}
	}

}
