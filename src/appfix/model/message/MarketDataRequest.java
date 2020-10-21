package appfix.model.message;

import java.util.List;

public class MarketDataRequest {
	
	private boolean AggregatedBook;
	private int ApplQueueAction;
	private int ApplQueueMax;
	private String CheckSum;
	private boolean MDImplicitDelete;
	private String MDReqID;
	private int MDUpdateType;
	private int MarketDepth;
	private int NoMDEntryTypes;
	private int NoRelatedSym;
	private int NoTradingSessions;
	private String OpenCloseSettlFlag;
	private String Scope;
	private String Signature;
	private int SignatureLength;
	private char SubscriptionRequestType;

	public boolean getAggregatedBook() {
		return AggregatedBook;
	}

	public void setAggregatedBook(boolean aggregatedBook) {
		this.AggregatedBook = aggregatedBook;
	}

	public int getApplQueueAction() {
		return ApplQueueAction;
	}

	public void setApplQueueAction(int applQueueAction) {
		this.ApplQueueAction = applQueueAction;
	}

	public int getApplQueueMax() {
		return ApplQueueMax;
	}

	public void setApplQueueMax(int applQueueMax) {
		this.ApplQueueMax = applQueueMax;
	}

	public String getCheckSum() {
		return CheckSum;
	}

	public void setCheckSum(String checkSum) {
		this.CheckSum = checkSum;
	}

	public boolean getMDImplicitDelete() {
		return MDImplicitDelete;
	}

	public void setMDImplicitDelete(boolean mDImplicitDelete) {
		this.MDImplicitDelete = mDImplicitDelete;
	}

	public String getMDReqID() {
		return MDReqID;
	}

	public void setMDReqID(String mDReqID) {
		this.MDReqID = mDReqID;
	}

	public int getMDUpdateType() {
		return MDUpdateType;
	}

	public void setMDUpdateType(int mDUpdateType) {
		this.MDUpdateType = mDUpdateType;
	}

	public int getMarketDepth() {
		return MarketDepth;
	}

	public void setMarketDepth(int marketDepth) {
		this.MarketDepth = marketDepth;
	}

	public int getNoMDEntryTypes() {
		return NoMDEntryTypes;
	}

	public void setNoMDEntryTypes(int noMDEntryTypes) {
		this.NoMDEntryTypes = noMDEntryTypes;
	}

	public int getNoRelatedSym() {
		return NoRelatedSym;
	}

	public void setNoRelatedSym(int noRelatedSym) {
		this.NoRelatedSym = noRelatedSym;
	}

	public int getNoTradingSessions() {
		return NoTradingSessions;
	}

	public void setNoTradingSessions(int noTradingSessions) {
		this.NoTradingSessions = noTradingSessions;
	}

	public String getOpenCloseSettlFlag() {
		return OpenCloseSettlFlag;
	}

	public void setOpenCloseSettlFlag(String openCloseSettlFlag) {
		this.OpenCloseSettlFlag = openCloseSettlFlag;
	}

	public String getScope() {
		return Scope;
	}

	public void setScope(String scope) {
		this.Scope = scope;
	}

	public String getSignature() {
		return Signature;
	}

	public void setSignature(String signature) {
		this.Signature = signature;
	}

	public int getSignatureLength() {
		return SignatureLength;
	}

	public void setSignatureLength(int signatureLength) {
		this.SignatureLength = signatureLength;
	}

	public char getSubscriptionRequestType() {
		return SubscriptionRequestType;
	}

	public void setSubscriptionRequestType(char subscriptionRequestType) {
		this.SubscriptionRequestType = subscriptionRequestType;
	}

	private List<NoTradingSessions> listNoTradingSessions;

	public List<NoTradingSessions> getListNoTradingSessions() {
		return listNoTradingSessions;
	}

	public void setListNoTradingSessions(List<NoTradingSessions> listNoTradingSessions) {
		this.listNoTradingSessions = listNoTradingSessions;
	}

	public static class NoTradingSessions {
		private String TradingSessionID;
		private String TradingSessionSubID;

		public String getTradingSessionID() {
			return TradingSessionID;
		}

		public void setTradingSessionID(String tradingSessionID) {
			this.TradingSessionID = tradingSessionID;
		}

		public String getTradingSessionSubID() {
			return TradingSessionSubID;
		}

		public void setTradingSessionSubID(String tradingSessionSubID) {
			this.TradingSessionSubID = tradingSessionSubID;
		}
	} // End Class NoTradingSessions

	private List<NoRelatedSym> listNoRelatedSym;

	public List<NoRelatedSym> getListNoRelatedSym() {
		return listNoRelatedSym;
	}

	public void setListNoRelatedSym(List<NoRelatedSym> listNoRelatedSym) {
		this.listNoRelatedSym = listNoRelatedSym;
	}

	public static class NoRelatedSym {
		private String CFICode;
		private int CPProgram;
		private String CPRegType;
		private double ContractMultiplier;
		private String ContractSettlMonth;
		private String CountryOfIssue;
		private String CouponPaymentDate;
		private double CouponRate;
		private String CreditRating;
		private String DatedDate;
		private String EncodedIssuer;
		private int EncodedIssuerLen;
		private String EncodedSecurityDesc;
		private int EncodedSecurityDescLen;
		private double Factor;
		private String InstrRegistry;
		private String InterestAccrualDate;
		private String IssueDate;
		private String Issuer;
		private String LocaleOfIssue;
		private String MaturityDate;
		private String MaturityMonthYear;
		private int NoEvents;
		private int NoLegs;
		private int NoSecurityAltID;
		private int NoUnderlyings;
		private char OptAttribute;
		private String Pool;
		private int Product;
		private int PutOrCall;
		private String RedemptionDate;
		private String RepoCollateralSecurityType;
		private double RepurchaseRate;
		private int RepurchaseTerm;
		private String SecurityDesc;
		private String SecurityExchange;
		private String SecurityID;
		private String SecurityIDSource;
		private String SecuritySubType;
		private String SecurityType;
		private String StateOrProvinceOfIssue;
		private String StrikeCurrency;
		private double StrikePrice;
		private String Symbol;
		private String SymbolSfx;

