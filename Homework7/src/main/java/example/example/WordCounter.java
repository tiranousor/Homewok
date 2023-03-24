package example.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        String filePath = "file.txt";
        File file = new File(filePath);

        Map<String, Integer> wordCountMap = new HashMap<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                for (String word : words) {
                    if (wordCountMap.containsKey(word)) {
                        wordCountMap.put(word, wordCountMap.get(word) + 1);
                    } else {
                        wordCountMap.put(word, 1);
                    }
                }
            }

            scanner.close();

            for (String word : wordCountMap.keySet()) {
                int frequency = wordCountMap.get(word);
                System.out.println(word + " - " + frequency);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}