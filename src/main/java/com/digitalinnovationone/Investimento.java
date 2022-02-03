package com.digitalinnovationone;

public class Investimento {
    public Investimento() {
    }


    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public double getJurosMensais() {
        return jurosMensais;
    }

    public void setJurosMensais(double jurosMensais) {
        this.jurosMensais = jurosMensais;
    }

    double valorInicial ;
    double jurosMensais ;

    public Investimento(double valorInicial, double jurosMensais) {
        this.valorInicial = valorInicial;
        this.jurosMensais = jurosMensais;
    }

    public double calcularLucro(int meses){
        return (valorInicial * (Math.pow((1 + jurosMensais), meses)))- valorInicial;
    }

}
