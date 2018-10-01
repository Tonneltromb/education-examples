package com.ymatin.education.stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        List<Phone> phones = Arrays.asList(
                new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple", 450),
                new Phone("Galaxy S9", "Samsung", 440),
                new Phone("Galaxy S8", "Samsung", 340));

        Map<Boolean, List<Phone>> phonesByCompany = phones.stream()
                .collect(Collectors.partitioningBy(p -> p.getCompany().equals("Apple")));

        phonesByCompany.forEach((key, value) -> {
            System.out.println(key);
            for (Phone phone : value) {
                System.out.println(phone.getName());
            }
            System.out.println();
        });


        Map<String, List<String>> phoneNamesByCompany = phones.stream()
                .collect(Collectors.groupingBy(Phone::getCompany,
                        Collectors.mapping(Phone::getName, Collectors.toList())));

        for(Map.Entry<String, List<String>> item : phoneNamesByCompany.entrySet()){
            System.out.println(item.getKey());
            for(String name : item.getValue()){
                System.out.println(name);
            }
            System.out.println();
        }
    }
}
