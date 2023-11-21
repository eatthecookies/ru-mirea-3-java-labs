package ru.mirea.lab18;

public class Test {
    public static void main(String[] args) {

        GenericClass <Integer, Monkey, String> genericClass = new GenericClass<>(10, new Monkey("ЧиЧиЧи"), "Hello");
        genericClass.printClassNames();

        System.out.println();

        Integer[] intArray = {3, 7, 2, 9, 1};
        MinMax<Integer> minMax1 = new MinMax<>(intArray);
        System.out.println("Min: " + minMax1.findMin());
        System.out.println("Max: " + minMax1.findMax());

        System.out.println();

        Double [] doubleArray = {3.2, 7.1, 2.5, 9.2, 1.5};
        MinMax<Double> minMax2 = new MinMax<>(doubleArray);
        System.out.println("Min: " + minMax2.findMin());
        System.out.println("Max: " + minMax2.findMax());

        System.out.println();

        System.out.println("Sum: " + Calculator.sum(5, 3.5));
        System.out.println("Multiply: " + Calculator.multiply(5, 1.5));
        System.out.println("Divide: " + Calculator.divide(5, 6.5));
        System.out.println("Subtraction: " + Calculator.subtraction(5, 3.5));
    }
}
