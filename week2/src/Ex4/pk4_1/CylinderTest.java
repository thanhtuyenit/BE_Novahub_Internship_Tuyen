package Ex4.pk4_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CylinderTest {
  Cylinder cylinder = new Cylinder();
  float    delta    = 0.00001f;
  double radius,height;
  String color;

  @Test
  public void testCylinder() {
    // with default color, radius, and height
    cylinder = new Cylinder();
    radius = 1.0;
    color = "red";
    assertEquals(radius, cylinder.getRadius(), delta);
    assertEquals(color, cylinder.getColor());
    
    radius = 2.0;
    cylinder = new Cylinder(radius);
    assertEquals(radius, cylinder.getRadius(), delta);

    radius = 3.0;
    height = 4.0;
    cylinder = new Cylinder(radius, height);
    assertEquals(radius, cylinder.getRadius(), delta);
    assertEquals(height, cylinder.getHeight(), delta);
    assertEquals(Math.PI * radius * radius * height, cylinder.getVolume(), delta);

    radius = 6.0;
    height = 8.0;
    color = "blue";
    cylinder = new Cylinder(radius, color, height);
    assertEquals(radius, cylinder.getRadius(), delta);
    assertEquals(color, cylinder.getColor());
    assertEquals(height, cylinder.getHeight(), delta);
    assertEquals(Math.PI * radius * radius * height, cylinder.getVolume(), delta);

    // test set, get color, height, radius
    
    radius = 6.0;
    height = 8.0;
    color = "blue";
    cylinder.setColor(color);
    cylinder.setHeight(height);
    cylinder.setRadius(radius);
    assertEquals(radius, cylinder.getRadius(), delta);
    assertEquals(color, cylinder.getColor());
    assertEquals(height, cylinder.getHeight(), delta);

    // test toString
    radius = 6.0;
    height = 8.0;
    color = "blue";
    cylinder = new Cylinder(radius, color, height);
    String actual = cylinder.toString();
    String expected = "Cylinder: subclass of Circle [radius=" + cylinder.getRadius() + ", color=" + cylinder.getColor()
        + "],height=" + cylinder.getHeight();
    assertEquals(expected, actual);

  }

}
