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
 * @brief Class Ex2AreaCircle
 */
public class Ex2AreaCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia o valor do raio (variável R)
        double R = scanner.nextDouble();

        // Calcule a área da circunferência
        double pi = 3.14159;
        double A = pi * R * R;

        // Imprima o resultado no formato desejado com quatro casas decimais
        System.out.printf("A=%.4f\n", A);
    }
}
