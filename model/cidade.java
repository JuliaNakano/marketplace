package model;

public class cidade {
    
    private int codigo;
    private String nome;
    private int codigoEstado;

    public cidade(int codigo, String nome, int codigoEstado) {
        this.codigo = codigo;
        this.nome = nome;
        this.codigoEstado = codigoEstado;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdEstado() {
        return codigoEstado;
    }

    public void setIdEstado(int codigoEstado) {
        this.codigoEstado = codigoEstado;
    }
    
}
