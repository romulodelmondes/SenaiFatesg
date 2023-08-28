package capitulo6.exemplos.exemplo9;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Produtor extends Thread {

    private Buffer buffer;

    public Produtor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            produzir();
        } catch (InterruptedException ex) {
            Logger.getLogger(Produtor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void produzir() throws InterruptedException {
        while (true) {
            Random r = new Random();
            int numero = r.nextInt(100);
            System.out.println("Adicionando " + numero);
            buffer.adicionar(numero);
            try {
                Random t = new Random();
                Thread.sleep(1000 * t.nextInt(3));
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
