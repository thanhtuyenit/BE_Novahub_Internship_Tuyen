package Ex1.pk1_7;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTest {
  Date  date  = new Date();
  float detal = 0.000001f;

  @Test
  public void testDate() {
    date = new Date(21, 11, 2017);
    assertEquals(21, date.getDay(), detal);
  }

  @Test
  public void testsetDay() {
    date.setDay(21);
    date.setMonth(11);
    date.setYear(2017);
    date.setDay(9, 9, 2017);
    assertEquals(21, date.getDay(), detal);
    assertEquals(11, date.getMonth(), detal);
    assertEquals(2017, date.getYear(), detal);
  }

  // @Test
  // public void testsetDay2() {
  // date.setDay(9, 9, 2017);
  // assertEquals(2017,date.getYear(),detal);
  // }
  @Test
  public void testToString() {
    date = new Date(21, 11, 2017);
    String actual = date.toString();
    String expected = "21/11/2017";
    assertEquals(expected, actual);
  }

  @Test
  public void testToString2() {
    Date date2 = new Date(2, 1, 2017);
    String actual = date2.toString();
    String expected = "02/01/2017";
    assertEquals(expected, actual);
  }

}
