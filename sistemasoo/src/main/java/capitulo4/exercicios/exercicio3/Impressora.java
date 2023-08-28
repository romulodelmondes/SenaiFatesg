package capitulo4.exercicios.exercicio3;

public class Impressora {
    private String modo;
    private float quantidadeML;

    public Impressora (String modo, float quantidadeML){
        setModo(modo);
        setQuantidadeML(quantidadeML);
    } 
    
    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public float getQuantidadeML() {
        return quantidadeML;
    }

    public void setQuantidadeML(float quantidadeML) {
        if (quantidadeML >=0 && quantidadeML <=100){
            this.quantidadeML = quantidadeML;
        }
    }
    
    public float calcularAutonomia(){
        float total;
        if (modo.equals("Econômico")){
            total = 300;
        }
        else{
            if (modo.equals("Normal")){
                total = 150;
            }
            else{
                total = 70;
            }
        }
        return (total * quantidadeML) / 100;
        
    }
}
