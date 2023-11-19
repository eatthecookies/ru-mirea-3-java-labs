package ru.mirea.lab16.task5;

import ru.mirea.lab16.task4.Exception2;

public class ThrowsDemo {
    public void getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails" );
        }
        System.out.println(key);
    }

    public static void main (String[]args){
        new ThrowsDemo().getDetails(null);
    }
}
