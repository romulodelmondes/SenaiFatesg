package capitulo6.exemplos.exemplo7;

public class Principal {

    public static void main(String[] args) {
        Jogador j = new Jogador();
        try {
            j.setIdade(7);
        } catch (JogadorException ex) {
            System.out.println(ex);
        }
    }
}
