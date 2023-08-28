package capitulo3.exemplos.exemplo6;

public class OperadorIncrementoDecremento {

    public static void main(String[] args) {
        int a = 30;
        int b = 30;
        System.out.println(a + " " + (a++) + " " + a);
        System.out.println(b + " " + (++b) + " " + b);
    }
}
