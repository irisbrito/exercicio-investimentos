package com.br.zup;

public class Main {

    public static void main(String[] args) {
	    Corretor corretor = new Corretor();

	    double lucro = corretor.calcularLucro(new Poupanca(),(1000));

        System.out.println(lucro);
    }
}
