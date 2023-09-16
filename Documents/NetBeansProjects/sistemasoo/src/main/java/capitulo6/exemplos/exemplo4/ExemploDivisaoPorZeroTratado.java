package capitulo6.exemplos.exemplo4;

public class ExemploDivisaoPorZeroTratado {

    public static void main(String[] args) {
        int x = 3;
        int y = 0;
        double res = Double.NaN;
        try {
            res = x / y;
        } catch (ArithmeticException e) {
            res = Double.NaN;
        } finally {
            System.out.println("Resultado: " + res);
        }
    }
}
