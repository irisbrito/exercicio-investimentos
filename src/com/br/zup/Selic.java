package com.br.zup;

public class Selic implements Investimento {
    private double selicRendimento = 1.4;
    private double imposto = 0.2;

    public Selic(){

    }

    public double getSelicRendimento() {
        return selicRendimento;
    }

    @Override
    public double calcularRendimentoInvestido(double valorAInvestir) {
        double resultado = valorAInvestir * selicRendimento;
        double imposto = resultado * this.imposto/100;
        return resultado - imposto;
    }
}
