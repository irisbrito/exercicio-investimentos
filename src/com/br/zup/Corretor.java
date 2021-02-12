package com.br.zup;

public class Corretor {
    // Poupança 1.9 ao ano
    // Selic 1.4 ao ano
    // FundosImobiliarios 10.5 ao ano

    public double calcularLucro(Investimento investimento, double montante) {
        return investimento.calcularRendimentoInvestido(montante);
    }
}
