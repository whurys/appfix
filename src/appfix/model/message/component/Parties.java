package appfix.model.message.component;

import java.util.List;

public class Parties {
	private List<NoPartyIDs> NoPartyIDs;

	public List<NoPartyIDs> getNoPartyIDs() {
		return NoPartyIDs;
	}

	public void setNoPartyIDs(List<NoPartyIDs> noPartyIDs) {
		NoPartyIDs = noPartyIDs;
	}

	public static class NoPartyIDs {
		private java.lang.String PartyID;

		public java.lang.String getPartyID() {
			return PartyID;
		}

		public void setPartyID(java.lang.String partyID) {
			PartyID = partyID;
		}

		private char PartyIDSource;

		public char getPartyIDSource() {
			return PartyIDSource;
		}

		public void setPartyIDSource(char partyIDSource) {
			PartyIDSource = partyIDSource;
		}

		private int PartyRole;

		public int getPartyRole() {
			return PartyRole;
		}

		public void setPartyRole(int partyRole) {
			PartyRole = partyRole;
		}

		private List<NoPartySubIDs> NoPartySubIDs;

		public List<NoPartySubIDs> getNoPartySubIDs() {
			return NoPartySubIDs;
		}

		public void setNoPartySubIDs(List<NoPartySubIDs> noPartySubIDs) {
			NoPartySubIDs = noPartySubIDs;
		}

		public static class NoPartySubIDs {
			private java.lang.String PartySubID;

			public java.lang.String getPartySubID() {
				return PartySubID;
			}

			public void setPartySubID(java.lang.String partySubID) {
				PartySubID = partySubID;
			}

			private int PartySubIDType;

			public int getPartySubIDType() {
				return PartySubIDType;
			}

			public void setPartySubIDType(int partySubIDType) {
				PartySubIDType = partySubIDType;
			}
		}
	}
} // Fim do Componente: Parties
