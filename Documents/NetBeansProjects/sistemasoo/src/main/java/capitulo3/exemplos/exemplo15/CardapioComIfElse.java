package capitulo3.exemplos.exemplo15;

public class CardapioComIfElse {

    public static void main(String[] args) {
        System.out.println("Entre com a opção desejada! ");
        System.out.println("1 - Pratos");
        System.out.println("2 - Bebidas");
        System.out.println("3 - Encerre sua conta");
        int opcao = new java.util.Scanner(System.in).nextInt();
        if (opcao == 1) {
            System.out.println("*Hamburguer ");
            System.out.println("*Pizza à moda da casa");
            System.out.println("*Batata recheada");
        } else {
            if (opcao == 2) {
                System.out.println("*Água");
                System.out.println("*Refrigerante");
                System.out.println("*Cerveja");
            } else {
                if (opcao == 3) {
                    System.out.println("Conta encerrada");
                } else {
                    System.out.println("Opção inválida");
                }
            }
        }
    }
}
