package homework.Lesson01;

public class Task05 {
    public static void main(String[] args) {
        int a = 0;
        int n = 100;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j = j * 2) {
                a = a + j;
            }
        }

        // Time Complexity -> 0(n)
        // Space Complexity -> 0(1)
    }
}
