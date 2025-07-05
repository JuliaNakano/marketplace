package model;

public class rua {
    private int codigo;
    private String nomeRua;
    private String cep;
    private int bairro_codigo;
    


    public rua(int codigo, String nomeRua, String cep, int bairro_codigo) {
        this.codigo = codigo;
        this.nomeRua = nomeRua;
        this.cep = cep;
        this.bairro_codigo = bairro_codigo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNomeRua() {
        return nomeRua;
    }
    
    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public int getBairro_codigo() {
        return bairro_codigo;
    }
    public void setBairro_codigo(int bairro_codigo) {
        this.bairro_codigo = bairro_codigo;
    }
    
}
