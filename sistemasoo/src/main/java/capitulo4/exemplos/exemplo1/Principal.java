package capitulo4.exemplos.exemplo1;

public class Principal {

    public static void main(String[] args) {
        Robo robo1;
        robo1 = new Robo();
        Robo robo2 = new Robo();
        robo1.modelo = "T100";
        robo1.cor = "Branco";
        robo1.ano = 2018;
        robo1.nSerie = "XYZ123";
        robo2.modelo = "T200";
        robo2.cor = "Preto";
        robo2.ano = 2015;
        robo2.nSerie = "ABC321";
        robo1.ano = 2006;
        robo2.cor = "Vermelho";
        System.out.println("Ano do Robô 1: " + robo1.ano);
        System.out.println("Cor do Robô 2: " + robo2.cor);
        robo1.ligar();
        robo1.andar();
        robo1.virar();
        robo1.parar();
        robo1.desligar();
        robo2.ligar();
        robo2.andar();
        robo2.virar();
        robo2.parar();
        robo2.desligar();
        robo1.nivelBateria=80;
        System.out.println("Tempo restante de bateria (estimado): " + robo1.calcularTempoRestante());
    }
}
