package appfix;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.UUID;

import quickfix.Application;
import quickfix.ConfigError;
import quickfix.DefaultMessageFactory;
import quickfix.FileLogFactory;
import quickfix.FileStoreFactory;
import quickfix.Message;
import quickfix.Message.Header;
import quickfix.MessageFactory;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionNotFound;
import quickfix.SessionSettings;
import quickfix.SocketInitiator;
import quickfix.field.BeginString;
import quickfix.field.MDEntryType;
import quickfix.field.MDReqID;
import quickfix.field.MarketDepth;
import quickfix.field.MsgType;
import quickfix.field.NoMDEntryTypes;
import quickfix.field.SenderCompID;
import quickfix.field.SubscriptionRequestType;
import quickfix.field.Symbol;
import quickfix.field.TargetCompID;
import quickfix.fix42.MarketDataRequest;

public class FastmatchMDRequest {
	public static void main(String[] args) {
		SocketInitiator socketInitiator = null;
		try {
			InputStream inputStream = null;
			if (args.length == 0) {
				inputStream = FastmatchMDRequest.class.getResourceAsStream("initiator.cfg");
			} else if (args.length == 1) {
				inputStream = new FileInputStream(args[0]);
			}
			if (inputStream == null) {
				System.out.println("usage: " + FastmatchMDRequest.class.getName() + " [configFile].");
				return;
			}
			SessionSettings settings = new SessionSettings(inputStream);
			inputStream.close();
			Application application = new TestMarketdataRequest();
			FileStoreFactory fileStoreFactory = new FileStoreFactory(settings);
			FileLogFactory logFactory = new FileLogFactory(settings);
			MessageFactory messageFactory = new DefaultMessageFactory();
			socketInitiator = new SocketInitiator(application, fileStoreFactory, settings, logFactory, messageFactory);
			socketInitiator.start();
			SessionID sessionId = socketInitiator.getSessions().get(0);
			sendMarkeDataRequest(sessionId);
			int i = 0;
			do {
				try {
					Thread.sleep(1000);
					System.out.println(socketInitiator.isLoggedOn());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				i++;
			} while ((!socketInitiator.isLoggedOn()) && (i < 30));
		} catch (ConfigError e) {
			e.printStackTrace();
		} catch (SessionNotFound e) {
			e.printStackTrace();
		} catch (Exception exp) {
			exp.printStackTrace();
		} finally {
			if (socketInitiator != null) {
				socketInitiator.stop(true);
			}
		}
	}

	private static void sendMarkeDataRequest(SessionID sessionId) throws SessionNotFound {
		UUID uuid = UUID.randomUUID();
		String randomUUIDString = uuid.toString();
		Message message = new Message();
		quickfix.fix42.MarketDataRequest.NoMDEntryTypes group = new quickfix.fix42.MarketDataRequest.NoMDEntryTypes();
		quickfix.fix42.MarketDataRequest.NoRelatedSym group1 = new quickfix.fix42.MarketDataRequest.NoRelatedSym();
		MarketDataRequest marketdatarequest = new MarketDataRequest();
		Header header = marketdatarequest.getHeader();
		header.setField(new BeginString("FIX.4.2"));
		header.setField(new SenderCompID("Mycomp"));
		header.setField(new TargetCompID("mybroker"));
		header.setField(new MsgType("V"));
		message.setField(new MDReqID(randomUUIDString));
		message.setField(new SubscriptionRequestType((char) 1));
		message.setField(new MarketDepth(1));
		message.setField(new NoMDEntryTypes(1));
		group.setField(new MDEntryType((char) 1));
		message.addGroup(group);
		group1.setField(new Symbol("ALL"));
		message.addGroup(group1);
		try {
			Session.sendToTarget(message);
			System.out.println("message" + message);
		} catch (Exception ex) {
			System.out.println("error" + ex);
		}
	}
}