package capitulo6.exemplos.exemplo9;

public class Principal {

    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Produtor produtor = new Produtor(buffer);
        Consumidor consumidor = new Consumidor(buffer);
        produtor.start();
        consumidor.start();
    }
}
