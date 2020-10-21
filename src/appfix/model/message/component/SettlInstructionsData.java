package appfix.model.message.component;

import java.util.List;

public class SettlInstructionsData {
	private int SettlDeliveryType;

	public int getSettlDeliveryType() {
		return SettlDeliveryType;
	}

	public void setSettlDeliveryType(int settlDeliveryType) {
		SettlDeliveryType = settlDeliveryType;
	}

	private int StandInstDbType;

	public int getStandInstDbType() {
		return StandInstDbType;
	}

	public void setStandInstDbType(int standInstDbType) {
		StandInstDbType = standInstDbType;
	}

	private java.lang.String StandInstDbName;

	public java.lang.String getStandInstDbName() {
		return StandInstDbName;
	}

	public void setStandInstDbName(java.lang.String standInstDbName) {
		StandInstDbName = standInstDbName;
	}

	private java.lang.String StandInstDbID;

	public java.lang.String getStandInstDbID() {
		return StandInstDbID;
	}

	public void setStandInstDbID(java.lang.String standInstDbID) {
		StandInstDbID = standInstDbID;
	}

	private List<NoDlvyInst> NoDlvyInst;

	public List<NoDlvyInst> getNoDlvyInst() {
		return NoDlvyInst;
	}

	public void setNoDlvyInst(List<NoDlvyInst> noDlvyInst) {
		NoDlvyInst = noDlvyInst;
	}

	public static class NoDlvyInst {
		private char SettlInstSource;

		public char getSettlInstSource() {
			return SettlInstSource;
		}

		public void setSettlInstSource(char settlInstSource) {
			SettlInstSource = settlInstSource;
		}

		private char DlvyInstType;

		public char getDlvyInstType() {
			return DlvyInstType;
		}

		public void setDlvyInstType(char dlvyInstType) {
			DlvyInstType = dlvyInstType;
		}

		private SettlParties SettlParties;

		public SettlParties getSettlParties() {
			return SettlParties;
		}

		public void setSettlParties(SettlParties settlParties) {
			SettlParties = settlParties;
		}
	}
} // Fim do Componente: SettlInstructionsData
