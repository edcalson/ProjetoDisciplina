package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

import java.net.FileNameMap;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        List<Financiamento> listadeFinanciamento = new ArrayList<>();


        double taxaJuros = interfaceUsuario.pedirTaxaJuros();
        int prazoFinanciamentoEmAnos = interfaceUsuario.pedirPrazoFinanciamento();
        double valorImovel = interfaceUsuario.pedirValorImovel();

        // Criando Objeto Financiamento.
        Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamentoEmAnos, taxaJuros);

    }
}
