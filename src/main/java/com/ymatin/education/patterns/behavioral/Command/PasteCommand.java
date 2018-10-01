package com.ymatin.education.patterns.behavioral.Command;

public class PasteCommand extends Command {
    public PasteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    void execute() {
        receiver.paste();
    }
}
