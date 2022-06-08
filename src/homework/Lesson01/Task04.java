package homework.Lesson01;

public class Task04 {
    public static void main(String[] args) {
        int a = 0;
        int n = 100;

        for (int i = 1; i < n; i = i * 2) {
            a = a + i;
        }

        // Time Complexity -> 0(log n)
        // Space Complexity -> 0(1)
    }
}
