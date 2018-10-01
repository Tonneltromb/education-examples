package com.ymatin.education.patterns.behavioral.Command;

public class Receiver {
    public void copy(){ System.out.println("Copying..."); }
    public void create(){ System.out.println("Creating..."); }
    public void delete(){ System.out.println("Deleting..."); }
    public void paste(){ System.out.println("Pasting..."); }
}
