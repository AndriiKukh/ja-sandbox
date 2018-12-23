package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /**
     * Простий REST контролер, який за запитом http://localhost:8080/greating
     * вертає обєкт Greeting в JSON
     *
     * @param name опціонально можна передати параметр http://localhost:8080/greating?name=Oleh
     * @return об'єкт Greeting в JSON форматі
     */
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)

    public Greeting greeting(
            @RequestParam(value="name", defaultValue="World")
                String name
    ) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
