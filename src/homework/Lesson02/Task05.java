package homework.Lesson02;

import ArrayList.ArrayList;

import java.util.Arrays;

public class Task05 {
    public static void main(String[] args) {
        var arrayList = new ArrayList(10);
        arrayList.insert(1);
        arrayList.insert(2);
        arrayList.insert(30);
        arrayList.insert(-4);
        arrayList.insert(5);
        arrayList.insert(5);

        var arr = new int[3];
        arr[0] = 1;
        arr[1] = -4;
        arr[2] = 2;
        System.out.println("arrayList.insert(arr) = " + Arrays.toString(arrayList.insert(arr)));
    }
}
