package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class NIOTest {
    @Test
    public void testNIOFile() throws IOException {
        String fileName = "test_nio.txt";
        String data = "У меня есть кошка Пуша и Пельмеша. Они очень хорошие";

        File file = new NIO();
        file.writeToFile(fileName, data);

        String readData = file.readFromFile(fileName);
        Assertions.assertEquals(data, readData);
    }
}