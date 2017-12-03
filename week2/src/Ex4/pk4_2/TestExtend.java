package Ex4.pk4_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestExtend {
  Person  person  = new Person();
  Student student = new Student();
  Staff   staff   = new Staff();
  float   delta   = 0.0000001f;
  String  expected, actual;
  String  name, address;

  @Test
  public void testPerson() {

    // test Person ()
    assertEquals(null, person.getName());
    assertEquals(null, person.getAddress());

    // test Person(String name, String address), set get
    name = "Tuyen";
    address = "Quang Nam";
    person = new Person(name, address);
    assertEquals(name, person.getName());
    assertEquals(address, person.getAddress());
    address = "Da Nang";
    person.setAddress(address);
    assertEquals(address, person.getAddress());

    // test toString
    name = "Tuyen";
    address = "Da Nang";
    person = new Person(name, address);
    expected = "Person [name=" + name + ", address=" + address + "]";
    actual = person.toString();
    assertEquals(expected, actual);

  } 

  @Test
  public void testStudent() {
    String program ="";
    int year;
    double fee;
    // test Student()
    assertEquals(null, student.getName());
    assertEquals(null, student.getAddress());
    assertEquals(null, student.getProgram());

    // test Student(String name, String address, String program, int year, double
    // fee)
    name = "Tuyen";
    address = "Quang Nam";
    year = 4;
    program = "Dai hoc";
    fee = 10.0;
    person = new Person(name, address);
    student = new Student(name, address, program, year, fee);

    assertEquals(name, student.getName());
    assertEquals(address, student.getAddress());
    assertEquals(program, student.getProgram());
    assertEquals(year, student.getYear());
    assertEquals(fee, student.getFee(), delta);
    
    address = "Da Nang";
    year = 5;
    program = "Cao Dang";
    fee = 100.0;
    student.setAddress(address);
    student.setProgram(program);
    student.setFee(fee);
    student.setYear(year);

    assertEquals(address, student.getAddress());
    assertEquals(program, student.getProgram());
    assertEquals(year, student.getYear());
    assertEquals(fee, student.getFee(), delta);

    // test toString
    name = "Tuyen";
    address = "Quang Nam";
    year = 4;
    program = "Dai hoc";
    fee = 10.0;
    student = new Student(name, address, program, year, fee);
    expected = "Student [Person [name=" + name + ", address=" + address + "], program="
        + program + ", year=" + year + ", fee=" + fee + "]";
    actual = student.toString();
    assertEquals(expected, actual);
  }

  @Test
  public void testStaff() {
    String school;
    double pay;
    // test Staff()
    assertEquals(null, staff.getName());
    assertEquals(null, staff.getAddress());

    // test Staff(String name, String address, String school, double pay)
    name = "Tuyen";
    address = "Quang Nam";
    school ="Bach Khoa";
    pay = 1000.0;
    staff = new Staff(name, address, school, pay);

    assertEquals(name, staff.getName());
    assertEquals(address, staff.getAddress());
    assertEquals(school, staff.getSchool());
    assertEquals(pay, staff.getPay(), delta);
    
    address = "Da Nang";
    school ="Kinh te";
    pay = 3420.0;
    staff.setAddress(address);
    staff.setPay(pay);
    staff.setSchool(school);

    assertEquals(address, staff.getAddress());
    assertEquals(school, staff.getSchool());
    assertEquals(pay, staff.getPay(), delta);

    // test toString
    name = "Tuyen";
    address = "Quang Nam";
    school ="Bach Khoa";
    pay = 1000.0;
    staff = new Staff(name, address, school, pay);
    expected = "Staff [Person [name=" + staff.getName() + ", address=" + staff.getAddress() + "], school="
        + staff.getSchool() + ", pay=" + staff.getPay() + "]";
    actual = staff.toString();
    assertEquals(expected, actual);

  }

}
