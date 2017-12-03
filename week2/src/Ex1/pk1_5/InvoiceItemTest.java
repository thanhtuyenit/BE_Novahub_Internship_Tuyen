package Ex1.pk1_5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InvoiceItemTest {
	InvoiceItem inv = new InvoiceItem();
	double delta = 0.0000001;
	@Test
	public void testInvoiceItem() {
		inv = new InvoiceItem("1", "1", 1, 1.0);
		assertEquals(1, inv.getQty(), 0.000001);
	}

	@Test
	public void testId() {
		inv.setId("1");
		assertEquals("1", inv.getId());
	}
	@Test
	public void testDesc() {
		inv.setDesc("1");
		assertEquals("1", inv.getDesc());
	}
	
	@Test
	public void testgetTotal(){
		inv.setQty(1);
		inv.setUnitPrice(1);
		assertEquals(1.0, inv.getTotal(),delta);
	}
	@Test
	public void testtoString() {
		inv = new InvoiceItem("1", "1",1, 1);
		String actual = inv.toString();
		String expected = "InvoiceItem [id=1, desc=1, qty=1, unitPrice=1.0]";
		assertEquals(expected,actual);
		
	}
}