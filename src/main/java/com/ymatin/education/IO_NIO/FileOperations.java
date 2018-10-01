package com.ymatin.education.IO_NIO;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperations {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("F:\\Projects\\tmp\\new.txt");

        //create
//        System.out.println(create(path.getParent(), "new1.txt"));
        //copy
//        System.out.println(copy(path, path.getParent(), "new_copy.txt"));
        //replace
//        System.out.println(replace(path, Paths.get(path.getParent().toString(), "\\tmp1\\tmp.txt")));
        //delete
        System.out.println(delete(Paths.get(path.getParent().toString(), "\\tmp1")));
    }

    private static boolean delete(Path path) throws IOException {
        return Files.deleteIfExists(path);
    }

    private static Path replace(Path source, Path target, CopyOption... options) throws IOException {
        return Files.move(source, target, options);
    }

    private static Path copy(Path source, Path target, String filename, CopyOption... options) throws IOException {
        Path localTarget = Paths.get(target.toString(), filename);
        return Files.copy(source, localTarget, options);
    }

    private static Path create(Path path, String fileName) throws IOException {
        return Files.createFile(Paths.get(path.toString(), fileName));
    }
}
