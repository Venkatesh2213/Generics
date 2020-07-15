package com.edu.generics.buffer;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNull;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class CircularBufferTest {


    private static CircularBuffer buffer;
    private static final int SIZE = 2;

    @BeforeMethod
    public void init() {
        buffer = new CircularBuffer(SIZE);
    }

    @Test
    public void shouldOfferPollableElement() {
        assertTrue(buffer.offer(1));
        assertEquals(1, buffer.poll());
        assertNull(buffer.poll());
    }


    @Test
    public void shouldNotOfferWhenBufferIsFull() {
        assertTrue(buffer.offer(1));
        assertTrue(buffer.offer(2));
        assertFalse(buffer.offer(3));

    }


    @Test
    public void shouldNotPollWhenBufferIsEmpty() {
        assertNull(buffer.poll());
    }

    @Test
    public void shouldRecycleBuffer() {
        assertTrue(buffer.offer(1));
        assertTrue(buffer.offer(2));
        assertEquals(1, buffer.poll());
        assertTrue(buffer.offer(3));
        assertEquals(2, buffer.poll());
        assertEquals(3, buffer.poll());

    }

}

