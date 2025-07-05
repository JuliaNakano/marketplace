package model;

public class mercante {
    private int codigo;
    private String nome;
    private String cnpj;
    private int cliente_codigo;


    public mercante(int codigo, String nome, String cnpj, int cliente_codigo) {
        this.codigo = codigo;
        this.nome = nome;
        this.cnpj = cnpj;
        this.cliente_codigo = cliente_codigo;
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
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public int getCliente_codigo() {
        return cliente_codigo;
    }
    public void setCliente_codigo(int cliente_codigo) {
        this.cliente_codigo = cliente_codigo;
    }


}
