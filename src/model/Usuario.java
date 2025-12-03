package model;


public class Usuario {
    private int codigo;
    private String login;
    private String senha;
    private String tipo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Usuario(int codigo, String login, String senha, String tipo) {
        this.codigo = codigo;
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }

    public Usuario() {
    }
    
    
}
