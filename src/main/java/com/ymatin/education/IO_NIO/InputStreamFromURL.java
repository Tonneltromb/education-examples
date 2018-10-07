package com.ymatin.education.IO_NIO;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class InputStreamFromURL {
    public static void main(String[] args) throws IOException {
        String url = "http://samlib.ru";
        InputStream inputStream = new URL(url).openStream();

        BufferedInputStream bis = new BufferedInputStream(inputStream);
        byte[] buffer = new byte[64 * 1024];
        while (true) {
            int count = bis.read(buffer);
            if (count != -1) {
                System.out.write(buffer, 0, count);
            } else {
                return;
            }

        }

    }
}
