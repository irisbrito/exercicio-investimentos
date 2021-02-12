package com.br.zup;

public class Poupanca implements Investimento{
    private double rendimento = 1.9;
    public int montante;

    public Poupanca() {

    }

    public double getRendimento() {
        return rendimento;
    }

    @Override
    public double calcularRendimentoInvestido(double valorAInvestir) {
        double resultado = valorAInvestir * rendimento/100;
        return resultado;
    }
}
