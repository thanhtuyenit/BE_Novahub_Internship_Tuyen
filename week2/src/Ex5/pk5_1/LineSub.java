package Ex5.pk5_1;

public class LineSub extends Point {
  Point end;

  public LineSub(int beginX, int beginY, int endX, int endY) {
    super(beginX, beginY);
    this.end = new Point(endX, endY);
  }

  public LineSub(Point begin, Point end) {
    super(begin.getX(), begin.getY());
    this.end = end;
  }

  @Override
  public String toString() {
    return super.toString() + " " + end.toString();
  }

  //
  public Point getBegin() {
    return new Point(getBeginX(), getBeginY());
  }

  public void setBegin(Point point) {
    setXY(point.getX(), point.getY());
  }

  //
  public Point getEnd() {
    return end;
  }

  public void setEnd(Point point) {
    setXY(point.getX(), point.getY());
  }

  //
  public int getBeginX() {
    return super.getX();
  }

  public void setBeginX(int beginX) {
    super.setX(beginX);
  }

  //
  public int getBeginY() {
    return super.getY();
  }

  public void setBeginY(int beginY) {
    super.setY(beginY);
  }

  //
  public int getEndX() {
    return this.end.getX();
  }

  public void setEndX(int endX) {
    end.setX(endX);
  }

  //
  public int getEndY() {
    return this.end.getY();
  }

  public void setEndY(int endY) {
    end.setY(endY);
  }

  //
  public void setBeginXY(int beginX, int beginY) {
    super.setXY(beginX, beginY);
  }

  public void setEndXY(int endX, int endY) {
    end.setXY(endX, endY);
  }
  
  public int getLength() {
    int xDiff = end.getX() - super.getX();
    int yDiff = end.getY() - super.getY();
    return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
  }

  public int getGradient() {
    int xDiff = end.getX() - super.getX();
    int yDiff = end.getY() - super.getY();
    return (int) Math.atan2(yDiff, xDiff);
  }

}
