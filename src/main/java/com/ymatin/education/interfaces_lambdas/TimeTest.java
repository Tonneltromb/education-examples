package com.ymatin.education.interfaces_lambdas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimeTest {
    public static void main(String[] args) {

        ActionListener timePrinter = new TimePrinter();
        Timer t = new Timer(4000, timePrinter);
        t.start();

        JOptionPane.showMessageDialog(null,"Enough?");
        System.exit(0);
    }


}
    class TimePrinter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            System.out.println(source.getClass());
        }
    }

