package ru.mirea.lab16.task8;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        boolean f = false;
        do {
            f = false;
            String key = myScanner.next();
            try {
                printDetails( key );
            } catch (Exception e) {
                System.out.println("Exception.. Try again");
                f = true;
            }
        } while (f);

    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key == "w") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo td = new ThrowsDemo();
        try {
            td.getKey();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}