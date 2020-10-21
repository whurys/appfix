package appfix.model.message.component;

import java.util.List;

public class InstrumentExtension {
	private int DeliveryForm;

	public int getDeliveryForm() {
		return DeliveryForm;
	}

	public void setDeliveryForm(int deliveryForm) {
		DeliveryForm = deliveryForm;
	}

	private double PctAtRisk;

	public double getPctAtRisk() {
		return PctAtRisk;
	}

	public void setPctAtRisk(double pctAtRisk) {
		PctAtRisk = pctAtRisk;
	}

	private List<NoInstrAttrib> NoInstrAttrib;

	public List<NoInstrAttrib> getNoInstrAttrib() {
		return NoInstrAttrib;
	}

	public void setNoInstrAttrib(List<NoInstrAttrib> noInstrAttrib) {
		NoInstrAttrib = noInstrAttrib;
	}

	public static class NoInstrAttrib {
		private int InstrAttribType;

		public int getInstrAttribType() {
			return InstrAttribType;
		}

		public void setInstrAttribType(int instrAttribType) {
			InstrAttribType = instrAttribType;
		}

		private java.lang.String InstrAttribValue;

		public java.lang.String getInstrAttribValue() {
			return InstrAttribValue;
		}

		public void setInstrAttribValue(java.lang.String instrAttribValue) {
			InstrAttribValue = instrAttribValue;
		}
	}
} // Fim do Componente: InstrumentExtension
