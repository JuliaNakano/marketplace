package model;

public class carrinho {
    
    private int codigo;
    private int codigoCliente;
    private double valorTotal;

    public carrinho(int codigo, int codigoCliente, double valorTotal) {
        this.codigo = codigo;
        this.codigoCliente = codigoCliente;
        this.valorTotal = valorTotal;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getcodigoCliente() {
        return codigoCliente;
    }

    public void setcodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
