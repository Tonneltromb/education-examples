package com.ymatin.education.IO_NIO;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class OutputStreamExample {
    public static void main(String[] args) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()){
            baos.write(1);
            byte[] bytes = baos.toByteArray();
            System.out.println(Arrays.toString(bytes));
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
