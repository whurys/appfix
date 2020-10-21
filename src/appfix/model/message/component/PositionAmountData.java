package appfix.model.message.component;

import java.util.List;

public class PositionAmountData {
	private List<NoPosAmt> NoPosAmt;

	public List<NoPosAmt> getNoPosAmt() {
		return NoPosAmt;
	}

	public void setNoPosAmt(List<NoPosAmt> noPosAmt) {
		NoPosAmt = noPosAmt;
	}

	public static class NoPosAmt {
		private java.lang.String PosAmtType;

		public java.lang.String getPosAmtType() {
			return PosAmtType;
		}

		public void setPosAmtType(java.lang.String posAmtType) {
			PosAmtType = posAmtType;
		}

		private double PosAmt;

		public double getPosAmt() {
			return PosAmt;
		}

		public void setPosAmt(double posAmt) {
			PosAmt = posAmt;
		}
	}
} // Fim do Componente: PositionAmountData
