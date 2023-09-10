/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lista2;

/**
 *
 * @author Rômulo Delmondes <romulodelmondes@gmail.com>
 * @date 10/09/2023
 * @brief Class Ex14Rails
 */

import java.util.Scanner;
import java.util.Stack;

public class Ex14Rails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            }

            int[] desiredOrder = new int[n];
            while (true) {
                Stack<Integer> station = new Stack<>();
                int coachToPush = 1;
                boolean valid = true;

                for (int i = 0; i < n; i++) {
                    desiredOrder[i] = scanner.nextInt();

                    if (desiredOrder[i] == 0) {
                        valid = false;
                        break;
                    }

                    while (coachToPush <= n && (station.isEmpty() || station.peek() != desiredOrder[i])) {
                        station.push(coachToPush);
                        coachToPush++;
                    }

                    if (!station.isEmpty() && station.peek() == desiredOrder[i]) {
                        station.pop();
                    } else {
                        valid = false;
                    }
                }

                if (valid) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

                if (scanner.hasNextInt()) {
                    n = scanner.nextInt();
                } else {
                    break;
                }
            }

            System.out.println();
        }
    }
}
