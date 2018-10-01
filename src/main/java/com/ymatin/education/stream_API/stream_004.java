package com.ymatin.education.stream_API;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class stream_004 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 3, 4, 1, 5, 6, 7, 8, 9, 20, 23};

        int[] arr2 = IntStream.of(arr).filter(e -> e % 2 == 0).toArray();
        System.out.println(Arrays.toString(arr2));
    }
}
