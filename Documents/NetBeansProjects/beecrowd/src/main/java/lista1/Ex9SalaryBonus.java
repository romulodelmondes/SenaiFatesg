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
 * @brief Class Ex9SalaryBonus
 */
public class Ex9SalaryBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the seller's name, fixed salary, and total sales
        String sellerName = scanner.nextLine();
        double fixedSalary = scanner.nextDouble();
        double totalSales = scanner.nextDouble();

        // Calculate the seller's total salary including the 15% commission
        double totalSalary = fixedSalary + (totalSales * 0.15);

        // Print the result in the desired format with two decimal places
        System.out.printf("TOTAL = R$ %.2f\n", totalSalary);

        // Close the Scanner
        scanner.close();
    }
}
