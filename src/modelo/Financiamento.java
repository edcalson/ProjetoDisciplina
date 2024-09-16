package modelo;

public class Financiamento{
    // Atributos
    private double valorImovel;
    private int prazoFinaciamento;
    private double taxaJurosAnual;

    public double getValorImovel() {
        return this.valorImovel;

    }
    // Construtor
    public Financiamento(double valorDesejadoImovel, int prazoFinaciamentoAnos, double taxaJurosAnual){
        this.valorImovel = valorDesejadoImovel;
        this.prazoFinaciamento = prazoFinaciamentoAnos;
        this.taxaJurosAnual = taxaJurosAnual;
    }
    // Métodos
    public double calcularPagamentoMensal() {
        return (this.valorImovel / (this.prazoFinaciamento *12)) * (1 + this.taxaJurosAnual / 12);
    }
    public double calcularTotalPagamento() {
        return this.calcularPagamentoMensal() * this.prazoFinaciamento * 12;
    }
}