package homework.Lesson01;

public class Task01 {
    public static void main(String[] args) {
         int a = 0, b = 0;
         int n = 100;
        for (int i = 0; i < n; i++) {
            a = a + i;
        }
        for (int j = 0; j < n; j++) {
            b = b + j;
        }

        // Time Complexity -> 0(n)
        // Space Complexity -> 0(1)

    }
}
