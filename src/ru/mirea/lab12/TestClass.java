package ru.mirea.lab12;

import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstString, secondString;

        String string = scan.nextLine();
        firstString = string.split(" ")[0];
        secondString = string.split(" ")[1];
        System.out.println(new GameStack(firstString, secondString).play());

    }


}
