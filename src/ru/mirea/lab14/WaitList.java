package ru.mirea.lab14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{

    protected ConcurrentLinkedQueue<E> content;

    public WaitList(){
        content = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection<E> c) {
        content = new ConcurrentLinkedQueue<>(c);
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }

    @Override
    public void add(E element) {

        content.add(element);
    }


    @Override
    public E remove() {
        if (content.isEmpty()) throw new IllegalStateException("Пустая очередь");
        return content.remove();
    }


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

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
