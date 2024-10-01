package modelo;

public class Terreno extends Financiamento {
    public Terreno(double valorDesejadoImovel, int prazoFinaciamentoAnos, double taxaJurosAnual) {
        super(valorDesejadoImovel, prazoFinaciamentoAnos, taxaJurosAnual);
    }


    public double calcularPagamentoMensal() {
        return super.calcularPagamentoMensal();
    }
}

