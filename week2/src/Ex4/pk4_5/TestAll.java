package Ex4.pk4_5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAll {
  Shape     shape     = new Shape();
  Circle    circle    = new Circle();
  Rectangle rectangle = new Rectangle();
  Square    square    = new Square();
  float     delta     = 0.0000001f;
  String    expected, actual;
  String    color;
  boolean   filled;

  @Test
  public void testShape() {
    // test Shape()
    shape = new Shape();
    assertEquals("red", shape.getColor());
    assertEquals(true, shape.isFilled());

    // test Shape(String color, boolean filled)
    color = "blue";
    filled = false;
    shape = new Shape(color, filled);

    assertEquals(color, shape.getColor());
    assertEquals(filled, shape.isFilled());

    // test set, get

    shape.setColor("green");
    shape.setFilled(true);
    assertEquals("green", shape.getColor());
    assertEquals(true, shape.isFilled());

    // test toString
    color = "blue";
    filled = false;
    shape = new Shape(color, filled);
    String check = "Filled";
    if (filled == false) {
      check = "Not filled";
    }
    expected = "Shape [color=" + color + ", filled=" + check + "]";
    actual = shape.toString();
    assertEquals(expected, actual);

  }

  @Test
  public void testCircle() {
    // test Circle()
    double radius = 1.0;
    shape = new Shape();
    circle = new Circle();
    assertEquals(shape.getColor(), circle.getColor());
    assertEquals(shape.isFilled(), circle.isFilled());
    assertEquals(radius, circle.getRadius(), delta);
    assertEquals(Math.PI * circle.getRadius() * circle.getRadius(), circle.getArea(), delta);
    assertEquals(Math.PI * circle.getRadius() * 2, circle.getPerimeter(), delta);

    // test Circle(String color, boolean filled)
    color = "blue";
    filled = false;
    circle = new Circle(color, filled);

    assertEquals(color, circle.getColor());
    assertEquals(filled, circle.isFilled());

    // test Circle(double radius)
    radius = 2.0;
    circle = new Circle(radius);

    assertEquals(radius, circle.getRadius(), delta);
    assertEquals(Math.PI * circle.getRadius() * circle.getRadius(), circle.getArea(), delta);
    assertEquals(Math.PI * circle.getRadius() * 2, circle.getPerimeter(), delta);

    // test Circle(String color, boolean filled, double radius)
    color = "blue";
    filled = false;
    radius = 3.0;
    circle = new Circle(color, filled, radius);

    assertEquals(color, circle.getColor());
    assertEquals(filled, circle.isFilled());
    assertEquals(radius, circle.getRadius(), delta);
    assertEquals(Math.PI * circle.getRadius() * circle.getRadius(), circle.getArea(), delta);
    assertEquals(Math.PI * circle.getRadius() * 2, circle.getPerimeter(), delta);

    // test get set

    color = "Green";
    filled = false;
    radius = 4.0;
    circle.setColor(color);
    circle.setFilled(filled);
    circle.setRadius(radius);

    assertEquals(color, circle.getColor());
    assertEquals(filled, circle.isFilled());
    assertEquals(radius, circle.getRadius(), delta);
    assertEquals(Math.PI * circle.getRadius() * circle.getRadius(), circle.getArea(), delta);
    assertEquals(Math.PI * circle.getRadius() * 2, circle.getPerimeter(), delta);

    // test toString

    color = "blue";
    filled = false;
    radius = 5.0;
    circle = new Circle(color, filled, radius);
    String check = "Filled";
    if (filled == false) {
      check = "Not filled";
    }
    expected = "A Circle with radius=" + radius + ", which is a subclass of Shape [color=" + color + ", filled=" + check
        + "]";
    actual = circle.toString();
    assertEquals(expected, actual);

  }

  @Test
  public void testRectangle() {
    double width = 1.0;
    double length = 1.0;

    // test Rectangle()
    shape = new Shape();
    rectangle = new Rectangle();

    assertEquals(shape.getColor(), rectangle.getColor());
    assertEquals(shape.isFilled(), rectangle.isFilled());
    assertEquals(width, rectangle.getWidth(), delta);
    assertEquals(length, rectangle.getLength(), delta);
    assertEquals(width * length, rectangle.getArea(), delta);
    assertEquals(2 * (width + length), rectangle.getPerimeter(), delta);

    // test Rectangle(String color, boolean filled)
    color = "blue";
    filled = true;
    rectangle = new Rectangle(color, filled);
    assertEquals(color, rectangle.getColor());
    assertEquals(filled, rectangle.isFilled());

    // test Rectangle(double width, double length)
    shape = new Shape();
    width = 2.0;
    length = 3.0;
    rectangle = new Rectangle(width, length);
    assertEquals(width, rectangle.getWidth(), delta);
    assertEquals(length, rectangle.getLength(), delta);
    assertEquals(width * length, rectangle.getArea(), delta);
    assertEquals(2 * (width + length), rectangle.getPerimeter(), delta);

    // test Rectangle(String color, boolean filled, double width, double length)
    color = "Green";
    filled = false;
    width = 5.0;
    length = 7.0;
    rectangle = new Rectangle(color, filled, width, length);
    assertEquals(color, rectangle.getColor());
    assertEquals(filled, rectangle.isFilled());
    assertEquals(width, rectangle.getWidth(), delta);
    assertEquals(length, rectangle.getLength(), delta);
    assertEquals(width * length, rectangle.getArea(), delta);
    assertEquals(2 * (width + length), rectangle.getPerimeter(), delta);

    // test get, set
    rectangle = new Rectangle();
    color = "yellow";
    filled = false;
    width = 10.0;
    length = 17.0;
    rectangle.setColor(color);
    rectangle.setFilled(filled);
    rectangle.setLength(length);
    rectangle.setWidth(width);
    assertEquals(color, rectangle.getColor());
    assertEquals(filled, rectangle.isFilled());
    assertEquals(width, rectangle.getWidth(), delta);
    assertEquals(length, rectangle.getLength(), delta);

    // test toString
    rectangle = new Rectangle(color, filled, width, length);
    String check = "Filled";
    if (filled == false) {
      check = "Not filled";
    }
    actual = rectangle.toString();
    expected = "A Rectangle with width=" + width + ", length=" + length + ", which is a subclass of Shape [color="
        + color + ", filled=" + check + "]";
    assertEquals(expected, actual);

  }

  @Test
  public void testSquare() {
    double side = 7.0;
    // test Square(double side)
    square = new Square(side);
    assertEquals(side, square.getSide(), delta);
    assertEquals(side * side, square.getArea(), delta);
    assertEquals(4 * side, square.getPerimeter(), delta);
    // test Square(double side, String color, boolean filled)
    color = "yellow";
    filled = false;
    side = 3.0;
    square = new Square(side, color, filled);
    assertEquals(side, square.getSide(), delta);
    assertEquals(color, square.getColor());
    assertEquals(filled, square.isFilled());
    assertEquals(side * side, square.getArea(), delta);
    assertEquals(4 * side, square.getPerimeter(), delta);

    // test set, get

    color = "blue";
    filled = false;
    side = 10.0;
    square.setColor(color);
    square.setFilled(filled);
    square.setSide(side);
    square.setWidth(side);
    square.setLength(side);

    assertEquals(side, square.getSide(), delta);
    assertEquals(color, square.getColor());
    assertEquals(filled, square.isFilled());
    assertEquals(side * side, square.getArea(), delta);
    assertEquals(4 * side, square.getPerimeter(), delta);

    // test toString
    color = "red";
    filled = false;
    side = 10.0;
    square = new Square(side, color, filled);
    String check = "Filled";
    if (filled == false) {
      check = "Not filled";
    }
    actual = square.toString();
    expected = "A Square with side=" + side + " which is a subclass of A Rectangle with width=" + side + ", length="
        + side + ", which is a subclass of Shape [color=" + color + ", filled=" + check + "]";
    assertEquals(expected, actual);
  }

}