		public String getCFICode() {
			return CFICode;
		}

		public void setCFICode(String cFICode) {
			this.CFICode = cFICode;
		}

		public int getCPProgram() {
			return CPProgram;
		}

		public void setCPProgram(int cPProgram) {
			this.CPProgram = cPProgram;
		}

		public String getCPRegType() {
			return CPRegType;
		}

		public void setCPRegType(String cPRegType) {
			this.CPRegType = cPRegType;
		}

		public double getContractMultiplier() {
			return ContractMultiplier;
		}

		public void setContractMultiplier(double contractMultiplier) {
			this.ContractMultiplier = contractMultiplier;
		}

		public String getContractSettlMonth() {
			return ContractSettlMonth;
		}

		public void setContractSettlMonth(String contractSettlMonth) {
			this.ContractSettlMonth = contractSettlMonth;
		}

		public String getCountryOfIssue() {
			return CountryOfIssue;
		}

		public void setCountryOfIssue(String countryOfIssue) {
			this.CountryOfIssue = countryOfIssue;
		}

		public String getCouponPaymentDate() {
			return CouponPaymentDate;
		}

		public void setCouponPaymentDate(String couponPaymentDate) {
			this.CouponPaymentDate = couponPaymentDate;
		}

		public double getCouponRate() {
			return CouponRate;
		}

		public void setCouponRate(double couponRate) {
			this.CouponRate = couponRate;
		}

		public String getCreditRating() {
			return CreditRating;
		}

		public void setCreditRating(String creditRating) {
			this.CreditRating = creditRating;
		}

		public String getDatedDate() {
			return DatedDate;
		}

		public void setDatedDate(String datedDate) {
			this.DatedDate = datedDate;
		}

		public String getEncodedIssuer() {
			return EncodedIssuer;
		}

		public void setEncodedIssuer(String encodedIssuer) {
			this.EncodedIssuer = encodedIssuer;
		}

		public int getEncodedIssuerLen() {
			return EncodedIssuerLen;
		}

		public void setEncodedIssuerLen(int encodedIssuerLen) {
			this.EncodedIssuerLen = encodedIssuerLen;
		}

		public String getEncodedSecurityDesc() {
			return EncodedSecurityDesc;
		}

		public void setEncodedSecurityDesc(String encodedSecurityDesc) {
			this.EncodedSecurityDesc = encodedSecurityDesc;
		}

		public int getEncodedSecurityDescLen() {
			return EncodedSecurityDescLen;
		}

		public void setEncodedSecurityDescLen(int encodedSecurityDescLen) {
			this.EncodedSecurityDescLen = encodedSecurityDescLen;
		}

		public double getFactor() {
			return Factor;
		}

		public void setFactor(double factor) {
			this.Factor = factor;
		}

		public String getInstrRegistry() {
			return InstrRegistry;
		}

		public void setInstrRegistry(String instrRegistry) {
			this.InstrRegistry = instrRegistry;
		}

		public String getInterestAccrualDate() {
			return InterestAccrualDate;
		}

		public void setInterestAccrualDate(String interestAccrualDate) {
			this.InterestAccrualDate = interestAccrualDate;
		}

		public String getIssueDate() {
			return IssueDate;
		}

		public void setIssueDate(String issueDate) {
			this.IssueDate = issueDate;
		}

		public String getIssuer() {
			return Issuer;
		}

		public void setIssuer(String issuer) {
			this.Issuer = issuer;
		}

		public String getLocaleOfIssue() {
			return LocaleOfIssue;
		}

		public void setLocaleOfIssue(String localeOfIssue) {
			this.LocaleOfIssue = localeOfIssue;
		}

		public String getMaturityDate() {
			return MaturityDate;
		}

		public void setMaturityDate(String maturityDate) {
			this.MaturityDate = maturityDate;
		}

		public String getMaturityMonthYear() {
			return MaturityMonthYear;
		}

		public void setMaturityMonthYear(String maturityMonthYear) {
			this.MaturityMonthYear = maturityMonthYear;
		}

		public int getNoEvents() {
			return NoEvents;
		}

		public void setNoEvents(int noEvents) {
			this.NoEvents = noEvents;
		}

		public int getNoLegs() {
			return NoLegs;
		}

		public void setNoLegs(int noLegs) {
			this.NoLegs = noLegs;
		}

		public int getNoSecurityAltID() {
			return NoSecurityAltID;
		}

		public void setNoSecurityAltID(int noSecurityAltID) {
			this.NoSecurityAltID = noSecurityAltID;
		}

		public int getNoUnderlyings() {
			return NoUnderlyings;
		}

		public void setNoUnderlyings(int noUnderlyings) {
			this.NoUnderlyings = noUnderlyings;
		}

		public char getOptAttribute() {
			return OptAttribute;
		}

		public void setOptAttribute(char optAttribute) {
			this.OptAttribute = optAttribute;
		}

		public String getPool() {
			return Pool;
		}

		public void setPool(String pool) {
			this.Pool = pool;
		}

		public int getProduct() {
			return Product;
		}

		public void setProduct(int product) {
			this.Product = product;
		}

		public int getPutOrCall() {
			return PutOrCall;
		}

