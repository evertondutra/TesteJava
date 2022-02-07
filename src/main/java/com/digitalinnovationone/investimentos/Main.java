package com.digitalinnovationone.investimentos;

public class Main {

    public static void main(String[] args) {
        Investimento investimentoComIR = new InvestimentoComIR();
        Investimento investimentoSemIR = new InvestimentoSemIR();


        investimentoComIR.setValorInicial(4000);
        investimentoComIR.setJurosMensais(0.012);

        investimentoComIR.calcularLucro(17);

        investimentoSemIR.setValorInicial(999);
        investimentoSemIR.setJurosMensais(0.007);

        investimentoSemIR.calcularLucro(10);



    }
}
