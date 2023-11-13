package ru.mirea.lab14;

import java.util.Collection;


public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }


    @Override
    public void add(E element) {
        if (content.size() == capacity) throw new IllegalStateException("Очередь заполнена");
        content.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}
