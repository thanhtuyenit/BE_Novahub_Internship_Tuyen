package Ex1.pk1_3;

public class Rectangle {
  float length = 1.0f;
  float width  = 1.0f;

  public Rectangle() {
    super();
    // TODO Auto-generated constructor stub
  }

  public Rectangle(float length, float width) {
    super();
    this.length = length;
    this.width = width;
  }

  public float getLength() {
    return length;
  }

  public void setLength(float length) {
    this.length = length;
  }

  public float getWidth() {
    return width;
  }

  public void setWidth(float width) {
    this.width = width;
  }

  @Override
  public String toString() {
    return "Rectangle [length=" + length + ", width=" + width + "]";
  }

  public double getArea() {
    return length * width;
  }

  public double getPerimeter() {
    return 2 * (length + width);
  }

}
