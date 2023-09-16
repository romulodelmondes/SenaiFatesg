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
 * @brief Class Ex7Difference
 */
public class Ex7Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the values of A, B, C, and D
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        // Calculate the difference of products
        int DIFERENCA = (A * B) - (C * D);

        // Print the result in the desired format
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
