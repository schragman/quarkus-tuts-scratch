package net.schrage.quarkus.starting;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {
  public List<Book> getAllBooks() {
    return List.of(new Book(1, "Understanding Quarkus", "Antonio", 2020, "IT"),
        new Book(2, "Practising Quarkus", "Antonio", 2020, "IT"),
        new Book(3, "Effective Java", "Josh Bloch", 2001, "IT"),
        new Book(4, "Thinking in Java", "Bruce Eckel", 1998, "IT"));
  }

  public Optional<Book> getBook(int id) {
    return getAllBooks().stream().filter(book -> book.id == id).findFirst();
  }
}
