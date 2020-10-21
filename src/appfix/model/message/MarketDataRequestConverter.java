package appfix.model.message;

import quickfix.FieldMap;
import quickfix.Field;
import quickfix.FieldNotFound;
import quickfix.Group;
import quickfix.field.MDEntryType;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MarketDataRequestConverter {

	public static MarketDataRequest fromMessage(FieldMap fieldMap) throws FieldNotFound {
		MarketDataRequest marketDataRequest = new MarketDataRequest();
		Iterator<Field<?>> fieldIterator = fieldMap.iterator();
		while (fieldIterator.hasNext()) {
			Field<?> field = (Field<?>) fieldIterator.next();
			switch (field.getTag()) {
			case quickfix.field.AggregatedBook.FIELD:
				marketDataRequest.setAggregatedBook(fieldMap.getBoolean(field.getTag()));
				break;
			case quickfix.field.ApplQueueAction.FIELD:
				marketDataRequest.setApplQueueAction(fieldMap.getInt(field.getTag()));
				break;
			case quickfix.field.ApplQueueMax.FIELD:
				marketDataRequest.setApplQueueMax(fieldMap.getInt(field.getTag()));
				break;
			case quickfix.field.CheckSum.FIELD:
				marketDataRequest.setCheckSum(fieldMap.getString(field.getTag()));
				break;
			case quickfix.field.MDImplicitDelete.FIELD:
				marketDataRequest.setMDImplicitDelete(fieldMap.getBoolean(field.getTag()));
				break;
			case quickfix.field.MDReqID.FIELD:
				marketDataRequest.setMDReqID(fieldMap.getString(field.getTag()));
				break;
			case quickfix.field.MDUpdateType.FIELD:
				marketDataRequest.setMDUpdateType(fieldMap.getInt(field.getTag()));
				break;
			case quickfix.field.MarketDepth.FIELD:
				marketDataRequest.setMarketDepth(fieldMap.getInt(field.getTag()));
				break;
			case quickfix.field.NoMDEntryTypes.FIELD:
				marketDataRequest.setNoMDEntryTypes(fieldMap.getInt(field.getTag()));
				break;
			case quickfix.field.NoRelatedSym.FIELD:
				marketDataRequest.setNoRelatedSym(fieldMap.getInt(field.getTag()));
				break;
			case quickfix.field.NoTradingSessions.FIELD:
				marketDataRequest.setNoTradingSessions(fieldMap.getInt(field.getTag()));
				break;
			case quickfix.field.OpenCloseSettlFlag.FIELD:
				marketDataRequest.setOpenCloseSettlFlag(fieldMap.getString(field.getTag()));
				break;
			case quickfix.field.Scope.FIELD:
				marketDataRequest.setScope(fieldMap.getString(field.getTag()));
				break;
			case quickfix.field.Signature.FIELD:
				marketDataRequest.setSignature(fieldMap.getString(field.getTag()));
				break;
			case quickfix.field.SignatureLength.FIELD:
				marketDataRequest.setSignatureLength(fieldMap.getInt(field.getTag()));
				break;
			case quickfix.field.SubscriptionRequestType.FIELD:
				marketDataRequest.setSubscriptionRequestType(fieldMap.getChar(field.getTag()));
				break;
			}
		}
		List<appfix.model.message.MarketDataRequest.NoTradingSessions> listNoTradingSessions = new ArrayList<>();
		List<appfix.model.message.MarketDataRequest.NoRelatedSym> listNoRelatedSym = new ArrayList<>();
		List<appfix.model.message.MarketDataRequest.NoMDEntryTypes> listNoMDEntryTypes = new ArrayList<>();
		Iterator<?> groupsKeysMarketDataRequest = fieldMap.groupKeyIterator();
		while (groupsKeysMarketDataRequest.hasNext()) {
			int groupCountTagMarketDataRequest = ((Integer) groupsKeysMarketDataRequest.next()).intValue();
			Group gMarketDataRequest = new Group(groupCountTagMarketDataRequest, 0);
			int iMarketDataRequest = 1;
			while (fieldMap.hasGroup(iMarketDataRequest, groupCountTagMarketDataRequest)) {
				fieldMap.getGroup(iMarketDataRequest, gMarketDataRequest);
				switch (groupCountTagMarketDataRequest) {
				case quickfix.field.NoTradingSessions.FIELD:
					appfix.model.message.MarketDataRequest.NoTradingSessions noTradingSessions = new appfix.model.message.MarketDataRequest.NoTradingSessions();
					Iterator<Field<?>> fieldIteratorNoTradingSessions = gMarketDataRequest.iterator();
					while (fieldIteratorNoTradingSessions.hasNext()) {
						Field<?> field = (Field<?>) fieldIteratorNoTradingSessions.next();
						switch (field.getTag()) {
						case quickfix.field.TradingSessionID.FIELD:
							noTradingSessions.setTradingSessionID(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.TradingSessionSubID.FIELD:
							noTradingSessions.setTradingSessionSubID(gMarketDataRequest.getString(field.getTag()));
							break;
						}
					}
					listNoTradingSessions.add(noTradingSessions);
					break;
				case quickfix.field.NoRelatedSym.FIELD:
					appfix.model.message.MarketDataRequest.NoRelatedSym noRelatedSym = new appfix.model.message.MarketDataRequest.NoRelatedSym();
					Iterator<Field<?>> fieldIteratorNoRelatedSym = gMarketDataRequest.iterator();
					while (fieldIteratorNoRelatedSym.hasNext()) {
						Field<?> field = (Field<?>) fieldIteratorNoRelatedSym.next();
						switch (field.getTag()) {
						case quickfix.field.CFICode.FIELD:
							noRelatedSym.setCFICode(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.CPProgram.FIELD:
							noRelatedSym.setCPProgram(gMarketDataRequest.getInt(field.getTag()));
							break;
						case quickfix.field.CPRegType.FIELD:
							noRelatedSym.setCPRegType(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.ContractMultiplier.FIELD:
							noRelatedSym.setContractMultiplier(gMarketDataRequest.getDouble(field.getTag()));
							break;
						case quickfix.field.ContractSettlMonth.FIELD:
							noRelatedSym.setContractSettlMonth(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.CountryOfIssue.FIELD:
							noRelatedSym.setCountryOfIssue(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.CouponPaymentDate.FIELD:
							noRelatedSym.setCouponPaymentDate(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.CouponRate.FIELD:
							noRelatedSym.setCouponRate(gMarketDataRequest.getDouble(field.getTag()));
							break;
						case quickfix.field.CreditRating.FIELD:
							noRelatedSym.setCreditRating(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.DatedDate.FIELD:
							noRelatedSym.setDatedDate(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.EncodedIssuer.FIELD:
							noRelatedSym.setEncodedIssuer(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.EncodedIssuerLen.FIELD:
							noRelatedSym.setEncodedIssuerLen(gMarketDataRequest.getInt(field.getTag()));
							break;
						case quickfix.field.EncodedSecurityDesc.FIELD:
							noRelatedSym.setEncodedSecurityDesc(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.EncodedSecurityDescLen.FIELD:
							noRelatedSym.setEncodedSecurityDescLen(gMarketDataRequest.getInt(field.getTag()));
							break;
						case quickfix.field.Factor.FIELD:
							noRelatedSym.setFactor(gMarketDataRequest.getDouble(field.getTag()));
							break;
						case quickfix.field.InstrRegistry.FIELD:
							noRelatedSym.setInstrRegistry(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.InterestAccrualDate.FIELD:
							noRelatedSym.setInterestAccrualDate(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.IssueDate.FIELD:
							noRelatedSym.setIssueDate(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.Issuer.FIELD:
							noRelatedSym.setIssuer(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.LocaleOfIssue.FIELD:
							noRelatedSym.setLocaleOfIssue(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.MaturityDate.FIELD:
							noRelatedSym.setMaturityDate(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.MaturityMonthYear.FIELD:
							noRelatedSym.setMaturityMonthYear(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.NoEvents.FIELD:
							noRelatedSym.setNoEvents(gMarketDataRequest.getInt(field.getTag()));
							break;
						case quickfix.field.NoLegs.FIELD:
							noRelatedSym.setNoLegs(gMarketDataRequest.getInt(field.getTag()));
							break;
						case quickfix.field.NoSecurityAltID.FIELD:
							noRelatedSym.setNoSecurityAltID(gMarketDataRequest.getInt(field.getTag()));
							break;
						case quickfix.field.NoUnderlyings.FIELD:
							noRelatedSym.setNoUnderlyings(gMarketDataRequest.getInt(field.getTag()));
							break;
						case quickfix.field.OptAttribute.FIELD:
							noRelatedSym.setOptAttribute(gMarketDataRequest.getChar(field.getTag()));
							break;
						case quickfix.field.Pool.FIELD:
							noRelatedSym.setPool(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.Product.FIELD:
							noRelatedSym.setProduct(gMarketDataRequest.getInt(field.getTag()));
							break;
						case quickfix.field.PutOrCall.FIELD:
							noRelatedSym.setPutOrCall(gMarketDataRequest.getInt(field.getTag()));
							break;
						case quickfix.field.RedemptionDate.FIELD:
							noRelatedSym.setRedemptionDate(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.RepoCollateralSecurityType.FIELD:
							noRelatedSym.setRepoCollateralSecurityType(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.RepurchaseRate.FIELD:
							noRelatedSym.setRepurchaseRate(gMarketDataRequest.getDouble(field.getTag()));
							break;
						case quickfix.field.RepurchaseTerm.FIELD:
							noRelatedSym.setRepurchaseTerm(gMarketDataRequest.getInt(field.getTag()));
							break;
						case quickfix.field.SecurityDesc.FIELD:
							noRelatedSym.setSecurityDesc(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.SecurityExchange.FIELD:
							noRelatedSym.setSecurityExchange(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.SecurityID.FIELD:
							noRelatedSym.setSecurityID(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.SecurityIDSource.FIELD:
							noRelatedSym.setSecurityIDSource(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.SecuritySubType.FIELD:
							noRelatedSym.setSecuritySubType(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.SecurityType.FIELD:
							noRelatedSym.setSecurityType(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.StateOrProvinceOfIssue.FIELD:
							noRelatedSym.setStateOrProvinceOfIssue(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.StrikeCurrency.FIELD:
							noRelatedSym.setStrikeCurrency(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.StrikePrice.FIELD:
							noRelatedSym.setStrikePrice(gMarketDataRequest.getDouble(field.getTag()));
							break;
						case quickfix.field.Symbol.FIELD:
							noRelatedSym.setSymbol(gMarketDataRequest.getString(field.getTag()));
							break;
						case quickfix.field.SymbolSfx.FIELD:
							noRelatedSym.setSymbolSfx(gMarketDataRequest.getString(field.getTag()));
							break;
						}
					}
					List<appfix.model.message.MarketDataRequest.NoRelatedSym.NoLegs> listNoLegs = new ArrayList<>();
					List<appfix.model.message.MarketDataRequest.NoRelatedSym.NoUnderlyings> listNoUnderlyings = new ArrayList<>();
					List<appfix.model.message.MarketDataRequest.NoRelatedSym.NoEvents> listNoEvents = new ArrayList<>();
					List<appfix.model.message.MarketDataRequest.NoRelatedSym.NoSecurityAltID> listNoSecurityAltID = new ArrayList<>();
					Iterator<?> groupsKeysNoRelatedSym = fieldMap.groupKeyIterator();
					while (groupsKeysNoRelatedSym.hasNext()) {
						int groupCountTagNoRelatedSym = ((Integer) groupsKeysNoRelatedSym.next()).intValue();
						Group gNoRelatedSym = new Group(groupCountTagNoRelatedSym, 0);
						int iNoRelatedSym = 1;
						while (fieldMap.hasGroup(iNoRelatedSym, groupCountTagNoRelatedSym)) {
							fieldMap.getGroup(iNoRelatedSym, gNoRelatedSym);
							switch (groupCountTagNoRelatedSym) {
							case quickfix.field.NoLegs.FIELD:
								appfix.model.message.MarketDataRequest.NoRelatedSym.NoLegs noLegs = new appfix.model.message.MarketDataRequest.NoRelatedSym.NoLegs();
								Iterator<Field<?>> fieldIteratorNoLegs = gNoRelatedSym.iterator();
								while (fieldIteratorNoLegs.hasNext()) {
									Field<?> field = (Field<?>) fieldIteratorNoLegs.next();
									switch (field.getTag()) {
									case quickfix.field.EncodedLegIssuer.FIELD:
										noLegs.setEncodedLegIssuer(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.EncodedLegIssuerLen.FIELD:
										noLegs.setEncodedLegIssuerLen(gNoRelatedSym.getInt(field.getTag()));
										break;
									case quickfix.field.EncodedLegSecurityDesc.FIELD:
										noLegs.setEncodedLegSecurityDesc(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.EncodedLegSecurityDescLen.FIELD:
										noLegs.setEncodedLegSecurityDescLen(gNoRelatedSym.getInt(field.getTag()));
										break;
									case quickfix.field.LegCFICode.FIELD:
										noLegs.setLegCFICode(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegContractMultiplier.FIELD:
										noLegs.setLegContractMultiplier(gNoRelatedSym.getDouble(field.getTag()));
										break;
									case quickfix.field.LegContractSettlMonth.FIELD:
										noLegs.setLegContractSettlMonth(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegCountryOfIssue.FIELD:
										noLegs.setLegCountryOfIssue(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegCouponPaymentDate.FIELD:
										noLegs.setLegCouponPaymentDate(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegCouponRate.FIELD:
										noLegs.setLegCouponRate(gNoRelatedSym.getDouble(field.getTag()));
										break;
									case quickfix.field.LegCreditRating.FIELD:
										noLegs.setLegCreditRating(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegCurrency.FIELD:
										noLegs.setLegCurrency(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegDatedDate.FIELD:
										noLegs.setLegDatedDate(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegFactor.FIELD:
										noLegs.setLegFactor(gNoRelatedSym.getDouble(field.getTag()));
										break;
									case quickfix.field.LegInstrRegistry.FIELD:
										noLegs.setLegInstrRegistry(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegInterestAccrualDate.FIELD:
										noLegs.setLegInterestAccrualDate(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegIssueDate.FIELD:
										noLegs.setLegIssueDate(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegIssuer.FIELD:
										noLegs.setLegIssuer(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegLocaleOfIssue.FIELD:
										noLegs.setLegLocaleOfIssue(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegMaturityDate.FIELD:
										noLegs.setLegMaturityDate(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegMaturityMonthYear.FIELD:
										noLegs.setLegMaturityMonthYear(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegOptAttribute.FIELD:
										noLegs.setLegOptAttribute(gNoRelatedSym.getChar(field.getTag()));
										break;
									case quickfix.field.LegPool.FIELD:
										noLegs.setLegPool(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegProduct.FIELD:
										noLegs.setLegProduct(gNoRelatedSym.getInt(field.getTag()));
										break;
									case quickfix.field.LegRatioQty.FIELD:
										noLegs.setLegRatioQty(gNoRelatedSym.getDouble(field.getTag()));
										break;
									case quickfix.field.LegRedemptionDate.FIELD:
										noLegs.setLegRedemptionDate(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegRepoCollateralSecurityType.FIELD:
										noLegs.setLegRepoCollateralSecurityType(
												gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegRepurchaseRate.FIELD:
										noLegs.setLegRepurchaseRate(gNoRelatedSym.getDouble(field.getTag()));
										break;
									case quickfix.field.LegRepurchaseTerm.FIELD:
										noLegs.setLegRepurchaseTerm(gNoRelatedSym.getInt(field.getTag()));
										break;
									case quickfix.field.LegSecurityDesc.FIELD:
										noLegs.setLegSecurityDesc(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegSecurityExchange.FIELD:
										noLegs.setLegSecurityExchange(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegSecurityID.FIELD:
										noLegs.setLegSecurityID(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegSecurityIDSource.FIELD:
										noLegs.setLegSecurityIDSource(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegSecuritySubType.FIELD:
										noLegs.setLegSecuritySubType(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegSecurityType.FIELD:
										noLegs.setLegSecurityType(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegSide.FIELD:
										noLegs.setLegSide(gNoRelatedSym.getChar(field.getTag()));
										break;
									case quickfix.field.LegStateOrProvinceOfIssue.FIELD:
										noLegs.setLegStateOrProvinceOfIssue(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegStrikeCurrency.FIELD:
										noLegs.setLegStrikeCurrency(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegStrikePrice.FIELD:
										noLegs.setLegStrikePrice(gNoRelatedSym.getDouble(field.getTag()));
										break;
									case quickfix.field.LegSymbol.FIELD:
										noLegs.setLegSymbol(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.LegSymbolSfx.FIELD:
										noLegs.setLegSymbolSfx(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.NoLegSecurityAltID.FIELD:
										noLegs.setNoLegSecurityAltID(gNoRelatedSym.getInt(field.getTag()));
										break;
									}
								}
								List<appfix.model.message.MarketDataRequest.NoRelatedSym.NoLegs.NoLegSecurityAltID> listNoLegSecurityAltID = new ArrayList<>();
								Iterator<?> groupsKeysNoLegs = fieldMap.groupKeyIterator();
								while (groupsKeysNoLegs.hasNext()) {
									int groupCountTagNoLegs = ((Integer) groupsKeysNoLegs.next()).intValue();
									Group gNoLegs = new Group(groupCountTagNoLegs, 0);
									int iNoLegs = 1;
									while (fieldMap.hasGroup(iNoLegs, groupCountTagNoLegs)) {
										fieldMap.getGroup(iNoLegs, gNoLegs);
										switch (groupCountTagNoLegs) {
										case quickfix.field.NoLegSecurityAltID.FIELD:
											appfix.model.message.MarketDataRequest.NoRelatedSym.NoLegs.NoLegSecurityAltID noLegSecurityAltID = new appfix.model.message.MarketDataRequest.NoRelatedSym.NoLegs.NoLegSecurityAltID();
											Iterator<Field<?>> fieldIteratorNoLegSecurityAltID = gNoLegs.iterator();
											while (fieldIteratorNoLegSecurityAltID.hasNext()) {
												Field<?> field = (Field<?>) fieldIteratorNoLegSecurityAltID.next();
												switch (field.getTag()) {
												case quickfix.field.LegSecurityAltID.FIELD:
													noLegSecurityAltID
															.setLegSecurityAltID(gNoLegs.getString(field.getTag()));
													break;
												case quickfix.field.LegSecurityAltIDSource.FIELD:
													noLegSecurityAltID.setLegSecurityAltIDSource(
															gNoLegs.getString(field.getTag()));
													break;
												}
											}
											listNoLegSecurityAltID.add(noLegSecurityAltID);
											break;
										}// End of Switch Case Groups
										iNoLegs++;
									}
								}
								noLegs.setListNoLegSecurityAltID(listNoLegSecurityAltID);
								listNoLegs.add(noLegs);
								break;
							case quickfix.field.NoUnderlyings.FIELD:
								appfix.model.message.MarketDataRequest.NoRelatedSym.NoUnderlyings noUnderlyings = new appfix.model.message.MarketDataRequest.NoRelatedSym.NoUnderlyings();
								Iterator<Field<?>> fieldIteratorNoUnderlyings = gNoRelatedSym.iterator();
								while (fieldIteratorNoUnderlyings.hasNext()) {
									Field<?> field = (Field<?>) fieldIteratorNoUnderlyings.next();
									switch (field.getTag()) {
									case quickfix.field.EncodedUnderlyingIssuer.FIELD:
										noUnderlyings
												.setEncodedUnderlyingIssuer(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.EncodedUnderlyingIssuerLen.FIELD:
										noUnderlyings
												.setEncodedUnderlyingIssuerLen(gNoRelatedSym.getInt(field.getTag()));
										break;
									case quickfix.field.EncodedUnderlyingSecurityDesc.FIELD:
										noUnderlyings.setEncodedUnderlyingSecurityDesc(
												gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.EncodedUnderlyingSecurityDescLen.FIELD:
										noUnderlyings.setEncodedUnderlyingSecurityDescLen(
												gNoRelatedSym.getInt(field.getTag()));
										break;
									case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
										noUnderlyings
												.setNoUnderlyingSecurityAltID(gNoRelatedSym.getInt(field.getTag()));
										break;
									case quickfix.field.NoUnderlyingStips.FIELD:
										noUnderlyings.setNoUnderlyingStips(gNoRelatedSym.getInt(field.getTag()));
										break;
									case quickfix.field.UnderlyingCFICode.FIELD:
										noUnderlyings.setUnderlyingCFICode(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingCPProgram.FIELD:
										noUnderlyings.setUnderlyingCPProgram(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingCPRegType.FIELD:
										noUnderlyings.setUnderlyingCPRegType(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingContractMultiplier.FIELD:
										noUnderlyings.setUnderlyingContractMultiplier(
												gNoRelatedSym.getDouble(field.getTag()));
										break;
									case quickfix.field.UnderlyingCountryOfIssue.FIELD:
										noUnderlyings
												.setUnderlyingCountryOfIssue(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingCouponPaymentDate.FIELD:
										noUnderlyings.setUnderlyingCouponPaymentDate(
												gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingCouponRate.FIELD:
										noUnderlyings.setUnderlyingCouponRate(gNoRelatedSym.getDouble(field.getTag()));
										break;
									case quickfix.field.UnderlyingCreditRating.FIELD:
										noUnderlyings
												.setUnderlyingCreditRating(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingCurrency.FIELD:
										noUnderlyings.setUnderlyingCurrency(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingCurrentValue.FIELD:
										noUnderlyings
												.setUnderlyingCurrentValue(gNoRelatedSym.getDouble(field.getTag()));
										break;
									case quickfix.field.UnderlyingDirtyPrice.FIELD:
										noUnderlyings.setUnderlyingDirtyPrice(gNoRelatedSym.getDouble(field.getTag()));
										break;
									case quickfix.field.UnderlyingEndPrice.FIELD:
										noUnderlyings.setUnderlyingEndPrice(gNoRelatedSym.getDouble(field.getTag()));
										break;
									case quickfix.field.UnderlyingEndValue.FIELD:
										noUnderlyings.setUnderlyingEndValue(gNoRelatedSym.getDouble(field.getTag()));
										break;
									case quickfix.field.UnderlyingFactor.FIELD:
										noUnderlyings.setUnderlyingFactor(gNoRelatedSym.getDouble(field.getTag()));
										break;
									case quickfix.field.UnderlyingInstrRegistry.FIELD:
										noUnderlyings
												.setUnderlyingInstrRegistry(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingIssueDate.FIELD:
										noUnderlyings.setUnderlyingIssueDate(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingIssuer.FIELD:
										noUnderlyings.setUnderlyingIssuer(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingLocaleOfIssue.FIELD:
										noUnderlyings
												.setUnderlyingLocaleOfIssue(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingMaturityDate.FIELD:
										noUnderlyings
												.setUnderlyingMaturityDate(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingMaturityMonthYear.FIELD:
										noUnderlyings.setUnderlyingMaturityMonthYear(
												gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingOptAttribute.FIELD:
										noUnderlyings.setUnderlyingOptAttribute(gNoRelatedSym.getChar(field.getTag()));
										break;
									case quickfix.field.UnderlyingProduct.FIELD:
										noUnderlyings.setUnderlyingProduct(gNoRelatedSym.getInt(field.getTag()));
										break;
									case quickfix.field.UnderlyingPutOrCall.FIELD:
										noUnderlyings.setUnderlyingPutOrCall(gNoRelatedSym.getInt(field.getTag()));
										break;
									case quickfix.field.UnderlyingPx.FIELD:
										noUnderlyings.setUnderlyingPx(gNoRelatedSym.getDouble(field.getTag()));
										break;
									case quickfix.field.UnderlyingQty.FIELD:
										noUnderlyings.setUnderlyingQty(gNoRelatedSym.getDouble(field.getTag()));
										break;
									case quickfix.field.UnderlyingRedemptionDate.FIELD:
										noUnderlyings
												.setUnderlyingRedemptionDate(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingRepoCollateralSecurityType.FIELD:
										noUnderlyings.setUnderlyingRepoCollateralSecurityType(
												gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingRepurchaseRate.FIELD:
										noUnderlyings
												.setUnderlyingRepurchaseRate(gNoRelatedSym.getDouble(field.getTag()));
										break;
									case quickfix.field.UnderlyingRepurchaseTerm.FIELD:
										noUnderlyings.setUnderlyingRepurchaseTerm(gNoRelatedSym.getInt(field.getTag()));
										break;
									case quickfix.field.UnderlyingSecurityDesc.FIELD:
										noUnderlyings
												.setUnderlyingSecurityDesc(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingSecurityExchange.FIELD:
										noUnderlyings
												.setUnderlyingSecurityExchange(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingSecurityID.FIELD:
										noUnderlyings.setUnderlyingSecurityID(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingSecurityIDSource.FIELD:
										noUnderlyings
												.setUnderlyingSecurityIDSource(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingSecuritySubType.FIELD:
										noUnderlyings
												.setUnderlyingSecuritySubType(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingSecurityType.FIELD:
										noUnderlyings
												.setUnderlyingSecurityType(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingStartValue.FIELD:
										noUnderlyings.setUnderlyingStartValue(gNoRelatedSym.getDouble(field.getTag()));
										break;
									case quickfix.field.UnderlyingStateOrProvinceOfIssue.FIELD:
										noUnderlyings.setUnderlyingStateOrProvinceOfIssue(
												gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingStrikeCurrency.FIELD:
										noUnderlyings
												.setUnderlyingStrikeCurrency(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingStrikePrice.FIELD:
										noUnderlyings.setUnderlyingStrikePrice(gNoRelatedSym.getDouble(field.getTag()));
										break;
									case quickfix.field.UnderlyingSymbol.FIELD:
										noUnderlyings.setUnderlyingSymbol(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.UnderlyingSymbolSfx.FIELD:
										noUnderlyings.setUnderlyingSymbolSfx(gNoRelatedSym.getString(field.getTag()));
										break;
									}
								}
								List<appfix.model.message.MarketDataRequest.NoRelatedSym.NoUnderlyings.NoUnderlyingStips> listNoUnderlyingStips = new ArrayList<>();
								List<appfix.model.message.MarketDataRequest.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID> listNoUnderlyingSecurityAltID = new ArrayList<>();
								Iterator<?> groupsKeysNoUnderlyings = fieldMap.groupKeyIterator();
								while (groupsKeysNoUnderlyings.hasNext()) {
									int groupCountTagNoUnderlyings = ((Integer) groupsKeysNoUnderlyings.next())
											.intValue();
									Group gNoUnderlyings = new Group(groupCountTagNoUnderlyings, 0);
									int iNoUnderlyings = 1;
									while (fieldMap.hasGroup(iNoUnderlyings, groupCountTagNoUnderlyings)) {
										fieldMap.getGroup(iNoUnderlyings, gNoUnderlyings);
										switch (groupCountTagNoUnderlyings) {
										case quickfix.field.NoUnderlyingStips.FIELD:
											appfix.model.message.MarketDataRequest.NoRelatedSym.NoUnderlyings.NoUnderlyingStips noUnderlyingStips = new appfix.model.message.MarketDataRequest.NoRelatedSym.NoUnderlyings.NoUnderlyingStips();
											Iterator<Field<?>> fieldIteratorNoUnderlyingStips = gNoUnderlyings
													.iterator();
											while (fieldIteratorNoUnderlyingStips.hasNext()) {
												Field<?> field = (Field<?>) fieldIteratorNoUnderlyingStips.next();
												switch (field.getTag()) {
												case quickfix.field.UnderlyingStipType.FIELD:
													noUnderlyingStips.setUnderlyingStipType(
															gNoUnderlyings.getString(field.getTag()));
													break;
												case quickfix.field.UnderlyingStipValue.FIELD:
													noUnderlyingStips.setUnderlyingStipValue(
															gNoUnderlyings.getString(field.getTag()));
													break;
												}
											}
											listNoUnderlyingStips.add(noUnderlyingStips);
											break;
										case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
											appfix.model.message.MarketDataRequest.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID noUnderlyingSecurityAltID = new appfix.model.message.MarketDataRequest.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();
											Iterator<Field<?>> fieldIteratorNoUnderlyingSecurityAltID = gNoUnderlyings
													.iterator();
											while (fieldIteratorNoUnderlyingSecurityAltID.hasNext()) {
												Field<?> field = (Field<?>) fieldIteratorNoUnderlyingSecurityAltID
														.next();
												switch (field.getTag()) {
												case quickfix.field.UnderlyingSecurityAltID.FIELD:
													noUnderlyingSecurityAltID.setUnderlyingSecurityAltID(
															gNoUnderlyings.getString(field.getTag()));
													break;
												case quickfix.field.UnderlyingSecurityAltIDSource.FIELD:
													noUnderlyingSecurityAltID.setUnderlyingSecurityAltIDSource(
															gNoUnderlyings.getString(field.getTag()));
													break;
												}
											}
											listNoUnderlyingSecurityAltID.add(noUnderlyingSecurityAltID);
											break;
										}// End of Switch Case Groups
										iNoUnderlyings++;
									}
								}
								noUnderlyings.setListNoUnderlyingStips(listNoUnderlyingStips);
								noUnderlyings.setListNoUnderlyingSecurityAltID(listNoUnderlyingSecurityAltID);
								listNoUnderlyings.add(noUnderlyings);
								break;
							case quickfix.field.NoEvents.FIELD:
								appfix.model.message.MarketDataRequest.NoRelatedSym.NoEvents noEvents = new appfix.model.message.MarketDataRequest.NoRelatedSym.NoEvents();
								Iterator<Field<?>> fieldIteratorNoEvents = gNoRelatedSym.iterator();
								while (fieldIteratorNoEvents.hasNext()) {
									Field<?> field = (Field<?>) fieldIteratorNoEvents.next();
									switch (field.getTag()) {
									case quickfix.field.EventDate.FIELD:
										noEvents.setEventDate(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.EventPx.FIELD:
										noEvents.setEventPx(gNoRelatedSym.getDouble(field.getTag()));
										break;
									case quickfix.field.EventText.FIELD:
										noEvents.setEventText(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.EventType.FIELD:
										noEvents.setEventType(gNoRelatedSym.getInt(field.getTag()));
										break;
									}
								}
								listNoEvents.add(noEvents);
								break;
							case quickfix.field.NoSecurityAltID.FIELD:
								appfix.model.message.MarketDataRequest.NoRelatedSym.NoSecurityAltID noSecurityAltID = new appfix.model.message.MarketDataRequest.NoRelatedSym.NoSecurityAltID();
								Iterator<Field<?>> fieldIteratorNoSecurityAltID = gNoRelatedSym.iterator();
								while (fieldIteratorNoSecurityAltID.hasNext()) {
									Field<?> field = (Field<?>) fieldIteratorNoSecurityAltID.next();
									switch (field.getTag()) {
									case quickfix.field.SecurityAltID.FIELD:
										noSecurityAltID.setSecurityAltID(gNoRelatedSym.getString(field.getTag()));
										break;
									case quickfix.field.SecurityAltIDSource.FIELD:
										noSecurityAltID.setSecurityAltIDSource(gNoRelatedSym.getString(field.getTag()));
										break;
									}
								}
								listNoSecurityAltID.add(noSecurityAltID);
								break;
							}// End of Switch Case Groups
							iNoRelatedSym++;
						}
					}
					noRelatedSym.setListNoLegs(listNoLegs);
					noRelatedSym.setListNoUnderlyings(listNoUnderlyings);
					noRelatedSym.setListNoEvents(listNoEvents);
					noRelatedSym.setListNoSecurityAltID(listNoSecurityAltID);
					listNoRelatedSym.add(noRelatedSym);
					break;
				case quickfix.field.NoMDEntryTypes.FIELD:
					appfix.model.message.MarketDataRequest.NoMDEntryTypes noMDEntryTypes = new appfix.model.message.MarketDataRequest.NoMDEntryTypes();
					Iterator<Field<?>> fieldIteratorNoMDEntryTypes = gMarketDataRequest.iterator();
					while (fieldIteratorNoMDEntryTypes.hasNext()) {
						Field<?> field = (Field<?>) fieldIteratorNoMDEntryTypes.next();
						switch (field.getTag()) {
						case quickfix.field.MDEntryType.FIELD:
							noMDEntryTypes.setMDEntryType(gMarketDataRequest.getChar(field.getTag()));
							break;
						}
					}
					listNoMDEntryTypes.add(noMDEntryTypes);
					break;
				}// End of Switch Case Groups
				iMarketDataRequest++;
			}
		}
		marketDataRequest.setListNoTradingSessions(listNoTradingSessions);
		marketDataRequest.setListNoRelatedSym(listNoRelatedSym);
		marketDataRequest.setListNoMDEntryTypes(listNoMDEntryTypes);
		return marketDataRequest;
	}

	public static quickfix.fix44.MarketDataRequest fromModel(appfix.model.message.MarketDataRequest marketDataRequest) {
		quickfix.fix44.MarketDataRequest message = new quickfix.fix44.MarketDataRequest();
		if (marketDataRequest.getApplQueueAction() != 0) {
			message.set(new quickfix.field.ApplQueueAction(marketDataRequest.getApplQueueAction()));
		} // for int
		if (marketDataRequest.getApplQueueMax() != 0) {
			message.set(new quickfix.field.ApplQueueMax(marketDataRequest.getApplQueueMax()));
		} // for int
		if (marketDataRequest.getCheckSum() != null && !marketDataRequest.getCheckSum().isEmpty()) {
			message.set(new quickfix.field.CheckSum(marketDataRequest.getCheckSum()));
		} // for String type
		if (marketDataRequest.getMDReqID() != null && !marketDataRequest.getMDReqID().isEmpty()) {
			message.set(new quickfix.field.MDReqID(marketDataRequest.getMDReqID()));
		} // for String type
		if (marketDataRequest.getMDUpdateType() != 0) {
			message.set(new quickfix.field.MDUpdateType(marketDataRequest.getMDUpdateType()));
		} // for int
		if (marketDataRequest.getMarketDepth() != 0) {
			message.set(new quickfix.field.MarketDepth(marketDataRequest.getMarketDepth()));
		} // for int
		if (marketDataRequest.getNoMDEntryTypes() != 0) {
			message.set(new quickfix.field.NoMDEntryTypes(marketDataRequest.getNoMDEntryTypes()));
		} // for int
		if (marketDataRequest.getNoRelatedSym() != 0) {
			message.set(new quickfix.field.NoRelatedSym(marketDataRequest.getNoRelatedSym()));
		} // for int
		if (marketDataRequest.getNoTradingSessions() != 0) {
			message.set(new quickfix.field.NoTradingSessions(marketDataRequest.getNoTradingSessions()));
		} // for int
		if (marketDataRequest.getOpenCloseSettlFlag() != null && !marketDataRequest.getOpenCloseSettlFlag().isEmpty()) {
			message.set(new quickfix.field.OpenCloseSettlFlag(marketDataRequest.getOpenCloseSettlFlag()));
		} // for String type
		if (marketDataRequest.getScope() != null && !marketDataRequest.getScope().isEmpty()) {
			message.set(new quickfix.field.Scope(marketDataRequest.getScope()));
		} // for String type
		if (marketDataRequest.getSignature() != null && !marketDataRequest.getSignature().isEmpty()) {
			message.set(new quickfix.field.Signature(marketDataRequest.getSignature()));
		} // for String type
		if (marketDataRequest.getSignatureLength() != 0) {
			message.set(new quickfix.field.SignatureLength(marketDataRequest.getSignatureLength()));
		} // for int
		List<appfix.model.message.MarketDataRequest.NoTradingSessions> listNoTradingSessions = marketDataRequest
				.getListNoTradingSessions();
		for (appfix.model.message.MarketDataRequest.NoTradingSessions noTradingSessions : listNoTradingSessions) {
			quickfix.fix44.MarketDataRequest.NoTradingSessions groupNoTradingSessions = new quickfix.fix44.MarketDataRequest.NoTradingSessions();
			if (noTradingSessions.getTradingSessionID() != null && !noTradingSessions.getTradingSessionID().isEmpty()) {
				groupNoTradingSessions
						.set(new quickfix.field.TradingSessionID(noTradingSessions.getTradingSessionID()));
			} // for String type
			if (noTradingSessions.getTradingSessionSubID() != null
					&& !noTradingSessions.getTradingSessionSubID().isEmpty()) {
				groupNoTradingSessions
						.set(new quickfix.field.TradingSessionSubID(noTradingSessions.getTradingSessionSubID()));
			} // for String type
			message.addGroup(groupNoTradingSessions);
		}
		List<appfix.model.message.MarketDataRequest.NoRelatedSym> listNoRelatedSym = marketDataRequest
				.getListNoRelatedSym();
		for (appfix.model.message.MarketDataRequest.NoRelatedSym noRelatedSym : listNoRelatedSym) {
			quickfix.fix44.MarketDataRequest.NoRelatedSym groupNoRelatedSym = new quickfix.fix44.MarketDataRequest.NoRelatedSym();
			if (noRelatedSym.getCFICode() != null && !noRelatedSym.getCFICode().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.CFICode(noRelatedSym.getCFICode()));
			} // for String type
			if (noRelatedSym.getCPProgram() != 0) {
				groupNoRelatedSym.set(new quickfix.field.CPProgram(noRelatedSym.getCPProgram()));
			} // for int
			if (noRelatedSym.getCPRegType() != null && !noRelatedSym.getCPRegType().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.CPRegType(noRelatedSym.getCPRegType()));
			} // for String type
			if (noRelatedSym.getContractMultiplier() != 0.0) {
				groupNoRelatedSym.set(new quickfix.field.ContractMultiplier(noRelatedSym.getContractMultiplier()));
			} // for double
			if (noRelatedSym.getContractSettlMonth() != null && !noRelatedSym.getContractSettlMonth().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.ContractSettlMonth(noRelatedSym.getContractSettlMonth()));
			} // for String type
			if (noRelatedSym.getCountryOfIssue() != null && !noRelatedSym.getCountryOfIssue().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.CountryOfIssue(noRelatedSym.getCountryOfIssue()));
			} // for String type
			if (noRelatedSym.getCouponPaymentDate() != null && !noRelatedSym.getCouponPaymentDate().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.CouponPaymentDate(noRelatedSym.getCouponPaymentDate()));
			} // for String type
			if (noRelatedSym.getCouponRate() != 0.0) {
				groupNoRelatedSym.set(new quickfix.field.CouponRate(noRelatedSym.getCouponRate()));
			} // for double
			if (noRelatedSym.getCreditRating() != null && !noRelatedSym.getCreditRating().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.CreditRating(noRelatedSym.getCreditRating()));
			} // for String type
			if (noRelatedSym.getDatedDate() != null && !noRelatedSym.getDatedDate().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.DatedDate(noRelatedSym.getDatedDate()));
			} // for String type
			if (noRelatedSym.getEncodedIssuer() != null && !noRelatedSym.getEncodedIssuer().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.EncodedIssuer(noRelatedSym.getEncodedIssuer()));
			} // for String type
			if (noRelatedSym.getEncodedIssuerLen() != 0) {
				groupNoRelatedSym.set(new quickfix.field.EncodedIssuerLen(noRelatedSym.getEncodedIssuerLen()));
			} // for int
			if (noRelatedSym.getEncodedSecurityDesc() != null && !noRelatedSym.getEncodedSecurityDesc().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.EncodedSecurityDesc(noRelatedSym.getEncodedSecurityDesc()));
			} // for String type
			if (noRelatedSym.getEncodedSecurityDescLen() != 0) {
				groupNoRelatedSym
						.set(new quickfix.field.EncodedSecurityDescLen(noRelatedSym.getEncodedSecurityDescLen()));
			} // for int
			if (noRelatedSym.getFactor() != 0.0) {
				groupNoRelatedSym.set(new quickfix.field.Factor(noRelatedSym.getFactor()));
			} // for double
			if (noRelatedSym.getInstrRegistry() != null && !noRelatedSym.getInstrRegistry().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.InstrRegistry(noRelatedSym.getInstrRegistry()));
			} // for String type
			if (noRelatedSym.getInterestAccrualDate() != null && !noRelatedSym.getInterestAccrualDate().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.InterestAccrualDate(noRelatedSym.getInterestAccrualDate()));
			} // for String type
			if (noRelatedSym.getIssueDate() != null && !noRelatedSym.getIssueDate().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.IssueDate(noRelatedSym.getIssueDate()));
			} // for String type
			if (noRelatedSym.getIssuer() != null && !noRelatedSym.getIssuer().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.Issuer(noRelatedSym.getIssuer()));
			} // for String type
			if (noRelatedSym.getLocaleOfIssue() != null && !noRelatedSym.getLocaleOfIssue().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.LocaleOfIssue(noRelatedSym.getLocaleOfIssue()));
			} // for String type
			if (noRelatedSym.getMaturityDate() != null && !noRelatedSym.getMaturityDate().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.MaturityDate(noRelatedSym.getMaturityDate()));
			} // for String type
			if (noRelatedSym.getMaturityMonthYear() != null && !noRelatedSym.getMaturityMonthYear().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.MaturityMonthYear(noRelatedSym.getMaturityMonthYear()));
			} // for String type
			if (noRelatedSym.getNoEvents() != 0) {
				groupNoRelatedSym.set(new quickfix.field.NoEvents(noRelatedSym.getNoEvents()));
			} // for int
			if (noRelatedSym.getNoLegs() != 0) {
				groupNoRelatedSym.set(new quickfix.field.NoLegs(noRelatedSym.getNoLegs()));
			} // for int
			if (noRelatedSym.getNoSecurityAltID() != 0) {
				groupNoRelatedSym.set(new quickfix.field.NoSecurityAltID(noRelatedSym.getNoSecurityAltID()));
			} // for int
			if (noRelatedSym.getNoUnderlyings() != 0) {
				groupNoRelatedSym.set(new quickfix.field.NoUnderlyings(noRelatedSym.getNoUnderlyings()));
			} // for int
			if (noRelatedSym.getPool() != null && !noRelatedSym.getPool().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.Pool(noRelatedSym.getPool()));
			} // for String type
			if (noRelatedSym.getProduct() != 0) {
				groupNoRelatedSym.set(new quickfix.field.Product(noRelatedSym.getProduct()));
			} // for int
			if (noRelatedSym.getPutOrCall() != 0) {
				groupNoRelatedSym.set(new quickfix.field.PutOrCall(noRelatedSym.getPutOrCall()));
			} // for int
			if (noRelatedSym.getRedemptionDate() != null && !noRelatedSym.getRedemptionDate().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.RedemptionDate(noRelatedSym.getRedemptionDate()));
			} // for String type
			if (noRelatedSym.getRepoCollateralSecurityType() != null
					&& !noRelatedSym.getRepoCollateralSecurityType().isEmpty()) {
				groupNoRelatedSym.set(
						new quickfix.field.RepoCollateralSecurityType(noRelatedSym.getRepoCollateralSecurityType()));
			} // for String type
			if (noRelatedSym.getRepurchaseRate() != 0.0) {
				groupNoRelatedSym.set(new quickfix.field.RepurchaseRate(noRelatedSym.getRepurchaseRate()));
			} // for double
			if (noRelatedSym.getRepurchaseTerm() != 0) {
				groupNoRelatedSym.set(new quickfix.field.RepurchaseTerm(noRelatedSym.getRepurchaseTerm()));
			} // for int
			if (noRelatedSym.getSecurityDesc() != null && !noRelatedSym.getSecurityDesc().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.SecurityDesc(noRelatedSym.getSecurityDesc()));
			} // for String type
			if (noRelatedSym.getSecurityExchange() != null && !noRelatedSym.getSecurityExchange().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.SecurityExchange(noRelatedSym.getSecurityExchange()));
			} // for String type
			if (noRelatedSym.getSecurityID() != null && !noRelatedSym.getSecurityID().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.SecurityID(noRelatedSym.getSecurityID()));
			} // for String type
			if (noRelatedSym.getSecurityIDSource() != null && !noRelatedSym.getSecurityIDSource().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.SecurityIDSource(noRelatedSym.getSecurityIDSource()));
			} // for String type
			if (noRelatedSym.getSecuritySubType() != null && !noRelatedSym.getSecuritySubType().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.SecuritySubType(noRelatedSym.getSecuritySubType()));
			} // for String type
			if (noRelatedSym.getSecurityType() != null && !noRelatedSym.getSecurityType().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.SecurityType(noRelatedSym.getSecurityType()));
			} // for String type
			if (noRelatedSym.getStateOrProvinceOfIssue() != null
					&& !noRelatedSym.getStateOrProvinceOfIssue().isEmpty()) {
				groupNoRelatedSym
						.set(new quickfix.field.StateOrProvinceOfIssue(noRelatedSym.getStateOrProvinceOfIssue()));
			} // for String type
			if (noRelatedSym.getStrikeCurrency() != null && !noRelatedSym.getStrikeCurrency().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.StrikeCurrency(noRelatedSym.getStrikeCurrency()));
			} // for String type
			if (noRelatedSym.getStrikePrice() != 0.0) {
				groupNoRelatedSym.set(new quickfix.field.StrikePrice(noRelatedSym.getStrikePrice()));
			} // for double
			if (noRelatedSym.getSymbol() != null && !noRelatedSym.getSymbol().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.Symbol(noRelatedSym.getSymbol()));
			} // for String type
			if (noRelatedSym.getSymbolSfx() != null && !noRelatedSym.getSymbolSfx().isEmpty()) {
				groupNoRelatedSym.set(new quickfix.field.SymbolSfx(noRelatedSym.getSymbolSfx()));
			} // for String type
			message.addGroup(groupNoRelatedSym);
		}
		
		List<appfix.model.message.MarketDataRequest.NoMDEntryTypes> listNoMDEntryTypes = marketDataRequest
				.getListNoMDEntryTypes();
		for (appfix.model.message.MarketDataRequest.NoMDEntryTypes noMDEntryTypes : listNoMDEntryTypes) {
			quickfix.fix44.MarketDataRequest.NoMDEntryTypes groupNoMDEntryTypes = new quickfix.fix44.MarketDataRequest.NoMDEntryTypes();
			if (!Character.isWhitespace(noMDEntryTypes.getMDEntryType())) {
				groupNoMDEntryTypes.set(new quickfix.field.MDEntryType(noMDEntryTypes.getMDEntryType()));
			} 
			message.addGroup(groupNoMDEntryTypes);
		}
		return message;
	}

} // End Class MarketDataRequestConverter
