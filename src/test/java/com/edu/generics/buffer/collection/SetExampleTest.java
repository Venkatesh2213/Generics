package com.edu.generics.buffer.collection;


import static org.assertj.core.api.Java6Assertions.assertThat;


import java.util.Set;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.edu.generics.collections.Person;
import com.edu.generics.collections.SetExample;


/**
 * This test class is used to test
 * functions of SetExample class.
 */

public class SetExampleTest {
    private static SetExample setExamples;

    private static final Person DON_DRAPER = new Person("Don Draper", 89);
    private static final Person PEGGY_OLSON = new Person("Peggy Olson", 65);
    private static final Person BERT_COPPER = new Person("Bert Cooper", 100);

    @BeforeTest
    public void init() {
        setExamples = new SetExample();
    }

    @Test
    public void testUniquePerson() {
        Person[] people = {DON_DRAPER, PEGGY_OLSON, BERT_COPPER};
        assertThat(setExamples.addUniquePerson(people)).containsExactlyInAnyOrder(PEGGY_OLSON, BERT_COPPER, DON_DRAPER);
    }

    @Test
    public void testUniquePersonWithDuplicates() {
        Person[] people = {DON_DRAPER, PEGGY_OLSON, BERT_COPPER, PEGGY_OLSON};
        assertThat(setExamples.addUniquePerson(people)).containsExactlyInAnyOrder(PEGGY_OLSON, BERT_COPPER, DON_DRAPER);
    }

    @Test
    public void checkParticularPerson() {
        Person[] people = {DON_DRAPER, PEGGY_OLSON, BERT_COPPER};
        assertThat(setExamples.addUniquePerson(people).contains(DON_DRAPER)).isTrue();
    }

    @Test
    public void checkParticularNonExistingPerson() {
        Person[] people = {DON_DRAPER, PEGGY_OLSON};
        assertThat(setExamples.addUniquePerson(people).contains(BERT_COPPER)).isFalse();
    }

    @Test
    public void testUniquePersonSize() {
        Person[] people = {DON_DRAPER, PEGGY_OLSON, BERT_COPPER};
        assertThat(setExamples.addUniquePerson(people).size()).isEqualTo(3);
    }

    @Test
    public void retrivePersonUsingForEach() {
        Person[] people = {DON_DRAPER, PEGGY_OLSON, BERT_COPPER};
        Set<Person> personSet = setExamples.addUniquePerson(people);
        for (Person person : personSet) {
            assertThat(people).contains(person);
        }
    }
}
