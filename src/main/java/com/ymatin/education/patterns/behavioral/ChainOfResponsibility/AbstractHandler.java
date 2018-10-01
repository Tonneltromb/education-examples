package com.ymatin.education.patterns.behavioral.ChainOfResponsibility;

public abstract class AbstractHandler implements Handler {
    Handler next;

    public AbstractHandler(Handler next) {
        this.next = next;
    }

    @Override
    public abstract void handle();

    public void doNext(){
        next.handle();
    }
}
