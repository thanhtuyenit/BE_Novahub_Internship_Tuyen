package Ex5.pk5_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class LineTest {
  Point  begin = new Point();
  Point  end = new Point();
  Line   line = new Line();
  int    x, y, endX, endY, beginX, beginY;
  String expected, actual;

  @Test
  public void testLine() {
    beginX = 1;
    beginY = 2;
    endX = 3;
    endY = 4;
    begin = new Point(beginX, beginY);
    end = new Point(endX, endY);
    
    //test Line(Point begin, Point end)
    line = new Line(begin, end);
    actual = line.toString();
    expected = "Line [begin= " + begin.toString() + ", end= " + end.toString() + "]";
    assertEquals(expected, actual);
    
    //test Line(int beginX, int beginY, int endX, int endY)
    line = new Line(beginX, beginY, endX, endY);
    actual = line.toString();
    expected = "Line [begin= " + begin.toString() + ", end= " + end.toString() + "]";
    assertEquals(expected, actual);
    
    //test get,set begin/end
    
    line.setBegin(begin);
    line.setEnd(end);
    
    assertEquals(begin.toString(), line.getBegin().toString());
    assertEquals(end.toString(), line.getEnd().toString());
    
    //test get set beginX, endX, beginY, endY
    
    line.setBeginX(beginX);
    line.setBeginY(beginY);
    line.setEndX(endX);
    line.setEndY(endY);
    
    assertEquals(begin.getX(), line.getBeginX());
    assertEquals(begin.getY(), line.getBeginY());
    assertEquals(end.getX(), line.getEndX());
    assertEquals(end.getY(), line.getEndY());
    
    //test setBegenXY, setEndXY, getLength, getGradient()
    
    line.setBeginXY(beginX, beginY);
    line.setEndXY(endX, endY);
    
    assertEquals(begin.getX(), line.getBeginX());
    assertEquals(end.getX(), line.getEndX());
    assertEquals(expected, actual);
    //test getLength()
    int xDiff = end.getX() - begin.getX();
    int yDiff = end.getY() - begin.getY();
    int expectdLength = (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    int actualLength = line.getLength();
    assertEquals(expectdLength, actualLength);
    
    //test getGradient()
    int expectdGradient = (int) Math.atan2(yDiff, xDiff);
    int actualGradient = line.getGradient();
    assertEquals(expectdGradient, actualGradient);

  }
}
