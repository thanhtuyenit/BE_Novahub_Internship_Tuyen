package Ex1.pk1_8;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeTest {
  Time  time  = new Time();
  float delta = 0.00001f;

  @Test
  public void tesTime() {
    time = new Time(0, 0, 0);
    assertEquals(0, time.getHour(), delta);
  }

  @Test
  public void tesToString() {
    time = new Time(1, 1, 1);
    assertEquals("01:01:01", time.toString());
  }

  @Test
  public void tesToString2() {
    time = new Time(11, 11, 11);
    assertEquals("11:11:11", time.toString());
  }

  @Test
  public void tesNextSecond() {
    time = new Time(12, 12, 59);
    Time time2 = time.nextSecond();
    assertEquals(12, time2.getHour(), delta);
  }

  @Test
  public void tesNextSecond2() {
    time = new Time(12, 59, 59);
    Time time2 = time.nextSecond();
    assertEquals(13, time2.getHour(), delta);
  }

  @Test
  public void tesNextSecond3() {
    time = new Time(23, 59, 59);
    Time time2 = time.nextSecond();
    assertEquals(0, time2.getHour(), delta);
  }

  @Test
  public void testPreviousSecond() {
    time = new Time(23, 59, 59);
    Time time2 = time.previousSecond();
    assertEquals(58, time2.getSecond(), delta);
  }

  @Test
  public void testPreviousSecond2() {
    time = new Time(0, 0, 0);
    Time time2 = time.previousSecond();
    assertEquals(59, time2.getSecond(), delta);
  }

}
