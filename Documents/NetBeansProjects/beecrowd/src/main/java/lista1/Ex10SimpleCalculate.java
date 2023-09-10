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
 * @brief Class Ex10SimpleCalculate
 */
public class Ex10SimpleCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the data for product 1
        int productCode1 = scanner.nextInt();
        int units1 = scanner.nextInt();
        double price1 = scanner.nextDouble();

        // Read the data for product 2
        int productCode2 = scanner.nextInt();
        int units2 = scanner.nextInt();
        double price2 = scanner.nextDouble();

        // Calculate the total amount to be paid
        double totalAmount = (units1 * price1) + (units2 * price2);

        // Print the result in the desired format with 2 decimal places
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalAmount);

        // Close the Scanner
        scanner.close();
    }
}
