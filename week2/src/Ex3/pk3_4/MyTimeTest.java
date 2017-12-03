package Ex3.pk3_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTimeTest {
  MyTime myTime = new MyTime();
  float  delta  = 0.00001f;
  int hour, minute,second,hourErr,minuteErr,secondErr;
  @Test
  public void testMyTime() {
    hour = 14;
    minute = 17;
    second = 30;
    myTime = new MyTime(hour, minute, second);
    String expected = "14:17:30";
    String actual = myTime.toString();
    // test toString
    assertEquals(expected, actual);

    hour = 3;
    minute = 5;
    second = 0;
    myTime.setHour(hour);
    myTime.setMinute(minute);
    myTime.setSecond(second);

    assertEquals(hour, myTime.getHour());
    assertEquals(minute, myTime.getMinute());
    assertEquals(second, myTime.getSecond());

    assertEquals("03:05:00", myTime.toString());

    // test setTime() true
    hour = 23;
    minute = 59;
    second = 59;
    myTime.setTime(hour, minute, second);
    assertEquals(hour, myTime.getHour());
    
    // test settime() invalid
    hourErr = 24;
    minuteErr = -31;
    secondErr = 60;
    myTime.setTime(hourErr, minuteErr, secondErr);
    assertEquals(hour, myTime.getHour());
    
    hourErr = 24;
    minuteErr = 60;
    secondErr = 60;
    myTime.setHour(hourErr);
    myTime.setMinute(minuteErr);
    myTime.setSecond(secondErr);

    assertEquals(hour, myTime.getHour());
    assertEquals(minute, myTime.getMinute());
    assertEquals(second, myTime.getSecond());

  }

  @Test
  public void testNext() {
    
    hour = 23;
    minute = 59;
    second = 59;
    myTime = new MyTime(hour, minute, second);

    // test nextSecond
    assertEquals("00:00:00", myTime.nextSecond().toString());
    assertEquals("00:00:01", myTime.nextSecond().toString());

    myTime = new MyTime(hour, minute, second);
    assertEquals("00:00:59", myTime.nextMinute().toString());
    assertEquals("00:01:59", myTime.nextMinute().toString());

    myTime = new MyTime(hour, minute, second);
    assertEquals("00:59:59", myTime.nextHour().toString());

    assertEquals("01:59:59", myTime.nextHour().toString());
  }

  @Test
  public void testPrevious() {
    hour = 0;
    minute = 0;
    second = 0;
    myTime = new MyTime(hour, minute, second);

    // test nextSecond
    assertEquals("23:59:59", myTime.previousSecond().toString());
    assertEquals("23:59:58", myTime.previousSecond().toString());

    myTime = new MyTime(hour, minute, second);
    assertEquals("23:59:00", myTime.previousMinute().toString());
    assertEquals("23:58:00", myTime.previousMinute().toString());

    myTime = new MyTime(hour, minute, second);
    assertEquals("23:00:00", myTime.previousHour().toString());

    assertEquals("22:00:00", myTime.previousHour().toString());
  }

}
