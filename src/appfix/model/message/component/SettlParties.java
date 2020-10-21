package appfix.model.message.component;

import java.util.List;

public class SettlParties {
	private List<NoSettlPartyIDs> NoSettlPartyIDs;

	public List<NoSettlPartyIDs> getNoSettlPartyIDs() {
		return NoSettlPartyIDs;
	}

	public void setNoSettlPartyIDs(List<NoSettlPartyIDs> noSettlPartyIDs) {
		NoSettlPartyIDs = noSettlPartyIDs;
	}

	public static class NoSettlPartyIDs {
		private java.lang.String SettlPartyID;

		public java.lang.String getSettlPartyID() {
			return SettlPartyID;
		}

		public void setSettlPartyID(java.lang.String settlPartyID) {
			SettlPartyID = settlPartyID;
		}

		private char SettlPartyIDSource;

		public char getSettlPartyIDSource() {
			return SettlPartyIDSource;
		}

		public void setSettlPartyIDSource(char settlPartyIDSource) {
			SettlPartyIDSource = settlPartyIDSource;
		}

		private int SettlPartyRole;

		public int getSettlPartyRole() {
			return SettlPartyRole;
		}

		public void setSettlPartyRole(int settlPartyRole) {
			SettlPartyRole = settlPartyRole;
		}

		private List<NoSettlPartySubIDs> NoSettlPartySubIDs;

		public List<NoSettlPartySubIDs> getNoSettlPartySubIDs() {
			return NoSettlPartySubIDs;
		}

		public void setNoSettlPartySubIDs(List<NoSettlPartySubIDs> noSettlPartySubIDs) {
			NoSettlPartySubIDs = noSettlPartySubIDs;
		}

		public static class NoSettlPartySubIDs {
			private java.lang.String SettlPartySubID;

			public java.lang.String getSettlPartySubID() {
				return SettlPartySubID;
			}

			public void setSettlPartySubID(java.lang.String settlPartySubID) {
				SettlPartySubID = settlPartySubID;
			}

			private int SettlPartySubIDType;

			public int getSettlPartySubIDType() {
				return SettlPartySubIDType;
			}

			public void setSettlPartySubIDType(int settlPartySubIDType) {
				SettlPartySubIDType = settlPartySubIDType;
			}
		}
	}
} // Fim do Componente: SettlParties
