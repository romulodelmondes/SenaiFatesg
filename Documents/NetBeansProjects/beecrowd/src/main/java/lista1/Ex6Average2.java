/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lista1;
// Programa de adição que exibe a soma de dois números.
import java.util.Scanner; //programa utiliza a classe Scanner

/**
 *
 * @author Rômulo Delmondes <romulodelmondes@gmail.com>
 * @date 04/09/2023
 * @brief Class Ex6Average2
 */
public class Ex6Average2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the values of grades A, B, and C
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        // Define the weights for each grade
        double weightA = 2.0;
        double weightB = 3.0;
        double weightC = 5.0;

        // Calculate the student's weighted average
        double MEDIA = (A * weightA + B * weightB + C * weightC) / (weightA + weightB + weightC);

        // Print the result in the desired format with one decimal place
        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }
}
