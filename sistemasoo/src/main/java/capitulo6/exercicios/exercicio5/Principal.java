package capitulo6.exercicios.exercicio5;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Principal {
    public static void main(String[] args) {
        try {
            Usuario usuario = new Usuario();
            usuario.setLogin("xy@123.com");
            usuario.setSenha("123456");
            usuario.setPerfil(PerfilEnum.ADMIN);
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
