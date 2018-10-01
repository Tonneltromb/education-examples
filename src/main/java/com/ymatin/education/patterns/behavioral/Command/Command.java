package com.ymatin.education.patterns.behavioral.Command;

public abstract class Command {
    Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }
    abstract void execute();
}
