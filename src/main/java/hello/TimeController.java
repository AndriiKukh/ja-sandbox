package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
    private static final String template = "It's you time, %s!";

    /**
     * Інший REST контролер, який за запитом http://localhost:8080/time/Oleh
     * вертає обєкт TimeGreeting в JSON
     *
     * @param name параметр, який передається як частина URL
     * @return об'єкт TimeGreeting в JSON форматі
     */
    @GetMapping("/time/{name}")
    public TimeGreeting greeting(@PathVariable(value="name") String name) {

        return new TimeGreeting(String.format(template, name)
        );
    }
}
