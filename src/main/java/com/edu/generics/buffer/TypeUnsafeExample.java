package com.edu.generics.buffer;

public class TypeUnsafeExample {
    /**
     * This main method we pass inputs.
     * @param args,
     */
    public static void main(String[] args) {
        //StringCircularBuffer buffer = new StringCircularBuffer(10);
        CircularBuffer buffer = new CircularBuffer(10);
        buffer.offer("a");
        buffer.offer("b");
        buffer.offer("cd");
        //buffer.offer(1);
        String value = concatenate(buffer);
        //System.out.println(value);

    }

    /*public static String concatenate(StringCircularBuffer buffer) {
        StringBuilder result = new StringBuilder();
        String value;
        while ((value = buffer.poll()) != null) {
            result.append(value);
        }
        return result.toString();
    }*/
    private static String concatenate(CircularBuffer buffer) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < buffer.size(); i++) {
            final String value = (String) buffer.poll();
            if (value != null) {
                result.append(value);
            }
        }
        return result.toString();
    }
}


