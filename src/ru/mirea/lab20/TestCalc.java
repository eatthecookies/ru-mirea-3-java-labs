package ru.mirea.lab20;

public class TestCalc {
    public static void main(String[] args) {
        String input = "1 20 +";
        String input1 = "2 3 * 4 5 * + ";
        String input2 = "2 3 4 5 6 * + - / ";
        Calculator calc = new Calculator();
        System.out.println(calc.processing(input));
        System.out.println(calc.processing(input1));
        System.out.println(calc.processing(input2));
    }
}
