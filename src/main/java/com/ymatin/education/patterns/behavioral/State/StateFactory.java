package com.ymatin.education.patterns.behavioral.State;

public class StateFactory {
    public static final State GOOD = new GoodState();
    public static final State EVIL = new EvilState();
}
