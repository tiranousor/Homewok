package org.example;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIO implements File {
    @Override
    public void writeToFile(String fileName, String data) throws IOException {
        RandomAccessFile file = new RandomAccessFile(fileName, "rw");
        FileChannel channel = file.getChannel();
        channel.truncate(0);
        ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
        channel.write(buffer);
    }

    @Override
    public String readFromFile(String fileName) throws IOException {
        RandomAccessFile file = new RandomAccessFile(fileName, "r");
        FileChannel channel = file.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate((int) channel.size());
        channel.read(buffer);
        buffer.flip();
        String data = new String(buffer.array());
        channel.close();
        file.close();
        return data;
    }
}

