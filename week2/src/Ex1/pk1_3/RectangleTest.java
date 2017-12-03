package Ex1.pk1_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RectangleTest {
  Rectangle rec = new Rectangle();

  @Test
  public void testArea() {
    double actual = rec.getArea();
    double expected = 1.0;
    assertEquals(expected, actual, 0.000001);

  }

  @Test
  public void testPerimeter() {
    double actual = rec.getPerimeter();
    double expected = 4.0;
    assertEquals(expected, actual, 0.000001);

  }

  @Test
  public void testRectangle() {
    rec = new Rectangle(1.0f, 1.0f);
    assertEquals(1.0, rec.getLength(), 0.000001);

  }

  @Test
  public void testLength() {
    rec = new Rectangle(1.0f, 1.0f);
    rec.setLength(1.0f);
    assertEquals(1.0, rec.getLength(), 0.000001);

  }

  @Test
  public void testWidth() {
    rec = new Rectangle(1.0f, 1.0f);
    rec.setWidth(1.0f);
    assertEquals(1.0, rec.getWidth(), 0.000001);

  }

  @Test
  public void testtoString() {
    String actual = rec.toString();
    String expected = "Rectangle [length=1.0, width=1.0]";
    assertEquals(expected, actual);
  }

}
