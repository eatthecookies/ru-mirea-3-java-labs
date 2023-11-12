package ru.mirea.lab14;

import java.util.Collection;

/**
 * Interface IWaitList with methods for classes implementors.
 * @param <E> Type of elements storing in WaitList
 */
public interface IWaitList<E> {
    /**
     * Method to add element in WaitList
     * @param element Value to be added
     */
    void add(E element);

    /**
     * Method to remove first element
     * @return Removed element
     */
    E remove();

    /**
     * Method for checking the presence of an element passed as a parameter in the WaitList
     * @param element Searching value
     * @return Is <i>(true)</i> element in list or not <i>(false)</i>
     */
    boolean contains(E element);

    /**
     * Method for checking the presence of all collection items in the WaitList
     * @param c Collection with values for search
     * @return Are <i>(true)</i> all elements in list or not <i>(false)</i>
     */
    boolean containsAll(Collection<E> c);

    /**
     * Method to check are there any elements in WaitList
     * @return Are <i>(true)</i> any elements in WaitLis or not <i>(false)</i>
     */
    boolean isEmpty();

}
