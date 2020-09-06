package edu.buet.cse.example02;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
  @GetMapping("/books")
  public List<Book> getAllBooks() {
    Book book = new Book();
    book.setId(1L);
    book.setName("Rendezvous with Rama");
    book.setAuthor("Arthur C. Clarke");
    
    // interesting generic syntax
    return Arrays.<Book>asList(book);
  }
}
