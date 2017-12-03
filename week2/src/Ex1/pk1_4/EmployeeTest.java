package Ex1.pk1_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {
  Employee em = new Employee();

  @Test
  public void testRectangle() {
    em = new Employee(1, "Nguyen", "Tuyen", 1000000);
    assertEquals(1, em.getId(), 0.000001);

  }

  @Test
  public void testId() {
    em.setId(1);
    assertEquals(1, em.getId(), 0.000001);

  }

  @Test
  public void testName() {
    em.setLastName("Tuyen");
    em.setFirstName("Nguyen");
    assertEquals("Nguyen Tuyen", em.getName());

  }

  @Test
  public void testraiseSalary() {
    em.setSalary(1);
    assertEquals(12.0, em.raiseSalary(1), 0.0000001);

  }

  @Test
  public void testtoString() {
    em = new Employee(1, "Nguyen", "Tuyen", 1);
    String actual = em.toString();
    String expected = "Employee [id=1, Name=Nguyen Tuyen, salary=1]";
    assertEquals(expected, actual);

  }

}
