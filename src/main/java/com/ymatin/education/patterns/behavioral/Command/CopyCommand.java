package com.ymatin.education.patterns.behavioral.Command;

public class CopyCommand extends Command {

    public CopyCommand(Receiver receiver) {
        super(receiver);
    }
    @Override
    void execute() {
        receiver.copy();
    }
}
