package Ex2.pk2_8;

public class Account {
  int      id;
  Customer customer;
  double   balance = 0.0;

  public Account() {
    super();
    // TODO Auto-generated constructor stub
  }

  public Account(int id, Customer customer, double balance) {
    super();
    this.id = id;
    this.customer = customer;
    this.balance = balance;
  }

  public Account(int id, Customer customer) {
    super();
    this.id = id;
    this.customer = customer;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public int getId() {
    return id;
  }

  public Customer getCustomer() {
    return customer;
  }

  @Override
  public String toString() {
    balance = Math.round(balance * 100) / 100.0;
    return customer.toString() + " balance=$" + balance;
  }

  public String getCustomerName() {
    return customer.getName();
  }

  public Account deposit(double amount) {
    balance += amount;
    return this;
  }

  public Account withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
    } else {
      System.out.println("amount withdraw exceed the current balance!");
    }
    return this;
  }

}
