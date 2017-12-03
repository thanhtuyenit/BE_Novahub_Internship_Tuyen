package Ex1.pk1_6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountTest {
  Account acc   = new Account();
  double  detal = 0.000001;

  @Test
  public void testAccount() {
    acc = new Account("1", "Tuyen", 1);
    assertEquals("1", acc.getId());
  }

  @Test
  public void testAccount2() {
    acc = new Account("1", "Tuyen");
    assertEquals("1", acc.getId());
    assertEquals("Tuyen", acc.getName());
  }

  @Test
  public void testBalance() {
    acc = new Account("1", "Tuyen", 1);
    assertEquals(1, acc.getBalance(), detal);
  }

  @Test
  public void testCredit() {
    acc = new Account("1", "Tuyen", 1);
    int actual = acc.credit(1);
    int expected = 2;
    assertEquals(expected, actual, detal);
  }

  @Test
  public void testDebit() {
    acc = new Account("1", "Tuyen", 1);
    int actual = acc.debit(1);
    int expected = 0;
    assertEquals(expected, actual, detal);
  }

  @Test
  public void testDebit2() {
    acc = new Account("1", "Tuyen", 1);
    int actual = acc.debit(5);
    assertEquals(1, actual, detal);
  }

  @Test
  public void testtransferTo() {
    acc = new Account("1", "Tuyen", 1);
    Account acc2 = new Account("2", "A", 2);
    int actual = acc.transferTo(acc2, 5);
    int expected = 1;
    assertEquals(expected, actual, detal);
  }

  @Test
  public void testtransferTo2() {
    acc = new Account("1", "Tuyen", 1);
    Account acc2 = new Account("2", "A", 2);
    int actual = acc.transferTo(acc2, 0);
    int expected = 1;
    assertEquals(expected, actual, detal);
  }

  @Test
  public void testtoString() {
    acc = new Account("1", "Tuyen", 1);
    String actual = acc.toString();
    String expected = "Account [id=1, name=Tuyen, balance=1]";
    assertEquals(expected, actual);

  }
}
