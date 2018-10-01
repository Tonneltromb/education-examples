package com.ymatin.education.patterns.creational.Bridge;

public class Main {
    public static void main(String[] args) {
        UIElementsFactory factory = new WindowsElemetsFactory();
        Button button = factory.createButton();
        System.out.println(button.getTitle());
    }
}
