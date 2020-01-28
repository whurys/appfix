package appfix;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import appfix.model.connectivity.SessionApp;
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
	
	private static final String CONFIG_PATH="C:\\Users\\wlopes\\eclipse-workspace\\appfix\\Files\\Config\\acceptor\\";
	
	private String sessionApp;
	
	private Map<String,String> mapSessionApp;
	

	private Acceptor acceptor;
	
	private List<Message> listMsg;
	
	
	public Server() {
		
		listMsg = new ArrayList<>();
		
		
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		InputStream input = externalContext.getResourceAsStream("/resources/movies.xml");
		
		
		mapSessionApp = new TreeMap<>();

		mapSessionApp.put("Local Acceptor", CONFIG_PATH + "acceptor.properties");
		mapSessionApp.put("DOZO", CONFIG_PATH + "dozo.properties");
		
		this.sessionApp = CONFIG_PATH + "acceptor.properties"; //Default when start cycle of web
		
	}

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
		
		listMsg.add(message);
		
	}

	@Override
	public void fromAdmin(Message message, SessionID sessionID)
			throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
		
		listMsg.add(message);
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
		
		System.out.println("Start session for "+sessionApp);

		SessionSettings settings = new SessionSettings(new FileInputStream(sessionApp));

		Application application = new Server();
		MessageStoreFactory messageStoreFactory = new FileStoreFactory(settings);
		LogFactory logFactory = new ScreenLogFactory(true, true, true);
		MessageFactory messageFactory = new DefaultMessageFactory();

		acceptor = new SocketAcceptor(application, messageStoreFactory, settings, logFactory, messageFactory);
		acceptor.start();

	}

	public void stop() {
		acceptor.stop();
		System.out.println("Acceptor was stopped!");
	}

	/**
	 * Stops all sessions, optionally waiting for logout completion.This method must
	 * not be called by several threads concurrently.Parameters:force don't wait for
	 * logout before disconnect.
	 */
	public void stopForce() {
		acceptor.stop(true);
	}

	

	public String getSessionApp() {
		return sessionApp;
	}

	public void setSessionApp(String sessionApp) {
		this.sessionApp = sessionApp;
	}

	
	public Map<String, String> getMapSessionApp() {
		return mapSessionApp;
	}

	public void setMapSessionApp(Map<String, String> mapSessionApp) {
		this.mapSessionApp = mapSessionApp;
	}

	public List<Message> getListMsg() {
		return listMsg;
	}

	public void setListMsg(List<Message> listMsg) {
		this.listMsg = listMsg;
	}


}