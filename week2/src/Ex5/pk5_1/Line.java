package Ex5.pk5_1;

public class Line {
  Point begin;
  Point end;

  public Line() {
    super();
    // TODO Auto-generated constructor stub
  }

  public Line(Point begin, Point end) {
    super();
    this.begin = begin;
    this.end = end;
  }

  public Line(int beginX, int beginY, int endX, int endY) {
    begin = new Point(beginX, beginY);
    end = new Point(endX, endY);
  }

  public Point getBegin() {
    return this.begin;
  }

  public void setBegin(Point begin) {
    this.begin = begin;
  }

  public Point getEnd() {
    return this.end;
  }

  public void setEnd(Point end) {
    this.end = end;
  }

  public int getBeginX() {
    return this.begin.getX();
  }
  
  public void setBeginX(int beginX) {
    this.begin.setX(beginX);
  }

  public int getBeginY() {
    return this.begin.getY();
  }
  
  public void setBeginY(int beginY) {
    this.begin.setY(beginY); 
  }

  public int getEndX() {
    return this.end.getX();
  }

  public void setEndX(int endX) {
    this.end.setX(endX);
  }
  
  public int getEndY() {
    return this.end.getY();
  }

  public void setEndY(int endY) {
    this.end.setY(endY);
  }

  public void setBeginXY(int beginX, int beginY) {
    this.begin.setXY(beginX, beginY);
  }
 
  public void setEndXY(int endX, int endY) {
    this.end.setXY(endX, endY);
  }

  public int getLength() {
    int xDiff = end.getX() - begin.getX();
    int yDiff = end.getY() - begin.getY();
    return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
  }

  public int getGradient() {
    int xDiff = end.getX() - begin.getX();
    int yDiff = end.getY() - begin.getY();
    return (int) Math.atan2(yDiff, xDiff);
  }

  @Override
  public String toString() {
    return "Line [begin= " + begin.toString() + ", end= " + end.toString() + "]";
  }

}
