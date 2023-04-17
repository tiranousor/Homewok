package org.example;

import java.io.IOException;

public interface File {
    void writeToFile(String fileName, String data) throws IOException;
    String readFromFile(String fileName) throws IOException;
}
