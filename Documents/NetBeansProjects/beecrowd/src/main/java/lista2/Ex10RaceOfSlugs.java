/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lista2;

/**
 *
 * @author Rômulo Delmondes <romulodelmondes@gmail.com>
 * @date 10/09/2023
 * @brief Class Ex10RaceOfSlugs
 */

import java.util.Scanner; //programa utiliza a classe Scanner

public class Ex10RaceOfSlugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int L = scanner.nextInt(); // Number of slugs in the group

            int maxSpeed = 0; // Initialize max speed to 0

            for (int i = 0; i < L; i++) {
                int Vi = scanner.nextInt(); // Speed of the slug

                // Update max speed if necessary
                if (Vi > maxSpeed) {
                    maxSpeed = Vi;
                }
            }

            // Determine the level based on max speed and print it
            int level;
            if (maxSpeed < 10) {
                level = 1;
            } else if (maxSpeed >= 10 && maxSpeed < 20) {
                level = 2;
            } else {
                level = 3;
            }

            System.out.println(level);
        }
    }
}
