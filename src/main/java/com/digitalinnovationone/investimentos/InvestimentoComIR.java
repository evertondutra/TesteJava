package com.digitalinnovationone.investimentos;

public class InvestimentoComIR extends Investimento{
    public InvestimentoComIR() {
    }

    @Override
    public void calcularLucro(int meses) {
        double desconto;
        if (meses < 6){
            desconto = 22.5;
        }else if (meses >= 6 && meses < 12){
            desconto = 20;
        }else if (meses >= 12 && meses < 24){
            desconto = 17.5;
        }else{
            desconto = 15;
        }
        double totalBruto = (valorInicial * (Math.pow((1 + jurosMensais), meses)))- valorInicial;
        System.out.println(String.format("%.2f ",   totalBruto - calcularDesconto(totalBruto, desconto)));
    }
}
