package com.digitalinnovationone.investimentos;

public abstract class Investimento implements Iinvestimento{
    public Investimento() {
    }


    protected double valorInicial ;

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public void setJurosMensais(double jurosMensais) {
        this.jurosMensais = jurosMensais;
    }

    protected double jurosMensais ;


    public double getValorInicial() {
        return valorInicial;
    }

    public double getJurosMensais() {
        return jurosMensais;
    }

    @Override
    public void calcularLucro(int meses) {
        System.out.println(String.format("%.2f", (valorInicial * (Math.pow((1 + jurosMensais), meses)))- valorInicial));

    }

    @Override
    public double calcularDesconto(double valor, double porcentagemDesconto) {
        double total = valor / 100 * porcentagemDesconto;
        return total;
    }


//    public double calcularLucro(int meses){
//        return (valorInicial * (Math.pow((1 + jurosMensais), meses)))- valorInicial;
//    }
//
//    public double calcularDesconto(double valor, double porcentagemDesconto){
//        double total = valor / 100 * porcentagemDesconto;
//        return total;
//    }

}
