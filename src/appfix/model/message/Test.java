package appfix.model.message;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import appfix.tools.MessageSamples;
import appfix.tools.Parser;
import edu.emory.mathcs.backport.java.util.Arrays;
import appfix.tools.CodeGeneratorConvert;
import quickfix.ConfigError;
import quickfix.DataDictionary;
import quickfix.Field;
import quickfix.FieldNotFound;
import quickfix.Group;
import quickfix.InvalidMessage;

public class Test {
	
	static MarketDataRequest marketDataRequest = new MarketDataRequest();
	static List<appfix.model.message.MarketDataRequest.NoTradingSessions> listNoTradingSessions = new ArrayList<>();
	static List<appfix.model.message.MarketDataRequest.NoRelatedSym> listNoRelatedSym = new ArrayList<>();
	List<appfix.model.message.MarketDataRequest.NoRelatedSym.NoLegs> listNoLegs = new ArrayList<>();
	List<appfix.model.message.MarketDataRequest.NoRelatedSym.NoUnderlyings> listNoUnderlyings = new ArrayList<>();
	List<appfix.model.message.MarketDataRequest.NoRelatedSym.NoEvents> listNoEvents = new ArrayList<>();
	List<appfix.model.message.MarketDataRequest.NoRelatedSym.NoSecurityAltID> listNoSecurityAltID = new ArrayList<>();

	static List<appfix.model.message.MarketDataRequest.NoMDEntryTypes> listNoMDEntryTypes = new ArrayList<>();

	public static void main(String[] args) throws ConfigError, InvalidMessage, FieldNotFound {

		quickfix.Message messageQF = Parser.stringMessageToMessageObject(MessageSamples.MARKET_DATA_REQUEST);

		System.out.println(messageQF.toXML());

//		if(messageQF.hasGroup(quickfix.field.NoRelatedSym.FIELD)) {
//			messageQF.getGroups(quickfix.field.NoRelatedSym.FIELD).forEach(m->{
//				System.out.println(Arrays.toString(m.getFieldOrder()));
//			});
//		}
//		

//		Iterator<Integer> groupsKeys = messageQF.groupKeyIterator();
//		while (groupsKeys.hasNext()) {
//			
//			Integer tag = (Integer) groupsKeys.next();
//			System.out.println(tag+ " has "+ messageQF.getGroupCount(tag)+" element(s).");
//			
//			List<Group> listGroup = messageQF.getGroups(tag);
//			listGroup.forEach(g -> System.out.println(Arrays.toString(g.getFieldOrder())));
//			
//		}

		print(messageQF, marketDataRequest, null);
		

		marketDataRequest.getListNoRelatedSym().forEach(l->System.out.println(l.getSymbol()));
		
		
//		System.out.println(messageQF.toRawString());
//
//		//Convert quickfix Message to Model
//		MarketDataRequest model = MarketDataRequestConverter.fromMessage(messageQF);
//
//		
//		quickfix.fix44.MarketDataRequest messageQFConverted = MarketDataRequestConverter.fromModel(model);
//		
//		System.out.println(messageQF.toXML());
//		System.out.println(messageQFConverted.toXML());

	}

//	public static void print(quickfix.FieldMap fieldMap) {
//
//		Iterator<quickfix.Field<?>> itField = fieldMap.iterator();
//		while (itField.hasNext()) {
//			Field<?> field = itField.next();
//			System.out.println(field.toString());
//		}
//
//		Iterator<Integer> groupsKeys = fieldMap.groupKeyIterator();
//		while (groupsKeys.hasNext()) {
//			Integer tag = (Integer) groupsKeys.next();
//			System.out.println(tag+ " has "+ fieldMap.getGroupCount(tag)+" element(s).");
//			List<Group> listGroup = fieldMap.getGroups(tag);
//			listGroup.forEach(g -> print(g));
//		}
//	}

	

