package capitulo6.exemplos.exemplo8;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Militar militar = new Militar();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o nome do militar: ");
        militar.setNome(teclado.nextLine());
        boolean ok = false;
        while (!ok) {
            try {
                System.out.println("Entre com a Força Armada do militar (MB, EB ou FAB): ");
                String forca = teclado.nextLine();
                militar.setForca(ForcaArmadaEnum.valueOf(forca));
                ok = true;
            } catch (java.lang.IllegalArgumentException e) {
                System.out.println("Entre com um valor correto para a Força Armada!");
            }

        }
        System.out.println("Dados do militar:");
        System.out.println(militar.getNome());
        System.out.println(militar.getForca());
    }
}
