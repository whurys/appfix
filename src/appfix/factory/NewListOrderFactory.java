package appfix.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import appfix.model.Order;
import appfix.model.OrderFactory;
import quickfix.Group;
import quickfix.InvalidMessage;
import quickfix.Message;
import quickfix.field.BidType;
import quickfix.field.ClOrdID;
import quickfix.field.ClOrdLinkID;
import quickfix.field.ListID;
import quickfix.field.ListSeqNo;
import quickfix.field.SecondaryClOrdID;
import quickfix.field.Side;
import quickfix.field.Symbol;
import quickfix.field.TotNoOrders;

public class NewListOrderFactory {

	public static void main(String[] args) {
		

//		try {
//			Message m = new Message("8=FIX.4.29=11935=E66=59201b99-2f81-4be9-a334-14b89025fe9868=3394=173=211=OPTION-167=155=XLP54=211=OPTION-267=255=XLP54=210=164");
//			System.out.println(m.toXML());
//		} catch (InvalidMessage e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}


		
		List<Order> listOrder = new ArrayList<>();
		listOrder.add(new Order(OrderFactory.createOrder()));
		listOrder.add(new Order(OrderFactory.createOrder()));
		
		
		ListID listID = new ListID("mycreation");				//Must be unique, by customer, for the day
		BidType bidType = new BidType(1);				//e.g. Non Disclosed Model, Disclosed Model, No Bidding Process
		TotNoOrders totNoOrders = new TotNoOrders(listOrder.size());	//Used to support fragmentation. Sum of NoOrders (73) across all messages with the same ListID (66).
		
		quickfix.fix42.Message message = new quickfix.fix42.NewOrderList(listID, bidType, totNoOrders);
		
		
//				//For the repeating group, there are helper classes available to set that information in the message.
//				quickfix.fix42.NewOrderList.NoOrdersGroup() noOrders1 = new quickfix.fix42.NewOrderList.NoOrdesGroup();
//				// Unique identifier for Order as assigned by the buy-side (institution, broker, intermediary etc.)
//				ClOrdID ClOrdID = new ClOrdID("OPTION-1");		//***** Important ****** Must be the first field in the repeating group.
//				Symbol symbol = new Symbol("XLP");
//				Side side = new Side(Side.SELL);
//		
//				noOrders1.set(ClOrdID);
//				noOrders1.set(symbol);
//				noOrders1.set(side);
//				noOrders1.setField(new ListSeqNo(1));
//				
//				//For the repeating group, there are helper classes available to set that information in the message.
//				quickfix.fix42.NewOrderList.NoOrders noOrders2 = new quickfix.fix42.NewOrderList.NoOrders();
//				// Unique identifier for Order as assigned by the buy-side (institution, broker, intermediary etc.)
//				ClOrdID ClOrdID2 = new ClOrdID("OPTION-2");		//***** Important ****** Must be the first field in the repeating group.
//				Symbol symbol2 = new Symbol("XLP2");
//				Side side2 = new Side(Side.SELL);
//		
//				noOrders2.set(ClOrdID2);
//				noOrders2.set(symbol2);
//				noOrders2.set(side2);
//				noOrders2.setField(new ListSeqNo(2));
				
				
				
				
				
				
				
				int seq = 0;
				for(Order order:listOrder) {
					++seq;
						Group group = new Group(18, new ClOrdID().getTag()); //18 is the number of field I will add below inot the group, second paramaeter is the first field of the group
					    group.setField(new ClOrdID(order.getClOrdID() + seq));
					    group.setField(new ListSeqNo(seq));
					    //message.setField(.... other fields to add to describe my order)
					    message.addGroup(group);
				}
				
		
		// Add 
		//message.addGroup(noOrders1);
		//message.addGroup(noOrders2);
		
		
		
		System.out.println(message.toString());
		
	
		
		

	}

	private static String createNewID() {
		return UUID.randomUUID().toString();
	}

}
