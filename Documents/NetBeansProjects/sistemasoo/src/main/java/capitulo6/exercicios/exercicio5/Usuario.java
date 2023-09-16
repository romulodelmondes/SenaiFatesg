package capitulo6.exercicios.exercicio5;

public class Usuario {
    private String login;
    private String senha;
    private PerfilEnum perfil;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) throws Exception {
        if (login.isBlank()){
            Exception e = new Exception("Login em branco");
            throw e;
        }
        if (!login.contains("@")){
            Exception e = new Exception("Login inválido");
            throw e;
        }
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception{
        if (senha.isBlank()){
            Exception e = new Exception("Senha em branco");
            throw e;
        }
        if (senha.length() < 6){
            Exception e = new Exception("Senha com menos de 6 caracteres");
            throw e;
        }
        this.senha = senha;
    }

    public PerfilEnum getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilEnum perfil) {
        this.perfil = perfil;
    }
    
    
}
