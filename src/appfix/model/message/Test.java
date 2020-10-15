package appfix.model.message;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import appfix.tools.MessageSamples;
import appfix.tools.Parser;
import appfix.tools.Populator;
import quickfix.ConfigError;
import quickfix.DataDictionary;
import quickfix.FieldNotFound;
import quickfix.InvalidMessage;
import quickfix.Message;

public class Test {

	public static void main(String[] args) throws ConfigError, InvalidMessage, FieldNotFound {
		DataDictionary dd = new DataDictionary("FIX44.xml");
		
		Message m = Parser.stringMessageToMessageObject(MessageSamples.MARKET_DATA_REQUEST);

		Populator printer = new Populator();
		printer.print(dd, m);
		
		
		MarketDataRequest model = MarketDataRequestConverter.fromMessageToModel(m);
		
		System.out.println(model.getAggregatedBook());
		System.out.println(model.getNoMDEntryTypes());
		System.out.println(model.getNoRelatedSym());
		System.out.println(model.getMDUpdateType());
		model.getListNoRelatedSym().forEach(l-> {
			System.out.println(l.getSymbol()+" "+l.getSecurityExchange());
		});
		model.getListNoMDEntryTypes().forEach(l->{
			System.out.println(l.getMDEntryType());
		});
		
		Gson g = new GsonBuilder().setPrettyPrinting().create();
		
		
		System.out.println(g.toJson(model, MarketDataRequest.class));


	}

}
