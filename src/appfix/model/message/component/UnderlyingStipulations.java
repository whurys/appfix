package appfix.model.message.component;

import java.util.List;

public class UnderlyingStipulations {
	private List<NoUnderlyingStips> NoUnderlyingStips;

	public List<NoUnderlyingStips> getNoUnderlyingStips() {
		return NoUnderlyingStips;
	}

	public void setNoUnderlyingStips(List<NoUnderlyingStips> noUnderlyingStips) {
		NoUnderlyingStips = noUnderlyingStips;
	}

	public static class NoUnderlyingStips {
		private java.lang.String UnderlyingStipType;

		public java.lang.String getUnderlyingStipType() {
			return UnderlyingStipType;
		}

		public void setUnderlyingStipType(java.lang.String underlyingStipType) {
			UnderlyingStipType = underlyingStipType;
		}

		private java.lang.String UnderlyingStipValue;

		public java.lang.String getUnderlyingStipValue() {
			return UnderlyingStipValue;
		}

		public void setUnderlyingStipValue(java.lang.String underlyingStipValue) {
			UnderlyingStipValue = underlyingStipValue;
		}
	}
} // Fim do Componente: UnderlyingStipulations
