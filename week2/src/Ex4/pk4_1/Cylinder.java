package Ex4.pk4_1;

public class Cylinder extends Circle {
  double height = 1.0;

  public Cylinder() {
    super();
  }

  public Cylinder(double radius) {
    super(radius);
  }

  public Cylinder(double radius, double height) {
    super(radius);
    this.height = height;
  }

  public Cylinder(double radius, String color, double height) {
    super(radius, color);
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

//   @Override
//   public double getArea() {
//   return Math.PI*radius*radius;
//   }
  public double getVolume() {
    return getArea() * height;
  }

  @Override
  public String toString() {
    return "Cylinder: subclass of " + super.toString() + ",height=" + height;
  }

}