		public void setPutOrCall(int putOrCall) {
			this.PutOrCall = putOrCall;
		}

		public String getRedemptionDate() {
			return RedemptionDate;
		}

		public void setRedemptionDate(String redemptionDate) {
			this.RedemptionDate = redemptionDate;
		}

		public String getRepoCollateralSecurityType() {
			return RepoCollateralSecurityType;
		}

		public void setRepoCollateralSecurityType(String repoCollateralSecurityType) {
			this.RepoCollateralSecurityType = repoCollateralSecurityType;
		}

		public double getRepurchaseRate() {
			return RepurchaseRate;
		}

		public void setRepurchaseRate(double repurchaseRate) {
			this.RepurchaseRate = repurchaseRate;
		}

		public int getRepurchaseTerm() {
			return RepurchaseTerm;
		}

		public void setRepurchaseTerm(int repurchaseTerm) {
			this.RepurchaseTerm = repurchaseTerm;
		}

		public String getSecurityDesc() {
			return SecurityDesc;
		}

		public void setSecurityDesc(String securityDesc) {
			this.SecurityDesc = securityDesc;
		}

		public String getSecurityExchange() {
			return SecurityExchange;
		}

		public void setSecurityExchange(String securityExchange) {
			this.SecurityExchange = securityExchange;
		}

		public String getSecurityID() {
			return SecurityID;
		}

		public void setSecurityID(String securityID) {
			this.SecurityID = securityID;
		}

		public String getSecurityIDSource() {
			return SecurityIDSource;
		}

		public void setSecurityIDSource(String securityIDSource) {
			this.SecurityIDSource = securityIDSource;
		}

		public String getSecuritySubType() {
			return SecuritySubType;
		}

		public void setSecuritySubType(String securitySubType) {
			this.SecuritySubType = securitySubType;
		}

		public String getSecurityType() {
			return SecurityType;
		}

		public void setSecurityType(String securityType) {
			this.SecurityType = securityType;
		}

		public String getStateOrProvinceOfIssue() {
			return StateOrProvinceOfIssue;
		}

		public void setStateOrProvinceOfIssue(String stateOrProvinceOfIssue) {
			this.StateOrProvinceOfIssue = stateOrProvinceOfIssue;
		}

		public String getStrikeCurrency() {
			return StrikeCurrency;
		}

		public void setStrikeCurrency(String strikeCurrency) {
			this.StrikeCurrency = strikeCurrency;
		}

		public double getStrikePrice() {
			return StrikePrice;
		}

		public void setStrikePrice(double strikePrice) {
			this.StrikePrice = strikePrice;
		}

		public String getSymbol() {
			return Symbol;
		}

		public void setSymbol(String symbol) {
			this.Symbol = symbol;
		}

		public String getSymbolSfx() {
			return SymbolSfx;
		}

		public void setSymbolSfx(String symbolSfx) {
			this.SymbolSfx = symbolSfx;
		}

		private List<NoLegs> listNoLegs;

		public List<NoLegs> getListNoLegs() {
			return listNoLegs;
		}

		public void setListNoLegs(List<NoLegs> listNoLegs) {
			this.listNoLegs = listNoLegs;
		}

		public static class NoLegs {
			private String EncodedLegIssuer;
			private int EncodedLegIssuerLen;
			private String EncodedLegSecurityDesc;
			private int EncodedLegSecurityDescLen;
			private String LegCFICode;
			private double LegContractMultiplier;
			private String LegContractSettlMonth;
			private String LegCountryOfIssue;
			private String LegCouponPaymentDate;
			private double LegCouponRate;
			private String LegCreditRating;
			private String LegCurrency;
			private String LegDatedDate;
			private double LegFactor;
			private String LegInstrRegistry;
			private String LegInterestAccrualDate;
			private String LegIssueDate;
			private String LegIssuer;
			private String LegLocaleOfIssue;
			private String LegMaturityDate;
			private String LegMaturityMonthYear;
			private char LegOptAttribute;
			private String LegPool;
			private int LegProduct;
			private double LegRatioQty;
			private String LegRedemptionDate;
			private String LegRepoCollateralSecurityType;
			private double LegRepurchaseRate;
			private int LegRepurchaseTerm;
			private String LegSecurityDesc;
			private String LegSecurityExchange;
			private String LegSecurityID;
			private String LegSecurityIDSource;
			private String LegSecuritySubType;
			private String LegSecurityType;
			private char LegSide;
			private String LegStateOrProvinceOfIssue;
			private String LegStrikeCurrency;
			private double LegStrikePrice;
			private String LegSymbol;
			private String LegSymbolSfx;
			private int NoLegSecurityAltID;

			public String getEncodedLegIssuer() {
				return EncodedLegIssuer;
			}

			public void setEncodedLegIssuer(String encodedLegIssuer) {
				this.EncodedLegIssuer = encodedLegIssuer;
			}

			public int getEncodedLegIssuerLen() {
				return EncodedLegIssuerLen;
			}

			public void setEncodedLegIssuerLen(int encodedLegIssuerLen) {
				this.EncodedLegIssuerLen = encodedLegIssuerLen;
			}

			public String getEncodedLegSecurityDesc() {
				return EncodedLegSecurityDesc;
			}

			public void setEncodedLegSecurityDesc(String encodedLegSecurityDesc) {
				this.EncodedLegSecurityDesc = encodedLegSecurityDesc;
			}

			public int getEncodedLegSecurityDescLen() {
				return EncodedLegSecurityDescLen;
			}

			public void setEncodedLegSecurityDescLen(int encodedLegSecurityDescLen) {
				this.EncodedLegSecurityDescLen = encodedLegSecurityDescLen;
			}

