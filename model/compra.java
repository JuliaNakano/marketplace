package model;


import java.time.LocalDateTime;

public class compra {
    private int codigo;
    private int codigoCliente;
    private LocalDateTime data_hora;
    private double valor_total;

    public compra(int codigo, LocalDateTime data_hora, int codigoCliente, double valorTotal) {
        this.codigo = codigo;
        this.codigoCliente = codigoCliente;
        this.valor_total = valorTotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getDataHora() {
        return data_hora;
    }
    public void setDataHora(LocalDateTime data_hora) {
        this.data_hora = data_hora;
    }


    public int getcodigoCliente() {
        return codigoCliente;
    }

    public void setcodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public double getValorTotal() {
        return valor_total;
    }

    public void setValorTotal(double valorTotal) {
        this.valor_total = valorTotal;
    }
}
