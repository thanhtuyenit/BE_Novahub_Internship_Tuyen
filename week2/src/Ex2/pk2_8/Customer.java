package Ex2.pk2_8;

public class Customer {
  int    ID;
  String name;
  char   gender;

  public Customer() {
    super();
    // TODO Auto-generated constructor stub
  }

  public Customer(int iD, String name, char gender) {
    super();
    ID = iD;
    this.name = name;
    this.gender = gender;
  }

  public int getID() {
    return ID;
  }

  public String getName() {
    return name;
  }

  public char getGender() {
    return gender;
  }

  @Override
  public String toString() {
    return name + "(" + ID + ")";
  }

}
