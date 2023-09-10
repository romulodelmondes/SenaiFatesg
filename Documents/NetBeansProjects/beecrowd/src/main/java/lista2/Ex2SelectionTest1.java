/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lista2;

/**
 *
 * @author Rômulo Delmondes <romulodelmondes@gmail.com>
 * @date 10/09/2023
 * @brief Class Ex2SelectionTest1
 */

import java.util.Scanner; //programa utiliza a classe Scanner

public class Ex2SelectionTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read four integer values A, B, C, and D
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        // Check the specified conditions
        boolean condition1 = (B > C) && (D > A);
        boolean condition2 = (C + D) > (A + B);
        boolean condition3 = (C > 0) && (D > 0);
        boolean condition4 = (A % 2 == 0);

        // Check if all conditions are met
        if (condition1 && condition2 && condition3 && condition4) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
