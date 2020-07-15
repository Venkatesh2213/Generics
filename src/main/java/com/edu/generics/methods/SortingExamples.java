package com.edu.generics.methods;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.edu.generics.classesandinterfaces.AgeComparator;
import com.edu.generics.collections.Person;

public class SortingExamples {
    /**
     * This method is sorted the youngest age,
     * @param people,
     * @return.
     */

    public Person getYoungestMember(final Person[] people) {
        if (people == null) {
            throw new IllegalArgumentException("Person array can't be null");
        }
        List<Person> personList = new ArrayList<>();
        for (Person person : people) {
            personList.add(person);
        }
        return min(personList, new AgeComparator());
    }

    public static <T> T min(List<T> values, Comparator<T> comparator) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("Unable to find the minimum of an empty list");
        }

        T lowestFound = values.get(0);

        for (int i = 1; i < values.size(); i++) {
            final T element = values.get(i);
            if (comparator.compare(element, lowestFound) < 0) {
                lowestFound = element;
            }
        }
        return lowestFound;
    }
}
