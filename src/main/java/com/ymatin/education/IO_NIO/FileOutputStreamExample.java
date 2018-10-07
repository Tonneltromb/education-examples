package com.ymatin.education.IO_NIO;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String uri = "F:\\Projects\\education\\src\\main\\java\\IO_NIO\\NIO_NIO\\test.txt";
        try (FileOutputStream fos = new FileOutputStream(uri)) {
            String string = "Goodbye!";
            byte[] bytes = string.getBytes(StandardCharsets.UTF_8);
            fos.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
