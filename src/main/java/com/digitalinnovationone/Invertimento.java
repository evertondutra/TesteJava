package com.digitalinnovationone;

public class Invertimento {

    double valorInicial;
    double jurosMensais;

    public Invertimento(double valorInicial, double jurosMensais) {
        this.valorInicial = valorInicial;
        this.jurosMensais = jurosMensais;
    }

    public double calcularLucro(int meses){
        return (valorInicial *(1 + jurosMensais)- valorInicial);
    }

}
