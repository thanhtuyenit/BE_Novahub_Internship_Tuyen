package Ex8.pk8_1;

public class MyIntStack {
  private int[] contents;
  private int   tos;     // Top of the stack

  // constructors
  public MyIntStack(int capacity) {
    contents = new int[capacity];
    tos = -1;
  }

  public void push(int element) {
    contents[++tos] = element;
  }

  public int pop() {
    return contents[tos - 1];
  }

  public int peek() {
    return contents[tos];
  }

  public boolean isEmpty() {
    return tos < 0;
  }

  public boolean isFull() {
    return tos == contents.length - 1;
  }

  public void pushCheckStack(int element) {
    if (!isFull()) {
      contents[++tos] = element;
    } else {
      throw new IllegalStateException("Stack is Full");
    }
  }

  public boolean pushCheck(int element) {
    if (!isFull()) {
      contents[++tos] = element;
      return true;
    } else {
      return false;
    }
  }

  public void pushResize(int element) {
    if (isFull()) {
      int[] newContents = new int[contents.length + 1];
      for (int i = 0; i < contents.length; i++) {
        newContents[i] = contents[i];
      }
      contents = newContents;
    }
    contents[++tos] = element;
  }

}