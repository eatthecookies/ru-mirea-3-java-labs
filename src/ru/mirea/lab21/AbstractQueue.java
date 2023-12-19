package ru.mirea.lab21;

public class AbstractQueue {
    protected int currentSize;
    public boolean isEmpty() {
        return currentSize == 0;
    }

    public int size() {
        return currentSize;
    }
}
