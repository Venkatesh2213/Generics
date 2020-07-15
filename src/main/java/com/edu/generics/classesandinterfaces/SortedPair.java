package com.edu.generics.classesandinterfaces;

import java.util.Comparator;

public class SortedPair<T extends Comparable> {
    private final transient T first;
    private final transient T second;

    public SortedPair(T left, T right) {
        if (left.compareTo(right) < 0) {
            first = left;
            second = right;
        } else {
            first = right;
            second = left;

        }

    }

    public T getSecond() {
        return second;
    }

    public T getFirst() {
        return first;
    }


}
