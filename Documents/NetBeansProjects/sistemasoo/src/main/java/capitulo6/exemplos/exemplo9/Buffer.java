package capitulo6.exemplos.exemplo9;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Buffer {
    private final int TAMANHO = 5;
    Queue<Integer> fila = new ArrayBlockingQueue<>(TAMANHO);
        
    public synchronized void adicionar (int valor) throws InterruptedException{
        boolean sucesso = false;
        while (!sucesso){
            try{
                fila.add(valor);
                sucesso = true;
                notifyAll();
            }catch(Exception e){
                System.out.println("Fila cheia... Aguardando consumo.");
                wait();
            }
        }
    }
    
    public synchronized int remover () throws InterruptedException{
        boolean sucesso = false;
        int valor = -1;
        while (!sucesso){
            try{
                valor = fila.poll();
                sucesso=true;
                notifyAll();
            }catch(Exception e){
                System.out.println("Fila vazia... Aguardando produção.");
                wait();
            }
        }
        return valor;
    }
}
