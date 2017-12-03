package Ex6.pk6_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {
  String  expected, actual;
  Circle  circle;
  Shape   shape;
  double  radius, delta = 0.000001;
  String  color;
  boolean filled;

  @Test
  public void testGetArea() {
    radius = 3.0;
    shape = new Circle(radius);
    circle = (Circle) shape;
    assertEquals(Math.PI * radius * radius, circle.getArea(), delta);
    assertEquals(Math.PI * radius * radius, shape.getArea(), delta);
    assertEquals(circle.getArea(), shape.getArea(), delta);
  }

  @Test
  public void testGetPerimeter() {
    radius = 3.0;
    shape = new Circle(radius);
    circle = (Circle) shape;
    assertEquals(circle.getPerimeter(), shape.getPerimeter(), delta);
  }

  @Test
  public void testToString() {
    color = "green";
    radius = 4.0;
    filled = false;
    shape = new Circle(color, filled, radius);
    circle = (Circle) shape;
    actual = circle.toString();
    expected = shape.toString();
    assertEquals(expected, actual);
  }

 

  @Test
  public void testCircleDouble() {
    radius = 9.0;
    circle = new Circle(radius);
    assertEquals(radius, circle.getRadius(),delta);
  }

  @Test
  public void testCircleStringBooleanDouble() {
    color = "blue";
    filled = false;
    radius = 4.0;
    shape = new Circle(color, filled, radius);
    circle = (Circle) shape;
    assertEquals(radius, circle.getRadius(),delta);
    assertEquals(shape.isFilled(), circle.isFilled());
    assertEquals(shape.getColor(), circle.getColor());
  }

  @Test
  public void testGetRadius() {
    radius = 9.0;
    circle = new Circle();
    circle.setRadius(radius);
    assertEquals(radius, circle.getRadius(),delta);
  }
 
  @Test
  public void testGetColor() {
    color ="green";
    shape = new Circle();
    circle = (Circle) shape;
    circle.setColor(color);
    assertEquals(shape.getColor(), shape.getColor());
  }
  
  @Test
  public void testIsFilled() {
    filled = true;
    shape = new Circle();
    circle = (Circle) shape;
    circle.setFilled(filled);;
    assertEquals(shape.isFilled(), shape.isFilled());
  }
  

}
