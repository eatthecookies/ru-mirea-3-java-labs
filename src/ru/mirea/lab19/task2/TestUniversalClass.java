package ru.mirea.lab19.task2;

public class TestUniversalClass {
    public static void main(String[] args) {
        UniversalClass<Integer> intMass = new UniversalClass<>();
        intMass.addElement(2);
        intMass.addElement(4);
        intMass.addElement(2);
        System.out.println(intMass.getElements());
        System.out.println(intMass.getElement(2));

        UniversalClass<String> strMass = new UniversalClass<>();
        strMass.addElement("Dwqwd");
        strMass.addElement("Hello");
        strMass.addElement("WOrekd");
        System.out.println(strMass.getElements());
        System.out.println(strMass.getElement(1));
    }
}
