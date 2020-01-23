package appfix;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.CountDownLatch;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import quickfix.Acceptor;
import quickfix.Application;
import quickfix.ConfigError;
import quickfix.DefaultMessageFactory;
import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.FileStoreFactory;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.InvalidMessage;
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
import quickfix.SocketAcceptor;
import quickfix.UnsupportedMessageType;

@ManagedBean(name = "serverView")
@SessionScoped
public class Server implements Application {

	private Acceptor acceptor;

	/**
	 * This method is called when quickfix creates a new session. A session comes
	 * into and remains in existence for the life of the application. Sessions exist
	 * whether or not a counter party is connected to it. As soon as a session is
	 * created, you can begin sending messages to it. If no one is logged on, the
	 * messages will be sent at the time a connection is established with the
	 * counterparty.
	 */
	@Override
	public void onCreate(SessionID sessionID) {
	}

	/**
	 * This callback notifies you when a valid logon has been established with a
	 * counter party. This is called when a connection has been established and the
	 * FIX logon process has completed with both parties exchanging valid logon
	 * messages.
	 */
	@Override
	public void onLogon(SessionID sessionID) {
	}

	/**
	 * This callback notifies you when an FIX session is no longer online. This
	 * could happen during a normal logout exchange or because of a forced
	 * termination or a loss of network connection.
	 * 
	 */
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

	public void start() throws ConfigError, FileNotFoundException, InterruptedException, SessionNotFound {

		// SessionSettings settings = new SessionSettings(new
		// FileInputStream("C:\\Users\\wlopes\\eclipse-workspace\\appfix\\acceptor.properties"));
		SessionSettings settings = new SessionSettings(
				new FileInputStream("C:\\Users\\wlopes\\eclipse-workspace\\appfix\\Files\\Config\\dozo.properties"));

		Application application = new Server();
		MessageStoreFactory messageStoreFactory = new FileStoreFactory(settings);
		LogFactory logFactory = new ScreenLogFactory(true, true, true);
		MessageFactory messageFactory = new DefaultMessageFactory();

		acceptor = new SocketAcceptor(application, messageStoreFactory, settings, logFactory, messageFactory);
		acceptor.start();

		// while(condition == true) { do something; }
		// acceptor.stop();

//		Message message = null;
//		try {
//			message = new Message("35=8|52=$SENDINGTIME|6=0|11=$COPY|14=0|15=$COPY|17=$UNIQUE|21=$COPY|31=0|32=0|37=$UNIQUE|38=$COPY|39=0|40=$COPY|44=$COPY|48=VOD.L|54=$COPY|55=$COPY|59=$COPY|60=$TIMESTAMP|76=$COPY|150=0|151=$COPY(38)|");
//		} catch (InvalidMessage e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		
//		if (Session.sendToTarget(message)) {
//			System.out.println("Mensagem SENT!");
//		} else {
//			System.out.println("ERRORRRRR !");
//		}

		CountDownLatch latch = new CountDownLatch(1);
		latch.await();
	}

	public void stop() {
		acceptor.stop();
	}

	/**
	 * Stops all sessions, optionally waiting for logout completion.This method must
	 * not be called by several threads concurrently.Parameters:force don't wait for
	 * logout before disconnect.
	 */
	public void stopForce() {
		acceptor.stop(true);
	}
}