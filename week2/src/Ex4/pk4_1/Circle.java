package Ex4.pk4_1;

public class Circle {
  double radius = 1.0;
  String color  = "red";

  public Circle() {
    super();
    // TODO Auto-generated constructor stub
  }

  public Circle(double radius, String color) {
    super();
    this.radius = radius;
    this.color = color;
  }

  public Circle(double radius) {
    super();
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public String toString() {
    return "Circle [radius=" + radius + ", color=" + color + "]";
  }

}
