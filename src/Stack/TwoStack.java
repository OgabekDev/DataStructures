package Stack;

import java.util.NoSuchElementException;

public class TwoStack {
    private final int[] items;
    public int count1, count2;

    public TwoStack(int n) {
        items = new int[n];
        count1 = 0;
        count2 = n;
    }

    public boolean isEmpty1() {
        return count1 == 0;
    }

    public boolean isEmpty2() {
        return count2 == items.length / 2;
    }

    public boolean isFull1() {
        return count1 == items.length / 2;
    }

    public boolean isFull2() {
        return count2 == items.length;
    }

    public void push1(int item) {
        if (count1 == items.length / 2) {
            throw new StackOverflowError();
        }
        items[count1++] = item;
    }

    public int peek1() {
        if (count1 == 0) {
            throw new NoSuchElementException();
        }
        return items[count1 - 1];
    }

    public int pop1() {
        if (count1 == 0) {
            throw new NoSuchElementException();
        }
        return items[--count1];
    }

    public void push2(int item) {
        if (count2 == items.length) {
            throw new StackOverflowError();
        }
        items[count2++] = item;
    }

    public int peek2() {
        if (count2 == items.length / 2) {
            throw new NoSuchElementException();
        }
        return items[count2 - 1];
    }

    public int pop2() {
        if (count2 == items.length / 2) {
            throw new NoSuchElementException();
        }
        return items[--count2];
    }

    private void print() {
        for (int i = 0; i < count1; i++) {
            System.out.println(items[i] + " ");
        }
        for (int i = count1 + 1; i < count2; i++) {
            System.out.println(items[i] + " ");
        }
    }

}
