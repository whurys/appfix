package appfix.model.message.component;

import java.util.List;

public class InstrumentLeg {
	private java.lang.String LegSymbol;

	public java.lang.String getLegSymbol() {
		return LegSymbol;
	}

	public void setLegSymbol(java.lang.String legSymbol) {
		LegSymbol = legSymbol;
	}

	private java.lang.String LegSymbolSfx;

	public java.lang.String getLegSymbolSfx() {
		return LegSymbolSfx;
	}

	public void setLegSymbolSfx(java.lang.String legSymbolSfx) {
		LegSymbolSfx = legSymbolSfx;
	}

	private java.lang.String LegSecurityID;

	public java.lang.String getLegSecurityID() {
		return LegSecurityID;
	}

	public void setLegSecurityID(java.lang.String legSecurityID) {
		LegSecurityID = legSecurityID;
	}

	private java.lang.String LegSecurityIDSource;

	public java.lang.String getLegSecurityIDSource() {
		return LegSecurityIDSource;
	}

	public void setLegSecurityIDSource(java.lang.String legSecurityIDSource) {
		LegSecurityIDSource = legSecurityIDSource;
	}

	private List<NoLegSecurityAltID> NoLegSecurityAltID;

	public List<NoLegSecurityAltID> getNoLegSecurityAltID() {
		return NoLegSecurityAltID;
	}

	public void setNoLegSecurityAltID(List<NoLegSecurityAltID> noLegSecurityAltID) {
		NoLegSecurityAltID = noLegSecurityAltID;
	}

	public static class NoLegSecurityAltID {
		private java.lang.String LegSecurityAltID;

		public java.lang.String getLegSecurityAltID() {
			return LegSecurityAltID;
		}

		public void setLegSecurityAltID(java.lang.String legSecurityAltID) {
			LegSecurityAltID = legSecurityAltID;
		}

		private java.lang.String LegSecurityAltIDSource;

		public java.lang.String getLegSecurityAltIDSource() {
			return LegSecurityAltIDSource;
		}

		public void setLegSecurityAltIDSource(java.lang.String legSecurityAltIDSource) {
			LegSecurityAltIDSource = legSecurityAltIDSource;
		}
	}

	private int LegProduct;

	public int getLegProduct() {
		return LegProduct;
	}

	public void setLegProduct(int legProduct) {
		LegProduct = legProduct;
	}

	private java.lang.String LegCFICode;

	public java.lang.String getLegCFICode() {
		return LegCFICode;
	}

	public void setLegCFICode(java.lang.String legCFICode) {
		LegCFICode = legCFICode;
	}

	private java.lang.String LegSecurityType;

	public java.lang.String getLegSecurityType() {
		return LegSecurityType;
	}

	public void setLegSecurityType(java.lang.String legSecurityType) {
		LegSecurityType = legSecurityType;
	}

	private java.lang.String LegSecuritySubType;

	public java.lang.String getLegSecuritySubType() {
		return LegSecuritySubType;
	}

	public void setLegSecuritySubType(java.lang.String legSecuritySubType) {
		LegSecuritySubType = legSecuritySubType;
	}

	private java.lang.String LegMaturityMonthYear;

	public java.lang.String getLegMaturityMonthYear() {
		return LegMaturityMonthYear;
	}

	public void setLegMaturityMonthYear(java.lang.String legMaturityMonthYear) {
		LegMaturityMonthYear = legMaturityMonthYear;
	}

	private java.lang.String LegMaturityDate;

	public java.lang.String getLegMaturityDate() {
		return LegMaturityDate;
	}

	public void setLegMaturityDate(java.lang.String legMaturityDate) {
		LegMaturityDate = legMaturityDate;
	}

	private java.lang.String LegCouponPaymentDate;

	public java.lang.String getLegCouponPaymentDate() {
		return LegCouponPaymentDate;
	}

	public void setLegCouponPaymentDate(java.lang.String legCouponPaymentDate) {
		LegCouponPaymentDate = legCouponPaymentDate;
	}

