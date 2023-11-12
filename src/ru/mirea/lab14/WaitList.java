package ru.mirea.lab14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Base class WaitList with base functionality
 * @param <E> Type of storing data
 * @see IWaitList
 */
public class WaitList<E> implements IWaitList<E>{
    /**
     * FIFO queue for storing elements
     */
    protected ConcurrentLinkedQueue<E> content;

    /**
     * Constructor - creates new object with no content
     */
    public WaitList(){
        content = new ConcurrentLinkedQueue<>();
    }

    /**
     * Constructor - creates new WaitList object with content
     * @param c Collection with data to store
     */
    public WaitList(Collection<E> c) {
        content = new ConcurrentLinkedQueue<>(c);
    }
    /**
     * Method to get information about this list in String type.
     * @return String-value of this list.
     */
    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }

    /**
     * Method to add element at the end of content queue.
     * @param element Value to be added.
     * @see IWaitList#add(Object).
     */
    @Override
    public void add(E element) {
        content.add(element);
    }

    /**
     * Method to remove first element of the queue.
     * @return Removed element.
     * @see IWaitList#remove()
     */
    @Override
    public E remove() {
        if (content.isEmpty()) throw new IllegalStateException("Пустая очередь");
        return content.remove();
    }

    /**
     Method for checking the presence of an element passed as a parameter in the WaitList
     * @param element Searching value
     * @return Is <i>(true)</i> element in list or not <i>(false)</i>
     * @see IWaitList#contains(Object)
     */
    @Override
    public boolean contains(E element) {
        boolean res = false;
        for (int i = 0; i < content.size(); i++) {
            E el = content.remove();
            if (el.equals(element))
                res = true;
            content.add(el);
        }
        return res;
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        ArrayList<E> al = new ArrayList<>(c);
        for (int i = 0; i < c.size(); i++) {
            E el = al.get(i);
            boolean res = contains(el);
            if (res == false)
                return false;
        }
        return true;
    }
    /**
     * Method to check, is {@link WaitList#content} empty.
     * @return True - {@link WaitList#content} has no elements, false - no any element in it.
     * @see IWaitList#isEmpty()
     * @see ConcurrentLinkedQueue#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
