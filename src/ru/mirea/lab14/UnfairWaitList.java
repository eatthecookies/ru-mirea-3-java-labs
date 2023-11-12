package ru.mirea.lab14;

public class UnfairWaitList<E> extends WaitList<E>{
    /**
     * Constructor - creates new UnfairWaitList object afrer creating a super class object
     */
    public UnfairWaitList() {
        super();
    }

    /**
     * Method to remove element from Wait List by its value
     * @param element Value for search and remove.
     * @see WaitList#remove()
     */
    public void remove(E element) {
        boolean removed = false;
        for (int i = 0; i < content.size(); i++) {
            E el = content.remove();
            if (!removed && el.equals(element))
                removed = true;
            else
                content.add(el);
        }
        if (removed) {
            content.add(content.remove());
        }
    }

    /**
     * Method for move element to the end of list
     * @param element Value to move
     */
    public void MoveToBack(E element){
        remove(element);
        content.add(element);
    }
}
