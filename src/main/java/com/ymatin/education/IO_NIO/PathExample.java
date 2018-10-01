package com.ymatin.education.IO_NIO;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) throws IOException {
//        Path path = Paths.get("F:\\Projects\\tmp\\new.txt");
        Path path = Paths.get(".\\src\\main\\java\\IO_NIO\\new.txt");
//        Path path1 = Paths.get(".\\src\\main\\java\\generics");


        System.out.println(path.getFileName());
        System.out.println(path.getName(0));
        System.out.println(path.getRoot());
        System.out.println(path.getNameCount()); // root(F:\) isn't considered
        System.out.println(path.getFileSystem());
        System.out.println(path.toUri());
        System.out.println(path.toAbsolutePath());
        System.out.println(path.normalize());
//        System.out.println(path.relativize(path1).toAbsolutePath());

        System.out.println();

        path.forEach((p) -> System.out.println(" " + p));

        System.out.println();

        Path normalizedPath = Paths.get(path.normalize().toString());

        System.out.println(normalizedPath.toAbsolutePath());
        System.out.println(path.toRealPath());

    }
}
