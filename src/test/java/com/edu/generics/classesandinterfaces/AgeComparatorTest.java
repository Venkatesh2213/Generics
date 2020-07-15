package com.edu.generics.classesandinterfaces;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

import com.edu.generics.collections.Person;



public class AgeComparatorTest {

    private static AgeComparator ageComparator;
    private static final Person DON_DRAPER = new Person("Don Draper", 89);
    private static final Person PEGGY_OLSON = new Person("Peggy Olson", 65);
    private static final Person BERT_COOPER = new Person("Bert Cooper", 100);

    @Test
    public void sortedOrder() {
        List<Person> madMen = new ArrayList<>();
        madMen.add(DON_DRAPER);
        madMen.add(PEGGY_OLSON);
        madMen.add(BERT_COOPER);
       Collections.sort(madMen, new AgeComparator());
        System.out.println(madMen);

    }

}
