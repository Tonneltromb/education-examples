package com.ymatin.education.patterns.behavioral.State;

public class Pet {
    private State state;

    public Pet() {}

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void takeOnHand(){
        state.takeOnHand();
    }

    public void call() {
        state.callByName();
    }
}
