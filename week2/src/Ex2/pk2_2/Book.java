package Ex2.pk2_2;

import java.util.Arrays;

public class Book {
  String   name;
  Author[] author;
  double   price;
  int      qty = 0;

  public Book() {
    super();
    // TODO Auto-generated constructor stub
  }

  public Book(String name, Author[] author, double price, int qty) {
    super();
    this.name = name;
    this.author = author;
    this.price = price;
    this.qty = qty;
  }

  public Book(String name, Author[] author, double price) {
    super();
    this.name = name;
    this.author = author;
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public String getName() {
    return name;
  }

  public Author[] getAuthor() {
    return author;
  }

  @Override
  public String toString() {
    return "Book [name=" + name + ", author={" + Arrays.toString(author) + "}, price=" + price + ", qty=" + qty + "]";
  }

  public String getAuthorName() {
    String name = author[0].getName();
    if (author.length > 1)
      for (int i = 1; i < author.length; i++) {
        name = name + "," + author[i].getName();
      }
    return name;
  }

}
