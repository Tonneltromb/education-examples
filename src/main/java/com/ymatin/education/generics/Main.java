package com.ymatin.education.generics;

public class Main {
    public static void main(String[] args) {
        String sResult = GenericMethods.getMiddle("A", "B", "C");
//        String sResult = GenericMethods.<String>getMiddle("A", "B", "C");
        System.out.println(sResult);

        Along<String> along = Along.makeAlong(String::new); // нельзя создать new T()

    }
}
