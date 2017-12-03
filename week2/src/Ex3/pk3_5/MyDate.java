package Ex3.pk3_5;

public class MyDate {
  int      year        = 0;
  int      month       = 0;
  int      day         = 0;
  String[] strMonths   = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
  String[] strDays     = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
  int[]    daysInMoths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

  public MyDate() {
    super();
  }

  public MyDate(int year, int month, int day) {
    super();
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    try {
      if ((year < 0) || (year > 9999)) {
        throw new IllegalArgumentException();
      } else {
        this.year = year;
      }
    } catch (IllegalArgumentException e) {
      System.out.println("Invalid year!");
    }
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    try {
      if ((month < 0) || (month > 12)) {
        throw new IllegalArgumentException();
      } else {
        this.month = month;
      }
    } catch (IllegalArgumentException e) {
      System.out.println("Invalid month!");
    }
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    if (isLeapYear(year)) {
      daysInMoths[1] = 29;
    }else {
      daysInMoths[1] = 28;
    }
    try {
      if (day <= daysInMoths[month - 1]) {
        this.day = day;
      } else {
        throw new IllegalArgumentException();
      }
    } catch (IllegalArgumentException e) {
      System.out.println("Invalid day!");
    }

  }

  public boolean isLeapYear(int year) {
    // check nam nhuan
    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
      return true;
    } else {
      return false;
    }

  }

  public boolean isValidDate(int year, int month, int day) {
    if (year > 0 && year < 10000) {
      if (month > 0 && month < 13) {
        if (isLeapYear(year)) {
          daysInMoths[1] = 29;
        } else {
          daysInMoths[1] = 28;
        }
        if (day <= daysInMoths[month - 1]) {
          return true;
        } else {
          return false;
        }
      } else {
        return false;
      }
    }
    return false;
  }

  public int getDayOfWeek(int year, int month, int day) {
    /*
     * 01/01/0001 - > Monday count(day) 11/01/0001 -> xx/xx/xxxx count % 7 -> X
     * X(0-6)-> "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
     * "Saturday"
     */
    // dem so ngay tu 0001-> year-1
    int countDayBeforeYear = 0;
    for (int i = 1; i < year; i++) {
      if (isLeapYear(i)) {
        countDayBeforeYear += 366;
      } else {
        countDayBeforeYear += 365;
      }

    }
    int countDayBeforeMonth = 0; //
    if (isLeapYear(year)) {
      daysInMoths[1] = 29;
    }else {
      daysInMoths[1] = 28;
    }
    for (int i = 1; i < month; i++) {
      countDayBeforeMonth += daysInMoths[i - 1];

    }
    int sumDay = countDayBeforeYear + countDayBeforeMonth + day;
    switch (sumDay % 7) {
    case 0:
      return 0;
    case 1:
      return 1;
    case 2:
      return 2;
    case 3:
      return 3;
    case 4:
      return 4;
    case 5:
      return 5;
    default:
      return 6;
    }

  }

  public void setDate(int year, int month, int day) {
    try {
      if (isValidDate(year, month, day)) {
        // valid
        // System.out.println("valid");
        this.year = year;
        this.month = month;
        this.day = day;
      } else
        throw new IllegalArgumentException();
    } catch (IllegalArgumentException e) {
      System.out.println("Invalid year, month, or day!");
    }

  }

  public String toString() {
    if ((isValidDate(year, month, day) == true) && (MyDate.this != null))
      return strDays[getDayOfWeek(year, month, day)] + " " + day + " " + strMonths[month - 1] + " " + year;
    else
      return "Invalid year, month, or day!";

  }

  public MyDate nextDay() {
    if (isValidDate(year, month, day)) {
      if (isLeapYear(year)) {
        daysInMoths[1] = 29;
      }else {
        daysInMoths[1] = 28;
      }
      day += 1;
      if (day > daysInMoths[month - 1]) {
        day = 1;
        nextMonth();
      }
    }
    return this;
  }

  public MyDate nextMonth() {
    if (isValidDate(year, month, day)) {
      month += 1;
      if (month > 12) {
        month = 1;
        // chuyen sang nam moi
        nextYear();
      }
    }
    return this;
  }

  public MyDate nextYear() {
    if (isValidDate(year, month, day)) {
      year += 1;
      try {
        if (year > 9999)
          throw new IllegalArgumentException();
      } catch (IllegalArgumentException e) {
        System.out.println("Year out of range!");
      }
    }
    return this;
  }

  public MyDate previousDay() {
    if (isValidDate(year, month, day)) {
      if (isLeapYear(year)) {
        daysInMoths[1] = 29;
      }else {
        daysInMoths[1] = 28;
      }
      day -= 1;
      if (day < 1) {
        // lui lai 1 tháng
        previousMonth();
        day = daysInMoths[month - 1];
      }
    }
    return this;
  }

  public MyDate previousMonth() {
    if (isValidDate(year, month, day)) {
      month -= 1;
      if (month < 1) {
        month = 12;
        previousYear();
      }
    }
    return this;
  }

  public MyDate previousYear() {
    if (isValidDate(year, month, day)) {
      year -= 1;
      try {
        if (year < 1)
          throw new IllegalArgumentException();
      } catch (IllegalArgumentException e) {
        System.out.println("Year out of range!");
      }
    }
    return this;
  }

}
