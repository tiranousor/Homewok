package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку:");
        String data = reader.readLine();

        File ioFile = new IO();
        String fileName1 = "io_file.txt";
        ioFile.writeToFile(fileName1, data);
        String ioData = ioFile.readFromFile(fileName1);
        System.out.println("IO: " + ioData);

        File nioFile = new NIO();
        String fileName2 = "nio_file.txt";
        nioFile.writeToFile(fileName2, data);
        String nioData = nioFile.readFromFile(fileName2);
        System.out.println("NIO: " + nioData);
    }
}
