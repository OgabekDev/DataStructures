package ArrayList;

import java.util.NoSuchElementException;

public class ArrayList {

    private int[] items;
    private int count;

    public ArrayList(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item) {
        // resize items
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        // add item
        items[count++] = item;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public void insertAt(int item, int index) {
        // resize items
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }

        // shift items
        for (int i = count - 1; i >= index; i--) {
            items[i + 1] = items[i];
        }

        // add item
        count++;
        items[index] = item;
    }

    public void removeAt(int index) {
        // invalid index
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("Index not found");
        }

        // shift items
        for (int i = index; i < count - 1; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int max() {
        // Checking not empty
        if (count == 0) throw new NoSuchElementException();

        // Searching
        var max = items[0];
        for (int item : items) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public int min() {
        // Checking not empty
        if (count == 0) throw new NoSuchElementException();

        // Searching
        var min = items[0];
        for (int item : items) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }

    public void reverse() {
        var last = count - 1;
        for (int i = 0; i < count / 2; i++) {
            var temp = items[i];
            items[i] = items[last];
            items[last--] = temp;
        }
    }

    public int[] insert(int[] arr) {
        var result = new ArrayList(1);
        for (int i = 0; i < arr.length; i++) {
            if (contains(i, items)) {
                if (!contains(i, result.items)) result.insert(i);
            }
        }
        return result.items;
    }

    public boolean contains(int number, int[] list) {
        for (int i : list) {
            if (i == number) return true;
        }
        return false;
    }

}
