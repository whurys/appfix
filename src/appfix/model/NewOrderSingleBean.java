package appfix.model;

import java.time.LocalDateTime;

public class NewOrderSingleBean extends MessageBean {

	private String Account;
	private int AccountType;
	private double AccruedInterestAmt;
	private double AccruedInterestRate;
	private int AcctIDSource;
	private String AgreementCurrency;
	private String AgreementDate;
	private String AgreementDesc;
	private String AgreementID;
	private String AllocID;
	private String BenchmarkCurveCurrency;
	private String BenchmarkCurveName;
	private String BenchmarkCurvePoint;
	private double BenchmarkPrice;
	private int BenchmarkPriceType;
	private String BenchmarkSecurityID;
	private String BenchmarkSecurityIDSource;
	private int BookingType;
	private char BookingUnit;
	private String CFICode;
	private int CPProgram;
	private String CPRegType;
	private char CancellationRights;
	private char CashMargin;
	private double CashOrderQty;
	private String ClOrdID;
	private String ClOrdLinkID;
	private String ClearingAccount;
	private String ClearingFeeIndicator;
	private String ClearingFirm;
	private String ClientID;
	private String CommCurrency;
	private char CommType;
	private double Commission;
	private String ComplianceID;
	private double ContractMultiplier;
	private String ContractSettlMonth;
	private String CountryOfIssue;
	private String CouponPaymentDate;
	private double CouponRate;
	private int CoveredOrUncovered;
	private String CreditRating;
	private String Currency;
	private boolean CustDirectedOrder;
	private int CustOrderCapacity;
	private String CustOrderHandlingInst;
	private int CustomerOrFirm;
	private String DatedDate;
	private char DayBookingInst;
	private int DeliveryType;
	private String Designation;
	private char DiscretionInst;
	private int DiscretionLimitType;
	private int DiscretionMoveType;
	private double DiscretionOffset;
	private int DiscretionOffsetType;
	private double DiscretionOffsetValue;
	private int DiscretionRoundDirection;
	private int DiscretionScope;
	private double DisplayHighQty;
	private double DisplayLowQty;
	private char DisplayMethod;
	private double DisplayMinIncr;
	private double DisplayQty;
	private char DisplayWhen;
	private LocalDateTime EffectiveTime;
	private String EncodedIssuer;
	private int EncodedIssuerLen;
	private String EncodedSecurityDesc;
	private int EncodedSecurityDescLen;
	private String EncodedText;
	private int EncodedTextLen;
	private String EndDate;
	private String ExDestination;
	private char ExDestinationIDSource;
	private String ExecBroker;
	private String ExecInst;
	private String ExpireDate;
	private LocalDateTime ExpireTime;
	private double Factor;
	private boolean ForexReq;
	private char FundRenewWaiv;
	private String FutSettDate;
	private String FutSettDate2;
	private int GTBookingInst;
	private char HandlInst;
	private String IDSource;
	private String IOIID;
	private String InstrRegistry;
	private char InstrmtAssignmentMethod;
	private String InterestAccrualDate;
	private String IssueDate;
	private String Issuer;
	private String LocaleOfIssue;
	private boolean LocateReqd;
	private boolean ManualOrderIndicator;
	private double MarginRatio;
	private double MatchIncrement;
	private String MaturityDate;
	private String MaturityDay;
	private String MaturityMonthYear;
	private String MaturityTime;
	private double MaxFloor;
	private int MaxPriceLevels;
	private double MaxShow;
	private double MinPriceIncrement;
	private double MinQty;
	private char MoneyLaunderingStatus;
	private int NTPositionLimit;
	private double NetMoney;
	private int NoAllocs;
	private int NoEvents;
	private int NoInstrumentParties;
	private int NoPartyIDs;
	private int NoSecurityAltID;
	private int NoStipulations;
	private int NoStrategyParameters;
	private int NoTradingSessions;
	private int NoTrdRegTimestamps;
	private int NoUnderlyings;
	private char OpenClose;
	private char OptAttribute;
	private char OrdType;
	private char OrderCapacity;
	private int OrderHandlingInstSource;
	private double OrderPercent;
	private double OrderQty;
	private double OrderQty2;
	private String OrderRestrictions;
	private double ParticipationRate;
	private double PegDifference;
	private int PegLimitType;
	private int PegMoveType;
	private int PegOffsetType;
	private double PegOffsetValue;
	private int PegPriceType;
	private int PegRoundDirection;
	private int PegScope;
	private String PegSecurityDesc;
	private String PegSecurityID;
	private String PegSecurityIDSource;
	private String PegSymbol;
	private String Pool;
	private char PositionEffect;
	private int PositionLimit;
	private boolean PreTradeAnonymity;
	private char PreallocMethod;
	private double PrevClosePx;
	private double Price;
	private double Price2;
	private char PriceProtectionScope;
	private int PriceType;
	private char ProcessCode;
	private int Product;
	private int PutOrCall;
	private int QtyType;
	private int QuantityType;
	private String QuoteID;
	private String ReceivedDeptID;
	private String RedemptionDate;
	private String RefOrderID;
	private char RefOrderIDSource;
	private double RefreshQty;
	private String RegistID;
	private String RepoCollateralSecurityType;
	private double RepurchaseRate;
	private int RepurchaseTerm;
	private char RoundingDirection;
	private double RoundingModulus;
	private char Rule80A;
	private String SecondaryClOrdID;
	private double SecondaryDisplayQty;
	private String SecurityDesc;
	private String SecurityExchange;
	private String SecurityID;
	private String SecurityIDSource;
	private String SecurityStatus;
	private String SecuritySubType;
	private String SecurityType;
	private String SettlCurrency;
	private String SettlDate;
	private String SettlDate2;
	private String SettlType;
	private String SettleOnOpenFlag;
	private char SettlmntTyp;
	private char Side;
	private boolean SolicitedFlag;
	private double Spread;
	private String StartDate;
	private String StateOrProvinceOfIssue;
	private double StopPx;
	private String StrikeCurrency;
	private double StrikeMultiplier;
	private double StrikePrice;
	private double StrikeValue;
	private String Symbol;
	private String SymbolSfx;
	private int TargetStrategy;
	private String TargetStrategyParameters;
	private int TerminationType;
	private String Text;
	private char TimeInForce;
	private String TimeUnit;
	private String TradeDate;
	private String TradeOriginationDate;
	private LocalDateTime TransactTime;
	private char TriggerAction;
	private double TriggerNewPrice;
	private double TriggerNewQty;
	private char TriggerOrderType;
	private double TriggerPrice;
	private char TriggerPriceDirection;
	private char TriggerPriceType;
	private char TriggerPriceTypeScope;
	private String TriggerSecurityDesc;
	private String TriggerSecurityID;
	private String TriggerSecurityIDSource;
	private String TriggerSymbol;
	private String TriggerTradingSessionID;
	private String TriggerTradingSessionSubID;
	private char TriggerType;
	private String UnitOfMeasure;
	private double Yield;
	private String YieldCalcDate;
	private String YieldRedemptionDate;
	private double YieldRedemptionPrice;
	private int YieldRedemptionPriceType;
	private String YieldType;
	
