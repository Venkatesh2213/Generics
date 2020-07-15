package com.edu.generics.classesandinterfaces;

import java.util.Comparator;

import com.edu.generics.collections.Person;

public class AgeComparator implements Comparator<Person> {

    /**
     * Compares its two arguments for order.  Returns a negative integer,
     * zero, or a positive integer as the first argument is less than, equal
     * to, or greater than the second.
     *
     * @param left  the first object to be compared.
     * @param right the second object to be compared.
     * @return a negative integer, zero, or a positive integer as the
     */

    @Override
    public int compare(Person left, Person right) {

        return Integer.compare(left.getAge(), right.getAge());
    }
}
