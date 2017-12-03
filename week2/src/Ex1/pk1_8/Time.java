package Ex1.pk1_8;

public class Time {
  int hour;
  int minute;
  int second;

  public Time() {
    super();
    // TODO Auto-generated constructor stub
  }

  public Time(int hour, int minute, int second) {
    super();
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    this.minute = minute;
  }

  public int getSecond() {
    return second;
  }

  public void setSecond(int second) {
    this.second = second;
  }

  // public void setTime(int hour, int minute, int second) {
  //
  // }

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

  public Time nextSecond() {
    setHour(getHour());
    setMinute(getMinute());
    setSecond(getSecond() + 1);
    if (getSecond() >= 60) {
      setSecond(0);
      setMinute(getMinute() + 1);
      if (getMinute() >= 60) {
        setMinute(0);
        setHour(getHour() + 1);
        if (getHour() == 24)
          setHour(0);
      }

    }
    return Time.this;
  }

  public Time previousSecond() {
    setHour(getHour());
    setMinute(getMinute());
    setSecond(getSecond() - 1);
    if (getSecond() < 0) {
      setSecond(59);
      setMinute(getMinute() - 1);
      if (getMinute() < 0) {
        setMinute(59);
        setHour(getHour() - 1);
        if (getHour() == -1)
          setHour(23);
      }
    }
    return Time.this;
  }

}
