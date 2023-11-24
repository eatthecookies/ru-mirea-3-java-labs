package ru.mirea.lab19.task2;

import java.util.ArrayList;

public class UniversalClass <T> {
    private ArrayList<T> array;

    public UniversalClass() {
        this.array = new ArrayList<>();
    }

    public void addElement(T element) {
        array.add(element);
    }
    public T getElement(int a) {
        return array.get(a);
    }

    public ArrayList<T> getElements() {
        return array;
    }

}
