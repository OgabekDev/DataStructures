package Others;

public class Fibonacci {
    public static void main(String[] args) {
        // 1, 1, 2, 3, 5, 8, 13 ...
        System.out.println(fibonacciFirst(3));
    }

    // Time Complexity O(n)
    // Space Complexity O(1)
    public static int fibonacciFirst(int n) {
        int x = 1, y = 1, z = 1;
        if (n == 1 || n == 2) return z;
        for (int i = 2; i < n; i++) {
            z = x + y;
            x = y;
            y = z;
        }
        return z;
    }


    // Time Complexity O(n)
    // Space Complexity O(1)

    public static int fibonacciSecond(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n - 1];

    }


    // Time Complexity O(2^n)
    // Space Complexity

    public static int fibonacciThird(int n) {
        if (n <= 1) return 1;
        return fibonacciThird(n-1) + fibonacciThird(n-2);
    }

}
