package com.ymatin.education.IO_NIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamReadFromFile {
    public static void main(String[] args) {
        String uri = "F:\\Projects\\education\\src\\main\\java\\IO_NIO\\NIO_NIO\\test.txt";
        try(InputStream fis = new FileInputStream(uri)){

            byte[] bytes = new byte[20];

            for (int i = 0; fis.available() > 0; i++) {
                int read = fis.read();
                bytes[i] = (byte) read;
            }

            System.out.println(Arrays.toString(bytes));
            System.out.println(new String(bytes));

//            while (fis.available() > 0) {
//                int read = fis.read();
//                System.out.println(read);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
