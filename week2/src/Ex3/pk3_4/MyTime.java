package Ex3.pk3_4;

public class MyTime {
  int hour   = 0;
  int minute = 0;
  int second = 0;

  public MyTime() {
    super();
    // TODO Auto-generated constructor stub
  }

  public MyTime(int hour, int minute, int second) {
    super();
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public void setTime(int hour, int minute, int second) {

    // check if the given hour, minute and second are valid before setting the
    // instance variables
    try {
      if (((hour < 0) || (hour > 23)) || ((minute < 0) || (minute > 59)) || ((second < 0) || (second > 59))) {
        throw new IllegalArgumentException();

      } else
        this.hour = hour;
      this.minute = minute;
      this.second = second;
    } catch (IllegalArgumentException e) {
      System.out.println("Invalid hour, minute, or second!");
    }
  }

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    try {
      if ((hour < 0) || (hour > 23)) {
        throw new IllegalArgumentException();

      } else
        this.hour = hour;
    } catch (IllegalArgumentException e) {
      System.out.println("Invalid hour!");
    }

  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    try {
      if ((minute < 0) || (minute > 59)) {
        throw new IllegalArgumentException();
      } else
        this.minute = minute;
    } catch (IllegalArgumentException e) {
      System.out.println("Invalid minute!");
    }
  }

  public int getSecond() {
    return second;
  }

  public void setSecond(int second) {
    try {
      if ((second < 0) || (second > 59)) {
        throw new IllegalArgumentException();
      } else
        this.second = second;
    } catch (IllegalArgumentException e) {
      System.out.println("Invalid second!");
    }
  }

  @Override
  public String toString() {
    String strHour;
    String strMinute;
    String strSecond;
    if (hour < 10) {
      strHour = "0" + hour;
    } else
      strHour = "" + hour;
    if (minute < 10) {
      strMinute = "0" + minute;
    } else
      strMinute = "" + minute;
    if (second < 10) {
      strSecond = "0" + second;
    } else
      strSecond = "" + second;
    return strHour + ":" + strMinute + ":" + strSecond;

  }

  public MyTime nextSecond() {
    second += 1;
    if (second >= 60) {
      second = 0;
      minute += 1;
      if (minute >= 60) {
        minute = 0;
        hour += 1;
        if (hour == 24)
          hour = 0;
      }

    }
    return MyTime.this;
  }

  public MyTime nextMinute() {
    minute += 1;
    if (minute >= 60) {
      minute = 0;
      hour += 1;
      if (hour == 24)
        hour = 0;

    }
    return MyTime.this;
  }

  public MyTime nextHour() {
    hour += 1;
    if (hour == 24)
      hour = 0;
    return MyTime.this;
  }

  public MyTime previousSecond() {
    second -= 1;
    if (second < 0) {
      setSecond(59);
      minute -= 1;
      if (minute < 0) {
        setMinute(59);
        hour -= 1;
        if (hour == -1)
          setHour(23);
      }
    }
    return MyTime.this;
  }

  public MyTime previousMinute() {
    minute -= 1;
    if (minute < 0) {
      setMinute(59);
      hour -= 1;
      if (hour == -1)
        setHour(23);
    }
    return MyTime.this;
  }

  public MyTime previousHour() {
    hour -= 1;
    if (hour < 0) {
      hour = 23;
    }
    return MyTime.this;

  }

}
