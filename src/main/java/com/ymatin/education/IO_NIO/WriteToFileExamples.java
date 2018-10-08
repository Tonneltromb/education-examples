package com.ymatin.education.IO_NIO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteToFileExamples {
    public static void main(String[] args) throws IOException {

        String path = "E:\\IdeaProjects\\education-examples\\temp\\test.txt";
        String text_1 = "Hello, I've already written by FileOutputStream!";
        String text_2 = "This text was written by OutputStreamWriter";
        String text_3 = "This text was written by FileWriter";
        String text_4 = "This text was written by Files#write";

        int i = 4;
        switch (i) {
            // FileOutputStream
            case 1:
                withOutputStream(path, text_1);
                break;
            // OutputStreamWriter
            case 2:
                withOutputStreamWriter(path, text_2);
                break;
            // FileWriter (uses OutputStreamWriter inside)
            case 3:
                withFileWriter(path, text_3);
                break;
            // Files#write
            case 4:
                withFiles(path, text_4);
                break;
            default:
                System.out.println("nothing was written");
        }
    }

    private static void withOutputStream(String path, String text) {

        try (OutputStream os = new FileOutputStream(new File(path));
             OutputStream bos = new BufferedOutputStream(os)) {
            byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
            bos.write(bytes, 0, bytes.length);
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void withOutputStreamWriter(String path, String text) {

        try (OutputStream os = new FileOutputStream(path);
             OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
             BufferedWriter bw = new BufferedWriter(osw)) {
            bw.write(text);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void withFileWriter(String path, String text) {

        try (FileWriter fw = new FileWriter(path, false);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void withFiles(String path, String text) {
        try {
            Files.write(Paths.get(path), text.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
