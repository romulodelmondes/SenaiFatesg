package capitulo3.exercicios.exercicio9;

public class Ex09 {
    public static void main(String[] args) {
        int lado1, lado2, lado3;
        
        System.out.println("Entre com o tamanho do primeiro lado: ");
        lado1 =  new java.util.Scanner(System.in).nextInt();
        
        System.out.println("Entre com o tamanho do segundo lado: ");
        lado2 =  new java.util.Scanner(System.in).nextInt();
        
        System.out.println("Entre com o tamanho do terceiro lado: ");
        lado3 =  new java.util.Scanner(System.in).nextInt();
        
        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("Triangulo equilátero! ");
        }else{
            if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
                System.out.println("Triangulo escaleno! ");
            }else{
                System.out.println("Triangulo isósceles! ");
            }
        }
    }
}