	public String getAccount() {
		return Account;
	}

	public void setAccount(String account) {
		Account = account;
	}

	public int getAccountType() {
		return AccountType;
	}

	public void setAccountType(int accountType) {
		AccountType = accountType;
	}

	public double getAccruedInterestAmt() {
		return AccruedInterestAmt;
	}

	public void setAccruedInterestAmt(double accruedInterestAmt) {
		AccruedInterestAmt = accruedInterestAmt;
	}

	public double getAccruedInterestRate() {
		return AccruedInterestRate;
	}

	public void setAccruedInterestRate(double accruedInterestRate) {
		AccruedInterestRate = accruedInterestRate;
	}

	public int getAcctIDSource() {
		return AcctIDSource;
	}

	public void setAcctIDSource(int acctIDSource) {
		AcctIDSource = acctIDSource;
	}

	public String getAgreementCurrency() {
		return AgreementCurrency;
	}

	public void setAgreementCurrency(String agreementCurrency) {
		AgreementCurrency = agreementCurrency;
	}

	public String getAgreementDate() {
		return AgreementDate;
	}

	public void setAgreementDate(String agreementDate) {
		AgreementDate = agreementDate;
	}

	public String getAgreementDesc() {
		return AgreementDesc;
	}

	public void setAgreementDesc(String agreementDesc) {
		AgreementDesc = agreementDesc;
	}

	public String getAgreementID() {
		return AgreementID;
	}

	public void setAgreementID(String agreementID) {
		AgreementID = agreementID;
	}

	public String getAllocID() {
		return AllocID;
	}

	public void setAllocID(String allocID) {
		AllocID = allocID;
	}

	public String getBenchmarkCurveCurrency() {
		return BenchmarkCurveCurrency;
	}

	public void setBenchmarkCurveCurrency(String benchmarkCurveCurrency) {
		BenchmarkCurveCurrency = benchmarkCurveCurrency;
	}

	public String getBenchmarkCurveName() {
		return BenchmarkCurveName;
	}

	public void setBenchmarkCurveName(String benchmarkCurveName) {
		BenchmarkCurveName = benchmarkCurveName;
	}

	public String getBenchmarkCurvePoint() {
		return BenchmarkCurvePoint;
	}

	public void setBenchmarkCurvePoint(String benchmarkCurvePoint) {
		BenchmarkCurvePoint = benchmarkCurvePoint;
	}

	public double getBenchmarkPrice() {
		return BenchmarkPrice;
	}

	public void setBenchmarkPrice(double benchmarkPrice) {
		BenchmarkPrice = benchmarkPrice;
	}

	public int getBenchmarkPriceType() {
		return BenchmarkPriceType;
	}

	public void setBenchmarkPriceType(int benchmarkPriceType) {
		BenchmarkPriceType = benchmarkPriceType;
	}

	public String getBenchmarkSecurityID() {
		return BenchmarkSecurityID;
	}

	public void setBenchmarkSecurityID(String benchmarkSecurityID) {
		BenchmarkSecurityID = benchmarkSecurityID;
	}

	public String getBenchmarkSecurityIDSource() {
		return BenchmarkSecurityIDSource;
	}

	public void setBenchmarkSecurityIDSource(String benchmarkSecurityIDSource) {
		BenchmarkSecurityIDSource = benchmarkSecurityIDSource;
	}

	public int getBookingType() {
		return BookingType;
	}

	public void setBookingType(int bookingType) {
		BookingType = bookingType;
	}

	public char getBookingUnit() {
		return BookingUnit;
	}

	public void setBookingUnit(char bookingUnit) {
		BookingUnit = bookingUnit;
	}

	public String getCFICode() {
		return CFICode;
	}

	public void setCFICode(String cFICode) {
		CFICode = cFICode;
	}

	public int getCPProgram() {
		return CPProgram;
	}

	public void setCPProgram(int cPProgram) {
		CPProgram = cPProgram;
	}

	public String getCPRegType() {
		return CPRegType;
	}

	public void setCPRegType(String cPRegType) {
		CPRegType = cPRegType;
	}

	public char getCancellationRights() {
		return CancellationRights;
	}

	public void setCancellationRights(char cancellationRights) {
		CancellationRights = cancellationRights;
	}

	public char getCashMargin() {
		return CashMargin;
	}

	public void setCashMargin(char cashMargin) {
		CashMargin = cashMargin;
	}

	public double getCashOrderQty() {
		return CashOrderQty;
	}

	public void setCashOrderQty(double cashOrderQty) {
		CashOrderQty = cashOrderQty;
	}

	public String getClOrdID() {
		return ClOrdID;
	}

