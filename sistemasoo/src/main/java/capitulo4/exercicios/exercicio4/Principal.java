package capitulo4.exercicios.exercicio4;

public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setNome("ABC");
        livro1.setEditora("Minha Editora");
        livro1.setAnoPublicacao(2000);
        
        Livro livro2 = new Livro();
        livro2.setNome("XYZ");
        livro2.setEditora("Minha Editora");
        livro2.setAnoPublicacao(2001);
        
        livro1.imprimir();
        livro2.imprimir();
        
    }
}
