package Ex2.pk2_7;

public class Customer {
  int    ID;
  String name;
  int    discount;

  public Customer() {
    super();
    // TODO Auto-generated constructor stub
  }

  public Customer(int iD, String name, int discount) {
    super();
    ID = iD;
    this.name = name;
    this.discount = discount;
  }

  public int getDiscount() {
    return discount;
  }

  public void setDiscount(int discount) {
    this.discount = discount;
  }

  public int getID() {
    return ID;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return name + "(" + ID + ")";
  }

}
