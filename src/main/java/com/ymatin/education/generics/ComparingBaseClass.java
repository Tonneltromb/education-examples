package com.ymatin.education.generics;

public class ComparingBaseClass {
    public static void main(String[] args) {
        Pair<String> stringPair = new Pair<>("A", "B");
        Pair<Integer> integerPair = new Pair<>(1, 2);
        System.out.println(stringPair.getClass() == integerPair.getClass()); // true
        System.out.println(stringPair.getClass().equals(integerPair.getClass())); // true
    }
}
