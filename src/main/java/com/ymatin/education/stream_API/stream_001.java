package com.ymatin.education.stream_API;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stream_001 {
    public static void main(String[] args) {

    int[] arr = {1, 3, 2, 2, 3, 4, 1, 5, 6, 7, 8, 9, 20, 23};
     IntStream
             .of(arr)
             .filter(e -> e > 3 && e < 10)
             .forEach(System.out::println);
        System.out.println(".............................");

     Arrays.stream(arr)
             .filter(e -> e < 10)
             .sorted()
             .distinct() // только уникальные
             .forEach(System.out::println);

        System.out.println(".............................");

    IntStream
            .of(arr)
            .skip(2)
            .limit(3)
            .forEach(System.out::println);

        System.out.println(".............................");

    Optional<Integer> result = Stream.of(1,2,3,4).reduce((x,y) -> x + y);
        System.out.println(result.get());
    }

}
