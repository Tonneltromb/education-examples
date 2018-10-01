package com.ymatin.education.IO_NIO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FilesExample_002 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("F:\\Projects\\tmp\\new.txt");

        Files.write(path, Arrays.asList("Hello!", "Goodbye!"));
        readAllBytes(path);
        readAllLines(path);
        Files.write(path, Arrays.asList("Good evening!", "Good afternoon"));
        readAllBytes(path);
        readAllLines(path);
    }

    private static void readAllLines(Path path) throws IOException {
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        System.out.println(lines);
    }

    private static void readAllBytes(Path path) throws IOException {
        byte[] bytes = Files.readAllBytes(path);
        System.out.println(Arrays.toString(bytes));
    }
}
