package com.edu.generics.classesandinterfaces;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;


public class SortedPairTest {
    @Test
    public void shouldRetainOrderOfOrderPair() {
        SortedPair<Integer> sortedPair = new SortedPair<>(1, 2);
        assertEquals(1, sortedPair.getFirst().intValue());
        assertEquals(2, sortedPair.getSecond().intValue());
    }

    @Test
    public void shouldFlipOrderOfMisorderPair() {
        SortedPair<Integer> sortedPair = new SortedPair<>(2, 1);
        assertEquals(1, sortedPair.getFirst().intValue());
        assertEquals(2, sortedPair.getSecond().intValue());

    }
}
