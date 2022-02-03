package com.digitalinnovationone.investimentos;

public class InvestimentoSemIR extends Investimento{
    public InvestimentoSemIR() {
    }

    @Override
    public void calcularLucro(int meses) {
        if (valorInicial< 1000){
            System.out.println("O valor Inicial não pode ser menor que R$1000");
            System.out.println(0);
        }else{
            super.calcularLucro(meses);
        }
    }
}
