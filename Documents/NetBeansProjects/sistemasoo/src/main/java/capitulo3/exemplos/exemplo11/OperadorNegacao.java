package capitulo3.exemplos.exemplo11;

public class OperadorNegacao {

    public static void main(String[] args) {
        boolean x = true;
        if (!x) { // Equivalente a x == false
            System.out.println("X é falso");
        } else {
            System.out.println("X é verdadeiro");
        }
        if (x) { // Equivalente a x == true
            System.out.println("X é verdadeiro");
        } else {
            System.out.println("X é falso");
        }
    }
}
