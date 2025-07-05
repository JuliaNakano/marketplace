package model;

public class bairro {
    
    private int codigo;
    private String nome;
    private int codigoCcodigoade;

    public bairro(int codigo, String nome, int codigoCcodigoade) {
        this.codigo = codigo;
        this.nome = nome;
        this.codigoCcodigoade = codigoCcodigoade;
    }
//troque todos os codigo por codigo

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

    public int getcodigoCcodigoade() {
        return codigoCcodigoade;
    }

    public void setcodigoCcodigoade(int codigoCcodigoade) {
        this.codigoCcodigoade = codigoCcodigoade;
    }


}
