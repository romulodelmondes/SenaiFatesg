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
 * @brief Class Ex8Salary
 */
public class Ex8Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the employee's number, worked hours, and hourly rate
        int employeeNumber = scanner.nextInt();
        int workedHours = scanner.nextInt();
        double hourlyRate = scanner.nextDouble();

        // Calculate the employee's salary
        double salary = workedHours * hourlyRate;

        // Print the result in the desired format with two decimal places
        System.out.printf("NUMBER = %d\n", employeeNumber);
        System.out.printf("SALARY = U$ %.2f\n", salary);

        // Close the Scanner
        scanner.close();
    }
}
