package modelo;

public class Casa extends Financiamento {
    public Casa(double valorDesejadoImovel, int prazoFinaciamentoAnos, double taxaJurosAnual) {
        super(valorDesejadoImovel, prazoFinaciamentoAnos, taxaJurosAnual);
    }

    public double calcularPagamentoMensal() {
        return super.calcularPagamentoMensal() + 80;
    }
}

