package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        double taxaJuros = interfaceUsuario.pedirTaxaJuros();
        int prazoFinanciamentoEmAnos = interfaceUsuario.pedirPrazoFinanciamento();
        double valorImovel = interfaceUsuario.pedirValorImovel();

        // Criando Objeto Financiamento.
        Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamentoEmAnos, taxaJuros);
        
    }
}