	public static MarketDataRequest print(quickfix.FieldMap fieldMap, Object parent, Object child)
			throws FieldNotFound {

		Iterator<quickfix.Field<?>> itField = fieldMap.iterator();
		while (itField.hasNext()) {
			Field<?> field = itField.next();

			if (child == null) { // Method populate tags individuais
				populateGeneral(fieldMap, field, marketDataRequest);
				//System.out.println(parent.getClass());
			} else { // Method populate groups
				//System.out.println(parent.getClass() + " " + child.getClass());
				if(child instanceof appfix.model.message.MarketDataRequest.NoRelatedSym)
					populateGroup(fieldMap, field, (List<appfix.model.message.MarketDataRequest.NoRelatedSym>) parent, (appfix.model.message.MarketDataRequest.NoRelatedSym)child);
			
			}

			//System.out.println(field.toString());
		}

		Iterator<Integer> groupsKeys = fieldMap.groupKeyIterator();
		while (groupsKeys.hasNext()) {
			Integer tag = (Integer) groupsKeys.next();
			System.out.println(tag + " has " + fieldMap.getGroupCount(tag) + " element(s).");
			List<Group> listGroup = fieldMap.getGroups(tag);
			List<appfix.model.message.MarketDataRequest.NoRelatedSym> listNoRelatedSym = new ArrayList<>();
			listGroup.forEach(g -> {
				try {
					print(g, listNoRelatedSym, getChild(tag));
				} catch (FieldNotFound e) {
					e.printStackTrace();
				}
			});
		}

		return marketDataRequest;
	}

