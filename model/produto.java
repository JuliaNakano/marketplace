package model;

public class produto {
    private int codigo;
    private String nome;
    private double valor_unitario;
    private int quantidade;
    private String descricao;
    private int categoria_codigo;
    private int mercante_codigo;

    public produto(int codigo, String nome, double valor_unitario, int quantidade, String descricao, int categoria_codigo, int mercante_codigo) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor_unitario = valor_unitario;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.categoria_codigo = categoria_codigo;
        this.mercante_codigo = mercante_codigo;
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
    public double getValor_unitario() {
        return valor_unitario;
        
    }
    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCategoria_codigo() {
        return categoria_codigo;
    }
    
    public void setCategoria_codigo(int categoria_codigo) {
        this.categoria_codigo = categoria_codigo;
    }
    public int getMercante_codigo() {
        return mercante_codigo;
    }
    public void setMercante_codigo(int mercante_codigo) {
        this.mercante_codigo = mercante_codigo;
    }
    
}
