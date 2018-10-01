package com.ymatin.education.stream_API;

import java.util.stream.Stream;

public class While {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers
                .sorted()
//                .dropWhile(n -> n < 0) // since jdk 1.9
//                .takeWhile(n -> n < 0) // since jdk 1.9
                .forEach(System.out::println);
    }
}
