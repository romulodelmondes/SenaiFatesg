/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lista2;

/**
 *
 * @author Rômulo Delmondes <romulodelmondes@gmail.com>
 * @date 10/09/2023
 * @brief Class Ex8DivisorsI
 */

import java.util.Scanner; //programa utiliza a classe Scanner

public class Ex8DivisorsI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer value N
        int N = scanner.nextInt();

        // Calculate and print the divisors of N
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
            }
        }
    }
}
