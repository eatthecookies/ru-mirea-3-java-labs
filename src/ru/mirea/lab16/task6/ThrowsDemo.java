package ru.mirea.lab16.task6;

public class ThrowsDemo {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
    public static void main (String[]args){
        ThrowsDemo td = new ThrowsDemo();

        try {
            td.printMessage("me!");
            td.printMessage(null);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}


