package appfix.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import com.google.gson.Gson;

import quickfix.ConfigError;
import quickfix.DataDictionary;
import quickfix.InvalidMessage;
import quickfix.Message;
import quickfix.field.Account;
import quickfix.field.ClOrdID;
import quickfix.field.HandlInst;
import quickfix.field.OrdType;
import quickfix.field.OrderQty;
import quickfix.field.Price;
import quickfix.field.SecurityExchange;
import quickfix.field.SecurityID;
import quickfix.field.Side;
import quickfix.field.Signature;
import quickfix.field.SignatureLength;
import quickfix.field.Symbol;
import quickfix.field.TransactTime;
import quickfix.fix42.NewOrderSingle;

public class OrderFactory {
	
	private static Gson g = new Gson();

	public static NewOrderSingle createOrder() {

		NewOrderSingle fixOrder = new NewOrderSingle();
		
		fixOrder.set(new TransactTime(LocalDateTime.now()));
		fixOrder.set(new HandlInst('1'));
		fixOrder.set(new Account("Account Wendel"));
		fixOrder.set(new Symbol("GOOGL.O"));
		fixOrder.set(new SecurityID("1212"));
		fixOrder.set(new SecurityExchange("NSQ"));
		fixOrder.set(new Price(new BigDecimal("100.0").doubleValue()));
		fixOrder.set(new Side(Side.BUY));
		fixOrder.set(new OrderQty(new BigDecimal("100.0").longValue()));
		fixOrder.set(new OrdType(OrdType.LIMIT));
		fixOrder.set(new ClOrdID("ID-"));

		return fixOrder;
	}
	
	public static NewOrderSingle createOrderWithConstructor() {

		return new NewOrderSingle(
				new ClOrdID("123456"), 
				new HandlInst('1'), 
				new Symbol("GOOGL.O"), 
				new Side(Side.BUY), 
				new TransactTime(LocalDateTime.now()), 
				new OrdType(OrdType.LIMIT)
				);
	}

	public void testRepeatingField() throws Exception {
		final NewOrderSingle order = createNewOrderSingle();

		order.getTrailer().setField(new Signature("FOO"));
		order.getTrailer().setField(new SignatureLength(3));

	}

	public NewOrderSingle createNewOrderSingle() {
		return new NewOrderSingle(new ClOrdID("CLIENT"),
				new HandlInst(HandlInst.AUTOMATED_EXECUTION_ORDER_PUBLIC_BROKER_INTERVENTION_OK), 
				new Symbol("ORCL"),
				new Side(Side.BUY), 
				new TransactTime(LocalDateTime.ofEpochSecond(0, 0, ZoneOffset.UTC)),
				new OrdType(OrdType.LIMIT));
	}
	
	public static NewOrderSingle createNewFromString () throws InvalidMessage {
		
		DataDictionary customSessionDictionary;
		DataDictionary standardSessionDictionary = null ;
		DataDictionary applicationDictionary = null ;
		
		try {
			customSessionDictionary = new DataDictionary("FIXT11_Custom_Test.xml");
			customSessionDictionary.setAllowUnknownMessageFields(false);
			
			standardSessionDictionary = new DataDictionary("FIXT11.xml");
	        standardSessionDictionary.setAllowUnknownMessageFields(false);

	        applicationDictionary = new DataDictionary("FIX50.xml");
	        applicationDictionary.setAllowUnknownMessageFields(false);

		} catch (ConfigError e) {
			e.printStackTrace();
		}
        
        final String sep = "\001";
        final StringBuilder sb = new StringBuilder();
        sb.append("8=FIXT1.1");
        sb.append(sep);
        sb.append("9=112");
        sb.append(sep);
        sb.append("35=6");
        sb.append(sep);
        sb.append("49=SENDER_COMP_ID");
        sb.append(sep);
        sb.append("56=TARGET_COMP_ID");
        sb.append(sep);
        sb.append("34=20");
        sb.append(sep);
        sb.append("52=20120922-11:00:00");
        sb.append(sep);
        sb.append("12312=foo");
        sb.append(sep);
        sb.append("23=123456");
        sb.append(sep);
        sb.append("28=N");
        sb.append(sep);
        sb.append("55=[N/A]");
        sb.append(sep);
        sb.append("54=1");
        sb.append(sep);
        sb.append("27=U");
        sb.append(sep);
        sb.append("10=52");
        sb.append(sep);
        final String messageData = sb.toString();

        final Message standardMessage = new Message(messageData, standardSessionDictionary, applicationDictionary, true);
		return null;

	}
	
	public static void testMsg() {
		try {
			final Message message = new Message("8=FIX.4.2\0019=40\00135=A\001"
			        + "98=0\001384=2\001372=D\001385=R\001372=8\001385=S\00110=96\001",
			        new DataDictionary("FIX44.xml"));
		} catch (InvalidMessage | ConfigError e) {
			e.printStackTrace();
		}
	}

}
