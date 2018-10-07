package com.ymatin.education.IO_NIO;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class DataIOExample {
    public static void main(String[] args) {

        byte[] bytes = "Hello".getBytes(StandardCharsets.UTF_8);


        try (
                InputStream dis = new DataInputStream(new ByteArrayInputStream(bytes));
                DataOutputStream dos = new DataOutputStream(System.out)
        ) {

            while (true) {
                int read = dis.read();
                if (read != -1) {
                   dos.write(read);
                } else {
                    return;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
