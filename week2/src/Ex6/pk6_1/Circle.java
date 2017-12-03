package Ex6.pk6_1;

public class Circle extends Shape {
  protected double radius;

  public Circle() {
    super();
  }

  public Circle(double radius) {
    super();
    this.radius = radius;
  }

  public Circle(String color, boolean filled, double radius) {
    super(color, filled);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  @Override
  public String toString() {
    return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
  }

 

}
