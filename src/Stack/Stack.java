package Stack;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Stack {
    private final int[] items;
    private int count;

    public Stack(int n) {
        items = new int[n];
    }

    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }

    public void push(int item) {
        if (count == items.length) {
            throw new StackOverflowError();
        }
        items[count++] = item;
    }

    public int peek() {
        if (count == 0) {
            throw new NoSuchElementException();
        }
        return items[count - 1];
    }

    public int pop() {
        if (count == 0) {
            throw new NoSuchElementException();
        }
        return items[--count];
    }
}
