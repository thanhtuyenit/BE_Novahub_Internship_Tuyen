package Ex5.pk5_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class LineSubTest {
  Point   begin = new Point();
  Point   end   = new Point();
//  Line    line  = new Line();
  int     x, y, endX, endY, beginX, beginY;
  String  expected, actual;
  LineSub lineSub;

  @Test
  public void test() {
    beginX = 3;
    beginY = 4;
    endX = 5;
    endY = 6;
    begin = new Point(beginX, beginY);
    end = new Point(endX, endY);

    lineSub = new LineSub(begin, end);
    actual = lineSub.toString();
    expected = begin.toString() + " " + end.toString();
    assertEquals(expected, actual);

    beginX = 34;
    beginY = 44;
    endX = 54;
    endY = 64;
    lineSub = new LineSub(beginX, beginY, endX, endY);
    begin = new Point(beginX, beginY);
    end = new Point(endX, endY);
    actual = lineSub.toString();
    expected = begin.toString() + " " + end.toString();
    assertEquals(expected, actual);

    //
    beginX = 4;
    beginY = 8;
    endX = 3;
    endY = 1;
    begin = new Point(beginX, beginY);
    end = new Point(endX, endY);
    lineSub.setBegin(begin);
    lineSub.setEnd(end);
    actual = lineSub.toString();
    expected = lineSub.getBegin().toString() + " " + lineSub.getEnd().toString();
    assertEquals(expected, actual);

    //
    beginX = 12;
    beginY = 8;
    endX = 7;
    endY = 9;

    lineSub.setBeginX(beginX);
    lineSub.setBeginY(beginY);
    lineSub.setEndX(endX);
    lineSub.setEndY(endY);
    begin = new Point(lineSub.getBeginX(), lineSub.getBeginY());
    end = new Point(lineSub.getEndX(), lineSub.getEndY());
    lineSub = new LineSub(lineSub.getBeginX(), lineSub.getBeginY(), lineSub.getEndX(), lineSub.getEndY());
    actual = lineSub.toString();
    expected = begin.toString() + " " + end.toString();
    assertEquals(expected, actual);
    
    beginX = 7;
    beginY = 8;
    endX = 1;
    endY = 9;
    lineSub.setBeginXY(beginX, beginY);
    lineSub.setEndXY(endX, endY);
    actual = lineSub.toString();
    begin.setXY(beginX, beginY);
    end.setXY(endX, endY);
    expected = begin.toString() + " " + end.toString();
    assertEquals(expected, actual);
    
  //test getLength()
    int xDiff = end.getX() - begin.getX();
    int yDiff = end.getY() - begin.getY();
    int expectdLength = (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    int actualLength = lineSub.getLength();
    assertEquals(expectdLength, actualLength);
    
    //test getGradient()
    int expectdGradient = (int) Math.atan2(yDiff, xDiff);
    int actualGradient = lineSub.getGradient();
    assertEquals(expectdGradient, actualGradient);
  }

}
