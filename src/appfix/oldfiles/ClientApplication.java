package appfix.oldfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

import quickfix.Application;
import quickfix.ConfigError;
import quickfix.DefaultMessageFactory;
import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.FileStoreFactory;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.Initiator;
import quickfix.LogFactory;
import quickfix.Message;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.RejectLogon;
import quickfix.ScreenLogFactory;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionNotFound;
import quickfix.SessionSettings;
import quickfix.SocketInitiator;
import quickfix.UnsupportedMessageType;
import quickfix.field.ClOrdID;
import quickfix.field.HandlInst;
import quickfix.field.OrdType;
import quickfix.field.Side;
import quickfix.field.Symbol;
import quickfix.field.TransactTime;
import quickfix.fix44.NewOrderSingle;

public class ClientApplication implements Application {

    private static volatile SessionID sessionID;

    @Override
    public void onCreate(SessionID sessionID) {
        System.out.println("OnCreate");
    }

    @Override
    public void onLogon(SessionID sessionID) {
        System.out.println("OnLogon");
        ClientApplication.sessionID = sessionID;
    }

    @Override
    public void onLogout(SessionID sessionID) {
        System.out.println("OnLogout");
        ClientApplication.sessionID = null;
    }

    @Override
    public void toAdmin(Message message, SessionID sessionID) {
        System.out.println("ToAdmin");
    }

    @Override
    public void fromAdmin(Message message, SessionID sessionID) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
        System.out.println("FromAdmin");
    }

    @Override
    public void toApp(Message message, SessionID sessionID) throws DoNotSend {
        System.out.println("ToApp: " + message);
    }

    @Override
    public void fromApp(Message message, SessionID sessionID) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        System.out.println("FromApp");
    }

    public static void main(String[] args) throws ConfigError, FileNotFoundException, InterruptedException, SessionNotFound {
       
    	//SessionSettings settings = new SessionSettings("res/initiator.properties");
    	SessionSettings settings = new SessionSettings(new FileInputStream("C:\\Users\\wlopes\\eclipse-workspace\\appfix\\initiator.properties"));

        Application application = new ClientApplication();
        MessageStoreFactory messageStoreFactory = new FileStoreFactory(settings);
        LogFactory logFactory = new ScreenLogFactory( true, true, true);
        MessageFactory messageFactory = new DefaultMessageFactory();

        Initiator initiator = new SocketInitiator(application, messageStoreFactory, settings, logFactory, messageFactory);
        initiator.start();

        while (sessionID == null) {
            Thread.sleep(1000);
        }

        
        final String orderId = "342";
        NewOrderSingle newOrder = new NewOrderSingle(new ClOrdID(orderId), new Side(Side.BUY), new TransactTime(), new OrdType(OrdType.MARKET));
        
        Session.sendToTarget(newOrder, sessionID);
        
        Thread.sleep(5000);
    }
}