			public String getLegCFICode() {
				return LegCFICode;
			}

			public void setLegCFICode(String legCFICode) {
				this.LegCFICode = legCFICode;
			}

			public double getLegContractMultiplier() {
				return LegContractMultiplier;
			}

			public void setLegContractMultiplier(double legContractMultiplier) {
				this.LegContractMultiplier = legContractMultiplier;
			}

			public String getLegContractSettlMonth() {
				return LegContractSettlMonth;
			}

			public void setLegContractSettlMonth(String legContractSettlMonth) {
				this.LegContractSettlMonth = legContractSettlMonth;
			}

			public String getLegCountryOfIssue() {
				return LegCountryOfIssue;
			}

			public void setLegCountryOfIssue(String legCountryOfIssue) {
				this.LegCountryOfIssue = legCountryOfIssue;
			}

			public String getLegCouponPaymentDate() {
				return LegCouponPaymentDate;
			}

			public void setLegCouponPaymentDate(String legCouponPaymentDate) {
				this.LegCouponPaymentDate = legCouponPaymentDate;
			}

			public double getLegCouponRate() {
				return LegCouponRate;
			}

			public void setLegCouponRate(double legCouponRate) {
				this.LegCouponRate = legCouponRate;
			}

			public String getLegCreditRating() {
				return LegCreditRating;
			}

			public void setLegCreditRating(String legCreditRating) {
				this.LegCreditRating = legCreditRating;
			}

			public String getLegCurrency() {
				return LegCurrency;
			}

			public void setLegCurrency(String legCurrency) {
				this.LegCurrency = legCurrency;
			}

			public String getLegDatedDate() {
				return LegDatedDate;
			}

			public void setLegDatedDate(String legDatedDate) {
				this.LegDatedDate = legDatedDate;
			}

			public double getLegFactor() {
				return LegFactor;
			}

			public void setLegFactor(double legFactor) {
				this.LegFactor = legFactor;
			}

			public String getLegInstrRegistry() {
				return LegInstrRegistry;
			}

			public void setLegInstrRegistry(String legInstrRegistry) {
				this.LegInstrRegistry = legInstrRegistry;
			}

			public String getLegInterestAccrualDate() {
				return LegInterestAccrualDate;
			}

			public void setLegInterestAccrualDate(String legInterestAccrualDate) {
				this.LegInterestAccrualDate = legInterestAccrualDate;
			}

			public String getLegIssueDate() {
				return LegIssueDate;
			}

			public void setLegIssueDate(String legIssueDate) {
				this.LegIssueDate = legIssueDate;
			}

			public String getLegIssuer() {
				return LegIssuer;
			}

			public void setLegIssuer(String legIssuer) {
				this.LegIssuer = legIssuer;
			}

			public String getLegLocaleOfIssue() {
				return LegLocaleOfIssue;
			}

			public void setLegLocaleOfIssue(String legLocaleOfIssue) {
				this.LegLocaleOfIssue = legLocaleOfIssue;
			}

			public String getLegMaturityDate() {
				return LegMaturityDate;
			}

			public void setLegMaturityDate(String legMaturityDate) {
				this.LegMaturityDate = legMaturityDate;
			}

			public String getLegMaturityMonthYear() {
				return LegMaturityMonthYear;
			}

			public void setLegMaturityMonthYear(String legMaturityMonthYear) {
				this.LegMaturityMonthYear = legMaturityMonthYear;
			}

			public char getLegOptAttribute() {
				return LegOptAttribute;
			}

			public void setLegOptAttribute(char legOptAttribute) {
				this.LegOptAttribute = legOptAttribute;
			}

			public String getLegPool() {
				return LegPool;
			}

			public void setLegPool(String legPool) {
				this.LegPool = legPool;
			}

			public int getLegProduct() {
				return LegProduct;
			}

			public void setLegProduct(int legProduct) {
				this.LegProduct = legProduct;
			}

			public double getLegRatioQty() {
				return LegRatioQty;
			}

			public void setLegRatioQty(double legRatioQty) {
				this.LegRatioQty = legRatioQty;
			}

			public String getLegRedemptionDate() {
				return LegRedemptionDate;
			}

			public void setLegRedemptionDate(String legRedemptionDate) {
				this.LegRedemptionDate = legRedemptionDate;
			}

			public String getLegRepoCollateralSecurityType() {
				return LegRepoCollateralSecurityType;
			}

			public void setLegRepoCollateralSecurityType(String legRepoCollateralSecurityType) {
				this.LegRepoCollateralSecurityType = legRepoCollateralSecurityType;
			}

			public double getLegRepurchaseRate() {
				return LegRepurchaseRate;
			}

			public void setLegRepurchaseRate(double legRepurchaseRate) {
				this.LegRepurchaseRate = legRepurchaseRate;
			}

			public int getLegRepurchaseTerm() {
				return LegRepurchaseTerm;
			}

			public void setLegRepurchaseTerm(int legRepurchaseTerm) {
				this.LegRepurchaseTerm = legRepurchaseTerm;
			}

			public String getLegSecurityDesc() {
				return LegSecurityDesc;
			}

			public void setLegSecurityDesc(String legSecurityDesc) {
				this.LegSecurityDesc = legSecurityDesc;
			}

			public String getLegSecurityExchange() {
				return LegSecurityExchange;
			}

			public void setLegSecurityExchange(String legSecurityExchange) {
				this.LegSecurityExchange = legSecurityExchange;
			}

			public String getLegSecurityID() {
				return LegSecurityID;
			}

			public void setLegSecurityID(String legSecurityID) {
				this.LegSecurityID = legSecurityID;
			}

