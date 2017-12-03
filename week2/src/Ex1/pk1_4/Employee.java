package Ex1.pk1_4;

public class Employee {
  int    id;
  String firstName;
  String lastName;
  int    salary;

  public Employee() {
    super();
    // TODO Auto-generated constructor stub
  }

  public Employee(int id, String firstName, String lastName, int salary) {
    super();
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getName() {
    return getFirstName() + " " + getLastName();
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getAnnualSalary() {
    return getSalary() * 12;
  }

  public int raiseSalary(int percent) {
    return getAnnualSalary() * percent;
  }

  @Override
  public String toString() {
    return "Employee [id=" + id + ", Name=" + firstName + " " + lastName + ", salary=" + salary + "]";
  }

}
