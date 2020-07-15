package com.edu.generics.classesandinterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import com.edu.generics.collections.Person;

public class SortingExamples {
    /**
     * This method is sorting the age,
     *
     * @param people,
     * @return list.
     */
    public List<Person> getSortedOrder(final Person[] people) {
        List<Person> list = new ArrayList<>();
        for (Person person : people) {
            list.add(person);
        }
        Collections.sort(list, new AgeComparator());
        return list;
    }

    public List<Person> getReverseSortedOrder(final Person[] people) {
        List<Person> list = new ArrayList<>();
        for (Person person : people) {
            list.add(person);
        }
        Collections.sort(list, new ReverseComparator<>(new AgeComparator()));
        return list;
    }
}