			public String getLegSecurityIDSource() {
				return LegSecurityIDSource;
			}

			public void setLegSecurityIDSource(String legSecurityIDSource) {
				this.LegSecurityIDSource = legSecurityIDSource;
			}

			public String getLegSecuritySubType() {
				return LegSecuritySubType;
			}

			public void setLegSecuritySubType(String legSecuritySubType) {
				this.LegSecuritySubType = legSecuritySubType;
			}

			public String getLegSecurityType() {
				return LegSecurityType;
			}

			public void setLegSecurityType(String legSecurityType) {
				this.LegSecurityType = legSecurityType;
			}

			public char getLegSide() {
				return LegSide;
			}

			public void setLegSide(char legSide) {
				this.LegSide = legSide;
			}

			public String getLegStateOrProvinceOfIssue() {
				return LegStateOrProvinceOfIssue;
			}

			public void setLegStateOrProvinceOfIssue(String legStateOrProvinceOfIssue) {
				this.LegStateOrProvinceOfIssue = legStateOrProvinceOfIssue;
			}

			public String getLegStrikeCurrency() {
				return LegStrikeCurrency;
			}

			public void setLegStrikeCurrency(String legStrikeCurrency) {
				this.LegStrikeCurrency = legStrikeCurrency;
			}

			public double getLegStrikePrice() {
				return LegStrikePrice;
			}

			public void setLegStrikePrice(double legStrikePrice) {
				this.LegStrikePrice = legStrikePrice;
			}

			public String getLegSymbol() {
				return LegSymbol;
			}

			public void setLegSymbol(String legSymbol) {
				this.LegSymbol = legSymbol;
			}

			public String getLegSymbolSfx() {
				return LegSymbolSfx;
			}

			public void setLegSymbolSfx(String legSymbolSfx) {
				this.LegSymbolSfx = legSymbolSfx;
			}

			public int getNoLegSecurityAltID() {
				return NoLegSecurityAltID;
			}

			public void setNoLegSecurityAltID(int noLegSecurityAltID) {
				this.NoLegSecurityAltID = noLegSecurityAltID;
			}

			private List<NoLegSecurityAltID> listNoLegSecurityAltID;

			public List<NoLegSecurityAltID> getListNoLegSecurityAltID() {
				return listNoLegSecurityAltID;
			}

			public void setListNoLegSecurityAltID(List<NoLegSecurityAltID> listNoLegSecurityAltID) {
				this.listNoLegSecurityAltID = listNoLegSecurityAltID;
			}

			public static class NoLegSecurityAltID {
				private String LegSecurityAltID;
				private String LegSecurityAltIDSource;

				public String getLegSecurityAltID() {
					return LegSecurityAltID;
				}

				public void setLegSecurityAltID(String legSecurityAltID) {
					this.LegSecurityAltID = legSecurityAltID;
				}

				public String getLegSecurityAltIDSource() {
					return LegSecurityAltIDSource;
				}

				public void setLegSecurityAltIDSource(String legSecurityAltIDSource) {
					this.LegSecurityAltIDSource = legSecurityAltIDSource;
				}
			} // End Class NoLegSecurityAltID
		} // End Class NoLegs

		private List<NoUnderlyings> listNoUnderlyings;

		public List<NoUnderlyings> getListNoUnderlyings() {
			return listNoUnderlyings;
		}

		public void setListNoUnderlyings(List<NoUnderlyings> listNoUnderlyings) {
			this.listNoUnderlyings = listNoUnderlyings;
		}

		public static class NoUnderlyings {
			private String EncodedUnderlyingIssuer;
			private int EncodedUnderlyingIssuerLen;
			private String EncodedUnderlyingSecurityDesc;
			private int EncodedUnderlyingSecurityDescLen;
			private int NoUnderlyingSecurityAltID;
			private int NoUnderlyingStips;
			private String UnderlyingCFICode;
			private String UnderlyingCPProgram;
			private String UnderlyingCPRegType;
			private double UnderlyingContractMultiplier;
			private String UnderlyingCountryOfIssue;
			private String UnderlyingCouponPaymentDate;
			private double UnderlyingCouponRate;
			private String UnderlyingCreditRating;
			private String UnderlyingCurrency;
			private double UnderlyingCurrentValue;
			private double UnderlyingDirtyPrice;
			private double UnderlyingEndPrice;
			private double UnderlyingEndValue;
			private double UnderlyingFactor;
			private String UnderlyingInstrRegistry;
			private String UnderlyingIssueDate;
			private String UnderlyingIssuer;
			private String UnderlyingLocaleOfIssue;
			private String UnderlyingMaturityDate;
			private String UnderlyingMaturityMonthYear;
			private char UnderlyingOptAttribute;
			private int UnderlyingProduct;
			private int UnderlyingPutOrCall;
			private double UnderlyingPx;
			private double UnderlyingQty;
			private String UnderlyingRedemptionDate;
			private String UnderlyingRepoCollateralSecurityType;
			private double UnderlyingRepurchaseRate;
			private int UnderlyingRepurchaseTerm;
			private String UnderlyingSecurityDesc;
			private String UnderlyingSecurityExchange;
			private String UnderlyingSecurityID;
			private String UnderlyingSecurityIDSource;
			private String UnderlyingSecuritySubType;
			private String UnderlyingSecurityType;
			private double UnderlyingStartValue;
			private String UnderlyingStateOrProvinceOfIssue;
			private String UnderlyingStrikeCurrency;
			private double UnderlyingStrikePrice;
			private String UnderlyingSymbol;
			private String UnderlyingSymbolSfx;

