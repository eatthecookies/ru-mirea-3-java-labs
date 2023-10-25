package ru.mirea.lab9;

public class TestClass {
    public static void main(String[] args) {
        Nameable nameableDog = new Dog("Rex");
        Nameable nameablePlanet = new Planet("Earth");
        System.out.println(nameablePlanet.getName());
        System.out.println(nameableDog.getName());
    }
}
