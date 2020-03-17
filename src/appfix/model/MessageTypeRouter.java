package appfix.model;

import quickfix.FieldNotFound;
import quickfix.InvalidMessage;
import quickfix.Message.Header;
import quickfix.MessageParseError;
import quickfix.field.MsgType;

public class MessageTypeRouter {

	public static void main(String[] args) {
		
		
		quickfix.fix42.NewOrderSingle nos = new quickfix.fix42.NewOrderSingle();
		String msgType = nos.MSGTYPE;
		
		String messageString = "";
		String messageType = "";
		String beginString = "";
		
		//Session session = new Session();
		
		try {
			
			
			
			messageType = quickfix.MessageUtils.getMessageType(messageString);
			beginString = quickfix.MessageUtils.getStringField(messageString, quickfix.field.BeginString.FIELD);
			
		} catch (InvalidMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static void getType(quickfix.Message message){
		final Header header = message.getHeader();
       
		try {
			final String msgType = header.getString(MsgType.FIELD);
		} catch (FieldNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static MsgType getType(String message){
		MsgType msgType = null;
		try {
			msgType = quickfix.Message.identifyType(message);
			
		} catch (MessageParseError e) {
			e.printStackTrace();
		}
		return msgType;
	}
	
	public static void getType(quickfix.fix42.Message message){
		final Header header = message.getHeader();
       
		try {
			final String msgType = header.getString(MsgType.FIELD);
		} catch (FieldNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
