package appfix;

import quickfix.Application;
import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.Message;
import quickfix.RejectLogon;
import quickfix.SessionID;
import quickfix.UnsupportedMessageType;
import quickfix.field.Currency;
import quickfix.field.DeleteReason;
import quickfix.field.ExpireDate;
import quickfix.field.ExpireTime;
import quickfix.field.MDEntryID;
import quickfix.field.MDEntryOriginator;
import quickfix.field.MDEntryPositionNo;
import quickfix.field.MDEntryPx;
import quickfix.field.MDEntrySize;
import quickfix.field.MDEntryType;
import quickfix.field.MDReqID;
import quickfix.field.MDUpdateAction;
import quickfix.field.NoMDEntries;
import quickfix.field.NumberOfOrders;
import quickfix.field.SendingTime;
import quickfix.field.Symbol;

public class TestMarketdataRequest implements Application {

	@Override
	public void fromAdmin(quickfix.Message arg0, SessionID arg1)
			throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
		// TODO Auto-generated method stub
		System.out.println("Successfully called fromAdmin for sessionId : " + arg0);
	}

	@Override
	public void fromApp(quickfix.Message arg0, SessionID arg1)
			throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
		// TODO Auto-generated method stub
		System.out.println("Successfully called fromApp for sessionId : " + arg0);
	}

	@Override
	public void onCreate(SessionID sessionID) {
		// TODO Auto-generated method stub
		System.out.println("Successfully called onCreate for sessionId : " + sessionID);
	}

	@Override
	public void onLogon(SessionID sessionID) {
		// TODO Auto-generated method stub
		System.out.println("Successfully logged on for sessionId : " + sessionID);
	}

	@Override
	public void onLogout(SessionID sessionID) {
		// TODO Auto-generated method stub
		System.out.println("Successfully logged out for sessionId : " + sessionID);
	}

	@Override
	public void toAdmin(quickfix.Message message, SessionID sessionID) {
		// TODO Auto-generated method stub
		System.out.println("Inside toAdmin");
	}

	@Override
	public void toApp(quickfix.Message message, SessionID sessionID) throws DoNotSend {
		// TODO Auto-generated method stub
		System.out.println("Message : " + message + " for sessionid : " + sessionID);
	}

	public void onMessage(quickfix.fix42.MarketDataIncrementalRefresh message, SessionID sessionID)
			throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		System.out.println("Inside onMessage for New Order Single" + message + sessionID);
	}

	public void MarketDataIncrementalRefresh(Message message, SessionID sessionID) throws FieldNotFound {
		try {
			MDReqID mdreqid = new MDReqID();
			SendingTime sendingtime = new SendingTime();
			NoMDEntries nomdentries = new NoMDEntries();
			quickfix.fix42.MarketDataIncrementalRefresh.NoMDEntries group = new quickfix.fix42.MarketDataIncrementalRefresh.NoMDEntries();
			MDUpdateAction mdupdateaction = new MDUpdateAction();
			DeleteReason deletereason = new DeleteReason();
			MDEntryType mdentrytype = new MDEntryType();
			MDEntryID mdentryid = new MDEntryID();
			Symbol symbol = new Symbol();
			MDEntryOriginator mdentryoriginator = new MDEntryOriginator();
			MDEntryPx mdentrypx = new MDEntryPx();
			Currency currency = new Currency();
			MDEntrySize mdentrysize = new MDEntrySize();
			ExpireDate expiredate = new ExpireDate();
			ExpireTime expiretime = new ExpireTime();
			NumberOfOrders numberoforders = new NumberOfOrders();
			MDEntryPositionNo mdentrypositionno = new MDEntryPositionNo();

			message.getField(nomdentries);
			message.getField(sendingtime);

			message.getGroup(1, group);

			int list = nomdentries.getValue();
			for (int i = 0; i < list; i++) {
				message.getGroup(i + 1, group);
				group.get(mdupdateaction);
				if (mdupdateaction.getValue() == '2')
					System.out.println("Enter");
				group.get(deletereason);
				group.get(mdentrytype);
				group.get(mdentryid);
				group.get(symbol);
				group.get(mdentryoriginator);
				if (mdupdateaction.getValue() == '0')
					group.get(mdentrypx);
				group.get(currency);
				if (mdupdateaction.getValue() == '0')
					group.get(mdentrysize);
			}

			System.out.printf("Got Symbol {0} Price {1}", symbol.getValue(), mdentrypx.getValue());

		} catch (Exception ex) {
			System.out.println("error" + ex);
		}
	}

	public void MarketDataSnapshotFullRefresh (Message message,    SessionID sessionID) throws FieldNotFound{

    String Symbol = message.getField(new Symbol()).getValue();

    NoMDEntries noMDEntries = new NoMDEntries();
    message.getField(noMDEntries);
    quickfix.fix42.MarketDataSnapshotFullRefresh.NoMDEntries group =
      new quickfix.fix42.MarketDataSnapshotFullRefresh.NoMDEntries();
    MDEntryType MDEntryType = new MDEntryType();
    MDEntryPx MDEntryPx = new MDEntryPx();
    MDEntrySize MDEntrySize = new MDEntrySize();
    SendingTime sendingTime = new SendingTime();

    message.getField(sendingTime);

    message.getGroup(1, group);
    group.get(MDEntryType);
    group.get(MDEntryPx);
    group.get(MDEntrySize);

    message.getGroup(2, group);
    group.get(MDEntryType);
    group.get(MDEntryPx);
    group.get(MDEntrySize);

    System.out.printf("Symbol {0} Price {1}", Symbol, MDEntryPx);
}

}