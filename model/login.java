package model;

public class login {
    
    private int codigo;
    private String senha;
    private int cliente_codigo;

    public login(int codigo, String senha, int cliente_codigo) {
        this.codigo = codigo;

        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public int getCliente_codigo() {
        return cliente_codigo;
    }
    public void setCliente_codigo(int cliente_codigo) {
        this.cliente_codigo = cliente_codigo;
    }
    
    
}
