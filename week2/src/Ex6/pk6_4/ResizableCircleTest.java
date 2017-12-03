package Ex6.pk6_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResizableCircleTest {
  double          delta           = 0.00001;
  int             percent         = 2;
  double          radius          = 4;
  ResizableCircle resizableCircle = new ResizableCircle(percent);

  @Test
  public void testResizableCircle() {
    assertEquals(percent, resizableCircle.getRadius(), delta);
  }

  @Test
  public void testResize() {
    assertEquals(resizableCircle.getRadius() * (1 - (percent / 100.0)), resizableCircle.resize(percent), delta);
  }

}