			public String getEncodedUnderlyingIssuer() {
				return EncodedUnderlyingIssuer;
			}

			public void setEncodedUnderlyingIssuer(String encodedUnderlyingIssuer) {
				this.EncodedUnderlyingIssuer = encodedUnderlyingIssuer;
			}

			public int getEncodedUnderlyingIssuerLen() {
				return EncodedUnderlyingIssuerLen;
			}

			public void setEncodedUnderlyingIssuerLen(int encodedUnderlyingIssuerLen) {
				this.EncodedUnderlyingIssuerLen = encodedUnderlyingIssuerLen;
			}

			public String getEncodedUnderlyingSecurityDesc() {
				return EncodedUnderlyingSecurityDesc;
			}

			public void setEncodedUnderlyingSecurityDesc(String encodedUnderlyingSecurityDesc) {
				this.EncodedUnderlyingSecurityDesc = encodedUnderlyingSecurityDesc;
			}

			public int getEncodedUnderlyingSecurityDescLen() {
				return EncodedUnderlyingSecurityDescLen;
			}

			public void setEncodedUnderlyingSecurityDescLen(int encodedUnderlyingSecurityDescLen) {
				this.EncodedUnderlyingSecurityDescLen = encodedUnderlyingSecurityDescLen;
			}

			public int getNoUnderlyingSecurityAltID() {
				return NoUnderlyingSecurityAltID;
			}

			public void setNoUnderlyingSecurityAltID(int noUnderlyingSecurityAltID) {
				this.NoUnderlyingSecurityAltID = noUnderlyingSecurityAltID;
			}

			public int getNoUnderlyingStips() {
				return NoUnderlyingStips;
			}

			public void setNoUnderlyingStips(int noUnderlyingStips) {
				this.NoUnderlyingStips = noUnderlyingStips;
			}

			public String getUnderlyingCFICode() {
				return UnderlyingCFICode;
			}

			public void setUnderlyingCFICode(String underlyingCFICode) {
				this.UnderlyingCFICode = underlyingCFICode;
			}

			public String getUnderlyingCPProgram() {
				return UnderlyingCPProgram;
			}

			public void setUnderlyingCPProgram(String underlyingCPProgram) {
				this.UnderlyingCPProgram = underlyingCPProgram;
			}

			public String getUnderlyingCPRegType() {
				return UnderlyingCPRegType;
			}

			public void setUnderlyingCPRegType(String underlyingCPRegType) {
				this.UnderlyingCPRegType = underlyingCPRegType;
			}

			public double getUnderlyingContractMultiplier() {
				return UnderlyingContractMultiplier;
			}

			public void setUnderlyingContractMultiplier(double underlyingContractMultiplier) {
				this.UnderlyingContractMultiplier = underlyingContractMultiplier;
			}

			public String getUnderlyingCountryOfIssue() {
				return UnderlyingCountryOfIssue;
			}

			public void setUnderlyingCountryOfIssue(String underlyingCountryOfIssue) {
				this.UnderlyingCountryOfIssue = underlyingCountryOfIssue;
			}

			public String getUnderlyingCouponPaymentDate() {
				return UnderlyingCouponPaymentDate;
			}

			public void setUnderlyingCouponPaymentDate(String underlyingCouponPaymentDate) {
				this.UnderlyingCouponPaymentDate = underlyingCouponPaymentDate;
			}

			public double getUnderlyingCouponRate() {
				return UnderlyingCouponRate;
			}

			public void setUnderlyingCouponRate(double underlyingCouponRate) {
				this.UnderlyingCouponRate = underlyingCouponRate;
			}

			public String getUnderlyingCreditRating() {
				return UnderlyingCreditRating;
			}

			public void setUnderlyingCreditRating(String underlyingCreditRating) {
				this.UnderlyingCreditRating = underlyingCreditRating;
			}

			public String getUnderlyingCurrency() {
				return UnderlyingCurrency;
			}

			public void setUnderlyingCurrency(String underlyingCurrency) {
				this.UnderlyingCurrency = underlyingCurrency;
			}

			public double getUnderlyingCurrentValue() {
				return UnderlyingCurrentValue;
			}

			public void setUnderlyingCurrentValue(double underlyingCurrentValue) {
				this.UnderlyingCurrentValue = underlyingCurrentValue;
			}

			public double getUnderlyingDirtyPrice() {
				return UnderlyingDirtyPrice;
			}

			public void setUnderlyingDirtyPrice(double underlyingDirtyPrice) {
				this.UnderlyingDirtyPrice = underlyingDirtyPrice;
			}

			public double getUnderlyingEndPrice() {
				return UnderlyingEndPrice;
			}

			public void setUnderlyingEndPrice(double underlyingEndPrice) {
				this.UnderlyingEndPrice = underlyingEndPrice;
			}

			public double getUnderlyingEndValue() {
				return UnderlyingEndValue;
			}

			public void setUnderlyingEndValue(double underlyingEndValue) {
				this.UnderlyingEndValue = underlyingEndValue;
			}

			public double getUnderlyingFactor() {
				return UnderlyingFactor;
			}

			public void setUnderlyingFactor(double underlyingFactor) {
				this.UnderlyingFactor = underlyingFactor;
			}

			public String getUnderlyingInstrRegistry() {
				return UnderlyingInstrRegistry;
			}

			public void setUnderlyingInstrRegistry(String underlyingInstrRegistry) {
				this.UnderlyingInstrRegistry = underlyingInstrRegistry;
			}

			public String getUnderlyingIssueDate() {
				return UnderlyingIssueDate;
			}

			public void setUnderlyingIssueDate(String underlyingIssueDate) {
				this.UnderlyingIssueDate = underlyingIssueDate;
			}

