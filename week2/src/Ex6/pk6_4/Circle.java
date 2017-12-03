package Ex6.pk6_4;

public class Circle implements GeometricObject {
  // Private variable
  double radius = 1.0;

  // Constructor
  public Circle(double radius) {
    super();
    this.radius = radius;
  }

  public Circle() {
    super();
  }

  public double getRadius() {
    return radius;
  }

//  public void setRadius(double radius) {
//    this.radius = radius;
//  }

  // Implement methods defined in the interface GeometricObject
  @Override
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

}
