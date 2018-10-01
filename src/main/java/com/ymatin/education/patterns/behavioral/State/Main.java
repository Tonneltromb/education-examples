package com.ymatin.education.patterns.behavioral.State;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.setState(StateFactory.GOOD);
        pet.takeOnHand();
        pet.call();
    }
}
