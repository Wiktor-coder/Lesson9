package task2;

import java.time.LocalDateTime;
import java.util.Locale;

public class SmartLogger implements Logger {
    int counter = 0;

    @Override
    public void log(String msg) {
        counter++;
        String level = msg.toLowerCase().contains("error") ? "ERROR" : "INFO";
        System.out.println(level
                + "#"
                + counter
                + " ["
                + LocalDateTime.now()
                + "] "
                + msg);
    }
}
