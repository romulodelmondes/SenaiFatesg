package capitulo6.exemplos.exemplo6;

public class Robo {
    private String modelo;
    private String cor;
    private int ano;
    private String nSerie;
    private boolean ligado;
    private float direcao;
    private float velocidade;
    private float nivelBateria;
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getnSerie() {
        return nSerie;
    }

    public void setnSerie(String nSerie) {
        this.nSerie = nSerie;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public float getDirecao() {
        return direcao;
    }

    public void setDirecao(float direcao) {
        this.direcao = direcao;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public float getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(float nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public void ligar() {
        ligado = true;
        velocidade = 0;
    }

    public void desligar() {
        ligado = false;
        velocidade = 0;
    }

    public void andar() {
        velocidade = 2;
    }

    public void parar() {
        velocidade = 0;
    }

    public void virar() {
        direcao = direcao + 1;
        if (direcao == 360) {
            direcao = 0;
        }
    }

    public float calcularTempoRestante() {
        float tr = nivelBateria / 20;
        return tr;
    }

    public void calcularVelocidade(int tempo, int distancia) throws ArithmeticException {
        this.velocidade = distancia / tempo;
    }

}
