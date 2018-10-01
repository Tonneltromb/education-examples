package com.ymatin.education.interfaces_lambdas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

public class WithLambdas {
    public static void main(String[] args) {

//        v1
//        Timer timer = new Timer(4000, e -> System.out.println(e.getClass()));
//        timer.start();
//        JOptionPane.showMessageDialog(null, "Do you want to stop?");

//        v2
//        new Timer(4000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("beep");
//            }
//        }).start();
//        JOptionPane.showMessageDialog(null, "Do you want to stop?");

//        v3
//        new Timer(4000, e -> System.out.println("beep")).start();
//        JOptionPane.showMessageDialog(null, "Do you want to stop?");

        String[] array = new String[]{"BBB", "AAA", "B", "A"};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(array));


    }
}
