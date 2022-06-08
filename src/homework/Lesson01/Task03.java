package homework.Lesson01;

public class Task03 {
    public static void main(String[] args) {
        int a = 0;
        int n = 100;

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                a = a + i + j;
            }
        }

        // Time Complexity -> 0(n^2)
        // Space Complexity -> 0(1)
    }
}
