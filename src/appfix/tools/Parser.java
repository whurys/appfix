package appfix.tools;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gson.Gson;

import quickfix.ConfigError;
import quickfix.DataDictionary;
import quickfix.Field;
import quickfix.FieldNotFound;
import quickfix.InvalidMessage;
import quickfix.Message;
import quickfix.MessageParseError;
import quickfix.StringField;
import quickfix.field.MsgType;

public class Parser {
	
	public static final char SOH_CHAR = '\001';
	public static final String SOH_STRING = String.valueOf(SOH_CHAR); // used to logs because SOH is not good in print logs

	public static void main(String[] args) {

		String msg = sanitize(MessageSamples.HEART_BEAT);
		
		try {
			MsgType msgType = Message.identifyType(msg);
			System.out.println(msgType);
		} catch (MessageParseError e1) {
			e1.printStackTrace();
		}
		
		Message m = stringMessageToMessageObject(MessageSamples.HEART_BEAT);
		

		try {
			System.out.println(m.getHeader().getString(MsgType.FIELD));
		} catch (FieldNotFound e) {
			e.printStackTrace();
		}
		
		System.out.println(m.toXML());
		
		DataDictionary dd = Parser.selectDictionary("FIX42");

		getFields(m).forEach((k, v) -> {
			System.out.print(k + " = " + v+"   "+dd.getFieldName(k)+ " ");
			if(dd.isField(k) && dd.isFieldValue(k, v) && dd.getValueName(k, v)!=null) {
				System.out.print(dd.getValueName(k, v));
				
			}
			
			System.out.println("");
		});
		

	}

	public static String sanitize(String message) {
		String s = new String();
		if (message.contains("‡")) {
			return message.replaceAll("‡", "");
		} 
		if(message.contains("|")) {
			return message.replace("|", SOH_STRING);
		}
		if(message.contains(";")) {
			return message.replace(";", SOH_STRING);
		}
		return message;
	}

	public static Message stringMessageToMessageObject(String originalMessage) {

		String message = sanitize(originalMessage);

		String messageType = null;
		String beginString = quickfix.MessageUtils.getStringField(message, quickfix.field.BeginString.FIELD);
		System.out.println("Begin Message = " + beginString);

		try {
			messageType = quickfix.MessageUtils.getMessageType(message);
			System.out.println("Message Type = " + messageType);
		} catch (InvalidMessage e) {
			e.printStackTrace();
		}

		DataDictionary dataDictionary = selectDictionary(beginString);
		try {
			return new Message(message, dataDictionary);
		} catch (InvalidMessage e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static Message stringMessageToMessageObject2(String originalMessage) throws InvalidMessage {

		String message = sanitize(originalMessage);

		String messageType = null;
		String beginString = quickfix.MessageUtils.getStringField(message, quickfix.field.BeginString.FIELD);
		System.out.println("Begin Message = " + beginString);

		try {
			messageType = quickfix.MessageUtils.getMessageType(message);
			System.out.println("Message Type = " + messageType);
		} catch (InvalidMessage e) {
			e.printStackTrace();
		}

		DataDictionary dataDictionary = selectDictionary(beginString);
		quickfix.fix44.Message msg = new quickfix.fix44.Message();
		
		return msg;

	}
	

	public static DataDictionary selectDictionary(String beginString) {
		DataDictionary dictionary = null;
		try {
			dictionary = new DataDictionary("C:\\Users\\Utilisateur\\eclipse-workspace\\fix-client\\WebContent\\resources\\DataDictionary\\"
					+ beginString.trim().replaceAll("\\.", "") + ".xml");
			dictionary.setAllowUnknownMessageFields(false);
		} catch (ConfigError e) {
			e.printStackTrace();
		}

		return dictionary;
	}
	
	public static Map<Integer, String> getFields(Message message) {
		
		Map<Integer, String> fields = new LinkedHashMap<>();

		Iterator<Field<?>> iHeader = message.getHeader().iterator();
		while (iHeader.hasNext()) {
			Field<?> f = iHeader.next();
			if (f instanceof StringField) {
				fields.put(f.getTag(), ((StringField) f).getValue());
			}
		}
		
		Iterator<Field<?>> iBody = message.iterator();
		while (iBody.hasNext()) {
			Field<?> f = iBody.next();
			if (f instanceof StringField) {
				fields.put(f.getTag(), ((StringField) f).getValue());
			}
		}
		
		Iterator<Field<?>> iTrailer = message.getTrailer().iterator();
		while (iTrailer.hasNext()) {
			Field<?> f = iTrailer.next();
			if (f instanceof StringField) {
				fields.put(f.getTag(), ((StringField) f).getValue());
			}
		}
		
		return fields;
	}

	public static Message ajustMessage(String message) throws InvalidMessage {
		if (message.endsWith(SOH_STRING)) {
            return new Message(message, false);
        } else {
            return new Message(message + SOH_STRING, false);
        }
	}
}
