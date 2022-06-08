package homework.Lesson01;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Enter number to check prime: ");
        var number = scanner.nextInt();

        if (number >= 2) {
            var isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.printf("Your %d number is Prime number", number);
            } else {
                System.out.printf("Your %d number is not Prime number", number);
            }
        } else {
            System.out.println("The prime numbers must be start from 2");
        }

        // Time Complexity -> 0(n)
        // Space Complexity -> 0(1)
    }
}
