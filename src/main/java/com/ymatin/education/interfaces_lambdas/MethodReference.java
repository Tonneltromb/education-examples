package com.ymatin.education.interfaces_lambdas;

import java.util.Arrays;

public class MethodReference {
    public static void main(String[] args) {
        String[] strings = {"a", "W", "c", "A", "C", "F"};
        //Arrays.sort(strings, (s1,s2) -> s1.compareToIgnoreCase(s2));
        Arrays.sort(strings, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strings));
    }
}
