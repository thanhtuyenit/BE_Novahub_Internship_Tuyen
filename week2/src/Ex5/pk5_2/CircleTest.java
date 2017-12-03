package Ex5.pk5_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {
  double radius = 1.0;
  String color  = "red";
  Circle circle = new Circle();
  String expected, actual;
  double delta  = 0.000001;

  @Test
  public void testCircle() {
    circle = new Circle();
    assertEquals(radius, circle.getRadius(), delta);
  }

  @Test
  public void testCircleDoubleString() {
    radius = 2.0;
    color = "green";
    circle = new Circle(radius, color);
    assertEquals(radius, circle.getRadius(), delta);
    assertEquals(color, circle.getColor());
  }

  @Test
  public void testCircleDouble() {
    radius = 3.0;
    circle = new Circle(radius);
    assertEquals(radius, circle.getRadius(), delta);
  }

  @Test
  public void testGetRadius() {
    radius = 4.0;
    circle.setRadius(radius);
    assertEquals(radius, circle.getRadius(), delta);
  }

  @Test
  public void testGetColor() {
    color = "blue";
    circle.setColor(color);
    assertEquals(color, circle.getColor());
  }

  @Test
  public void testGetArea() {
    radius = 5.0;
    circle = new Circle(radius, color);
    double exp = Math.PI * radius * radius;
    double act = circle.getArea();
    assertEquals(exp, act, delta);
  }

  @Test
  public void testToString() {
    radius = 7.0;
    color = "green";
    circle = new Circle(radius, color);
    actual = circle.toString();
    expected = "Circle [radius=" + radius + ", color=" + color + "]";
    assertEquals(expected, actual);
  }

}
