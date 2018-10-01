package com.ymatin.education.IO_NIO;

import java.io.IOException;

public class InOutExample {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("temp.txt");
//        DataInputStream dis = new DataInputStream(fis);
//        long l = dis.readLong();

        int read = System.in.read();
        System.out.println(read);
    }
}
