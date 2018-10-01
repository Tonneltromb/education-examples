package com.ymatin.education.IO_NIO;

import java.io.IOException;
import java.nio.file.*;
import java.util.function.Consumer;

public class Directories {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("F:\\Projects\\tmp\\");

//        Iterable<Path> directories = FileSystems.getDefault().getRootDirectories();
//        directories.forEach(d -> System.out.println(d));

//        System.out.println(Files.createDirectory(Paths.get(path.toString(), "\\tmp1\\tmp2")));
//        System.out.println(Files.createDirectories(Paths.get(path.toString(), "\\tmp1\\tmp2")));

//       recursiveIteration(path, System.out::println);
       recursiveIteration(path, "*new[0-9]*", System.out::println); // first level only, and directories that match

    }


    private static void recursiveIteration(Path path, Consumer<Path> consumer) throws IOException {
        DirectoryStream<Path> paths = Files.newDirectoryStream(path);
        for (Path p : paths) {
            if (Files.isDirectory(p)){
                recursiveIteration(p, consumer);
            }
            consumer.accept(p);
        }
    }

    private static void recursiveIteration(Path path, String glob, Consumer<Path> consumer) throws IOException {
        DirectoryStream<Path> paths = Files.newDirectoryStream(path, glob);
        for (Path p : paths) {
            if (Files.isDirectory(p)){
                recursiveIteration(p, glob, consumer);
            }
            consumer.accept(p);
        }
    }
}
