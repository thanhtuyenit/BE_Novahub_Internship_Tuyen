package Ex5.pk5_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PointTest {
  Point  point = new Point();
  int    x;
  int    y;
  String expected, actual;

  @Test
  public void testPoint() {
    // test Point(int x, int y), toString
    x = 3;
    y = 4;
    point = new Point(x, y);

    assertEquals(x, point.getX());
    assertEquals(y, point.getY());
    actual = point.toString();
    expected = "Point: (" + point.getX() + "," + point.getY() + ")";
    assertEquals(expected, actual);

    // test get set
    x = 10;
    y = 10;
    point.setX(x);
    point.setY(y);
    assertEquals(x, point.getX());
    assertEquals(y, point.getY());
    
    //test setXY
    x = 8;
    y = 9;
    point.setXY(x, y);
    actual = point.toString();
    expected = "Point: (" + point.getX() + "," + point.getY() + ")";
    assertEquals(expected, actual);
  }

}

