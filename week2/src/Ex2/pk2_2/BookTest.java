package Ex2.pk2_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {
  Author   auth     = new Author();
  Author[] authors  = new Author[2];
  Book     javaBook = new Book();
  float    delta    = 0.00000001f;

  @Test
  public void testBook() {
    authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
    authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
    javaBook = new Book("Java for Dummy", authors, 19.99, 99);
    // setPrice
    javaBook.setPrice(10.0);
    // setQty
    javaBook.setQty(10);

    // test getPrice
    assertEquals(10.0, javaBook.getPrice(), delta);

    // test getQty
    assertEquals(10, javaBook.getQty());

    // test getName author
    assertEquals("Paul Tan", authors[1].getName());

    // test getName book
    assertEquals("Java for Dummy", javaBook.getName());

    // test getAuthor
    assertEquals("Tan Ah Teck", javaBook.getAuthor()[0].getName());
  }

  @Test
  public void testBook2() {
    authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
    authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
    javaBook = new Book("Java for Dummy", authors, 19.99);
    // set price
    javaBook.setPrice(10.0);

    // set email
    authors[1].setEmail("a@gmail.com");
    // test email
    assertEquals("a@gmail.com", authors[1].getEmail());
    // test Gender
    assertEquals('m', authors[1].getGender());
  }

  @Test
  public void testToString() {
    authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
    authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
    javaBook = new Book("Java for Dummy", authors, 19.99, 99);
    String expected = "Book [name=Java for Dummy, author={[Author [name=Tan Ah Teck, email=AhTeck@somewhere.com, gender=m], Author [name=Paul Tan, email=Paul@nowhere.com, gender=m]]}, price=19.99, qty=99]";
    String actual = javaBook.toString();

    // test toString()
    assertEquals(expected, actual);
    // test getAuthorName
    assertEquals("Tan Ah Teck,Paul Tan", javaBook.getAuthorName());

  }

}
