package week7.tryStacks;

import java.util.Arrays;

public class OurStack {

    private static final int DEFAULT_CAPACITY = 10;
    private String[] elements;
    private int size;

    public OurStack() {
        elements = new String[DEFAULT_CAPACITY];
        size = 0;
    }

    public void push(String item) {
        if (size >= elements.length) {
            increaseCapacity();
        }
        elements[size] = item;
        size++;

    }

    public String pop() {
        String top;
        if (size > 0) {
            top = elements[size - 1];
            size--;
        } else {
            top = null;
        }
        return top;
    }

    public String peek() {
        if (size > 0) {
            String top = elements[size - 1];
            return top;
        } else {
            return null;
        }
    }

    private void increaseCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public String toString() {
        String out = "";
        for (int count = 0; count < size; count++) {
            out = out +  elements[count] + " ";
        }
        return out;
    }

}
