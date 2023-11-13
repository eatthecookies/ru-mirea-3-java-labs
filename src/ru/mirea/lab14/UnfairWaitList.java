package ru.mirea.lab14;

import java.util.ArrayList;

public class UnfairWaitList<E> extends WaitList<E>{
    ArrayList<E> removedItems = new ArrayList<>();

    public UnfairWaitList() {
        super();
    }

    @Override
    public void add(E element) {
        if (!removedItems.contains(element))
            super.add(element);
        else
            throw new IllegalStateException("Удаленный элемент не может быть добавлен снова");
    }

    public void remove(E element) {
        boolean removed = false;
        for (int i = 0; i < content.size(); i++) {

            E el = content.remove();
            if (!removed && el.equals(element)) {
                if (i == 0){
                    throw new IllegalStateException("Первый элемент не может быть удален");
                }
                removed = true;
                removedItems.add(element);
            }
            else
                content.add(el);
        }
        if (removed) {
            content.add(content.remove());
        }
    }

    public void MoveToBack(E element){
        remove(element);
        content.add(element);
    }
}
