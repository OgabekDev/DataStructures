package homework.Lesson02;

import ArrayList.ArrayList;

public class Task03 {
    public static void main(String[] args) {
        var arrayList = new ArrayList(10);
        arrayList.insert(1);
        arrayList.insert(2);
        arrayList.insert(30);
        arrayList.insert(-4);
        arrayList.insert(5);

        System.out.println("arrayList.min() = " + arrayList.min());
        // Time Complexity -> 0(n)

    }
}
