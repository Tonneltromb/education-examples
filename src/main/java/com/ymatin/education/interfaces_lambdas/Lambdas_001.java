package com.ymatin.education.interfaces_lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Lambdas_001 {
    private static void repeat(final int count, Runnable event) throws InterruptedException {
        for (int i = 0; i < count; i++) {
            event.run();
            Thread.sleep(1000);
        }
    }

    private static void repeat(final int count, IntConsumer event) throws InterruptedException {
        for (int i = 1; i < count + 1; i++) {
            event.accept(i);
            Thread.sleep(1000);
        }
    }

    private static int[] repeat(final int[] arr, IntPredicate event) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (event.test(i)) {
                list.add(i);
            }
        }
        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }

//
//    private static<T> T[] sort(T[] arr, Predicate<T> event) throws InterruptedException {
//        ArrayList<T> list = new ArrayList<>(arr.length);
//        for (T anArr : arr) {
//            if (event.test(anArr)) {
//                list.add(anArr);
//            }
//        }
//        return list.stream().toArray(value -> (T[])new Object[value]);
//
//    }

    public static void main(String[] args) throws InterruptedException {
//        repeat(5, () -> System.out.println("hello"));
//        repeat(5, s -> System.out.println("CCC " + s));
//        String[] sort = sort(new String[]{"A", "AA", "AAA", "B", "BB", "BBB"}, s -> s.length() > 2);
//        System.out.println(Arrays.toString(sort));
        int[] arr = repeat(new int[]{1, 2, 3, 4, 5, 6}, e -> e % 2 != 0);

        //The same without lambda
        int[] arr1 = repeat(new int[]{1, 2, 3, 4, 5, 6}, new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 != 0;
            }
        });

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
