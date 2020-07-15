package com.edu.generics.buffer;

import static org.assertj.core.api.Assertions.assertThat;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNull;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GenericCircularBufferTest {
    private static GenericCircularBuffer<Integer> buffer;
    private static final int SIZE = 2;


    @BeforeMethod
    public void init() {
        buffer = new GenericCircularBuffer<>(SIZE);

    }

    @Test
    public void shouldOfferPollableElement() {
        assertTrue(buffer.offer(1));
        assertThat(buffer.poll()).isEqualTo(Integer.valueOf(1));
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
        //assertEquals(1, buffer.poll());
        assertThat(buffer.poll()).isEqualTo(Integer.valueOf(1));
        assertTrue(buffer.offer(3));
        //assertEquals(2, buffer.poll());
        assertThat(buffer.poll()).isEqualTo(Integer.valueOf(2));
        assertThat(buffer.poll()).isEqualTo(Integer.valueOf(3));
        //assertEquals(3, buffer.poll());

    }

}



