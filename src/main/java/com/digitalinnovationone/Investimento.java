package com.digitalinnovationone;

public class Investimento {
    public Investimento() {
    }

    double valorInicial = 1000;
    double jurosMensais = 0.04;

    public Investimento(double valorInicial, double jurosMensais) {
        this.valorInicial = valorInicial;
        this.jurosMensais = jurosMensais;
    }

    public double calcularLucro(int meses){
        return (valorInicial * (Math.pow((1 + jurosMensais), meses)))- valorInicial;
    }

}
