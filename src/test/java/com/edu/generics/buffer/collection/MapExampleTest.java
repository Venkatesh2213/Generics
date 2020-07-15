package com.edu.generics.buffer.collection;


import static org.assertj.core.api.Java6Assertions.assertThat;


import java.util.Map;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.edu.generics.collections.MapExample;
import com.edu.generics.collections.Person;


/**
 * This test class is used to test
 * functions of MapExample class.
 */

public class MapExampleTest {
    private static MapExample mapExamples;

    private static final Person DON_DRAPER = new Person("Don Draper", 89);
    private static final Person PEGGY_OLSON = new Person("Peggy Olson", 65);
    private static final Person BERT_COOPER = new Person("Bert Cooper", 100);

    @BeforeTest
    public void init() {
        mapExamples = new MapExample();
    }

    @Test
    public void testPersonByName() {
        Person[] people = {DON_DRAPER, PEGGY_OLSON, BERT_COOPER};
        Map<String, Person> stringPersonMap = mapExamples.addPersonAskeyValue(people);
        assertThat(stringPersonMap.get(DON_DRAPER.getName())).isEqualTo(DON_DRAPER);
    }

    @Test
    public void testListOfNames() {
        Person[] people = {DON_DRAPER, PEGGY_OLSON, BERT_COOPER};
        Map<String, Person> stringPersonMap = mapExamples.addPersonAskeyValue(people);
        assertThat(stringPersonMap.keySet()).containsExactlyInAnyOrder(DON_DRAPER.getName(),
                        PEGGY_OLSON.getName(), BERT_COOPER.getName());
    }

    @Test
    public void testListOfValues() {
        Person[] people = {DON_DRAPER, PEGGY_OLSON, BERT_COOPER};
        Map<String, Person> stringPersonMap = mapExamples.addPersonAskeyValue(people);
        assertThat(stringPersonMap.values()).containsExactlyInAnyOrder(DON_DRAPER, PEGGY_OLSON, BERT_COOPER);
    }
}
