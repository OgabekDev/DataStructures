package homework.Lesson01;

public class Task02 {
    public static void main(String[] args) {
        int a = 0, b = 0;
        int n = 100;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a = a + j;
            }
        }

        for (int k = 0; k < n; k++) {
            b = b + k;
        }

        // Time Complexity -> 0(n^2)
        // Space Complexity -> 0(n)
    }
}
