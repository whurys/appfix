package appfix.model.message.component;

import java.util.List;

public class NestedParties3 {
	private List<NoNested3PartyIDs> NoNested3PartyIDs;

	public List<NoNested3PartyIDs> getNoNested3PartyIDs() {
		return NoNested3PartyIDs;
	}

	public void setNoNested3PartyIDs(List<NoNested3PartyIDs> noNested3PartyIDs) {
		NoNested3PartyIDs = noNested3PartyIDs;
	}

	public static class NoNested3PartyIDs {
		private java.lang.String Nested3PartyID;

		public java.lang.String getNested3PartyID() {
			return Nested3PartyID;
		}

		public void setNested3PartyID(java.lang.String nested3PartyID) {
			Nested3PartyID = nested3PartyID;
		}

		private char Nested3PartyIDSource;

		public char getNested3PartyIDSource() {
			return Nested3PartyIDSource;
		}

		public void setNested3PartyIDSource(char nested3PartyIDSource) {
			Nested3PartyIDSource = nested3PartyIDSource;
		}

		private int Nested3PartyRole;

		public int getNested3PartyRole() {
			return Nested3PartyRole;
		}

		public void setNested3PartyRole(int nested3PartyRole) {
			Nested3PartyRole = nested3PartyRole;
		}

		private List<NoNested3PartySubIDs> NoNested3PartySubIDs;

		public List<NoNested3PartySubIDs> getNoNested3PartySubIDs() {
			return NoNested3PartySubIDs;
		}

		public void setNoNested3PartySubIDs(List<NoNested3PartySubIDs> noNested3PartySubIDs) {
			NoNested3PartySubIDs = noNested3PartySubIDs;
		}

		public static class NoNested3PartySubIDs {
			private java.lang.String Nested3PartySubID;

			public java.lang.String getNested3PartySubID() {
				return Nested3PartySubID;
			}

			public void setNested3PartySubID(java.lang.String nested3PartySubID) {
				Nested3PartySubID = nested3PartySubID;
			}

			private int Nested3PartySubIDType;

			public int getNested3PartySubIDType() {
				return Nested3PartySubIDType;
			}

			public void setNested3PartySubIDType(int nested3PartySubIDType) {
				Nested3PartySubIDType = nested3PartySubIDType;
			}
		}
	}
} // Fim do Componente: NestedParties3
