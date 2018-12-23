package hello;

import java.time.LocalDateTime;

public class TimeGreeting {
    private LocalDateTime date = LocalDateTime.now();
    private String content;

    public TimeGreeting(String content) {
        this.content = content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
