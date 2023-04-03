import java.io.*;

public class Cd implements Command {
    public void execute(String[] args) {
        if (args.length < 2) {
            System.out.println("Неправильный тип параметров для cd команды");
            return;
        }

        File directoriy = new File(args[1]);
        if (directoriy.exists() && directoriy.isDirectory()) {
            System.setProperty("user.dir", directoriy.getAbsolutePath());
        } else {
            System.out.println("Недопустимый путь: " + args[1]);
        }
    }
}