	public static void populateGeneral(quickfix.FieldMap fieldMap, Field<?> field, MarketDataRequest marketDataRequest)
			throws FieldNotFound {

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

	public static void populateGroup(quickfix.FieldMap fieldMap, Field<?> field,
			List list,
			appfix.model.message.MarketDataRequest.NoRelatedSym noRelatedSym) throws FieldNotFound {

		switch (field.getTag()) {
		case quickfix.field.CFICode.FIELD:
			noRelatedSym.setCFICode(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.CPProgram.FIELD:
			noRelatedSym.setCPProgram(fieldMap.getInt(field.getTag()));
			break;
		case quickfix.field.CPRegType.FIELD:
			noRelatedSym.setCPRegType(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.ContractMultiplier.FIELD:
			noRelatedSym.setContractMultiplier(fieldMap.getDouble(field.getTag()));
			break;
		case quickfix.field.ContractSettlMonth.FIELD:
			noRelatedSym.setContractSettlMonth(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.CountryOfIssue.FIELD:
			noRelatedSym.setCountryOfIssue(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.CouponPaymentDate.FIELD:
			noRelatedSym.setCouponPaymentDate(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.CouponRate.FIELD:
			noRelatedSym.setCouponRate(fieldMap.getDouble(field.getTag()));
			break;
		case quickfix.field.CreditRating.FIELD:
			noRelatedSym.setCreditRating(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.DatedDate.FIELD:
			noRelatedSym.setDatedDate(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.EncodedIssuer.FIELD:
			noRelatedSym.setEncodedIssuer(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.EncodedIssuerLen.FIELD:
			noRelatedSym.setEncodedIssuerLen(fieldMap.getInt(field.getTag()));
			break;
		case quickfix.field.EncodedSecurityDesc.FIELD:
			noRelatedSym.setEncodedSecurityDesc(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.EncodedSecurityDescLen.FIELD:
			noRelatedSym.setEncodedSecurityDescLen(fieldMap.getInt(field.getTag()));
			break;
		case quickfix.field.Factor.FIELD:
			noRelatedSym.setFactor(fieldMap.getDouble(field.getTag()));
			break;
		case quickfix.field.InstrRegistry.FIELD:
			noRelatedSym.setInstrRegistry(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.InterestAccrualDate.FIELD:
			noRelatedSym.setInterestAccrualDate(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.IssueDate.FIELD:
			noRelatedSym.setIssueDate(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.Issuer.FIELD:
			noRelatedSym.setIssuer(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.LocaleOfIssue.FIELD:
			noRelatedSym.setLocaleOfIssue(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.MaturityDate.FIELD:
			noRelatedSym.setMaturityDate(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.MaturityMonthYear.FIELD:
			noRelatedSym.setMaturityMonthYear(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.NoEvents.FIELD:
			noRelatedSym.setNoEvents(fieldMap.getInt(field.getTag()));
			break;
		case quickfix.field.NoLegs.FIELD:
			noRelatedSym.setNoLegs(fieldMap.getInt(field.getTag()));
			break;
		case quickfix.field.NoSecurityAltID.FIELD:
			noRelatedSym.setNoSecurityAltID(fieldMap.getInt(field.getTag()));
			break;
		case quickfix.field.NoUnderlyings.FIELD:
			noRelatedSym.setNoUnderlyings(fieldMap.getInt(field.getTag()));
			break;
		case quickfix.field.OptAttribute.FIELD:
			noRelatedSym.setOptAttribute(fieldMap.getChar(field.getTag()));
			break;
		case quickfix.field.Pool.FIELD:
			noRelatedSym.setPool(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.Product.FIELD:
			noRelatedSym.setProduct(fieldMap.getInt(field.getTag()));
			break;
		case quickfix.field.PutOrCall.FIELD:
			noRelatedSym.setPutOrCall(fieldMap.getInt(field.getTag()));
			break;
		case quickfix.field.RedemptionDate.FIELD:
			noRelatedSym.setRedemptionDate(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.RepoCollateralSecurityType.FIELD:
			noRelatedSym.setRepoCollateralSecurityType(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.RepurchaseRate.FIELD:
			noRelatedSym.setRepurchaseRate(fieldMap.getDouble(field.getTag()));
			break;
		case quickfix.field.RepurchaseTerm.FIELD:
			noRelatedSym.setRepurchaseTerm(fieldMap.getInt(field.getTag()));
			break;
		case quickfix.field.SecurityDesc.FIELD:
			noRelatedSym.setSecurityDesc(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.SecurityExchange.FIELD:
			noRelatedSym.setSecurityExchange(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.SecurityID.FIELD:
			noRelatedSym.setSecurityID(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.SecurityIDSource.FIELD:
			noRelatedSym.setSecurityIDSource(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.SecuritySubType.FIELD:
			noRelatedSym.setSecuritySubType(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.SecurityType.FIELD:
			noRelatedSym.setSecurityType(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.StateOrProvinceOfIssue.FIELD:
			noRelatedSym.setStateOrProvinceOfIssue(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.StrikeCurrency.FIELD:
			noRelatedSym.setStrikeCurrency(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.StrikePrice.FIELD:
			noRelatedSym.setStrikePrice(fieldMap.getDouble(field.getTag()));
			break;
		case quickfix.field.Symbol.FIELD:
			noRelatedSym.setSymbol(fieldMap.getString(field.getTag()));
			break;
		case quickfix.field.SymbolSfx.FIELD:
			noRelatedSym.setSymbolSfx(fieldMap.getString(field.getTag()));
			break;
		}
		
		list.add(noRelatedSym);

	}

	public static void populateGroup(quickfix.FieldMap fieldMap, Field<?> field,
			List list,
			appfix.model.message.MarketDataRequest.NoMDEntryTypes noMDEntryTypes) throws FieldNotFound {
		switch (field.getTag()) {
		case quickfix.field.MDEntryType.FIELD:
			noMDEntryTypes.setMDEntryType(fieldMap.getChar(field.getTag()));
			break;
		}
		
		list.add(noMDEntryTypes);
	}
	
	
	public static Object getChild(int tag) {
		switch (tag) {
		case quickfix.field.NoRelatedSym.FIELD:
			return new appfix.model.message.MarketDataRequest.NoRelatedSym();
		case quickfix.field.NoTradingSessions.FIELD:
			return new appfix.model.message.MarketDataRequest.NoTradingSessions();
		case quickfix.field.NoMDEntryTypes.FIELD:
			return new appfix.model.message.MarketDataRequest.NoMDEntryTypes();
		default:
			return null;
		}
	}
	
	
	
}
