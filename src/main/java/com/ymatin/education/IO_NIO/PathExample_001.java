package com.ymatin.education.IO_NIO;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample_001 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("tmp");
        Path path1 = Paths.get("F:\\Projects\\education\\tmp");

        System.out.println(path.compareTo(path1) == 0);
        System.out.println(path1.equals(path));
        System.out.println(path1.equals(path.toAbsolutePath()));


    }
}
