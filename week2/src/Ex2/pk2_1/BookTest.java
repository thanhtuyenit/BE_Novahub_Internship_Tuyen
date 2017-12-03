package Ex2.pk2_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {
  Book   bk    = new Book();
  Author auth  = new Author();
  float  delta = 0.0000001f;

  @Test
  public void testBook() {
    auth = new Author("Tuyen", "a@gmail.com", 'f');
    bk = new Book("T2", auth, 1.0, 1);
    bk.setPrice(1.0);
    bk.setQty(1);
    assertEquals("Tuyen", bk.getAuthor().getName());
    assertEquals(1.0, bk.getPrice(), delta);
    assertEquals(1, bk.getQty());
    assertEquals("T2", bk.getName());
  }

  @Test
  public void testBook2() {
    auth = new Author("Tuyen", "a@gmail.com", 'f');
    bk = new Book("T2", auth, 1.0);
    bk.setPrice(1.0);
    bk.setQty(1);
    assertEquals("Tuyen", bk.getAuthor().getName());
    assertEquals(1.0, bk.getPrice(), delta);
    assertEquals("T2", bk.getName());
  }

  @Test
  public void testToString() {
    auth = new Author("Tuyen", "a@gmail.com", 'f');
    bk = new Book("T2", auth, 1.0, 1);
    String actual = bk.toString();
    String expected = "Book [name=T2, Author [name=Tuyen, email=a@gmail.com, gender=f], price=1.0, qty=1]";
    assertEquals(expected, actual);
  }

}
