package Ex4.pk4_2;

public class Person {
  String name;
  String address;
  public Person() {
    super();
  }
  public Person(String name, String address) {
    super();
    this.name = name;
    this.address = address;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public String getName() {
    return name;
  }
  @Override
  public String toString() {
    return "Person [name=" + name + ", address=" + address + "]";
  }
  

}
