package com.ymatin.education.IO_NIO;

import java.nio.charset.Charset;
import java.util.SortedMap;

public class TextTransformation {
    public static void main(String[] args) {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
//        charsets.keySet().forEach(System.out::println);


        char c1 = 55378;
        char c2 = 56816;
        char c3 = '\u0F0F';

        String string = new String(new char[]{c1, c2});
        System.out.println(Character.hashCode(string.toCharArray()[0]));
        System.out.println("\u0F0FA\u0F0F");
    }
}
