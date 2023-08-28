package capitulo6.exercicios.exercicio7;

public class Usuario {
    private String login;
    private String senha;
    private PerfilEnum perfil;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) throws Exception {
        if (login.isBlank()){
            UsuarioException.lancarExcecaoLoginEmBranco();
        }
        if (!login.contains("@")){
            UsuarioException.lancarExcecaoLoginInvalido();
        }
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception{
        if (senha.isBlank()){
            UsuarioException.lancarExcecaoSenhaEmBranco();
        }
        if (senha.length() < 6){
            UsuarioException.lancarExcecaoLoginInvalido();
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
