import java.io.*;
import java.util.stream.Collectors;

public class Ls implements Command {
    public void execute(String[] args) {
        boolean axis1 = false;
        if (args.length > 1 && args[1].equals("-Column")) {
            axis1 = true;
        }

        File currentDir = new File(".");
        File[] files = currentDir.listFiles();

        if (axis1) {
            // Выводим в столбик
            java.util.Arrays.sort(files);
            String result = java.util.Arrays.stream(files)
                    .map(File::getName)
                    .collect(Collectors.joining("\n"));
            System.out.println("Вывод всех файлов в директории в столбик: ");
            System.out.println(result);
        } else {
            // Выводим в строку
            java.util.Arrays.sort(files);
            String result = java.util.Arrays.stream(files)
                    .map(File::getName)
                    .collect(Collectors.joining(" "));
            System.out.println("Вывод всех файлов в директории в строку: ");
            System.out.println(result);
        }
    }
}