			public String getUnderlyingIssuer() {
				return UnderlyingIssuer;
			}

			public void setUnderlyingIssuer(String underlyingIssuer) {
				this.UnderlyingIssuer = underlyingIssuer;
			}

			public String getUnderlyingLocaleOfIssue() {
				return UnderlyingLocaleOfIssue;
			}

			public void setUnderlyingLocaleOfIssue(String underlyingLocaleOfIssue) {
				this.UnderlyingLocaleOfIssue = underlyingLocaleOfIssue;
			}

			public String getUnderlyingMaturityDate() {
				return UnderlyingMaturityDate;
			}

			public void setUnderlyingMaturityDate(String underlyingMaturityDate) {
				this.UnderlyingMaturityDate = underlyingMaturityDate;
			}

			public String getUnderlyingMaturityMonthYear() {
				return UnderlyingMaturityMonthYear;
			}

			public void setUnderlyingMaturityMonthYear(String underlyingMaturityMonthYear) {
				this.UnderlyingMaturityMonthYear = underlyingMaturityMonthYear;
			}

			public char getUnderlyingOptAttribute() {
				return UnderlyingOptAttribute;
			}

			public void setUnderlyingOptAttribute(char underlyingOptAttribute) {
				this.UnderlyingOptAttribute = underlyingOptAttribute;
			}

			public int getUnderlyingProduct() {
				return UnderlyingProduct;
			}

			public void setUnderlyingProduct(int underlyingProduct) {
				this.UnderlyingProduct = underlyingProduct;
			}

			public int getUnderlyingPutOrCall() {
				return UnderlyingPutOrCall;
			}

			public void setUnderlyingPutOrCall(int underlyingPutOrCall) {
				this.UnderlyingPutOrCall = underlyingPutOrCall;
			}

			public double getUnderlyingPx() {
				return UnderlyingPx;
			}

			public void setUnderlyingPx(double underlyingPx) {
				this.UnderlyingPx = underlyingPx;
			}

			public double getUnderlyingQty() {
				return UnderlyingQty;
			}

			public void setUnderlyingQty(double underlyingQty) {
				this.UnderlyingQty = underlyingQty;
			}

			public String getUnderlyingRedemptionDate() {
				return UnderlyingRedemptionDate;
			}

			public void setUnderlyingRedemptionDate(String underlyingRedemptionDate) {
				this.UnderlyingRedemptionDate = underlyingRedemptionDate;
			}

			public String getUnderlyingRepoCollateralSecurityType() {
				return UnderlyingRepoCollateralSecurityType;
			}

			public void setUnderlyingRepoCollateralSecurityType(String underlyingRepoCollateralSecurityType) {
				this.UnderlyingRepoCollateralSecurityType = underlyingRepoCollateralSecurityType;
			}

			public double getUnderlyingRepurchaseRate() {
				return UnderlyingRepurchaseRate;
			}

			public void setUnderlyingRepurchaseRate(double underlyingRepurchaseRate) {
				this.UnderlyingRepurchaseRate = underlyingRepurchaseRate;
			}

			public int getUnderlyingRepurchaseTerm() {
				return UnderlyingRepurchaseTerm;
			}

			public void setUnderlyingRepurchaseTerm(int underlyingRepurchaseTerm) {
				this.UnderlyingRepurchaseTerm = underlyingRepurchaseTerm;
			}

			public String getUnderlyingSecurityDesc() {
				return UnderlyingSecurityDesc;
			}

			public void setUnderlyingSecurityDesc(String underlyingSecurityDesc) {
				this.UnderlyingSecurityDesc = underlyingSecurityDesc;
			}

			public String getUnderlyingSecurityExchange() {
				return UnderlyingSecurityExchange;
			}

			public void setUnderlyingSecurityExchange(String underlyingSecurityExchange) {
				this.UnderlyingSecurityExchange = underlyingSecurityExchange;
			}

			public String getUnderlyingSecurityID() {
				return UnderlyingSecurityID;
			}

			public void setUnderlyingSecurityID(String underlyingSecurityID) {
				this.UnderlyingSecurityID = underlyingSecurityID;
			}

			public String getUnderlyingSecurityIDSource() {
				return UnderlyingSecurityIDSource;
			}

			public void setUnderlyingSecurityIDSource(String underlyingSecurityIDSource) {
				this.UnderlyingSecurityIDSource = underlyingSecurityIDSource;
			}

			public String getUnderlyingSecuritySubType() {
				return UnderlyingSecuritySubType;
			}

			public void setUnderlyingSecuritySubType(String underlyingSecuritySubType) {
				this.UnderlyingSecuritySubType = underlyingSecuritySubType;
			}

			public String getUnderlyingSecurityType() {
				return UnderlyingSecurityType;
			}

			public void setUnderlyingSecurityType(String underlyingSecurityType) {
				this.UnderlyingSecurityType = underlyingSecurityType;
			}

			public double getUnderlyingStartValue() {
				return UnderlyingStartValue;
			}

			public void setUnderlyingStartValue(double underlyingStartValue) {
				this.UnderlyingStartValue = underlyingStartValue;
			}

			public String getUnderlyingStateOrProvinceOfIssue() {
				return UnderlyingStateOrProvinceOfIssue;
			}

			public void setUnderlyingStateOrProvinceOfIssue(String underlyingStateOrProvinceOfIssue) {
				this.UnderlyingStateOrProvinceOfIssue = underlyingStateOrProvinceOfIssue;
			}

			public String getUnderlyingStrikeCurrency() {
				return UnderlyingStrikeCurrency;
			}

