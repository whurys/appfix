package appfix.model.message.component;

import java.util.List;

public class Stipulations {
	private List<NoStipulations> NoStipulations;

	public List<NoStipulations> getNoStipulations() {
		return NoStipulations;
	}

	public void setNoStipulations(List<NoStipulations> noStipulations) {
		NoStipulations = noStipulations;
	}

	public static class NoStipulations {
		private java.lang.String StipulationType;

		public java.lang.String getStipulationType() {
			return StipulationType;
		}

		public void setStipulationType(java.lang.String stipulationType) {
			StipulationType = stipulationType;
		}

		private java.lang.String StipulationValue;

		public java.lang.String getStipulationValue() {
			return StipulationValue;
		}

		public void setStipulationValue(java.lang.String stipulationValue) {
			StipulationValue = stipulationValue;
		}
	}
} // Fim do Componente: Stipulations
