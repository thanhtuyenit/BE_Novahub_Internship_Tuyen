package Ex4.pk4_5;

public class Shape {
  String  color;
  boolean filled;

  public Shape() {
    super();
    this.color = "red";
    this.filled = true;
  }

  public Shape(String color, boolean filled) {
    super();
    this.color = color;
    this.filled = filled;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  @Override
  public String toString() {
    String check = "Filled";
    if (this.filled == false) {
      check = "Not filled";
    }
    return "Shape [color=" + color + ", filled=" + check + "]";
  }

}
