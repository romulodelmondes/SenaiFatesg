package capitulo3.exemplos.exemplo7;

public class CombinacaoOperadores {

    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c = 9;
        int d = 12;
        int e = 15;
        a += 1; //Equivalente a a = a + 1
        b -= 2; //Equivalente a b = b - 2
        c *= 3; //Equivalente a c = c * 3
        d /= 4; //Equivalente a d = d / 4
        e %= 5; //Equivalente a e = e % 5
        System.out.println("a:" + a + " b:" + b);
        System.out.println("c:" + c + " d:" + d + " e:" + e);
    }
}
