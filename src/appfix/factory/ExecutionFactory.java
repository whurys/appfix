package appfix.factory;


public class ExecutionFactory {

	/**
	 *  Required fields for Execution FIX50
	 * @param orderID
	 * @param execID
	 * @param execType
	 * @param ordStatus
	 * @param side
	 * @param leavesQty
	 * @param cumQty
	 * @return
	 */
	public static quickfix.Message getAck(quickfix.field.OrderID orderID, quickfix.field.ExecID execID,
			quickfix.field.ExecType execType, quickfix.field.OrdStatus ordStatus, quickfix.field.Side side,
			quickfix.field.LeavesQty leavesQty, quickfix.field.CumQty cumQty) {
		
		return new quickfix.fix50.ExecutionReport(orderID, execID, execType, ordStatus, side, leavesQty, cumQty);
	}

}
