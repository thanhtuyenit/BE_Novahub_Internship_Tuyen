package Ex2.pk2_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AuthorTest {
  Author auth = new Author();

  @Test
  public void testAuthor() {
    auth = new Author("Tuyen", "a@gmail.com", 'f');
    assertEquals("Tuyen", auth.getName());
    assertEquals('f', auth.getGender());
  }

  @Test
  public void testEmail() {
    auth.setEmail("b@gmail.com");
    assertEquals("b@gmail.com", auth.getEmail());
  }

  @Test
  public void testToStirng() {
    auth = new Author("Tuyen", "a@gmail.com", 'f');
    String actual = auth.toString();
    String expected = "Author [name=Tuyen, email=a@gmail.com, gender=f]";
    assertEquals(expected, actual);
  }

}
