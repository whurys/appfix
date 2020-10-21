package appfix.model.message.component;

import java.util.List;

public class Instrument {
	
	private java.lang.String Symbol;

	public java.lang.String getSymbol() {
		return Symbol;
	}

	public void setSymbol(java.lang.String symbol) {
		Symbol = symbol;
	}

	private java.lang.String SymbolSfx;

	public java.lang.String getSymbolSfx() {
		return SymbolSfx;
	}

	public void setSymbolSfx(java.lang.String symbolSfx) {
		SymbolSfx = symbolSfx;
	}

	private java.lang.String SecurityID;

	public java.lang.String getSecurityID() {
		return SecurityID;
	}

	public void setSecurityID(java.lang.String securityID) {
		SecurityID = securityID;
	}

	private java.lang.String SecurityIDSource;

	public java.lang.String getSecurityIDSource() {
		return SecurityIDSource;
	}

	public void setSecurityIDSource(java.lang.String securityIDSource) {
		SecurityIDSource = securityIDSource;
	}

	private List<NoSecurityAltID> NoSecurityAltID;

	public List<NoSecurityAltID> getNoSecurityAltID() {
		return NoSecurityAltID;
	}

	public void setNoSecurityAltID(List<NoSecurityAltID> noSecurityAltID) {
		NoSecurityAltID = noSecurityAltID;
	}

	public static class NoSecurityAltID {
		private java.lang.String SecurityAltID;

		public java.lang.String getSecurityAltID() {
			return SecurityAltID;
		}

		public void setSecurityAltID(java.lang.String securityAltID) {
			SecurityAltID = securityAltID;
		}

		private java.lang.String SecurityAltIDSource;

		public java.lang.String getSecurityAltIDSource() {
			return SecurityAltIDSource;
		}

		public void setSecurityAltIDSource(java.lang.String securityAltIDSource) {
			SecurityAltIDSource = securityAltIDSource;
		}
	}

	private int Product;

	public int getProduct() {
		return Product;
	}

	public void setProduct(int product) {
		Product = product;
	}

	private java.lang.String CFICode;

	public java.lang.String getCFICode() {
		return CFICode;
	}

	public void setCFICode(java.lang.String cFICode) {
		CFICode = cFICode;
	}

	private java.lang.String SecurityType;

	public java.lang.String getSecurityType() {
		return SecurityType;
	}

	public void setSecurityType(java.lang.String securityType) {
		SecurityType = securityType;
	}

	private java.lang.String SecuritySubType;

	public java.lang.String getSecuritySubType() {
		return SecuritySubType;
	}

	public void setSecuritySubType(java.lang.String securitySubType) {
		SecuritySubType = securitySubType;
	}

	private java.lang.String MaturityMonthYear;

	public java.lang.String getMaturityMonthYear() {
		return MaturityMonthYear;
	}

	public void setMaturityMonthYear(java.lang.String maturityMonthYear) {
		MaturityMonthYear = maturityMonthYear;
	}

	private java.lang.String MaturityDate;

	public java.lang.String getMaturityDate() {
		return MaturityDate;
	}

	public void setMaturityDate(java.lang.String maturityDate) {
		MaturityDate = maturityDate;
	}

	private int PutOrCall;

	public int getPutOrCall() {
		return PutOrCall;
	}

	public void setPutOrCall(int putOrCall) {
		PutOrCall = putOrCall;
	}

	private java.lang.String CouponPaymentDate;

	public java.lang.String getCouponPaymentDate() {
		return CouponPaymentDate;
	}

	public void setCouponPaymentDate(java.lang.String couponPaymentDate) {
		CouponPaymentDate = couponPaymentDate;
	}

	private java.lang.String IssueDate;

	public java.lang.String getIssueDate() {
		return IssueDate;
	}

	public void setIssueDate(java.lang.String issueDate) {
		IssueDate = issueDate;
	}

	private java.lang.String RepoCollateralSecurityType;

	public java.lang.String getRepoCollateralSecurityType() {
		return RepoCollateralSecurityType;
	}

	public void setRepoCollateralSecurityType(java.lang.String repoCollateralSecurityType) {
		RepoCollateralSecurityType = repoCollateralSecurityType;
	}

	private int RepurchaseTerm;

	public int getRepurchaseTerm() {
		return RepurchaseTerm;
	}

	public void setRepurchaseTerm(int repurchaseTerm) {
		RepurchaseTerm = repurchaseTerm;
	}

	private double RepurchaseRate;

	public double getRepurchaseRate() {
		return RepurchaseRate;
	}

	public void setRepurchaseRate(double repurchaseRate) {
		RepurchaseRate = repurchaseRate;
	}

	private double Factor;

	public double getFactor() {
		return Factor;
	}

	public void setFactor(double factor) {
		Factor = factor;
	}

	private java.lang.String CreditRating;

	public java.lang.String getCreditRating() {
		return CreditRating;
	}

	public void setCreditRating(java.lang.String creditRating) {
		CreditRating = creditRating;
	}

	private java.lang.String InstrRegistry;

	public java.lang.String getInstrRegistry() {
		return InstrRegistry;
	}

	public void setInstrRegistry(java.lang.String instrRegistry) {
		InstrRegistry = instrRegistry;
	}

	private java.lang.String CountryOfIssue;

	public java.lang.String getCountryOfIssue() {
		return CountryOfIssue;
	}

	public void setCountryOfIssue(java.lang.String countryOfIssue) {
		CountryOfIssue = countryOfIssue;
	}

	private java.lang.String StateOrProvinceOfIssue;

	public java.lang.String getStateOrProvinceOfIssue() {
		return StateOrProvinceOfIssue;
	}

