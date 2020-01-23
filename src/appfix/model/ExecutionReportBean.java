package appfix.model;

public class ExecutionReportBean extends Model {
	
	private String OrderID;
	private String ExecID;
	private char ExecType;
	private char OrdStatus;
	private char Side;
	private double LeavesQty;
	private double CumQty;
	
	
	public String getOrderID() {
		return OrderID;
	}
	public void setOrderID(String orderID) {
		OrderID = orderID;
	}
	public String getExecID() {
		return ExecID;
	}
	public void setExecID(String execID) {
		ExecID = execID;
	}
	public char getExecType() {
		return ExecType;
	}
	public void setExecType(char execType) {
		ExecType = execType;
	}
	public char getOrdStatus() {
		return OrdStatus;
	}
	public void setOrdStatus(char ordStatus) {
		OrdStatus = ordStatus;
	}
	public char getSide() {
		return Side;
	}
	public void setSide(char side) {
		Side = side;
	}
	public double getLeavesQty() {
		return LeavesQty;
	}
	public void setLeavesQty(double leavesQty) {
		LeavesQty = leavesQty;
	}
	public double getCumQty() {
		return CumQty;
	}
	public void setCumQty(double cumQty) {
		CumQty = cumQty;
	}
	
}
