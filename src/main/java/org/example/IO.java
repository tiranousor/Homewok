
package org.example;
// IO
import java.io.*;

class IO implements File {
    @Override
    public void writeToFile(String fileName, String data) throws IOException {
        try (BufferedWriter CharWriter = new BufferedWriter(new FileWriter(fileName))) {
            CharWriter.write(data);
        }
    }

    @Override
    public String readFromFile(String fileName) throws IOException {
        try (FileReader CharRead = new FileReader(fileName)) {
            StringBuilder CharBuilder = new StringBuilder();
            char[] buf = new char[1024];
            int inChar = CharRead.read(buf);
            while (inChar != -1) {
                CharBuilder.append(buf, 0, inChar);
                inChar =CharRead.read(buf);
            }
            return CharBuilder.toString();
        }
    }}