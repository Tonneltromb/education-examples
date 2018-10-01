package com.ymatin.education.patterns.behavioral.Command;

public class CommandFactory {
    private Receiver receiver;

    public CommandFactory(Receiver receiver) {
        this.receiver = receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public Command copyCommand(){ return new CopyCommand(receiver); }
    public Command createCommand() { return new CreateCommand(receiver); }
    public Command deleteCommand(){ return new DeleteCommand(receiver); }
    public Command pasteCommand(){ return new PasteCommand(receiver); }
}
