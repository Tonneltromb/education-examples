package com.ymatin.education.IO_NIO;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class StreamReaderWriterExample {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out, StandardCharsets.UTF_8)
        ) {

            String text;
            while (!(text = bufferedReader.readLine()).equals("esc")) {
                outputStreamWriter.write(text + "\n");
                outputStreamWriter.flush();
            }
        }
    }
}
