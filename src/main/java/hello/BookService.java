package hello;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class BookService {


    private final AtomicLong idGenerator = new AtomicLong();
    private List<Book> books = new ArrayList<>();

    public BookService() {
        Book b = new Book(
                "Шілдт",
                "Java",
                2004,
                100.00);
        b.setId(idGenerator.incrementAndGet());
        books.add(b);

        b = new Book(
                "Еккель",
                "Thinking in Java",
                2005,
                500.00);
        b.setId(idGenerator.incrementAndGet());
        books.add(b);
    }

    public List<Book> getAll() {
        return books;
    }

    public Book addBook(Book book) {
        book.setId(idGenerator.incrementAndGet());
        books.add(book);

        return book;
    }

    public void deleteBook(long id) {
        for (Book book : books) {
            if (book.getId() == id) {
                books.remove(book);
                break;
            }
        }
    }

}
