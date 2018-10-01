package com.ymatin.education.stream_API;

import java.util.*;
import java.util.stream.Collectors;

public class CollectStream {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<>();
        Collections.addAll(phones, "iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        List<String> list = phones.stream()
                .filter(s->s.length()<10)
                .collect(Collectors.toList());

        Set<String> set = phones.stream()
                .map(e -> e.split(" ")[0])
                .collect(Collectors.toSet());

        Map<String, Integer> map = phones.stream()
                .filter(e -> e.contains("6"))
                .collect(Collectors.toMap(k -> k, String::length));

        //concrete map
        Map<String, Integer> concreteMap = phones.stream()
                .map(e -> e.split(" ")[0])
                .collect(
                        HashMap::new,
                        (m, v)-> m.put(v,v.length()),
                        HashMap::putAll);

        //concrete list
        List concreteList = phones.stream()
                .map(e -> e.split(" ")[0])
                .filter(e -> e.length() == 6)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
        System.out.println(concreteMap);
        System.out.println(concreteList);
    }
}
