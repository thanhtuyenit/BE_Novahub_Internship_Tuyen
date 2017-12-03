package Ex4.pk4_5;

public class Rectangle extends Shape {
  double width;
  double length;

  public Rectangle() {
    super();
    this.width = 1.0;
    this.length = 1.0;
  }

  public Rectangle(String color, boolean filled) {
    super(color, filled);
  }

  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  public Rectangle(String color, boolean filled, double width, double length) {
    super(color, filled);
    this.width = width;
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getArea() {
    return width * length;
  }

  public double getPerimeter() {
    return 2 * (width + length);
  }

  @Override
  public String toString() {
    return "A Rectangle with width=" + width + ", length=" + length + ", which is a subclass of " + super.toString();
  }

}
