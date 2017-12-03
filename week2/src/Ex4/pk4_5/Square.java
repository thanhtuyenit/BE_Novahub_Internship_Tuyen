package Ex4.pk4_5;

public class Square extends Rectangle {

  public Square() {
    super();
  }

  public Square(double side) {
    super(side, side);
  }


  public Square(double side, String color, boolean filled) {
    super(color, filled);
    super.length = side;
    super.width = side;
  }

  public double getSide() {
    return super.length;
  }

  public void setSide(double side) {
    super.length = side;
    super.width = side;
  }

  public void setWidth(double side) {
    super.width = side;
  }

  public void setLength(double side) {
    super.length = side;
  }
  
  @Override
  public String toString() {
    return "A Square with side="+getSide()+" which is a subclass of "+super.toString();
  }

}
