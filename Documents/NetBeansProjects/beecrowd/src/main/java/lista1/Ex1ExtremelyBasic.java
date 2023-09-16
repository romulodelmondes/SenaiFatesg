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
 * @brief Class Ex1ExtremelyBasic
 */
public class Ex1ExtremelyBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia os valores de A e B
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Calcule a soma e armazene em X
        int X = A + B;

        // Imprima o resultado no formato desejado
        System.out.println("X = " + X);
    }
}
