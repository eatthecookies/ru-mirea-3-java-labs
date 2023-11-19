package ru.mirea.lab16.task4;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("Exception has been caught");
        } finally {
            System.out.println("In all cases this block will be called");
        }
//        catch (NumberFormatException e) {
//            System.out.println("Non-integer value");
//        } catch (ArithmeticException e) {
//            System.out.println("Attempted division by null");
//        }
    }
    public static void main (String[]args){
        new Exception2().exceptionDemo();
    }
}
