package capitulo4.exercicios.exercicio2;

public class Principal {
    public static void main(String[] args) {
        Revista revista = new Revista();
        
        revista.setNome("Diário Global");
        revista.setPaginaAtual(1);
        revista.setTotalPaginas(42);
        
        for (int i=1; i<30; i++){
            revista.avancarPagina();
        }
            
        System.out.println("Página atual: " + revista.getPaginaAtual());
    }
}
