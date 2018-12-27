package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            bookRepository.save(new Book("J. K. Rowling",
                    "Harry Potter and The Goblet of Fire",
                    2000,
                    100.01));

            bookRepository.save(new Book("J. K. Rowling",
                    "Harry Potter and The Order of the Phoenix",
                    2003,
                    200.02));

            bookRepository.save(new Book("J. K. Rowling",
                    "Harry Potter and The Half-Blood Prince",
                    2005,
                    300.33));

            bookRepository.save(new Book("J. K. Rowling",
                    "Harry Potter and The Deathly Hallows",
                    2007,
                    499.99));
        };
    }
}
