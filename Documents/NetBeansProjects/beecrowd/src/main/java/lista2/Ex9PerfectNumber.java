/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lista2;

/**
 *
 * @author Rômulo Delmondes <romulodelmondes@gmail.com>
 * @date 10/09/2023
 * @brief Class Ex9PerfectNumber
 */

import java.util.Scanner; //programa utiliza a classe Scanner

public class Ex9PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt(); // Read the integer

            // Check if X is a perfect number
            boolean isPerfect = isPerfectNumber(X);

            // Print the result
            if (isPerfect) {
                System.out.printf("%d eh perfeito%n", X);
            } else {
                System.out.printf("%d nao eh perfeito%n", X);
            }
        }

        // Close the Scanner
        scanner.close();
    }

    // Function to check if a number is a perfect number
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 1; // Initialize the sum with 1 (1 is a divisor for all positive integers)

        // Find divisors and add them to the sum
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        // Check if the sum is equal to the number
        return sum == num;

    }
}
