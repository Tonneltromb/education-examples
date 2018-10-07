package com.ymatin.education.IO_NIO;

import java.io.*;

public class FileInputOutputCopyFromFileToFile {
    public static void main(String[] args) {
        String fromPath = "";
        String toPath = "";
        try(
                InputStream from = new FileInputStream(fromPath);
                OutputStream to = new FileOutputStream(toPath)
                ){

            byte[] bytes = new byte[from.available()];
            from.read(bytes, 0, bytes.length);
            to.write(bytes, 0, bytes.length);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
