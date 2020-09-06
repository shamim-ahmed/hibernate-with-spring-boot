package edu.buet.cse.example02;

public class Book {
  private long id;
  private String name;
  private String author;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  @Override
  public String toString() {
    return String.format("Book[id = %d, name = %s, author = %s]", id, name, author);
  }
}