	public void setStateOrProvinceOfIssue(java.lang.String stateOrProvinceOfIssue) {
		StateOrProvinceOfIssue = stateOrProvinceOfIssue;
	}

	private java.lang.String LocaleOfIssue;

	public java.lang.String getLocaleOfIssue() {
		return LocaleOfIssue;
	}

	public void setLocaleOfIssue(java.lang.String localeOfIssue) {
		LocaleOfIssue = localeOfIssue;
	}

	private java.lang.String RedemptionDate;

	public java.lang.String getRedemptionDate() {
		return RedemptionDate;
	}

	public void setRedemptionDate(java.lang.String redemptionDate) {
		RedemptionDate = redemptionDate;
	}

	private double StrikePrice;

	public double getStrikePrice() {
		return StrikePrice;
	}

	public void setStrikePrice(double strikePrice) {
		StrikePrice = strikePrice;
	}

	private java.lang.String StrikeCurrency;

	public java.lang.String getStrikeCurrency() {
		return StrikeCurrency;
	}

	public void setStrikeCurrency(java.lang.String strikeCurrency) {
		StrikeCurrency = strikeCurrency;
	}

	private char OptAttribute;

	public char getOptAttribute() {
		return OptAttribute;
	}

	public void setOptAttribute(char optAttribute) {
		OptAttribute = optAttribute;
	}

	private double ContractMultiplier;

	public double getContractMultiplier() {
		return ContractMultiplier;
	}

	public void setContractMultiplier(double contractMultiplier) {
		ContractMultiplier = contractMultiplier;
	}

	private double CouponRate;

	public double getCouponRate() {
		return CouponRate;
	}

	public void setCouponRate(double couponRate) {
		CouponRate = couponRate;
	}

	private java.lang.String SecurityExchange;

	public java.lang.String getSecurityExchange() {
		return SecurityExchange;
	}

	public void setSecurityExchange(java.lang.String securityExchange) {
		SecurityExchange = securityExchange;
	}

	private java.lang.String Issuer;

	public java.lang.String getIssuer() {
		return Issuer;
	}

	public void setIssuer(java.lang.String issuer) {
		Issuer = issuer;
	}

	private int EncodedIssuerLen;

	public int getEncodedIssuerLen() {
		return EncodedIssuerLen;
	}

	public void setEncodedIssuerLen(int encodedIssuerLen) {
		EncodedIssuerLen = encodedIssuerLen;
	}

	private java.lang.String EncodedIssuer;

	public java.lang.String getEncodedIssuer() {
		return EncodedIssuer;
	}

	public void setEncodedIssuer(java.lang.String encodedIssuer) {
		EncodedIssuer = encodedIssuer;
	}

	private java.lang.String SecurityDesc;

	public java.lang.String getSecurityDesc() {
		return SecurityDesc;
	}

	public void setSecurityDesc(java.lang.String securityDesc) {
		SecurityDesc = securityDesc;
	}

	private int EncodedSecurityDescLen;

	public int getEncodedSecurityDescLen() {
		return EncodedSecurityDescLen;
	}

	public void setEncodedSecurityDescLen(int encodedSecurityDescLen) {
		EncodedSecurityDescLen = encodedSecurityDescLen;
	}

	private java.lang.String EncodedSecurityDesc;

	public java.lang.String getEncodedSecurityDesc() {
		return EncodedSecurityDesc;
	}

	public void setEncodedSecurityDesc(java.lang.String encodedSecurityDesc) {
		EncodedSecurityDesc = encodedSecurityDesc;
	}

	private java.lang.String Pool;

	public java.lang.String getPool() {
		return Pool;
	}

	public void setPool(java.lang.String pool) {
		Pool = pool;
	}

	private java.lang.String ContractSettlMonth;

	public java.lang.String getContractSettlMonth() {
		return ContractSettlMonth;
	}

	public void setContractSettlMonth(java.lang.String contractSettlMonth) {
		ContractSettlMonth = contractSettlMonth;
	}

	private int CPProgram;

	public int getCPProgram() {
		return CPProgram;
	}

	public void setCPProgram(int cPProgram) {
		CPProgram = cPProgram;
	}

	private java.lang.String CPRegType;

	public java.lang.String getCPRegType() {
		return CPRegType;
	}

	public void setCPRegType(java.lang.String cPRegType) {
		CPRegType = cPRegType;
	}

	private List<NoEvents> NoEvents;

	public List<NoEvents> getNoEvents() {
		return NoEvents;
	}

	public void setNoEvents(List<NoEvents> noEvents) {
		NoEvents = noEvents;
	}

	public static class NoEvents {
		private int EventType;

		public int getEventType() {
			return EventType;
		}

		public void setEventType(int eventType) {
			EventType = eventType;
		}

		private java.lang.String EventDate;

		public java.lang.String getEventDate() {
			return EventDate;
		}

		public void setEventDate(java.lang.String eventDate) {
			EventDate = eventDate;
		}

		private double EventPx;

		public double getEventPx() {
			return EventPx;
		}

		public void setEventPx(double eventPx) {
			EventPx = eventPx;
		}

		private java.lang.String EventText;

		public java.lang.String getEventText() {
			return EventText;
		}

		public void setEventText(java.lang.String eventText) {
			EventText = eventText;
		}
	}

	private java.lang.String DatedDate;

	public java.lang.String getDatedDate() {
		return DatedDate;
	}

	public void setDatedDate(java.lang.String datedDate) {
		DatedDate = datedDate;
	}

	private java.lang.String InterestAccrualDate;

	public java.lang.String getInterestAccrualDate() {
		return InterestAccrualDate;
	}

	public void setInterestAccrualDate(java.lang.String interestAccrualDate) {
		InterestAccrualDate = interestAccrualDate;
	}
} // Fim do Componente: Instrument
