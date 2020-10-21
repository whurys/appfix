package appfix.model.message.component;

import java.util.List;

public class PositionQty {
	private List<NoPositions> NoPositions;

	public List<NoPositions> getNoPositions() {
		return NoPositions;
	}

	public void setNoPositions(List<NoPositions> noPositions) {
		NoPositions = noPositions;
	}

	public static class NoPositions {
		private java.lang.String PosType;

		public java.lang.String getPosType() {
			return PosType;
		}

		public void setPosType(java.lang.String posType) {
			PosType = posType;
		}

		private double LongQty;

		public double getLongQty() {
			return LongQty;
		}

		public void setLongQty(double longQty) {
			LongQty = longQty;
		}

		private double ShortQty;

		public double getShortQty() {
			return ShortQty;
		}

		public void setShortQty(double shortQty) {
			ShortQty = shortQty;
		}

		private int PosQtyStatus;

		public int getPosQtyStatus() {
			return PosQtyStatus;
		}

		public void setPosQtyStatus(int posQtyStatus) {
			PosQtyStatus = posQtyStatus;
		}

		private NestedParties NestedParties;

		public NestedParties getNestedParties() {
			return NestedParties;
		}

		public void setNestedParties(NestedParties nestedParties) {
			NestedParties = nestedParties;
		}
	}
} // Fim do Componente: PositionQty
