package appfix.model.message.component;

import java.util.List;

public class NestedParties {
	private List<NoNestedPartyIDs> NoNestedPartyIDs;

	public List<NoNestedPartyIDs> getNoNestedPartyIDs() {
		return NoNestedPartyIDs;
	}

	public void setNoNestedPartyIDs(List<NoNestedPartyIDs> noNestedPartyIDs) {
		NoNestedPartyIDs = noNestedPartyIDs;
	}

	public static class NoNestedPartyIDs {
		private java.lang.String NestedPartyID;

		public java.lang.String getNestedPartyID() {
			return NestedPartyID;
		}

		public void setNestedPartyID(java.lang.String nestedPartyID) {
			NestedPartyID = nestedPartyID;
		}

		private char NestedPartyIDSource;

		public char getNestedPartyIDSource() {
			return NestedPartyIDSource;
		}

		public void setNestedPartyIDSource(char nestedPartyIDSource) {
			NestedPartyIDSource = nestedPartyIDSource;
		}

		private int NestedPartyRole;

		public int getNestedPartyRole() {
			return NestedPartyRole;
		}

		public void setNestedPartyRole(int nestedPartyRole) {
			NestedPartyRole = nestedPartyRole;
		}

		private List<NoNestedPartySubIDs> NoNestedPartySubIDs;

		public List<NoNestedPartySubIDs> getNoNestedPartySubIDs() {
			return NoNestedPartySubIDs;
		}

		public void setNoNestedPartySubIDs(List<NoNestedPartySubIDs> noNestedPartySubIDs) {
			NoNestedPartySubIDs = noNestedPartySubIDs;
		}

		public static class NoNestedPartySubIDs {
			private java.lang.String NestedPartySubID;

			public java.lang.String getNestedPartySubID() {
				return NestedPartySubID;
			}

			public void setNestedPartySubID(java.lang.String nestedPartySubID) {
				NestedPartySubID = nestedPartySubID;
			}

			private int NestedPartySubIDType;

			public int getNestedPartySubIDType() {
				return NestedPartySubIDType;
			}

			public void setNestedPartySubIDType(int nestedPartySubIDType) {
				NestedPartySubIDType = nestedPartySubIDType;
			}
		}
	}
} // Fim do Componente: NestedParties
