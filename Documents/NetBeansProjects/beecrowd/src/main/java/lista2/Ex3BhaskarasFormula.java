/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lista2;

/**
 *
 * @author Rômulo Delmondes <romulodelmondes@gmail.com>
 * @date 10/09/2023
 * @brief Class Ex3BhaskarasFormula
 */

import java.util.Scanner; //programa utiliza a classe Scanner

public class Ex3BhaskarasFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the coefficients A, B, and C
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        // Calculate the discriminant
        double discriminant = B * B - 4 * A * C;

        // Check if it's impossible to calculate
        if (A == 0 || discriminant < 0) {
            System.out.println("Impossivel calcular");
        } else {
            // Calculate the roots
            double root1 = (-B + Math.sqrt(discriminant)) / (2 * A);
            double root2 = (-B - Math.sqrt(discriminant)) / (2 * A);

            // Print the roots with 5 decimal places
            System.out.printf("R1 = %.5f%n", root1);
            System.out.printf("R2 = %.5f%n", root2);
        }
    }
}
