package entidade;

import java.time.LocalDate;

public class Venda {
    
    private LocalDate data;

    private double valorTotal;

    private Cliente c1;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getC1() {
        return c1;
    }

    public void setC1(Cliente c1) {
        this.c1 = c1;
    }

}
