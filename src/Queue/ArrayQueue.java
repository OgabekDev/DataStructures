package Queue;

import java.util.Arrays;

public class ArrayQueue {

    private int[] items;
    private int front;
    private int rear;

    public ArrayQueue(int n) {
        items = new int[n];
    }

    public void enqueue(int item) {
        if (rear == items.length) throw new StackOverflowError();
        items[rear++] = item;
    }

    public int dequeue() {
        var item = items[front];
        items[front] = 0;
        front++;
        return item;
    }

    public void print() {
        System.out.println(Arrays.toString(items));
    }

}
