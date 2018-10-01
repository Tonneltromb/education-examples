package com.ymatin.education.IO_NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitor {
    public static void main(String[] args) throws IOException {
//        Path path = Paths.get("F:\\Projects\\tmp\\");
        Path path = Paths.get("E:\\IdeaProjects\\tmp");

        String pattern = "*{test,test[0-9]}.txt";
        Files.walkFileTree(path, new FileVisitorImpl(pattern));
    }
}

class FileVisitorImpl extends SimpleFileVisitor<Path>{

    private String pattern = "*";

    public FileVisitorImpl() {}

    public FileVisitorImpl(String pattern){ this.pattern = pattern; }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        DirectoryStream<Path> paths = Files.newDirectoryStream(dir, pattern);
        System.out.format("Directory: %s%n", dir);
        for (Path p : paths) {
            System.out.println("matches: " + p.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }
}
