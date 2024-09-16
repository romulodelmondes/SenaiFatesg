/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex2.entities;

/**
 *
 * @author Rômulo Delmondes <romulodelmondes@gmail.com>
 * @date 16/09/2024
 * @brief Class NumeroSecreto
 */
public class NumeroSecreto {
    private long numeroAleatorio;

    //public static long aleatorio = 0;
    //public static long arredonda = 0;
    
    public NumeroSecreto() {
        this.numeroAleatorio = -1;
    }

    public void sortear() {
        
        //aleatorio = (long) (Math.random() * 100);
        //arredonda = Math.round(aleatorio);
        this.numeroAleatorio = (Math.round(Math.random() * 100));
    }

    public int adivinhar(long palpite) {
        int retorno;
        if (this.numeroAleatorio == -1) {
            retorno = -2;
        } else if (this.numeroAleatorio > palpite) {
            retorno = -1;
        } else if (this.numeroAleatorio == palpite) {
            retorno = 0;
        } else {
            retorno = 1;
        }

        return retorno;

    }
}