	public void setClOrdID(String clOrdID) {
		ClOrdID = clOrdID;
	}

	public String getClOrdLinkID() {
		return ClOrdLinkID;
	}

	public void setClOrdLinkID(String clOrdLinkID) {
		ClOrdLinkID = clOrdLinkID;
	}

	public String getClearingAccount() {
		return ClearingAccount;
	}

	public void setClearingAccount(String clearingAccount) {
		ClearingAccount = clearingAccount;
	}

	public String getClearingFeeIndicator() {
		return ClearingFeeIndicator;
	}

	public void setClearingFeeIndicator(String clearingFeeIndicator) {
		ClearingFeeIndicator = clearingFeeIndicator;
	}

	public String getClearingFirm() {
		return ClearingFirm;
	}

	public void setClearingFirm(String clearingFirm) {
		ClearingFirm = clearingFirm;
	}

	public String getClientID() {
		return ClientID;
	}

	public void setClientID(String clientID) {
		ClientID = clientID;
	}

	public String getCommCurrency() {
		return CommCurrency;
	}

	public void setCommCurrency(String commCurrency) {
		CommCurrency = commCurrency;
	}

	public char getCommType() {
		return CommType;
	}

	public void setCommType(char commType) {
		CommType = commType;
	}

	public double getCommission() {
		return Commission;
	}

	public void setCommission(double commission) {
		Commission = commission;
	}

	public String getComplianceID() {
		return ComplianceID;
	}

	public void setComplianceID(String complianceID) {
		ComplianceID = complianceID;
	}

	public double getContractMultiplier() {
		return ContractMultiplier;
	}

	public void setContractMultiplier(double contractMultiplier) {
		ContractMultiplier = contractMultiplier;
	}

	public String getContractSettlMonth() {
		return ContractSettlMonth;
	}

	public void setContractSettlMonth(String contractSettlMonth) {
		ContractSettlMonth = contractSettlMonth;
	}

	public String getCountryOfIssue() {
		return CountryOfIssue;
	}

	public void setCountryOfIssue(String countryOfIssue) {
		CountryOfIssue = countryOfIssue;
	}

	public String getCouponPaymentDate() {
		return CouponPaymentDate;
	}

	public void setCouponPaymentDate(String couponPaymentDate) {
		CouponPaymentDate = couponPaymentDate;
	}

	public double getCouponRate() {
		return CouponRate;
	}

	public void setCouponRate(double couponRate) {
		CouponRate = couponRate;
	}

	public int getCoveredOrUncovered() {
		return CoveredOrUncovered;
	}

	public void setCoveredOrUncovered(int coveredOrUncovered) {
		CoveredOrUncovered = coveredOrUncovered;
	}

	public String getCreditRating() {
		return CreditRating;
	}

