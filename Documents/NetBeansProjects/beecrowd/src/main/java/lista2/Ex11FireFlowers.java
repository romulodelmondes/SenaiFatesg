/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lista2;

/**
 *
 * @author Rômulo Delmondes <romulodelmondes@gmail.com>
 * @date 10/09/2023
 * @brief Class Ex11FireFlowers
 */

import java.util.Scanner; //programa utiliza a classe Scanner

public class Ex11FireFlowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int R1 = scanner.nextInt();
            int X1 = scanner.nextInt();
            int Y1 = scanner.nextInt();
            int R2 = scanner.nextInt();
            int X2 = scanner.nextInt();
            int Y2 = scanner.nextInt();

            // Calculate the distance between the centers of the two circles
            double distance = Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));

            // Check if the hunter's circle completely covers the flower's circle
            if (distance + R2 <= R1) {
                System.out.println("RICO");
            } else {
                System.out.println("MORTO");
            }
        }
    }
}
