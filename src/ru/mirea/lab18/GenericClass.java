package ru.mirea.lab18;

import java.io.Serializable;

public class GenericClass <T extends Comparable<T>, V extends Animal & Serializable, K> {
    T t;
    V v;
    K k;

    public GenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClassNames() {
        System.out.println("Переменная 1 класса: " + t.getClass().getName());
        System.out.println("Переменная 2 класса: " + v.getClass().getName());
        System.out.println("Переменная 3 класса: " + k.getClass().getName());
    }
}
