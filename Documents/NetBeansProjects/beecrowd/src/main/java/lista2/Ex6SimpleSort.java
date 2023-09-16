/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lista2;

/**
 *
 * @author Rômulo Delmondes <romulodelmondes@gmail.com>
 * @date 10/09/2023
 * @brief Class Ex6SimpleSort
 */

import java.util.Scanner; //programa utiliza a classe Scanner

public class Ex6SimpleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three integers
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Sort the integers in ascending order
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        // Print the sorted integers followed by a blank line
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();

        // Print the original order of the integers
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
