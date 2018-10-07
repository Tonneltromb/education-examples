package com.ymatin.education.IO_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.DosFileAttributeView;
import java.util.List;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".\\src\\main\\java\\IO_NIO\\new.txt");
        Path path1 = Paths.get("F:\\Projects\\education\\src\\main\\java\\IO_NIO\\new.txt");

        System.out.println(Files.isSameFile(path, path1));
        System.out.println(Files.exists(path, LinkOption.NOFOLLOW_LINKS));

        System.out.printf("Readable: %b, Writable: %b, Executable: %b",
                Files.isReadable(path),
                Files.isWritable(path),
                Files.isExecutable(path));

//        System.out.println(Files.isHidden(path));
        System.out.println(Files.getAttribute(path, "size"));
        System.out.println(Files.getLastModifiedTime(path, LinkOption.NOFOLLOW_LINKS));
        System.out.println(Files.getOwner(path, LinkOption.NOFOLLOW_LINKS).getName());
        AclFileAttributeView view = Files.getFileAttributeView(path, AclFileAttributeView.class);
        List<AclEntry> acl = view.getAcl();
        acl.forEach(System.out::println);
        DosFileAttributeView view1 = Files.getFileAttributeView(path, DosFileAttributeView.class);
        List<AclEntry> acls = view.getAcl();
        acls.forEach(System.out::println);

    }
}
