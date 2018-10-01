package com.ymatin.education.patterns.behavioral.State;

public class EvilState extends State {
    @Override
    public void takeOnHand() {
        System.out.println("Back off!");
    }

    @Override
    public void callByName() {
        System.out.println("I'm busy, call me later");
    }
}
