package appfix.model.message.component;

import java.util.List;

public class LegStipulations {
	private List<NoLegStipulations> NoLegStipulations;

	public List<NoLegStipulations> getNoLegStipulations() {
		return NoLegStipulations;
	}

	public void setNoLegStipulations(List<NoLegStipulations> noLegStipulations) {
		NoLegStipulations = noLegStipulations;
	}

	public static class NoLegStipulations {
		private java.lang.String LegStipulationType;

		public java.lang.String getLegStipulationType() {
			return LegStipulationType;
		}

		public void setLegStipulationType(java.lang.String legStipulationType) {
			LegStipulationType = legStipulationType;
		}

		private java.lang.String LegStipulationValue;

		public java.lang.String getLegStipulationValue() {
			return LegStipulationValue;
		}

		public void setLegStipulationValue(java.lang.String legStipulationValue) {
			LegStipulationValue = legStipulationValue;
		}
	}
} // Fim do Componente: LegStipulations
