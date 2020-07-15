package com.edu.generics.classesandinterfaces;

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T> {


    private final transient Comparator<T> delegateComparator;

    public  ReverseComparator(final Comparator<T> delegateComparator) {
        this.delegateComparator = delegateComparator;

    }

    /**
     * Compares its two arguments for order.  Returns a negative integer,
     * zero, or a positive integer as the first argument is less than, equal
     * to, or greater than the second.
     *
     * @param left  the first object to be compared.
     * @param right the second object to be compared.
     * @return a negative integer, zero, or a positive integer as the being compared by this comparator.
     */
    @Override
    public int compare(T left, T right) {
        return -1 * delegateComparator.compare(left, right);
    }
}