	private java.lang.String LegIssueDate;

	public java.lang.String getLegIssueDate() {
		return LegIssueDate;
	}

	public void setLegIssueDate(java.lang.String legIssueDate) {
		LegIssueDate = legIssueDate;
	}

	private java.lang.String LegRepoCollateralSecurityType;

	public java.lang.String getLegRepoCollateralSecurityType() {
		return LegRepoCollateralSecurityType;
	}

	public void setLegRepoCollateralSecurityType(java.lang.String legRepoCollateralSecurityType) {
		LegRepoCollateralSecurityType = legRepoCollateralSecurityType;
	}

	private int LegRepurchaseTerm;

	public int getLegRepurchaseTerm() {
		return LegRepurchaseTerm;
	}

	public void setLegRepurchaseTerm(int legRepurchaseTerm) {
		LegRepurchaseTerm = legRepurchaseTerm;
	}

	private double LegRepurchaseRate;

	public double getLegRepurchaseRate() {
		return LegRepurchaseRate;
	}

	public void setLegRepurchaseRate(double legRepurchaseRate) {
		LegRepurchaseRate = legRepurchaseRate;
	}

	private double LegFactor;

	public double getLegFactor() {
		return LegFactor;
	}

	public void setLegFactor(double legFactor) {
		LegFactor = legFactor;
	}

	private java.lang.String LegCreditRating;

	public java.lang.String getLegCreditRating() {
		return LegCreditRating;
	}

	public void setLegCreditRating(java.lang.String legCreditRating) {
		LegCreditRating = legCreditRating;
	}

	private java.lang.String LegInstrRegistry;

	public java.lang.String getLegInstrRegistry() {
		return LegInstrRegistry;
	}

	public void setLegInstrRegistry(java.lang.String legInstrRegistry) {
		LegInstrRegistry = legInstrRegistry;
	}

	private java.lang.String LegCountryOfIssue;

	public java.lang.String getLegCountryOfIssue() {
		return LegCountryOfIssue;
	}

	public void setLegCountryOfIssue(java.lang.String legCountryOfIssue) {
		LegCountryOfIssue = legCountryOfIssue;
	}

	private java.lang.String LegStateOrProvinceOfIssue;

	public java.lang.String getLegStateOrProvinceOfIssue() {
		return LegStateOrProvinceOfIssue;
	}

	public void setLegStateOrProvinceOfIssue(java.lang.String legStateOrProvinceOfIssue) {
		LegStateOrProvinceOfIssue = legStateOrProvinceOfIssue;
	}

	private java.lang.String LegLocaleOfIssue;

	public java.lang.String getLegLocaleOfIssue() {
		return LegLocaleOfIssue;
	}

	public void setLegLocaleOfIssue(java.lang.String legLocaleOfIssue) {
		LegLocaleOfIssue = legLocaleOfIssue;
	}

	private java.lang.String LegRedemptionDate;

	public java.lang.String getLegRedemptionDate() {
		return LegRedemptionDate;
	}

	public void setLegRedemptionDate(java.lang.String legRedemptionDate) {
		LegRedemptionDate = legRedemptionDate;
	}

	private double LegStrikePrice;

	public double getLegStrikePrice() {
		return LegStrikePrice;
	}

	public void setLegStrikePrice(double legStrikePrice) {
		LegStrikePrice = legStrikePrice;
	}

	private java.lang.String LegStrikeCurrency;

	public java.lang.String getLegStrikeCurrency() {
		return LegStrikeCurrency;
	}

	public void setLegStrikeCurrency(java.lang.String legStrikeCurrency) {
		LegStrikeCurrency = legStrikeCurrency;
	}

	private char LegOptAttribute;

	public char getLegOptAttribute() {
		return LegOptAttribute;
	}

	public void setLegOptAttribute(char legOptAttribute) {
		LegOptAttribute = legOptAttribute;
	}

	private double LegContractMultiplier;

	public double getLegContractMultiplier() {
		return LegContractMultiplier;
	}

