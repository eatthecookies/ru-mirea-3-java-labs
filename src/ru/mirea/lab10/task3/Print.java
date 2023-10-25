package ru.mirea.lab10.task3;

public class Print {
    public static int print(int a, int b){
        if (a == b){
            System.out.println(b);
            return 0;
        }
        else if (a < b){
            System.out.println(a);
            return print(a + 1, b);
        }
        else {
            System.out.println(a);
            return print(a - 1, b);
        }
    }
    public static void main(String[] args) {
        print(1, 5);
        System.out.println();
        print(20, 2);
    }
}
