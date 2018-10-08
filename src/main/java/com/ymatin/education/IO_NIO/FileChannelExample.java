package com.ymatin.education.IO_NIO;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelExample {
    public static void main(String[] args) {
        String path = "E:\\IdeaProjects\\education-examples\\temp\\test.txt";

        try (FileChannel fileChannel = FileChannel.open(Paths.get(path), StandardOpenOption.READ);){
            MappedByteBuffer buffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fileChannel.size());
            byte b = buffer.get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
