package Ex2.pk2_8;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {
  Customer customer = new Customer();
  Account  acc      = new Account();
  float    delta    = 0.000001f;

  // customer
  int      idCustomer;
  String   name;
  char     gender;
  // account
  int      idAccount;
  double   balance  = 0.0;
  double   amount;
  String   expected, actual;

  @Test
  public void testCustomer() {

    // test Customer(int iD, String name, char gender)
    idCustomer = 3;
    name = "BK";
    gender = 'f';
    customer = new Customer(idCustomer, name, gender);
    assertEquals(idCustomer, customer.getID());
    assertEquals(name, customer.getName());
    assertEquals(gender, customer.getGender());

    // test toString
    actual = customer.toString();
    expected = name + "(" + idCustomer + ")";
    assertEquals(expected, actual);
  }

  @Test
  public void testAccount() {

    // test Account(int id, Customer customer, double balance)
    idCustomer = 3;
    name = "BK";
    gender = 'f';
    customer = new Customer(idCustomer, name, gender);
    idAccount = 5;
    balance = 12000.0;
    acc = new Account(idAccount, customer, balance);
    assertEquals(idAccount, acc.getId());
    assertEquals(balance, acc.getBalance(), delta);
    // test getCustomer
    assertEquals(idCustomer, acc.getCustomer().getID());

    // test Account(int id, Customer customer)
    idCustomer = 12;
    name = "BKDN";
    gender = 'm';
    customer = new Customer(idCustomer, name, gender);
    idAccount = 12;
    acc = new Account(idAccount, customer);
    assertEquals(idAccount, acc.getId());

    // test getCustomer
    assertEquals(idCustomer, acc.getCustomer().getID());

    // test getCustomerName
    assertEquals(name, acc.getCustomerName());

    // test set, get balance
    balance = 9999.0;
    acc.setBalance(balance);
    assertEquals(balance, acc.getBalance(), delta);

    // test toString
    idCustomer = 12;
    name = "BKDN";
    gender = 'm';
    customer = new Customer(idCustomer, name, gender);
    idAccount = 12;
    balance = 9999.0;
    acc = new Account(idAccount, customer,balance);
    expected = name + "(" + idCustomer + ") balance=$" + balance;
    actual = acc.toString();
    assertEquals(expected, actual);

    // test deposit
    balance = 12000.0;
    amount = 2000.0;
    actual = acc.deposit(amount).toString();
    expected = acc.toString();
    assertEquals(expected, actual);

    // test withdraw////balance >amount
    balance = 12000.0;
    amount = 2000.0;
    acc.setBalance(balance);
    actual = acc.withdraw(amount).toString();
    expected = acc.toString();
    assertEquals(expected, actual);

    // test withdraw //balance < amount
    balance = 12000.0;
    amount = 242000.0;
    acc.setBalance(balance);
    actual = acc.withdraw(amount).toString();
    expected = acc.toString();
    assertEquals(expected, actual);

  }


}
