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
 * @brief Class Ex5Average1
 */
public class Ex5Average1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the values of grades A and B
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        // Define the weights for each grade
        double weightA = 3.5;
        double weightB = 7.5;

        // Calculate the student's average
        double MEDIA = (A * weightA + B * weightB) / (weightA + weightB);

        // Print the result in the desired format with 5 digits after the decimal point
        System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
}
