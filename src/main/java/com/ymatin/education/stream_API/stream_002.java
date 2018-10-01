package com.ymatin.education.stream_API;

import com.ymatin.education.MyEntity.MyEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class stream_002 {
    public static void main(String[] args) {
        List<MyEntity> list = new ArrayList<>();
        Collections.addAll(list,
                new MyEntity(1, "A", "A"),
                new MyEntity(1, "A", "B"),
                new MyEntity(2, "B", "B"));

        list.stream()
                .filter(e -> e.getLastName().equals("B"))
                .forEach(System.out::println);

        list.stream()
                .map(e-> "id = " + e.getId() +", "+ "lastname = " + e.getLastName())
                .forEach(System.out::println);

        list.stream()
                .flatMap(e -> Stream.of(e.getId(),e.getId()*2))
                .forEach(e-> System.out.println(e + " "));

        String[] array = list.stream().map(MyEntity::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }
}
