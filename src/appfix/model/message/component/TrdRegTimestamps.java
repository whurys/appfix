package appfix.model.message.component;

import java.util.List;

public class TrdRegTimestamps {
	private List<NoTrdRegTimestamps> NoTrdRegTimestamps;

	public List<NoTrdRegTimestamps> getNoTrdRegTimestamps() {
		return NoTrdRegTimestamps;
	}

	public void setNoTrdRegTimestamps(List<NoTrdRegTimestamps> noTrdRegTimestamps) {
		NoTrdRegTimestamps = noTrdRegTimestamps;
	}

	public static class NoTrdRegTimestamps {
		private java.time.LocalDateTime TrdRegTimestamp;

		public java.time.LocalDateTime getTrdRegTimestamp() {
			return TrdRegTimestamp;
		}

		public void setTrdRegTimestamp(java.time.LocalDateTime trdRegTimestamp) {
			TrdRegTimestamp = trdRegTimestamp;
		}

		private int TrdRegTimestampType;

		public int getTrdRegTimestampType() {
			return TrdRegTimestampType;
		}

		public void setTrdRegTimestampType(int trdRegTimestampType) {
			TrdRegTimestampType = trdRegTimestampType;
		}

		private java.lang.String TrdRegTimestampOrigin;

		public java.lang.String getTrdRegTimestampOrigin() {
			return TrdRegTimestampOrigin;
		}

		public void setTrdRegTimestampOrigin(java.lang.String trdRegTimestampOrigin) {
			TrdRegTimestampOrigin = trdRegTimestampOrigin;
		}
	}
} // Fim do Componente: TrdRegTimestamps
