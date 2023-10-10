package ru.mirea.lab2;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("for: " + sum);

        sum = 0;
        int i = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }

        System.out.println("while: " + sum);

        sum = 0;
        i = 0;
        do {
            sum += array[i];
            i++;
        } while (i < array.length);
        System.out.println("do while: " + sum);

        System.out.println();
        // Аргументы командной строки
        i = 1;
        for (String arg : args) {
            System.out.println("Аргумент " + i + ": " + arg);
            i++;
        }
        System.out.println();

        System.out.println();

        int n = 10; // Количество чисел в ряду
        double sum2 = 0.0;

        System.out.println("Первые " + n + " чисел гармонического ряда:");

        DecimalFormat df = new DecimalFormat("#.##");

        for (i = 1; i <= n; i++) {
            sum2 += 1.0 / i;
            System.out.println("Число " + i + ": " + df.format(sum2));
        }

        System.out.println();

        int[] array1 = new int[5];

        System.out.print("Unsorted: ");
        for (i = 0; i < 5; i++) {
            array1[i] = (int) (Math.random() * (100 - 10) + 10);
        }
        for (int value : array1) {
            System.out.print(value + " ");
        }

        System.out.print("\nSorted: ");
        Arrays.sort(array1);
        for (int value : array1) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.println("\nФакториал 6: " + factorial(6));

    }

    private static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
