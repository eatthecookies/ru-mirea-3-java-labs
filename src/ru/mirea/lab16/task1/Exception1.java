package ru.mirea.lab16.task1;

public class Exception1 {
    public void exceptionDemo() {
        System.out.println( 2 / 0 );
    }

    public static void main(String[] args) {
        new Exception1().exceptionDemo();

    }
}
