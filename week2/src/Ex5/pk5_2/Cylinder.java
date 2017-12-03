package Ex5.pk5_2;

public class Cylinder{
  double height = 1.0;
  Circle base;

  public Cylinder() {
    base = new Circle();
    height = 1.0;
  }

  public Cylinder(double radius) {
    base = new Circle(radius);
  }

  public Cylinder(double radius, double height) {
    base = new Circle(radius);
    this.height = height;
  }

  public Cylinder(double radius, String color, double height) {
    base = new Circle(radius, color);
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getVolume() {
    return base.getArea() * height;
  }

  @Override
  public String toString() {
    return "Cylinder: subclass of " + base.toString() + ",height=" + height;
  }

}