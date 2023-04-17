package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class IOTest {

    @Test
    public void testIOFile() throws IOException {
        String fileName = "test_io.txt";
        String data = "У меня есть кошка Пуша и Пельмеша. Они очень красивые";

        File file = new IO();
        file.writeToFile(fileName, data);

        String readData = file.readFromFile(fileName);
        Assertions.assertEquals(data, readData);
    }
}