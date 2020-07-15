package com.edu.generics.buffer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TypeUnsafeTest {
    protected static TypeUnsafeExample typeUnsafeExample;
    StringCircularBuffer buffer;

    private static final String VALUE_1 = "a";
    private static final String VALUE_2 = "bc";
    private static final String VALUE_3 = "d";

    // private static final int INT_VALUE = 1;

    @BeforeTest
    public void init() {
        typeUnsafeExample = new TypeUnsafeExample();
    }

    @Test
    public void testConcatenatedUnsafeString() {
        String[] strings = {VALUE_1, VALUE_2, VALUE_3};

    }
}
/*
        assertThatExceptionOfType(ClassCastException.class).
                isThrownBy(() -> typeUnsafeExample.getConcatenatedUnsafeString(INT_VALUE, strings));
*/


