package ru.mirea.lab8;

import ru.mirea.lab7.MyApplication;

import javax.swing.*;

public class RunApplication {
    public static void main(String[] args) {
        Application frame = new Application();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
