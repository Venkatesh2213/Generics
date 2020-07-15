package com.edu.generics.buffer;

public class TypeSafeExample {
    /**
     * This main method we pass inputs.
     *
     * @param args,
     */


    public static void main(String[] args) {
        StringCircularBuffer buffer = new StringCircularBuffer(10);

        buffer.offer("a");
        buffer.offer("b");
        buffer.offer("cd");
        String value = concatenate(buffer);
        //System.out.println(value);
    }

    /**
     * This method concatenate two strings,
     *
     * @param buffer,
     * @return.
     */
    public static String concatenate(StringCircularBuffer buffer) {

        StringBuilder result = new StringBuilder();
        String value;
        while ((value = buffer.poll()) != null) {
            result.append(value);
        }
        return result.toString();
    }
}
