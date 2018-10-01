package com.ymatin.education.patterns.behavioral.Command;

public class CreateCommand extends Command {

    public CreateCommand(Receiver receiver) {
        super(receiver);
    }
    @Override
    void execute() {
        receiver.create();
    }
}
