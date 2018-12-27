package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Bootstrap implements ApplicationRunner {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        bookRepository.save(new Book("J. K. Rowling",
                "Harry Potter and The Philosopher's Stone",
                1997,
                100));

        bookRepository.save(new Book("J. K. Rowling",
                "Harry Potter and The Chamber of Secrets",
                1998,
                100));

        bookRepository.save(new Book("J. K. Rowling",
                "Harry Potter and The Prisoner of Azkaban",
                1999,
                99.99));
    }
}
