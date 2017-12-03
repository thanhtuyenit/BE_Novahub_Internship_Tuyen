package Ex6.pk6_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;


public class SquareTest {
  String    expected, actual;
  Rectangle rectangle;
  Shape     shape;
  double    delta     = 0.000001;
  String    color;
  boolean   filled;
  double    side;
  Square    square;

  @Test
  public void testToString() {
    color = "red";
    side = 7.00;
    filled = false;
    shape = new Square(side, color, filled);
    square = (Square) shape;
    assertEquals(shape.toString(), square.toString());
  }

  @Test
  public void testSetWidth() {
    side = 9.0;
    shape = new Square();
    rectangle = (Rectangle) shape;
    square = (Square) rectangle;
    square.setWidth(side);
    assertEquals(rectangle.getWidth(), square.getWidth(), delta);
  }

  @Test
  public void testSetLength() {
    side = 9.0;
    square = new Square();
    square.setLength(side);
    assertEquals(side, square.getLength(), delta);
  }

  @Test
  public void testSquareDouble() {
    side = 10.0;
    square = new Square(side);
    assertEquals(side, square.getSide(), delta);
  }

  @Test
  public void testSquareDoubleStringBoolean() {
    color = "yellow";
    filled = false;
    side = 3.0;
    shape = new Square(side, color, filled);
    rectangle = (Rectangle) shape;
    square = (Square) rectangle;
    
    assertEquals(rectangle.getWidth(), square.getSide(), delta);
    assertEquals(shape.getColor(), square.getColor());
    assertEquals(shape.isFilled(), square.isFilled());
    assertEquals(shape.getArea(), square.getArea(), delta);
    assertEquals(shape.getPerimeter(),square.getPerimeter(), delta);
  }

  @Test
  public void testGetSide() {
    side = 9.0;
    shape = new Square();
    square = (Square) shape;
    square.setSide(side);
    assertEquals(side, square.getSide(),delta);
  }

  

}
