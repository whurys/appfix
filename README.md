# appfix

### is a full featured messaging engine for the FIX protocol. It is a 100% Java open source
This is the starting page for FIX Latest, the specification of the application layer of the FIX Protocol. 
It provides the normative specification and is the successor of the previous specification documents

## Pre-Trade
* Indication
* Event Communication
* Quotation Negotiation
* Market Data
* Securities Reference Data
* Market Structure Reference Data

### Creating a FIX application is as easy as implementing the QuickFIX Application interface.
```
package appfix;

public interface Application {
  void onCreate(SessionID sessionId);
  void onLogon(SessionID sessionId);
  void onLogout(SessionID sessionId);
  void toAdmin(Message message, SessionID sessionId);
  void toApp(Message message, SessionID sessionId)
    throws DoNotSend;
  void fromAdmin(Message message, SessionID sessionId)
    throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon;
  void fromApp(Message message, SessionID sessionId)
    throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType;
}

```
