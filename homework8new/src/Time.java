import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time implements Command {
    public void execute(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Настоящее время по МСК: ");
        System.out.println(formatter.format(now));
    }
}
