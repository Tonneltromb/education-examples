package com.ymatin.education.stream_API;

import java.util.stream.IntStream;

public class TwoStreams {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 3, 4, 1, 5, 6, 7, 8, 9, 20, 23};
        IntStream intStream1 = IntStream.of(arr).filter(x -> x % 2 == 0);
        IntStream.of(arr).filter(x -> x % 3 == 0).forEach(System.out::println);
        intStream1.forEach(System.out::println);
    }
}
