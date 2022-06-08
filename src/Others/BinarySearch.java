package Others;

public class BinarySearch {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 10, 40};
        int number = 10;

        // Binary Search - O(log n)
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int middle = left + (right - left) / 2;

            if (numbers[middle] == number) {
                System.out.println(middle);
            }

            if (numbers[middle] < number) {
                left = middle + 1;  // If number is greater, ignore left half
            } else {
                right = middle - 1; // If number is smaller, ignore right half
            }
        }

        // Linear Search - O(n)
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] == number) {
                System.out.println(numbers[i]);
            }
        }

    }
}
