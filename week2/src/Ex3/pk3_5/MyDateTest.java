package Ex3.pk3_5;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyDateTest {
  MyDate myDate   = new MyDate();
  String actual   = "";
  String expected = "";
  int    day, month, year,dayErr,monthErr,yearErr;

  @Test
  public void testMyDate() {
    day = 24;
    month = 11;
    year = 2017;
    myDate = new MyDate(year, month, day); // yyyy/mm/dd

    // test toString
    assertEquals("Friday 24 Nov 2017", myDate.toString());
    
    // test get,set year
    year = 2018;
    myDate.setYear(year);
    assertEquals(year, myDate.getYear());
    yearErr = 10000;
    myDate.setYear(yearErr);
    assertEquals(year, myDate.getYear());

    // test get,set month
    month = 2;
    myDate.setMonth(month);
    assertEquals(month, myDate.getMonth());
    monthErr = 13;
    myDate.setMonth(monthErr);
    assertEquals(month, myDate.getMonth());

    // test get,set day
    // nam khong nhuan
    day = 28;
    month = 3;
    year = 2017;
    myDate.setDate(year, month, day);
    day = 31;
    myDate.setDay(day);
    assertEquals(day, myDate.getDay());
    dayErr = 32;
    myDate.setDay(dayErr);
    assertEquals(day, myDate.getDay());

    // nam nhuan
    day = 28;
    month = 2;
    year = 2016;
    myDate.setDate(year, month, day);
    day = 29;
    myDate.setDay(day);
    assertEquals(day, myDate.getDay());
    dayErr = 30;
    myDate.setDay(dayErr);
    assertEquals(day, myDate.getDay());

    // test isLeapYear()
    year = 2017;
    assertEquals(false, myDate.isLeapYear(year));
    year = 2016;
    assertEquals(true, myDate.isLeapYear(year));

    // test isValidDate
    // invalid year
    day = 24;
    month = 11;
    year = 0;
    assertEquals(false, myDate.isValidDate(year, month, day));
    // invalid month
    day = 24;
    month = 13;
    year = 2017;
    assertEquals(false, myDate.isValidDate(year, month, day));
    // invalid day
    day = 28;
    month = 2;
    year = 2017;
    assertEquals(true, myDate.isValidDate(year, month, day));
    day = 29;
    month = 2;
    assertEquals(false, myDate.isValidDate(year, month, day));
    day = 28;
    month = 3;
    assertEquals(true, myDate.isValidDate(year, month, day));
    day = 32;
    month = 3;
    assertEquals(false, myDate.isValidDate(year, month, day));
    day = 29;
    month = 2;
    year = 2016;
    assertEquals(true, myDate.isValidDate(year, month, day));
    

    // test getDayOfWeek
//    day = 26;
//    month = 11;
//    year = 2017;
    assertEquals(0, myDate.getDayOfWeek(2017, 11, 26));
    assertEquals(1, myDate.getDayOfWeek(2016, 2, 29));
    assertEquals(2, myDate.getDayOfWeek(2017, 2, 28));
    assertEquals(3, myDate.getDayOfWeek(2017, 11, 22));
    assertEquals(4, myDate.getDayOfWeek(2017, 11, 23));
    assertEquals(5, myDate.getDayOfWeek(2017, 11, 24));
    assertEquals(6, myDate.getDayOfWeek(2017, 11, 25));

    // test setDate
    day = 24;
    month = 11;
    year = 2017;
    myDate.setDate(year, month, day);
    assertEquals(year, myDate.getYear());
    
    dayErr = 32;
    myDate.setDate(year, month, dayErr);
    assertEquals(day, myDate.getDay());

    // test nextDay()
    day = 31;
    month = 12;
    year = 2017;
    myDate.setDate(year, month, day);
    actual = myDate.nextDay().toString();
    expected = myDate.toString();
    assertEquals(expected, actual);

    day = 28;
    month = 2;
    year = 2016;
    myDate.setDate(year, month, day);
    actual = myDate.nextDay().toString();
    expected = myDate.toString();
    assertEquals(expected, actual);

    // test nextMonth()
    day = 31;
    month = 12;
    year = 2017;
    myDate.setDate(year, month, day);
    actual = myDate.nextMonth().toString();
    expected = myDate.toString();
    assertEquals(expected, actual);
    
    day = 31;
    month = 11;
    year = 2017;
    myDate.setDate(year, month, day);
    actual = myDate.nextMonth().toString();
    expected = myDate.toString();
    assertEquals(expected, actual);

    // test nextYear()
    day = 31;
    month = 12;
    year = 2017;
    myDate.setDate(year, month, day);
    actual = myDate.nextYear().toString();
    expected = myDate.toString();
    assertEquals(expected, actual);

    day = 31;
    month = 12;
    year = 9999;
    myDate.setDate(year, month, day);
    actual = myDate.nextYear().toString();
    expected = myDate.toString();
    assertEquals(expected, actual);

    // test previousDay()
    day = 13;
    month = 4;
    year = 2017;
    myDate.setDate(year, month, day);
    actual = myDate.previousDay().toString();
    expected = myDate.toString();
    assertEquals(expected, actual);
    
    day = 1;
    month = 3;
    year = 2016;
    myDate.setDate(year, month, day);
    actual = myDate.previousDay().toString();
    expected = myDate.toString();
    assertEquals(expected, actual);

    // test previousMonth()
    day = 1;
    month = 1;
    year = 2016;
    myDate.setDate(year, month, day);
    actual = myDate.previousMonth().toString();
    expected = myDate.toString();
    assertEquals(expected, actual);

    day = 1;
    month = 2;
    year = 2016;
    myDate.setDate(year, month, day);
    actual = myDate.previousMonth().toString();
    expected = myDate.toString();
    assertEquals(expected, actual);

    // test previousYear()
    day = 1;
    month = 2;
    year = 2017;
    myDate.setDate(year, month, day);
    actual = myDate.previousYear().toString();
    expected = myDate.toString();
    assertEquals(expected, actual);
    
    day = 1;
    month = 2;
    year = 1;
    myDate.setDate(year, month, day);
    actual = myDate.previousYear().toString();
    expected = myDate.toString();
    assertEquals(expected, actual);

  }

}
