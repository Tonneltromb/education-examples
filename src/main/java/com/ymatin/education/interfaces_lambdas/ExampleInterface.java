package com.ymatin.education.interfaces_lambdas;

import java.util.Random;

public interface ExampleInterface {

    String CONSTATNT_1 = "first";
    //equals constant above (public static final) by default
    //the same with methods
    public static final String CONSTANT_2 = "second";

    //static method since JDK 1.8
    public static int getRandomInt(final int count) {
        return new Random().nextInt(count);
    }

    //default method since 1.8
    default String getString(){ return "default string"; }
}
