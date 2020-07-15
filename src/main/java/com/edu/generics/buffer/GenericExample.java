package com.edu.generics.buffer;

public class GenericExample {
    /**
     * This method we are passing inputs.
     *
     * @param args,
     */
    public static void main(String[] args) {
        GenericCircularBuffer buffer = new GenericCircularBuffer(10);
        buffer.offer("a");
        buffer.offer("b");
        buffer.offer("c");
        //String value = concatenate(buffer);
        //System.out.println(value);


    }

    private static String concatenate(GenericCircularBuffer<String> buffer) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < buffer.size(); i++) {
            final String value = buffer.poll();
            if (value != null) {
                result.append(value);
            }
        }
        return result.toString();
    }
}
