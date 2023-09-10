/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lista2;

/**
 *
 * @author Rômulo Delmondes <romulodelmondes@gmail.com>
 * @date 10/09/2023
 * @brief Class Ex13Encryption
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13Encryption {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = reader.readLine();
            if (line == null || line.isEmpty()) {
                break;
            }

            int n = Integer.parseInt(line);
            StringBuilder encryptedMessage = new StringBuilder();

            for (int i = 0; i < n; i++) {
                String message = reader.readLine();
                encryptedMessage.append(encrypt(message)).append("\n");
            }

            System.out.print(encryptedMessage);
        }
    }

    public static String encrypt(String message) {
        StringBuilder result = new StringBuilder();

        for (int i = message.length() - 1; i >= 0; i--) {
            char c = message.charAt(i);

            if (Character.isLetter(c)) {
                c = (char) (c + 3);

                if ((Character.isLowerCase(message.charAt(i)) && c > 'z') ||
                        (Character.isUpperCase(message.charAt(i)) && c > 'Z')) {
                    c = (char) (c - 26);
                }
            } else if (c == '@') {
                c = ' ';
            }

            result.append(c);
        }

        return result.toString();
    }
}
