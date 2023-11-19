package ru.mirea.lab16.task2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try{
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch (NumberFormatException e) {
            System.out.println("Non-integer value");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by null");
        }

    }
    public static void main(String[] args) {
        new Exception2().exceptionDemo();
    }
}