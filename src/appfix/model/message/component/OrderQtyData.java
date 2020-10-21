package appfix.model.message.component;

public class OrderQtyData {
	private double OrderQty;

	public double getOrderQty() {
		return OrderQty;
	}

	public void setOrderQty(double orderQty) {
		OrderQty = orderQty;
	}

	private double CashOrderQty;

	public double getCashOrderQty() {
		return CashOrderQty;
	}

	public void setCashOrderQty(double cashOrderQty) {
		CashOrderQty = cashOrderQty;
	}

	private double OrderPercent;

	public double getOrderPercent() {
		return OrderPercent;
	}

	public void setOrderPercent(double orderPercent) {
		OrderPercent = orderPercent;
	}

	private char RoundingDirection;

	public char getRoundingDirection() {
		return RoundingDirection;
	}

	public void setRoundingDirection(char roundingDirection) {
		RoundingDirection = roundingDirection;
	}

	private double RoundingModulus;

	public double getRoundingModulus() {
		return RoundingModulus;
	}

	public void setRoundingModulus(double roundingModulus) {
		RoundingModulus = roundingModulus;
	}
} // Fim do Componente: OrderQtyData
