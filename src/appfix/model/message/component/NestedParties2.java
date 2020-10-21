package appfix.model.message.component;

import java.util.List;

public class NestedParties2 {
	private List<NoNested2PartyIDs> NoNested2PartyIDs;

	public List<NoNested2PartyIDs> getNoNested2PartyIDs() {
		return NoNested2PartyIDs;
	}

	public void setNoNested2PartyIDs(List<NoNested2PartyIDs> noNested2PartyIDs) {
		NoNested2PartyIDs = noNested2PartyIDs;
	}

	public static class NoNested2PartyIDs {
		private java.lang.String Nested2PartyID;

		public java.lang.String getNested2PartyID() {
			return Nested2PartyID;
		}

		public void setNested2PartyID(java.lang.String nested2PartyID) {
			Nested2PartyID = nested2PartyID;
		}

		private char Nested2PartyIDSource;

		public char getNested2PartyIDSource() {
			return Nested2PartyIDSource;
		}

		public void setNested2PartyIDSource(char nested2PartyIDSource) {
			Nested2PartyIDSource = nested2PartyIDSource;
		}

		private int Nested2PartyRole;

		public int getNested2PartyRole() {
			return Nested2PartyRole;
		}

		public void setNested2PartyRole(int nested2PartyRole) {
			Nested2PartyRole = nested2PartyRole;
		}

		private List<NoNested2PartySubIDs> NoNested2PartySubIDs;

		public List<NoNested2PartySubIDs> getNoNested2PartySubIDs() {
			return NoNested2PartySubIDs;
		}

		public void setNoNested2PartySubIDs(List<NoNested2PartySubIDs> noNested2PartySubIDs) {
			NoNested2PartySubIDs = noNested2PartySubIDs;
		}

		public static class NoNested2PartySubIDs {
			private java.lang.String Nested2PartySubID;

			public java.lang.String getNested2PartySubID() {
				return Nested2PartySubID;
			}

			public void setNested2PartySubID(java.lang.String nested2PartySubID) {
				Nested2PartySubID = nested2PartySubID;
			}

			private int Nested2PartySubIDType;

			public int getNested2PartySubIDType() {
				return Nested2PartySubIDType;
			}

			public void setNested2PartySubIDType(int nested2PartySubIDType) {
				Nested2PartySubIDType = nested2PartySubIDType;
			}
		}
	}
} // Fim do Componente: NestedParties2
