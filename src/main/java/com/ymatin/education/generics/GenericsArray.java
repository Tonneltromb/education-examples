package com.ymatin.education.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsArray {
    public static void main(String[] args) {
        Pair<String>[] stringPairArray = (Pair<String>[]) new Pair<?>[]{};
        List<Pair<String>> stringPairsList = new ArrayList<>(); // более предпочтительный способ
        stringPairsList.toArray((Pair<String>[]) new Pair<?>[stringPairsList.size()]);// плохо

        Pair<String>[] array =
                GenericMethods.getArray(new Pair<>("A", "B"), new Pair<>("C", "D"));
        System.out.println(array[0]); // @SafeVarargs
    }
}
