package Ex5.pk5_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CylinderTest {
  double   radius = 1.0;
  String   color  = "red";
  Circle   base = new Circle();
  String   expected, actual;
  double   delta  = 0.000001;
  double   height = 1.0;
  Cylinder cylinder= new Cylinder();

  @Test
  public void testCylinder() {
    // base = new Circle();
    cylinder = new Cylinder();
    // assertEquals(height, cylinder.getHeight(), delta);
    // assertEquals(radius, base.getRadius(), delta);
    actual = cylinder.toString();
    expected = "Cylinder: subclass of Circle [radius=" + radius + ", color=" + color + "],height=" + height;
    assertEquals(expected, actual);
  }

  @Test
  public void testCylinderDouble() {
    radius = 9.0;
    cylinder = new Cylinder(radius);
    actual = cylinder.toString();
    expected = "Cylinder: subclass of Circle [radius=" + radius + ", color=" + color + "],height=" + height;
    assertEquals(expected, actual);
  }

  @Test
  public void testCylinderDoubleDouble() {
    radius = 7.0;
    height = 2.0;
    cylinder = new Cylinder(radius, height);

    assertEquals(height, cylinder.getHeight(), delta);
    actual = cylinder.toString();
    expected = "Cylinder: subclass of Circle [radius=" + radius + ", color=" + color + "],height=" + height;
    assertEquals(expected, actual);
  }

  @Test
  public void testCylinderDoubleStringDouble() {
    cylinder = new Cylinder(radius, color, height);
    actual = cylinder.toString();
    expected = "Cylinder: subclass of Circle [radius=" + radius + ", color=" + color + "],height=" + height;
    assertEquals(expected, actual);
  }

  @Test
  public void testGetHeight() {
    height = 6.0;
    cylinder.setHeight(height);
    assertEquals(height, cylinder.getHeight(),delta);
  }

  @Test
  public void testGetVolume() {
    radius = 7.0;
    height = 2.0;
    color = "green";
    cylinder = new Cylinder(radius, color, height);
    base = new Circle(radius);
    assertEquals(base.getArea() * height, cylinder.getVolume(), delta);
  }

  @Test
  public void testToString() {
    cylinder = new Cylinder(radius, color, height);
    actual = cylinder.toString();
    expected = "Cylinder: subclass of Circle [radius=" + radius + ", color=" + color + "],height=" + height;
    assertEquals(expected, actual);
  }

}
