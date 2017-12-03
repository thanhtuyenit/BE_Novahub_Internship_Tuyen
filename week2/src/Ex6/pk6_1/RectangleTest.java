package Ex6.pk6_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {
  String    expected, actual;
  Rectangle rectangle = new Rectangle();
  Shape     shape;
  double    width, length, delta = 0.000001;
  String    color;
  boolean   filled;

  @Test
  public void testGetArea() {
    width = 3.0;
    length = 5.0;
    shape = new Rectangle(width, length);
    rectangle = (Rectangle) shape;
    assertEquals(rectangle.getArea(), shape.getArea(), delta);
  }

  @Test
  public void testGetPerimeter() {
    width = 3.0;
    length = 5.0;
    shape = new Rectangle(width, length);
    rectangle = (Rectangle) shape;
    assertEquals(rectangle.getPerimeter(), shape.getPerimeter(), delta);
  }

  @Test
  public void testToString() {
    color = "green";
    width = 3.0;
    length = 5.0;
    filled = false;
    shape = new Rectangle(color, filled, width, length);
    rectangle = (Rectangle) shape;
    actual = rectangle.toString();
    expected = shape.toString();
    assertEquals(expected, actual);
  }

  @Test
  public void testRectangleStringBoolean() {
    color = "green";
    filled = false;
    shape = new Rectangle(color, filled);
    rectangle = (Rectangle) shape;
    assertEquals(shape.getColor(), rectangle.getColor());
    assertEquals(shape.isFilled(), rectangle.isFilled());
  }

  @Test
  public void testRectangleDoubleDouble() {
    width = 5.0;
    length = 7.0;
    shape = new Rectangle(width, length);
    rectangle = (Rectangle) shape;
    assertEquals(width, rectangle.getWidth(), delta);
    assertEquals(length, rectangle.getLength(), delta);
  }

  @Test
  public void testRectangleStringBooleanDoubleDouble() {
    width = 5.0;
    length = 7.0;
    color = "green";
    filled = false;
    shape = new Rectangle(color, filled, width, length);
    rectangle = (Rectangle) shape;
    assertEquals(width, rectangle.getWidth(), delta);
    assertEquals(length, rectangle.getLength(), delta);
    assertEquals(shape.getColor(), rectangle.getColor());
    assertEquals(shape.isFilled(), rectangle.isFilled());
  }

  @Test
  public void testGetWidth() {
    width = 10.0;
    rectangle = new Rectangle();
    rectangle.setWidth(width);
    assertEquals(width, rectangle.getWidth(), delta);
  }

 

  @Test
  public void testGetLength() {
    length = 10.0;
    rectangle = new Rectangle();
    rectangle.setLength(length);
    assertEquals(length, rectangle.getLength(), delta);
  }

 

}
