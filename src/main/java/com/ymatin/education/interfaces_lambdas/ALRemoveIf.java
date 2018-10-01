package com.ymatin.education.interfaces_lambdas;

import java.util.*;

public class ALRemoveIf {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 2, 3, 4, 5, 6);
        System.out.println(integers);
        integers.removeIf(e -> e % 2 != 0);
        System.out.println(integers);
    }
}
