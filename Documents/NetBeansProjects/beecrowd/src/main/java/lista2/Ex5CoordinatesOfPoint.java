/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lista2;

/**
 *
 * @author Rômulo Delmondes <romulodelmondes@gmail.com>
 * @date 10/09/2023
 * @brief Class Ex5CoordinatesOfPoint
 */

import java.util.Scanner; //programa utiliza a classe Scanner

public class Ex5CoordinatesOfPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the coordinates of the point
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

        
    }
}
