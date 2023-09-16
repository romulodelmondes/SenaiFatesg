package capitulo3.exemplos.exemplo16;

public class CardapioComSwitchCase {

    public static void main(String[] args) {
        System.out.println("Entre com a opção desejada! ");
        System.out.println("1 - Pratos");
        System.out.println("2 - Bebidas");
        System.out.println("3 - Encerre sua conta");
        int opcao = new java.util.Scanner(System.in).nextInt();
        switch (opcao) {
            case 1: {
                System.out.println("*Hamburguer artesanal");
                System.out.println("*Pizza à moda da casa");
                System.out.println("*Batata recheada");
                break;
            }
            case 2: {
                System.out.println("*Água");
                System.out.println("*Refrigerante");
                System.out.println("*Cerveja");
                break;
            }
            case 3: {
                System.out.println("Conta encerrada");
                break;
            }
            default: {
                System.out.println("Opção inválida");
            }
        }
    }
}
