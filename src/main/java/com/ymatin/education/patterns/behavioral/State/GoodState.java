package com.ymatin.education.patterns.behavioral.State;

public class GoodState extends State {
    @Override
    public void takeOnHand() {
        System.out.println("Meow, I love you, master =)");
    }

    @Override
    public void callByName() {
        System.out.println("Meow, I am there");
    }
}
