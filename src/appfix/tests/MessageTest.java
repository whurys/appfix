package appfix.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import quickfix.FieldNotFound;
import quickfix.Message;
import quickfix.field.ClOrdID;
import quickfix.field.CountryOfIssue;
import quickfix.field.MsgType;
import quickfix.field.OrderQty;
import quickfix.field.Price;
import quickfix.field.SecurityType;
import quickfix.field.Symbol;
import quickfix.fix44.component.Instrument;

public class MessageTest {

	@Test
	public void testIsAdmin() {
		final Message message = new Message();

		message.getHeader().setString(MsgType.FIELD, MsgType.HEARTBEAT);
		assertTrue(message.isAdmin());

		message.getHeader().setString(MsgType.FIELD, MsgType.LOGON);
		assertTrue(message.isAdmin());

		message.getHeader().setString(MsgType.FIELD, MsgType.LOGOUT);
		assertTrue(message.isAdmin());

		message.getHeader().setString(MsgType.FIELD, MsgType.SEQUENCE_RESET);
		assertTrue(message.isAdmin());

		message.getHeader().setString(MsgType.FIELD, MsgType.RESEND_REQUEST);
		assertTrue(message.isAdmin());

		message.getHeader().setString(MsgType.FIELD, MsgType.TEST_REQUEST);
		assertTrue(message.isAdmin());

		message.getHeader().setString(MsgType.FIELD, MsgType.REJECT);
		assertTrue(message.isAdmin());

		message.getHeader().setString(MsgType.FIELD, MsgType.ORDER_SINGLE);
		assertFalse(message.isAdmin());

		message.getHeader().setString(MsgType.FIELD, MsgType.QUOTE_RESPONSE);
		assertFalse(message.isAdmin());
	}

	@Test
	public void testComponent() throws Exception {
		final Instrument instrument = new Instrument();
		instrument.set(new Symbol("DELL"));
		instrument.set(new CountryOfIssue("USA"));
		instrument.set(new SecurityType(SecurityType.COMMON_STOCK));

		final quickfix.fix44.NewOrderSingle newOrderSingle = new quickfix.fix44.NewOrderSingle();
		newOrderSingle.set(instrument);
		newOrderSingle.set(new OrderQty(100));
		newOrderSingle.set(new Price(45));

		assertEquals(new Symbol("DELL"), newOrderSingle.getSymbol());
		assertEquals(new CountryOfIssue("USA"), newOrderSingle.getCountryOfIssue());
		assertEquals(new SecurityType(SecurityType.COMMON_STOCK), newOrderSingle.getSecurityType());

		newOrderSingle.set(new ClOrdID("CLIENT_ORDER_ID"));
		final Instrument instrument2 = newOrderSingle.getInstrument();
		assertEquals(new Symbol("DELL"), instrument2.getSymbol());
		assertEquals(new CountryOfIssue("USA"), instrument2.getCountryOfIssue());
		assertEquals(new SecurityType(SecurityType.COMMON_STOCK), instrument2.getSecurityType());
		try {
			instrument2.getField(new ClOrdID());
			fail("should have thrown exception");
		} catch (final FieldNotFound e) {
			// expected
		}
	}

}
