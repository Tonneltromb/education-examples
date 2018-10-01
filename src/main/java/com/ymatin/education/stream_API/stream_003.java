package com.ymatin.education.stream_API;

import com.ymatin.education.MyEntity.MyEntity;

import java.util.*;

public class stream_003 {
    public static void main(String[] args) {
        ArrayList<MyEntity> list = new ArrayList<>(Arrays.asList(
                new MyEntity(1,"A", "B"),
                new MyEntity(2,"A", "C"),
                new MyEntity(3,"B", "G"),
                new MyEntity(9,"B", "C"),
                new MyEntity(4,"C", "C"),
                new MyEntity(5,"D", "E"),
                new MyEntity(6,"E", "C")));

        list.forEach(System.out::println);
        System.out.println();
        list
                .stream()
                .sorted(Comparator
                        .comparing(MyEntity::getLastName)
//                        .thenComparing(MyEntity::getName)
        )
                .forEach(System.out::println);

    }
}
