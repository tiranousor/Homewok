import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//Выводим время
public class Time implements Command {
    public void execute(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Настоящее время по МСК: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(formatter.format(now));
    }
}
