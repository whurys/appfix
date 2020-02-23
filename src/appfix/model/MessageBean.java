package appfix.model;

import java.time.LocalDateTime;

public class MessageBean extends Model {
	
	
	//Standard Message Header Fields
	private String BeginString;
	private int BodyLength;
	private String DeliverToCompID;
	private String DeliverToLocationID;
	private String DeliverToSubID;
	private int LastMsgSeqNumProcessed;
	private String MessageEncoding;
	private int MsgSeqNum;
	private String MsgType;
	private int NoHops;
	private String OnBehalfOfCompID;
	private String OnBehalfOfLocationID;
	private String OnBehalfOfSubID;
	private LocalDateTime OrigSendingTime;
	private boolean PossDupFlag;
	private boolean PossResend;
	private String SecureData;
	private int SecureDataLen;
	private String SenderCompID;
	private String SenderLocationID;
	private String SenderSubID;
	private LocalDateTime SendingTime;
	private String TargetCompID;
	private String TargetLocationID;
	private String TargetSubID;
	private String XmlData;
	private int XmlDataLen;
	//Standard Message Trailer Fields
	private String CheckSum;
	private String Signature;
	private int SignatureLength;
	
	public String getBeginString() {
		return BeginString;
	}
	public void setBeginString(String beginString) {
		BeginString = beginString;
	}
	public int getBodyLength() {
		return BodyLength;
	}
	public void setBodyLength(int bodyLength) {
		BodyLength = bodyLength;
	}
	public String getDeliverToCompID() {
		return DeliverToCompID;
	}
	public void setDeliverToCompID(String deliverToCompID) {
		DeliverToCompID = deliverToCompID;
	}
	public String getDeliverToLocationID() {
		return DeliverToLocationID;
	}
	public void setDeliverToLocationID(String deliverToLocationID) {
		DeliverToLocationID = deliverToLocationID;
	}
	public String getDeliverToSubID() {
		return DeliverToSubID;
	}
	public void setDeliverToSubID(String deliverToSubID) {
		DeliverToSubID = deliverToSubID;
	}
	public int getLastMsgSeqNumProcessed() {
		return LastMsgSeqNumProcessed;
	}
	public void setLastMsgSeqNumProcessed(int lastMsgSeqNumProcessed) {
		LastMsgSeqNumProcessed = lastMsgSeqNumProcessed;
	}
	public String getMessageEncoding() {
		return MessageEncoding;
	}
	public void setMessageEncoding(String messageEncoding) {
		MessageEncoding = messageEncoding;
	}
	public int getMsgSeqNum() {
		return MsgSeqNum;
	}
	public void setMsgSeqNum(int msgSeqNum) {
		MsgSeqNum = msgSeqNum;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public int getNoHops() {
		return NoHops;
	}
	public void setNoHops(int noHops) {
		NoHops = noHops;
	}
	public String getOnBehalfOfCompID() {
		return OnBehalfOfCompID;
	}
	public void setOnBehalfOfCompID(String onBehalfOfCompID) {
		OnBehalfOfCompID = onBehalfOfCompID;
	}
	public String getOnBehalfOfLocationID() {
		return OnBehalfOfLocationID;
	}
	public void setOnBehalfOfLocationID(String onBehalfOfLocationID) {
		OnBehalfOfLocationID = onBehalfOfLocationID;
	}
	public String getOnBehalfOfSubID() {
		return OnBehalfOfSubID;
	}
	public void setOnBehalfOfSubID(String onBehalfOfSubID) {
		OnBehalfOfSubID = onBehalfOfSubID;
	}
	public LocalDateTime getOrigSendingTime() {
		return OrigSendingTime;
	}
	public void setOrigSendingTime(LocalDateTime origSendingTime) {
		OrigSendingTime = origSendingTime;
	}
	public boolean isPossDupFlag() {
		return PossDupFlag;
	}
	public void setPossDupFlag(boolean possDupFlag) {
		PossDupFlag = possDupFlag;
	}
	public boolean isPossResend() {
		return PossResend;
	}
	public void setPossResend(boolean possResend) {
		PossResend = possResend;
	}
	public String getSecureData() {
		return SecureData;
	}
	public void setSecureData(String secureData) {
		SecureData = secureData;
	}
	public int getSecureDataLen() {
		return SecureDataLen;
	}
	public void setSecureDataLen(int secureDataLen) {
		SecureDataLen = secureDataLen;
	}
	public String getSenderCompID() {
		return SenderCompID;
	}
	public void setSenderCompID(String senderCompID) {
		SenderCompID = senderCompID;
	}
	public String getSenderLocationID() {
		return SenderLocationID;
	}
	public void setSenderLocationID(String senderLocationID) {
		SenderLocationID = senderLocationID;
	}
	public String getSenderSubID() {
		return SenderSubID;
	}
	public void setSenderSubID(String senderSubID) {
		SenderSubID = senderSubID;
	}
	public LocalDateTime getSendingTime() {
		return SendingTime;
	}
	public void setSendingTime(LocalDateTime sendingTime) {
		SendingTime = sendingTime;
	}
	public String getTargetCompID() {
		return TargetCompID;
	}
	public void setTargetCompID(String targetCompID) {
		TargetCompID = targetCompID;
	}
	public String getTargetLocationID() {
		return TargetLocationID;
	}
	public void setTargetLocationID(String targetLocationID) {
		TargetLocationID = targetLocationID;
	}
	public String getTargetSubID() {
		return TargetSubID;
	}
	public void setTargetSubID(String targetSubID) {
		TargetSubID = targetSubID;
	}
	public String getXmlData() {
		return XmlData;
	}
	public void setXmlData(String xmlData) {
		XmlData = xmlData;
	}
	public int getXmlDataLen() {
		return XmlDataLen;
	}
	public void setXmlDataLen(int xmlDataLen) {
		XmlDataLen = xmlDataLen;
	}
	public String getCheckSum() {
		return CheckSum;
	}
	public void setCheckSum(String checkSum) {
		CheckSum = checkSum;
	}
	public String getSignature() {
		return Signature;
	}
	public void setSignature(String signature) {
		Signature = signature;
	}
	public int getSignatureLength() {
		return SignatureLength;
	}
	public void setSignatureLength(int signatureLength) {
		SignatureLength = signatureLength;
	}

}
