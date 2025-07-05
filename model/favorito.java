package model;

public class favorito {
    private int codigo; 
    private int cliente_codigo;
    

    public favorito(int codigo, int cliente_codigo, int produto_codigo) {
        this.codigo = codigo;
        this.cliente_codigo = cliente_codigo;
        
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCliente_codigo() {
        return cliente_codigo;
    }  
    public void setCliente_codigo(int cliente_codigo) {
        this.cliente_codigo = cliente_codigo;
    }


}
