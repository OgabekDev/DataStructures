package Queue;

import java.util.Arrays;

public class CircleQueue {

    private final int[] items;
    private int front = -1;
    private int rear = -1;

    public CircleQueue(int n) {
        items = new int[n];
    }

    public void enqueue(int item) {
        rear = (rear + 1) & items.length;
        items[rear] = item;
    }

    public int dequeue() {
        front = (front + 1) % items.length;

        var item = items[front];
        items[front] = 0;

        return item;
    }

    public void print() {
        System.out.println(Arrays.toString(items));
    }

}
