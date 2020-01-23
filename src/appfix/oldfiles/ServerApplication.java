package appfix.oldfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.CountDownLatch;

import quickfix.Acceptor;
import quickfix.Application;
import quickfix.ConfigError;
import quickfix.DefaultMessageFactory;
import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.FileStoreFactory;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.LogFactory;
import quickfix.Message;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.RejectLogon;
import quickfix.ScreenLogFactory;
import quickfix.SessionID;
import quickfix.SessionNotFound;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;
import quickfix.UnsupportedMessageType;

/**
 * We have an initiator application (the client) and we need to also create an
 * acceptor application (the server). Below I've attached the two classes that
 * will do what do you want.
 * 
 * This is a server application that will stay started and listen for messages
 * from the clients which connect to it. Here is the configuration file
 * (acceptor.properties) used by it:
 * 
 * @author wlopes
 *
 */

public class ServerApplication implements Application {

	@Override
	public void onCreate(SessionID sessionID) {
	}

	@Override
	public void onLogon(SessionID sessionID) {
	}

	@Override
	public void onLogout(SessionID sessionID) {
	}

	@Override
	public void toAdmin(Message message, SessionID sessionID) {
	}

	@Override
	public void fromAdmin(Message message, SessionID sessionID)
			throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
	}

	@Override
	public void toApp(Message message, SessionID sessionID) throws DoNotSend {
	}

	@Override
	public void fromApp(Message message, SessionID sessionID)
			throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
		System.out.println("FromApp: " + message);
	}

	public static void main(String[] args)
			throws ConfigError, FileNotFoundException, InterruptedException, SessionNotFound {

		SessionSettings settings = new SessionSettings(new FileInputStream("C:\\Users\\wlopes\\eclipse-workspace\\appfix\\acceptor.properties"));

		Application application = new ServerApplication();
		MessageStoreFactory messageStoreFactory = new FileStoreFactory(settings);
		LogFactory logFactory = new ScreenLogFactory(true, true, true);
		MessageFactory messageFactory = new DefaultMessageFactory();

		Acceptor acceptor = new SocketAcceptor(application, messageStoreFactory, settings, logFactory, messageFactory);
		acceptor.start();
		 // while(condition == true) { do something; }
	    //acceptor.stop();

		CountDownLatch latch = new CountDownLatch(1);
		latch.await();
	}
}
