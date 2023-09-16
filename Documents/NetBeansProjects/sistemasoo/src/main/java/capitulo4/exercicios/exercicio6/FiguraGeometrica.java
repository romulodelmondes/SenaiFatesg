package capitulo4.exercicios.exercicio6;

public abstract class FiguraGeometrica {
    public static final double COORDENADA_CENTRO_X = 2;
    public static final double COORDENADA_CENTRO_Y = 2;
    
    public abstract float calcularArea(); 
    
    public static double calcularDistancia(double x, double y){
        double dx = (COORDENADA_CENTRO_X - x) * (COORDENADA_CENTRO_X - x);
        double dy = (COORDENADA_CENTRO_Y - y) * (COORDENADA_CENTRO_Y - y);
        double resultado = Math.sqrt(dx + dy);
        return resultado;
    }
    
    
}
