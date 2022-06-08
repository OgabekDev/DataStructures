package homework.Lesson02;

import ArrayList.ArrayList;

public class Task01 {
    public static void main(String[] args) {
        var arrayList = new ArrayList(10);

        arrayList.insert(1);
        // Time Complexity -> 0(n)
        // Space Complexity -> 0(n)

        arrayList.insertAt(1, 10);
        // Time Complexity -> 0(n)
        // Space Complexity -> 0(n)

        arrayList.indexOf(10);
        // Time Complexity -> 0(n)
        // Space Complexity -> null

        arrayList.removeAt(2);
        // Time Complexity -> 0(n)
        // Space Complexity -> 0(n)

    }
}
