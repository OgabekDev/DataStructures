package homework.Lesson06;

import java.util.HashMap;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        var input = scanner.next();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char i: input.toCharArray()) {
            if (map.get(i) > 1) {
                System.out.println(i);
                break;
            } else map.put(i, 1);
        }
    }
}
