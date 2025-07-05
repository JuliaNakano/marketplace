package model;

public class endereco { 
    private String numero_casa;
    private int rua_codigo;
    private int cliente_codigo;

    public endereco(String numero_casa, int rua_codigo, int cliente_codigo) {
        this.numero_casa = numero_casa;
        this.rua_codigo = rua_codigo;
        this.cliente_codigo = cliente_codigo;
    }
    
    public String getNumero_casa() {
        return numero_casa;
    }
    public void setNumero_casa(String numero_casa) {
        this.numero_casa = numero_casa;
    }
    public int getRua_codigo() {
        return rua_codigo;
    }
    public void setRua_codigo(int rua_codigo) {
        this.rua_codigo = rua_codigo;
    }
    public int getCliente_codigo() {
        return cliente_codigo;
    }
    public void setCliente_codigo(int cliente_codigo) {
        this.cliente_codigo = cliente_codigo;
    }
    
    
}
