package capitulo4.exemplos.exemplo1;

public class Robo {

    String modelo;
    String cor;
    int ano;
    String nSerie;
    boolean ligado;
    float direcao;
    float velocidade;
    float nivelBateria;

    void ligar() {
        ligado = true;
        velocidade = 0;
    }

    void desligar() {
        ligado = false;
        velocidade = 0;
    }

    void andar() {
        velocidade = 2;
    }

    void parar() {
        velocidade = 0;
    }

    void virar() {
        direcao = direcao + 1;
        if (direcao == 360) {
            direcao = 0;
        }
    }

    float calcularTempoRestante() {
        float tr = nivelBateria / 20;
        return tr;
    }
}
