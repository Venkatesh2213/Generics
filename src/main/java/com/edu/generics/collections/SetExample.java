package com.edu.generics.collections;

import java.util.HashSet;
import java.util.Set;


/**
 * This class is used Person as
 * generic type to inset unique person.
 */
public class SetExample {

    /**
     * This Method is used to add Person to HashSet.
     */

    public Set<Person> addUniquePerson(final Person[] people) {
        Set<Person> personSet = new HashSet<>();
        for (Person person : people) {
            personSet.add(person);
        }
        return personSet;
    }
}
