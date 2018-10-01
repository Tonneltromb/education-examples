package com.ymatin.education.patterns.behavioral.Command;

public class DeleteCommand extends Command {
    public DeleteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    void execute() {
        receiver.delete();
    }
}
