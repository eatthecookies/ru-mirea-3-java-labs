package ru.mirea.lab16.task5;
public class TrowsDemo2 {
    public void getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails" );
        }
        System.out.println(key);
    }

    public static void main (String[]args){
        ThrowsDemo td = new ThrowsDemo();
        try {
            td.getDetails(null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