	public void setLegContractMultiplier(double legContractMultiplier) {
		LegContractMultiplier = legContractMultiplier;
	}

	private double LegCouponRate;

	public double getLegCouponRate() {
		return LegCouponRate;
	}

	public void setLegCouponRate(double legCouponRate) {
		LegCouponRate = legCouponRate;
	}

	private java.lang.String LegSecurityExchange;

	public java.lang.String getLegSecurityExchange() {
		return LegSecurityExchange;
	}

	public void setLegSecurityExchange(java.lang.String legSecurityExchange) {
		LegSecurityExchange = legSecurityExchange;
	}

	private java.lang.String LegIssuer;

	public java.lang.String getLegIssuer() {
		return LegIssuer;
	}

	public void setLegIssuer(java.lang.String legIssuer) {
		LegIssuer = legIssuer;
	}

	private int EncodedLegIssuerLen;

	public int getEncodedLegIssuerLen() {
		return EncodedLegIssuerLen;
	}

	public void setEncodedLegIssuerLen(int encodedLegIssuerLen) {
		EncodedLegIssuerLen = encodedLegIssuerLen;
	}

	private java.lang.String EncodedLegIssuer;

	public java.lang.String getEncodedLegIssuer() {
		return EncodedLegIssuer;
	}

	public void setEncodedLegIssuer(java.lang.String encodedLegIssuer) {
		EncodedLegIssuer = encodedLegIssuer;
	}

	private java.lang.String LegSecurityDesc;

	public java.lang.String getLegSecurityDesc() {
		return LegSecurityDesc;
	}

	public void setLegSecurityDesc(java.lang.String legSecurityDesc) {
		LegSecurityDesc = legSecurityDesc;
	}

	private int EncodedLegSecurityDescLen;

	public int getEncodedLegSecurityDescLen() {
		return EncodedLegSecurityDescLen;
	}

	public void setEncodedLegSecurityDescLen(int encodedLegSecurityDescLen) {
		EncodedLegSecurityDescLen = encodedLegSecurityDescLen;
	}

	private java.lang.String EncodedLegSecurityDesc;

	public java.lang.String getEncodedLegSecurityDesc() {
		return EncodedLegSecurityDesc;
	}

	public void setEncodedLegSecurityDesc(java.lang.String encodedLegSecurityDesc) {
		EncodedLegSecurityDesc = encodedLegSecurityDesc;
	}

	private double LegRatioQty;

	public double getLegRatioQty() {
		return LegRatioQty;
	}

	public void setLegRatioQty(double legRatioQty) {
		LegRatioQty = legRatioQty;
	}

	private char LegSide;

	public char getLegSide() {
		return LegSide;
	}

	public void setLegSide(char legSide) {
		LegSide = legSide;
	}

	private java.lang.String LegCurrency;

	public java.lang.String getLegCurrency() {
		return LegCurrency;
	}

	public void setLegCurrency(java.lang.String legCurrency) {
		LegCurrency = legCurrency;
	}

	private java.lang.String LegPool;

	public java.lang.String getLegPool() {
		return LegPool;
	}

	public void setLegPool(java.lang.String legPool) {
		LegPool = legPool;
	}

	private java.lang.String LegDatedDate;

	public java.lang.String getLegDatedDate() {
		return LegDatedDate;
	}

	public void setLegDatedDate(java.lang.String legDatedDate) {
		LegDatedDate = legDatedDate;
	}

	private java.lang.String LegContractSettlMonth;

	public java.lang.String getLegContractSettlMonth() {
		return LegContractSettlMonth;
	}

	public void setLegContractSettlMonth(java.lang.String legContractSettlMonth) {
		LegContractSettlMonth = legContractSettlMonth;
	}

	private java.lang.String LegInterestAccrualDate;

	public java.lang.String getLegInterestAccrualDate() {
		return LegInterestAccrualDate;
	}

	public void setLegInterestAccrualDate(java.lang.String legInterestAccrualDate) {
		LegInterestAccrualDate = legInterestAccrualDate;
	}
} // Fim do Componente: InstrumentLeg