	public void setCreditRating(String creditRating) {
		CreditRating = creditRating;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public boolean isCustDirectedOrder() {
		return CustDirectedOrder;
	}

	public void setCustDirectedOrder(boolean custDirectedOrder) {
		CustDirectedOrder = custDirectedOrder;
	}

	public int getCustOrderCapacity() {
		return CustOrderCapacity;
	}

	public void setCustOrderCapacity(int custOrderCapacity) {
		CustOrderCapacity = custOrderCapacity;
	}

	public String getCustOrderHandlingInst() {
		return CustOrderHandlingInst;
	}

	public void setCustOrderHandlingInst(String custOrderHandlingInst) {
		CustOrderHandlingInst = custOrderHandlingInst;
	}

	public int getCustomerOrFirm() {
		return CustomerOrFirm;
	}

	public void setCustomerOrFirm(int customerOrFirm) {
		CustomerOrFirm = customerOrFirm;
	}

	public String getDatedDate() {
		return DatedDate;
	}

	public void setDatedDate(String datedDate) {
		DatedDate = datedDate;
	}

	public char getDayBookingInst() {
		return DayBookingInst;
	}

	public void setDayBookingInst(char dayBookingInst) {
		DayBookingInst = dayBookingInst;
	}

	public int getDeliveryType() {
		return DeliveryType;
	}

	public void setDeliveryType(int deliveryType) {
		DeliveryType = deliveryType;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public char getDiscretionInst() {
		return DiscretionInst;
	}

	public void setDiscretionInst(char discretionInst) {
		DiscretionInst = discretionInst;
	}

	public int getDiscretionLimitType() {
		return DiscretionLimitType;
	}

	public void setDiscretionLimitType(int discretionLimitType) {
		DiscretionLimitType = discretionLimitType;
	}

	public int getDiscretionMoveType() {
		return DiscretionMoveType;
	}

	public void setDiscretionMoveType(int discretionMoveType) {
		DiscretionMoveType = discretionMoveType;
	}

	public double getDiscretionOffset() {
		return DiscretionOffset;
	}

	public void setDiscretionOffset(double discretionOffset) {
		DiscretionOffset = discretionOffset;
	}

	public int getDiscretionOffsetType() {
		return DiscretionOffsetType;
	}

	public void setDiscretionOffsetType(int discretionOffsetType) {
		DiscretionOffsetType = discretionOffsetType;
	}

	public double getDiscretionOffsetValue() {
		return DiscretionOffsetValue;
	}

	public void setDiscretionOffsetValue(double discretionOffsetValue) {
		DiscretionOffsetValue = discretionOffsetValue;
	}

	public int getDiscretionRoundDirection() {
		return DiscretionRoundDirection;
	}

	public void setDiscretionRoundDirection(int discretionRoundDirection) {
		DiscretionRoundDirection = discretionRoundDirection;
	}

	public int getDiscretionScope() {
		return DiscretionScope;
	}

	public void setDiscretionScope(int discretionScope) {
		DiscretionScope = discretionScope;
	}

	public double getDisplayHighQty() {
		return DisplayHighQty;
	}

	public void setDisplayHighQty(double displayHighQty) {
		DisplayHighQty = displayHighQty;
	}

	public double getDisplayLowQty() {
		return DisplayLowQty;
	}

	public void setDisplayLowQty(double displayLowQty) {
		DisplayLowQty = displayLowQty;
	}

	public char getDisplayMethod() {
		return DisplayMethod;
	}

	public void setDisplayMethod(char displayMethod) {
		DisplayMethod = displayMethod;
	}

	public double getDisplayMinIncr() {
		return DisplayMinIncr;
	}

	public void setDisplayMinIncr(double displayMinIncr) {
		DisplayMinIncr = displayMinIncr;
	}

	public double getDisplayQty() {
		return DisplayQty;
	}

	public void setDisplayQty(double displayQty) {
		DisplayQty = displayQty;
	}

	public char getDisplayWhen() {
		return DisplayWhen;
	}

	public void setDisplayWhen(char displayWhen) {
		DisplayWhen = displayWhen;
	}

	public LocalDateTime getEffectiveTime() {
		return EffectiveTime;
	}

	public void setEffectiveTime(LocalDateTime effectiveTime) {
		EffectiveTime = effectiveTime;
	}

	public String getEncodedIssuer() {
		return EncodedIssuer;
	}

	public void setEncodedIssuer(String encodedIssuer) {
		EncodedIssuer = encodedIssuer;
	}

	public int getEncodedIssuerLen() {
		return EncodedIssuerLen;
	}

	public void setEncodedIssuerLen(int encodedIssuerLen) {
		EncodedIssuerLen = encodedIssuerLen;
	}

	public String getEncodedSecurityDesc() {
		return EncodedSecurityDesc;
	}

	public void setEncodedSecurityDesc(String encodedSecurityDesc) {
		EncodedSecurityDesc = encodedSecurityDesc;
	}

	public int getEncodedSecurityDescLen() {
		return EncodedSecurityDescLen;
	}

	public void setEncodedSecurityDescLen(int encodedSecurityDescLen) {
		EncodedSecurityDescLen = encodedSecurityDescLen;
	}

	public String getEncodedText() {
		return EncodedText;
	}

	public void setEncodedText(String encodedText) {
		EncodedText = encodedText;
	}

	public int getEncodedTextLen() {
		return EncodedTextLen;
	}

	public void setEncodedTextLen(int encodedTextLen) {
		EncodedTextLen = encodedTextLen;
	}

	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}

	public String getExDestination() {
		return ExDestination;
	}

	public void setExDestination(String exDestination) {
		ExDestination = exDestination;
	}

	public char getExDestinationIDSource() {
		return ExDestinationIDSource;
	}

	public void setExDestinationIDSource(char exDestinationIDSource) {
		ExDestinationIDSource = exDestinationIDSource;
	}

	public String getExecBroker() {
		return ExecBroker;
	}

	public void setExecBroker(String execBroker) {
		ExecBroker = execBroker;
	}

	public String getExecInst() {
		return ExecInst;
	}

	public void setExecInst(String execInst) {
		ExecInst = execInst;
	}

	public String getExpireDate() {
		return ExpireDate;
	}

	public void setExpireDate(String expireDate) {
		ExpireDate = expireDate;
	}

	public LocalDateTime getExpireTime() {
		return ExpireTime;
	}

	public void setExpireTime(LocalDateTime expireTime) {
		ExpireTime = expireTime;
	}

	public double getFactor() {
		return Factor;
	}

	public void setFactor(double factor) {
		Factor = factor;
	}

	public boolean isForexReq() {
		return ForexReq;
	}

	public void setForexReq(boolean forexReq) {
		ForexReq = forexReq;
	}

	public char getFundRenewWaiv() {
		return FundRenewWaiv;
	}

	public void setFundRenewWaiv(char fundRenewWaiv) {
		FundRenewWaiv = fundRenewWaiv;
	}

	public String getFutSettDate() {
		return FutSettDate;
	}

	public void setFutSettDate(String futSettDate) {
		FutSettDate = futSettDate;
	}

	public String getFutSettDate2() {
		return FutSettDate2;
	}

	public void setFutSettDate2(String futSettDate2) {
		FutSettDate2 = futSettDate2;
	}

	public int getGTBookingInst() {
		return GTBookingInst;
	}

	public void setGTBookingInst(int gTBookingInst) {
		GTBookingInst = gTBookingInst;
	}

	public char getHandlInst() {
		return HandlInst;
	}

	public void setHandlInst(char handlInst) {
		HandlInst = handlInst;
	}

	public String getIDSource() {
		return IDSource;
	}

	public void setIDSource(String iDSource) {
		IDSource = iDSource;
	}

	public String getIOIID() {
		return IOIID;
	}

	public void setIOIID(String iOIID) {
		IOIID = iOIID;
	}

	public String getInstrRegistry() {
		return InstrRegistry;
	}

	public void setInstrRegistry(String instrRegistry) {
		InstrRegistry = instrRegistry;
	}

	public char getInstrmtAssignmentMethod() {
		return InstrmtAssignmentMethod;
	}

	public void setInstrmtAssignmentMethod(char instrmtAssignmentMethod) {
		InstrmtAssignmentMethod = instrmtAssignmentMethod;
	}

	public String getInterestAccrualDate() {
		return InterestAccrualDate;
	}

	public void setInterestAccrualDate(String interestAccrualDate) {
		InterestAccrualDate = interestAccrualDate;
	}

	public String getIssueDate() {
		return IssueDate;
	}

	public void setIssueDate(String issueDate) {
		IssueDate = issueDate;
	}

	public String getIssuer() {
		return Issuer;
	}

	public void setIssuer(String issuer) {
		Issuer = issuer;
	}

	public String getLocaleOfIssue() {
		return LocaleOfIssue;
	}

	public void setLocaleOfIssue(String localeOfIssue) {
		LocaleOfIssue = localeOfIssue;
	}

	public boolean isLocateReqd() {
		return LocateReqd;
	}

	public void setLocateReqd(boolean locateReqd) {
		LocateReqd = locateReqd;
	}

	public boolean isManualOrderIndicator() {
		return ManualOrderIndicator;
	}

	public void setManualOrderIndicator(boolean manualOrderIndicator) {
		ManualOrderIndicator = manualOrderIndicator;
	}

	public double getMarginRatio() {
		return MarginRatio;
	}

	public void setMarginRatio(double marginRatio) {
		MarginRatio = marginRatio;
	}

	public double getMatchIncrement() {
		return MatchIncrement;
	}

	public void setMatchIncrement(double matchIncrement) {
		MatchIncrement = matchIncrement;
	}

	public String getMaturityDate() {
		return MaturityDate;
	}

	public void setMaturityDate(String maturityDate) {
		MaturityDate = maturityDate;
	}

	public String getMaturityDay() {
		return MaturityDay;
	}

	public void setMaturityDay(String maturityDay) {
		MaturityDay = maturityDay;
	}

	public String getMaturityMonthYear() {
		return MaturityMonthYear;
	}

	public void setMaturityMonthYear(String maturityMonthYear) {
		MaturityMonthYear = maturityMonthYear;
	}

	public String getMaturityTime() {
		return MaturityTime;
	}

	public void setMaturityTime(String maturityTime) {
		MaturityTime = maturityTime;
	}

	public double getMaxFloor() {
		return MaxFloor;
	}

	public void setMaxFloor(double maxFloor) {
		MaxFloor = maxFloor;
	}

	public int getMaxPriceLevels() {
		return MaxPriceLevels;
	}

	public void setMaxPriceLevels(int maxPriceLevels) {
		MaxPriceLevels = maxPriceLevels;
	}

	public double getMaxShow() {
		return MaxShow;
	}

	public void setMaxShow(double maxShow) {
		MaxShow = maxShow;
	}

	public double getMinPriceIncrement() {
		return MinPriceIncrement;
	}

	public void setMinPriceIncrement(double minPriceIncrement) {
		MinPriceIncrement = minPriceIncrement;
	}

	public double getMinQty() {
		return MinQty;
	}

	public void setMinQty(double minQty) {
		MinQty = minQty;
	}

	public char getMoneyLaunderingStatus() {
		return MoneyLaunderingStatus;
	}

	public void setMoneyLaunderingStatus(char moneyLaunderingStatus) {
		MoneyLaunderingStatus = moneyLaunderingStatus;
	}

	public int getNTPositionLimit() {
		return NTPositionLimit;
	}

	public void setNTPositionLimit(int nTPositionLimit) {
		NTPositionLimit = nTPositionLimit;
	}

	public double getNetMoney() {
		return NetMoney;
	}

	public void setNetMoney(double netMoney) {
		NetMoney = netMoney;
	}

	public int getNoAllocs() {
		return NoAllocs;
	}

	public void setNoAllocs(int noAllocs) {
		NoAllocs = noAllocs;
	}

	public int getNoEvents() {
		return NoEvents;
	}

	public void setNoEvents(int noEvents) {
		NoEvents = noEvents;
	}

	public int getNoInstrumentParties() {
		return NoInstrumentParties;
	}

	public void setNoInstrumentParties(int noInstrumentParties) {
		NoInstrumentParties = noInstrumentParties;
	}

	public int getNoPartyIDs() {
		return NoPartyIDs;
	}

	public void setNoPartyIDs(int noPartyIDs) {
		NoPartyIDs = noPartyIDs;
	}

	public int getNoSecurityAltID() {
		return NoSecurityAltID;
	}

	public void setNoSecurityAltID(int noSecurityAltID) {
		NoSecurityAltID = noSecurityAltID;
	}

	public int getNoStipulations() {
		return NoStipulations;
	}

	public void setNoStipulations(int noStipulations) {
		NoStipulations = noStipulations;
	}

	public int getNoStrategyParameters() {
		return NoStrategyParameters;
	}

	public void setNoStrategyParameters(int noStrategyParameters) {
		NoStrategyParameters = noStrategyParameters;
	}

	public int getNoTradingSessions() {
		return NoTradingSessions;
	}

	public void setNoTradingSessions(int noTradingSessions) {
		NoTradingSessions = noTradingSessions;
	}

	public int getNoTrdRegTimestamps() {
		return NoTrdRegTimestamps;
	}

	public void setNoTrdRegTimestamps(int noTrdRegTimestamps) {
		NoTrdRegTimestamps = noTrdRegTimestamps;
	}

	public int getNoUnderlyings() {
		return NoUnderlyings;
	}

	public void setNoUnderlyings(int noUnderlyings) {
		NoUnderlyings = noUnderlyings;
	}

	public char getOpenClose() {
		return OpenClose;
	}

	public void setOpenClose(char openClose) {
		OpenClose = openClose;
	}

	public char getOptAttribute() {
		return OptAttribute;
	}

	public void setOptAttribute(char optAttribute) {
		OptAttribute = optAttribute;
	}

	public char getOrdType() {
		return OrdType;
	}

	public void setOrdType(char ordType) {
		OrdType = ordType;
	}

	public char getOrderCapacity() {
		return OrderCapacity;
	}

	public void setOrderCapacity(char orderCapacity) {
		OrderCapacity = orderCapacity;
	}

	public int getOrderHandlingInstSource() {
		return OrderHandlingInstSource;
	}

	public void setOrderHandlingInstSource(int orderHandlingInstSource) {
		OrderHandlingInstSource = orderHandlingInstSource;
	}

	public double getOrderPercent() {
		return OrderPercent;
	}

	public void setOrderPercent(double orderPercent) {
		OrderPercent = orderPercent;
	}

	public double getOrderQty() {
		return OrderQty;
	}

	public void setOrderQty(double orderQty) {
		OrderQty = orderQty;
	}

	public double getOrderQty2() {
		return OrderQty2;
	}

	public void setOrderQty2(double orderQty2) {
		OrderQty2 = orderQty2;
	}

	public String getOrderRestrictions() {
		return OrderRestrictions;
	}

	public void setOrderRestrictions(String orderRestrictions) {
		OrderRestrictions = orderRestrictions;
	}

	public double getParticipationRate() {
		return ParticipationRate;
	}

	public void setParticipationRate(double participationRate) {
		ParticipationRate = participationRate;
	}

	public double getPegDifference() {
		return PegDifference;
	}

	public void setPegDifference(double pegDifference) {
		PegDifference = pegDifference;
	}

	public int getPegLimitType() {
		return PegLimitType;
	}

	public void setPegLimitType(int pegLimitType) {
		PegLimitType = pegLimitType;
	}

	public int getPegMoveType() {
		return PegMoveType;
	}

	public void setPegMoveType(int pegMoveType) {
		PegMoveType = pegMoveType;
	}

	public int getPegOffsetType() {
		return PegOffsetType;
	}

	public void setPegOffsetType(int pegOffsetType) {
		PegOffsetType = pegOffsetType;
	}

	public double getPegOffsetValue() {
		return PegOffsetValue;
	}

	public void setPegOffsetValue(double pegOffsetValue) {
		PegOffsetValue = pegOffsetValue;
	}

	public int getPegPriceType() {
		return PegPriceType;
	}

	public void setPegPriceType(int pegPriceType) {
		PegPriceType = pegPriceType;
	}

	public int getPegRoundDirection() {
		return PegRoundDirection;
	}

	public void setPegRoundDirection(int pegRoundDirection) {
		PegRoundDirection = pegRoundDirection;
	}

	public int getPegScope() {
		return PegScope;
	}

	public void setPegScope(int pegScope) {
		PegScope = pegScope;
	}

	public String getPegSecurityDesc() {
		return PegSecurityDesc;
	}

	public void setPegSecurityDesc(String pegSecurityDesc) {
		PegSecurityDesc = pegSecurityDesc;
	}

	public String getPegSecurityID() {
		return PegSecurityID;
	}

	public void setPegSecurityID(String pegSecurityID) {
		PegSecurityID = pegSecurityID;
	}

	public String getPegSecurityIDSource() {
		return PegSecurityIDSource;
	}

	public void setPegSecurityIDSource(String pegSecurityIDSource) {
		PegSecurityIDSource = pegSecurityIDSource;
	}

	public String getPegSymbol() {
		return PegSymbol;
	}

	public void setPegSymbol(String pegSymbol) {
		PegSymbol = pegSymbol;
	}

	public String getPool() {
		return Pool;
	}

	public void setPool(String pool) {
		Pool = pool;
	}

	public char getPositionEffect() {
		return PositionEffect;
	}

	public void setPositionEffect(char positionEffect) {
		PositionEffect = positionEffect;
	}

	public int getPositionLimit() {
		return PositionLimit;
	}

	public void setPositionLimit(int positionLimit) {
		PositionLimit = positionLimit;
	}

	public boolean isPreTradeAnonymity() {
		return PreTradeAnonymity;
	}

	public void setPreTradeAnonymity(boolean preTradeAnonymity) {
		PreTradeAnonymity = preTradeAnonymity;
	}

	public char getPreallocMethod() {
		return PreallocMethod;
	}

	public void setPreallocMethod(char preallocMethod) {
		PreallocMethod = preallocMethod;
	}

	public double getPrevClosePx() {
		return PrevClosePx;
	}

	public void setPrevClosePx(double prevClosePx) {
		PrevClosePx = prevClosePx;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public double getPrice2() {
		return Price2;
	}

	public void setPrice2(double price2) {
		Price2 = price2;
	}

	public char getPriceProtectionScope() {
		return PriceProtectionScope;
	}

	public void setPriceProtectionScope(char priceProtectionScope) {
		PriceProtectionScope = priceProtectionScope;
	}

	public int getPriceType() {
		return PriceType;
	}

	public void setPriceType(int priceType) {
		PriceType = priceType;
	}

	public char getProcessCode() {
		return ProcessCode;
	}

	public void setProcessCode(char processCode) {
		ProcessCode = processCode;
	}

	public int getProduct() {
		return Product;
	}

	public void setProduct(int product) {
		Product = product;
	}

	public int getPutOrCall() {
		return PutOrCall;
	}

	public void setPutOrCall(int putOrCall) {
		PutOrCall = putOrCall;
	}

	public int getQtyType() {
		return QtyType;
	}

	public void setQtyType(int qtyType) {
		QtyType = qtyType;
	}

	public int getQuantityType() {
		return QuantityType;
	}

	public void setQuantityType(int quantityType) {
		QuantityType = quantityType;
	}

	public String getQuoteID() {
		return QuoteID;
	}

	public void setQuoteID(String quoteID) {
		QuoteID = quoteID;
	}

	public String getReceivedDeptID() {
		return ReceivedDeptID;
	}

	public void setReceivedDeptID(String receivedDeptID) {
		ReceivedDeptID = receivedDeptID;
	}

	public String getRedemptionDate() {
		return RedemptionDate;
	}

	public void setRedemptionDate(String redemptionDate) {
		RedemptionDate = redemptionDate;
	}

	public String getRefOrderID() {
		return RefOrderID;
	}

	public void setRefOrderID(String refOrderID) {
		RefOrderID = refOrderID;
	}

	public char getRefOrderIDSource() {
		return RefOrderIDSource;
	}

	public void setRefOrderIDSource(char refOrderIDSource) {
		RefOrderIDSource = refOrderIDSource;
	}

	public double getRefreshQty() {
		return RefreshQty;
	}

	public void setRefreshQty(double refreshQty) {
		RefreshQty = refreshQty;
	}

	public String getRegistID() {
		return RegistID;
	}

	public void setRegistID(String registID) {
		RegistID = registID;
	}

	public String getRepoCollateralSecurityType() {
		return RepoCollateralSecurityType;
	}

	public void setRepoCollateralSecurityType(String repoCollateralSecurityType) {
		RepoCollateralSecurityType = repoCollateralSecurityType;
	}

	public double getRepurchaseRate() {
		return RepurchaseRate;
	}

	public void setRepurchaseRate(double repurchaseRate) {
		RepurchaseRate = repurchaseRate;
	}

	public int getRepurchaseTerm() {
		return RepurchaseTerm;
	}

	public void setRepurchaseTerm(int repurchaseTerm) {
		RepurchaseTerm = repurchaseTerm;
	}

	public char getRoundingDirection() {
		return RoundingDirection;
	}

	public void setRoundingDirection(char roundingDirection) {
		RoundingDirection = roundingDirection;
	}

	public double getRoundingModulus() {
		return RoundingModulus;
	}

	public void setRoundingModulus(double roundingModulus) {
		RoundingModulus = roundingModulus;
	}

	public char getRule80A() {
		return Rule80A;
	}

	public void setRule80A(char rule80a) {
		Rule80A = rule80a;
	}

	public String getSecondaryClOrdID() {
		return SecondaryClOrdID;
	}

	public void setSecondaryClOrdID(String secondaryClOrdID) {
		SecondaryClOrdID = secondaryClOrdID;
	}

	public double getSecondaryDisplayQty() {
		return SecondaryDisplayQty;
	}

	public void setSecondaryDisplayQty(double secondaryDisplayQty) {
		SecondaryDisplayQty = secondaryDisplayQty;
	}

	public String getSecurityDesc() {
		return SecurityDesc;
	}

	public void setSecurityDesc(String securityDesc) {
		SecurityDesc = securityDesc;
	}

	public String getSecurityExchange() {
		return SecurityExchange;
	}

	public void setSecurityExchange(String securityExchange) {
		SecurityExchange = securityExchange;
	}

	public String getSecurityID() {
		return SecurityID;
	}

	public void setSecurityID(String securityID) {
		SecurityID = securityID;
	}

	public String getSecurityIDSource() {
		return SecurityIDSource;
	}

	public void setSecurityIDSource(String securityIDSource) {
		SecurityIDSource = securityIDSource;
	}

	public String getSecurityStatus() {
		return SecurityStatus;
	}

	public void setSecurityStatus(String securityStatus) {
		SecurityStatus = securityStatus;
	}

	public String getSecuritySubType() {
		return SecuritySubType;
	}

	public void setSecuritySubType(String securitySubType) {
		SecuritySubType = securitySubType;
	}

	public String getSecurityType() {
		return SecurityType;
	}

	public void setSecurityType(String securityType) {
		SecurityType = securityType;
	}

	public String getSettlCurrency() {
		return SettlCurrency;
	}

	public void setSettlCurrency(String settlCurrency) {
		SettlCurrency = settlCurrency;
	}

	public String getSettlDate() {
		return SettlDate;
	}

	public void setSettlDate(String settlDate) {
		SettlDate = settlDate;
	}

	public String getSettlDate2() {
		return SettlDate2;
	}

	public void setSettlDate2(String settlDate2) {
		SettlDate2 = settlDate2;
	}

	public String getSettlType() {
		return SettlType;
	}

	public void setSettlType(String settlType) {
		SettlType = settlType;
	}

	public String getSettleOnOpenFlag() {
		return SettleOnOpenFlag;
	}

	public void setSettleOnOpenFlag(String settleOnOpenFlag) {
		SettleOnOpenFlag = settleOnOpenFlag;
	}

	public char getSettlmntTyp() {
		return SettlmntTyp;
	}

	public void setSettlmntTyp(char settlmntTyp) {
		SettlmntTyp = settlmntTyp;
	}

	public char getSide() {
		return Side;
	}

	public void setSide(char side) {
		Side = side;
	}

//	@Override
//	public String getSignature() {
//		return Signature;
//	}
//
//	@Override
//	public void setSignature(String signature) {
//		Signature = signature;
//	}
//
//	@Override
//	public int getSignatureLength() {
//		return SignatureLength;
//	}
//
//	@Override
//	public void setSignatureLength(int signatureLength) {
//		SignatureLength = signatureLength;
//	}

	public boolean isSolicitedFlag() {
		return SolicitedFlag;
	}

	public void setSolicitedFlag(boolean solicitedFlag) {
		SolicitedFlag = solicitedFlag;
	}

	public double getSpread() {
		return Spread;
	}

	public void setSpread(double spread) {
		Spread = spread;
	}

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	public String getStateOrProvinceOfIssue() {
		return StateOrProvinceOfIssue;
	}

	public void setStateOrProvinceOfIssue(String stateOrProvinceOfIssue) {
		StateOrProvinceOfIssue = stateOrProvinceOfIssue;
	}

	public double getStopPx() {
		return StopPx;
	}

	public void setStopPx(double stopPx) {
		StopPx = stopPx;
	}

	public String getStrikeCurrency() {
		return StrikeCurrency;
	}

	public void setStrikeCurrency(String strikeCurrency) {
		StrikeCurrency = strikeCurrency;
	}

	public double getStrikeMultiplier() {
		return StrikeMultiplier;
	}

	public void setStrikeMultiplier(double strikeMultiplier) {
		StrikeMultiplier = strikeMultiplier;
	}

	public double getStrikePrice() {
		return StrikePrice;
	}

	public void setStrikePrice(double strikePrice) {
		StrikePrice = strikePrice;
	}

	public double getStrikeValue() {
		return StrikeValue;
	}

	public void setStrikeValue(double strikeValue) {
		StrikeValue = strikeValue;
	}

	public String getSymbol() {
		return Symbol;
	}

	public void setSymbol(String symbol) {
		Symbol = symbol;
	}

	public String getSymbolSfx() {
		return SymbolSfx;
	}

	public void setSymbolSfx(String symbolSfx) {
		SymbolSfx = symbolSfx;
	}

	public int getTargetStrategy() {
		return TargetStrategy;
	}

	public void setTargetStrategy(int targetStrategy) {
		TargetStrategy = targetStrategy;
	}

	public String getTargetStrategyParameters() {
		return TargetStrategyParameters;
	}

	public void setTargetStrategyParameters(String targetStrategyParameters) {
		TargetStrategyParameters = targetStrategyParameters;
	}

	public int getTerminationType() {
		return TerminationType;
	}

	public void setTerminationType(int terminationType) {
		TerminationType = terminationType;
	}

	public String getText() {
		return Text;
	}

	public void setText(String text) {
		Text = text;
	}

	public char getTimeInForce() {
		return TimeInForce;
	}

	public void setTimeInForce(char timeInForce) {
		TimeInForce = timeInForce;
	}

	public String getTimeUnit() {
		return TimeUnit;
	}

	public void setTimeUnit(String timeUnit) {
		TimeUnit = timeUnit;
	}

	public String getTradeDate() {
		return TradeDate;
	}

	public void setTradeDate(String tradeDate) {
		TradeDate = tradeDate;
	}

	public String getTradeOriginationDate() {
		return TradeOriginationDate;
	}

	public void setTradeOriginationDate(String tradeOriginationDate) {
		TradeOriginationDate = tradeOriginationDate;
	}

	public LocalDateTime getTransactTime() {
		return TransactTime;
	}

	public void setTransactTime(LocalDateTime transactTime) {
		TransactTime = transactTime;
	}

	public char getTriggerAction() {
		return TriggerAction;
	}

	public void setTriggerAction(char triggerAction) {
		TriggerAction = triggerAction;
	}

	public double getTriggerNewPrice() {
		return TriggerNewPrice;
	}

	public void setTriggerNewPrice(double triggerNewPrice) {
		TriggerNewPrice = triggerNewPrice;
	}

	public double getTriggerNewQty() {
		return TriggerNewQty;
	}

	public void setTriggerNewQty(double triggerNewQty) {
		TriggerNewQty = triggerNewQty;
	}

	public char getTriggerOrderType() {
		return TriggerOrderType;
	}

	public void setTriggerOrderType(char triggerOrderType) {
		TriggerOrderType = triggerOrderType;
	}

	public double getTriggerPrice() {
		return TriggerPrice;
	}

	public void setTriggerPrice(double triggerPrice) {
		TriggerPrice = triggerPrice;
	}

	public char getTriggerPriceDirection() {
		return TriggerPriceDirection;
	}

	public void setTriggerPriceDirection(char triggerPriceDirection) {
		TriggerPriceDirection = triggerPriceDirection;
	}

	public char getTriggerPriceType() {
		return TriggerPriceType;
	}

	public void setTriggerPriceType(char triggerPriceType) {
		TriggerPriceType = triggerPriceType;
	}

	public char getTriggerPriceTypeScope() {
		return TriggerPriceTypeScope;
	}

	public void setTriggerPriceTypeScope(char triggerPriceTypeScope) {
		TriggerPriceTypeScope = triggerPriceTypeScope;
	}

	public String getTriggerSecurityDesc() {
		return TriggerSecurityDesc;
	}

	public void setTriggerSecurityDesc(String triggerSecurityDesc) {
		TriggerSecurityDesc = triggerSecurityDesc;
	}

	public String getTriggerSecurityID() {
		return TriggerSecurityID;
	}

	public void setTriggerSecurityID(String triggerSecurityID) {
		TriggerSecurityID = triggerSecurityID;
	}

	public String getTriggerSecurityIDSource() {
		return TriggerSecurityIDSource;
	}

	public void setTriggerSecurityIDSource(String triggerSecurityIDSource) {
		TriggerSecurityIDSource = triggerSecurityIDSource;
	}

	public String getTriggerSymbol() {
		return TriggerSymbol;
	}

	public void setTriggerSymbol(String triggerSymbol) {
		TriggerSymbol = triggerSymbol;
	}

	public String getTriggerTradingSessionID() {
		return TriggerTradingSessionID;
	}

	public void setTriggerTradingSessionID(String triggerTradingSessionID) {
		TriggerTradingSessionID = triggerTradingSessionID;
	}

	public String getTriggerTradingSessionSubID() {
		return TriggerTradingSessionSubID;
	}

	public void setTriggerTradingSessionSubID(String triggerTradingSessionSubID) {
		TriggerTradingSessionSubID = triggerTradingSessionSubID;
	}

	public char getTriggerType() {
		return TriggerType;
	}

	public void setTriggerType(char triggerType) {
		TriggerType = triggerType;
	}

	public String getUnitOfMeasure() {
		return UnitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		UnitOfMeasure = unitOfMeasure;
	}

	public double getYield() {
		return Yield;
	}

	public void setYield(double yield) {
		Yield = yield;
	}

	public String getYieldCalcDate() {
		return YieldCalcDate;
	}

	public void setYieldCalcDate(String yieldCalcDate) {
		YieldCalcDate = yieldCalcDate;
	}

	public String getYieldRedemptionDate() {
		return YieldRedemptionDate;
	}

	public void setYieldRedemptionDate(String yieldRedemptionDate) {
		YieldRedemptionDate = yieldRedemptionDate;
	}

	public double getYieldRedemptionPrice() {
		return YieldRedemptionPrice;
	}

	public void setYieldRedemptionPrice(double yieldRedemptionPrice) {
		YieldRedemptionPrice = yieldRedemptionPrice;
	}

	public int getYieldRedemptionPriceType() {
		return YieldRedemptionPriceType;
	}

	public void setYieldRedemptionPriceType(int yieldRedemptionPriceType) {
		YieldRedemptionPriceType = yieldRedemptionPriceType;
	}

	public String getYieldType() {
		return YieldType;
	}

	public void setYieldType(String yieldType) {
		YieldType = yieldType;
	}
	
}
