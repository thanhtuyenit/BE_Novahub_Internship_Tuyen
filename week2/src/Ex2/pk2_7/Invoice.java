package Ex2.pk2_7;

public class Invoice {
  int      ID;
  Customer customer;
  double   amount;

  public Invoice() {
    super();
    // TODO Auto-generated constructor stub
  }

  public Invoice(int iD, Customer customer, double amount) {
    super();
    ID = iD;
    this.customer = customer;
    this.amount = amount;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public int getID() {
    return ID;
  }

  public String getCustomerName() {
    return customer.getName();
  }

  public double getAmountAfterDiscount() {
    return amount - amount * customer.getDiscount() / 100;
  }

}
