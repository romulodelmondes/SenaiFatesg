package capitulo6.exercicios.desafio;

public class Principal {
    public static void main(String[] args) {
        ProgramaTv programa = new ProgramaTv ();
        programa.setDuracao(2);
        programa.setNome("Meu programa");
        
        Artista artista = new Artista();
        artista.setCpf("111.111.111-11");
        artista.setNome("João");
        artista.setCache(1000);
        
        Apoio apoio = new Apoio();
        apoio.setCpf("222.222.222-22");
        apoio.setNome("José");
        apoio.setEspecialidade(EspecialidadeEnum.TEC);
        
        Apresentador apresentador = new Apresentador();
        apresentador.setCpf("333.333.333-33");
        apresentador.setNome("Maria");
        apresentador.setTipo(TipoEnum.PALCO);
        
        programa.adicionarFuncionario(apoio);
        programa.adicionarFuncionario(artista);
        programa.adicionarFuncionario(apresentador);
        
        apoio.adicionarPrograma(programa);
        artista.adicionarPrograma(programa);
        apresentador.adicionarPrograma(programa);
        
        Thread t = new Thread(programa);
        t.start();
        
    }
}