			public void setUnderlyingStrikeCurrency(String underlyingStrikeCurrency) {
				this.UnderlyingStrikeCurrency = underlyingStrikeCurrency;
			}

			public double getUnderlyingStrikePrice() {
				return UnderlyingStrikePrice;
			}

			public void setUnderlyingStrikePrice(double underlyingStrikePrice) {
				this.UnderlyingStrikePrice = underlyingStrikePrice;
			}

			public String getUnderlyingSymbol() {
				return UnderlyingSymbol;
			}

			public void setUnderlyingSymbol(String underlyingSymbol) {
				this.UnderlyingSymbol = underlyingSymbol;
			}

			public String getUnderlyingSymbolSfx() {
				return UnderlyingSymbolSfx;
			}

			public void setUnderlyingSymbolSfx(String underlyingSymbolSfx) {
				this.UnderlyingSymbolSfx = underlyingSymbolSfx;
			}

			private List<NoUnderlyingStips> listNoUnderlyingStips;

			public List<NoUnderlyingStips> getListNoUnderlyingStips() {
				return listNoUnderlyingStips;
			}

			public void setListNoUnderlyingStips(List<NoUnderlyingStips> listNoUnderlyingStips) {
				this.listNoUnderlyingStips = listNoUnderlyingStips;
			}

			public static class NoUnderlyingStips {
				private String UnderlyingStipType;
				private String UnderlyingStipValue;

				public String getUnderlyingStipType() {
					return UnderlyingStipType;
				}

				public void setUnderlyingStipType(String underlyingStipType) {
					this.UnderlyingStipType = underlyingStipType;
				}

				public String getUnderlyingStipValue() {
					return UnderlyingStipValue;
				}

				public void setUnderlyingStipValue(String underlyingStipValue) {
					this.UnderlyingStipValue = underlyingStipValue;
				}
			} // End Class NoUnderlyingStips

			private List<NoUnderlyingSecurityAltID> listNoUnderlyingSecurityAltID;

			public List<NoUnderlyingSecurityAltID> getListNoUnderlyingSecurityAltID() {
				return listNoUnderlyingSecurityAltID;
			}

			public void setListNoUnderlyingSecurityAltID(
					List<NoUnderlyingSecurityAltID> listNoUnderlyingSecurityAltID) {
				this.listNoUnderlyingSecurityAltID = listNoUnderlyingSecurityAltID;
			}

			public static class NoUnderlyingSecurityAltID {
				private String UnderlyingSecurityAltID;
				private String UnderlyingSecurityAltIDSource;

				public String getUnderlyingSecurityAltID() {
					return UnderlyingSecurityAltID;
				}

				public void setUnderlyingSecurityAltID(String underlyingSecurityAltID) {
					this.UnderlyingSecurityAltID = underlyingSecurityAltID;
				}

				public String getUnderlyingSecurityAltIDSource() {
					return UnderlyingSecurityAltIDSource;
				}

				public void setUnderlyingSecurityAltIDSource(String underlyingSecurityAltIDSource) {
					this.UnderlyingSecurityAltIDSource = underlyingSecurityAltIDSource;
				}
			} // End Class NoUnderlyingSecurityAltID
		} // End Class NoUnderlyings

		private List<NoEvents> listNoEvents;

		public List<NoEvents> getListNoEvents() {
			return listNoEvents;
		}

		public void setListNoEvents(List<NoEvents> listNoEvents) {
			this.listNoEvents = listNoEvents;
		}

		public static class NoEvents {
			private String EventDate;
			private double EventPx;
			private String EventText;
			private int EventType;

			public String getEventDate() {
				return EventDate;
			}

			public void setEventDate(String eventDate) {
				this.EventDate = eventDate;
			}

			public double getEventPx() {
				return EventPx;
			}

			public void setEventPx(double eventPx) {
				this.EventPx = eventPx;
			}

			public String getEventText() {
				return EventText;
			}

			public void setEventText(String eventText) {
				this.EventText = eventText;
			}

			public int getEventType() {
				return EventType;
			}

			public void setEventType(int eventType) {
				this.EventType = eventType;
			}
		} // End Class NoEvents

		private List<NoSecurityAltID> listNoSecurityAltID;

		public List<NoSecurityAltID> getListNoSecurityAltID() {
			return listNoSecurityAltID;
		}

		public void setListNoSecurityAltID(List<NoSecurityAltID> listNoSecurityAltID) {
			this.listNoSecurityAltID = listNoSecurityAltID;
		}

		public static class NoSecurityAltID {
			private String SecurityAltID;
			private String SecurityAltIDSource;

			public String getSecurityAltID() {
				return SecurityAltID;
			}

			public void setSecurityAltID(String securityAltID) {
				this.SecurityAltID = securityAltID;
			}

			public String getSecurityAltIDSource() {
				return SecurityAltIDSource;
			}

			public void setSecurityAltIDSource(String securityAltIDSource) {
				this.SecurityAltIDSource = securityAltIDSource;
			}
		} // End Class NoSecurityAltID
	} // End Class NoRelatedSym

	private List<NoMDEntryTypes> listNoMDEntryTypes;

	public List<NoMDEntryTypes> getListNoMDEntryTypes() {
		return listNoMDEntryTypes;
	}

	public void setListNoMDEntryTypes(List<NoMDEntryTypes> listNoMDEntryTypes) {
		this.listNoMDEntryTypes = listNoMDEntryTypes;
	}

	public static class NoMDEntryTypes {
		private char MDEntryType;

		public char getMDEntryType() {
			return MDEntryType;
		}

		public void setMDEntryType(char mDEntryType) {
			this.MDEntryType = mDEntryType;
		}
	} // End Class NoMDEntryTypes
} // End Class MarketDataRequest
