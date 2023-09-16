/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lista2;

/**
 *
 * @author Rômulo Delmondes <romulodelmondes@gmail.com>
 * @date 10/09/2023
 * @brief Class Ex1TimeConversion
 */

import java.util.Scanner;

public class Ex1TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the duration in seconds
        int durationInSeconds = scanner.nextInt();

        // Calculate hours, minutes, and seconds
        int hours = durationInSeconds / 3600;
        int minutes = (durationInSeconds % 3600) / 60;
        int seconds = durationInSeconds % 60;

        // Print the result in the desired format
        System.out.printf("%d:%d:%d%n", hours, minutes, seconds);
    }
}
