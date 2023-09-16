package capitulo6.exercicios.desafio;

public class Artista extends Funcionario{
    private float cache;

    public float getCache() {
        return cache;
    }

    public void setCache(float cache) {
        if (cache < 0){
            ArtistaException.lancarExcecaoCacheMenorQueZero();
        }
        this.cache = cache;
    }
    
    
}
