package capitulo6.exemplos.exemplo10;

public class Principal {

    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Produtor produtor = new Produtor(buffer);
        Consumidor consumidor = new Consumidor(buffer);
        Thread t1 = new Thread (produtor);
        t1.start();
        Thread t2 = new Thread (consumidor);
        t2.start();
    }
}
