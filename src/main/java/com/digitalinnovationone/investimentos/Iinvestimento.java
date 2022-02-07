package com.digitalinnovationone.investimentos;

public interface Iinvestimento {
    void calcularLucro(int meses);

    double calcularDesconto(double valor, double porcentagemDesconto);
}
