package Ex5.pk5_1;

public class Point {
  int x;
  int y;
  public Point() {
    super();
    // TODO Auto-generated constructor stub
  }
  public Point(int x, int y) {
    super();
    this.x = x;
    this.y = y;
  }
  public int getX() {
    return x;
  }
  public void setX(int x) {
    this.x = x;
  }
  public int getY() {
    return y;
  }
  public void setY(int y) {
    this.y = y;
  }
  public void setXY(int x, int y) {
    this.x = x;
    this.y = y;
  }
  @Override
  public String toString() {
    return "Point: (" + x + "," + y + ")";
  }
  
  

}
