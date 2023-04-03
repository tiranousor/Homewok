import java.io.*;

public class Cd implements Command {
    public void execute(String[] args) {
        if (args.length < 2) {
            System.out.println("Неправильный тип параметров для cd команды");
            return;
        }

        File dir = new File(args[1]);
        if (dir.exists() && dir.isDirectory()) {
            System.setProperty("user.dir", dir.getAbsolutePath());
        } else {
            System.out.println("Недопустимый путь: " + args[1]);
        }
    }
}