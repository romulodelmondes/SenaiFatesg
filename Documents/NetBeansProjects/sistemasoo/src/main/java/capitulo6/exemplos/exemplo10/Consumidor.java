package capitulo6.exemplos.exemplo10;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor implements Runnable {

    private Buffer buffer;

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            consumir();
        } catch (InterruptedException ex) {
            Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void consumir() throws InterruptedException {
        while (true) {
            int numero = buffer.remover();
            System.out.println("Removendo " + numero);
            try {
                Random t = new Random();
                Thread.sleep(1000 * t.nextInt(3));
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
