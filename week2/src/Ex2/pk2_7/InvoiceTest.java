package Ex2.pk2_7;

import static org.junit.Assert.*;

import org.junit.Test;

public class InvoiceTest {
  Customer customer = new Customer();
  Invoice  invoice  = new Invoice();
  float    delta    = 0.0000001f;

  @Test
  public void testCustomer() {
    customer = new Customer(0, "Tuyen", 10);
    // setDiscount
    customer.setDiscount(20);
    // test getDiscount
    assertEquals(20, customer.getDiscount());
    // test getName
    assertEquals("Tuyen", customer.getName());
    // test ID
    assertEquals(0, customer.getID());
    // test ToString
    assertEquals("Tuyen(0)", customer.toString());

  }

  @Test
  public void testInvoice() {
    customer = new Customer(0, "Tuyen", 10);
    invoice = new Invoice(1, customer, 10.0);
    // setAmount
    invoice.setAmount(20.0);
    // setCustomer
    invoice.setCustomer(customer);
    assertEquals(20.0, invoice.getAmount(), delta);

    assertEquals("Tuyen", customer.getName());

    // test Id invoice
    assertEquals(1, invoice.getID());

    // test getCutomer

    assertEquals(0, invoice.getCustomer().getID());

    assertEquals("Tuyen", invoice.getCustomerName());

    // tesst getAmountAfterDiscount

    assertEquals(18.0, invoice.getAmountAfterDiscount(), delta);

  }

}
