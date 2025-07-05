package model;
import java.time.LocalDateTime;


//ARRUMAR O FORMATO DE VALOR TOTAL NO BANCOD E DADOS PARA DOUBLE

public class itemCompra {
    
    private int codigo;
    private int compra_codigo;
    private int Produto_codigo;
    private int quantcodigoade;
    private double  valor_total;
    private LocalDateTime data_hora;

    public itemCompra(int codigo, int compra_codigo, int produto_codigo, int quantcodigoade, double valor_total, LocalDateTime data_hora) {
        this.codigo = codigo;
        this.compra_codigo = compra_codigo;
        this.Produto_codigo = produto_codigo;
        this.quantcodigoade = quantcodigoade;
        this.valor_total = valor_total;
        this.data_hora = data_hora;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCompraCodigo() {
        return compra_codigo;
    }

    public void setCompraCodigo(int compra_codigo) {
        this.compra_codigo = compra_codigo;
    }
    public int getProdutoCodigo() {
        return Produto_codigo;
    }
    public void setProdutoCodigo(int produto_codigo) {
        this.Produto_codigo = produto_codigo;
    }
    public int getQuantcodigoade() {
        return quantcodigoade;
    }
    public void setQuantcodigoade(int quantcodigoade) {
        this.quantcodigoade = quantcodigoade;
        }
    public double getValorTotal() {
        return valor_total; 
        }
    public void setValorTotal(double valor_total) {
        this.valor_total = valor_total; 
        }
    public LocalDateTime getDataHora() {
        return data_hora;   
        }
    public void setDataHora(LocalDateTime data_hora) {
        this.data_hora = data_hora; 
        }
        



  
    
}