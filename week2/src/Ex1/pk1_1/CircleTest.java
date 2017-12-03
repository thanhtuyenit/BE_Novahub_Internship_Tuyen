package Ex1.pk1_1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CircleTest {
  Circle c = new Circle();

  @Test
  public void testPrintMessage() {
    Circle c1 = new Circle();
    double actual1 = c1.getRadius();
    double expected1 = 1.0;
    assertEquals(expected1, actual1, 0.000001);
  }

  @Test
  public void testgetArea() {
    Circle c2 = new Circle();
    double actual2 = c2.getArea();
    double expected2 = 3.141592653589793;
    assertEquals(expected2, actual2, 0.00001);
  }

  @Test
  public void testCircle() {
    c = new Circle(2.0);
    assertEquals(2, c.getRadius(), 0.000001);
  }
}
