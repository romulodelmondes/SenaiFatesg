package capitulo6.exercicios.exercicio6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
    public static void main(String[] args) {
        try {
            Material material = new Material();
            material.setNome("Plástico");
            material.setPeso(-10);
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
