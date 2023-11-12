package ru.mirea.lab14;

import java.util.Collection;

/**
 * Class inhereted by WaitList with constant capacity.
 * @param <E> Type of stored data.
 * @see IWaitList
 * @see WaitList
 */
public class BoundedWaitList<E> extends WaitList<E> {
    /**
     * Field for maximum count of elements in Wait List
     */
    private int capacity;

    /**
     * Constructor - creates new object with no content
     * @param capacity Maximum {@link BoundedWaitList#capacity} of queue.
     */
    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }
    /**
     * Method to get property {@link BoundedWaitList#capacity}
     * @return Value of {@link BoundedWaitList#capacity}
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Method to add new element in Wait list
     * @param element Value to be added
     */
    @Override
    public void add(E element) {
        if (content.size() == capacity) throw new IllegalStateException("Очередь заполнена");
        content.add(element);
    }

    /**
     * Method to get information about this list in String type.
     * @return String-value of this list.
     */
    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}
