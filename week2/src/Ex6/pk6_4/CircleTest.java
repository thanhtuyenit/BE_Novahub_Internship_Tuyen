package Ex6.pk6_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {
  double radius = 1.0;
  Circle circle;
  double delta;
  GeometricObject geometricObject;

  @Test
  public void test() {
    geometricObject = new Circle();
    circle = (Circle) geometricObject;
    assertEquals(radius, circle.getRadius(),delta);
    radius = 4;
    geometricObject = new Circle(radius);
    circle = (Circle) geometricObject;
    assertEquals(radius, circle.getRadius(),delta);
    assertEquals(geometricObject.getArea(), circle.getArea(),delta);
    assertEquals(geometricObject.getPerimeter(), circle.getPerimeter(),delta);
    
  }

}
