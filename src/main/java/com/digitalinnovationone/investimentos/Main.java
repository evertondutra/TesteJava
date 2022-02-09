package com.digitalinnovationone.investimentos;

public class Main {

    /**
     *     Investimentos
     *     Escreva uma classe pai chamada Investimento com os
     *     atributos valorInicial e jurosMensais, passados no construtor e uma
     *     função: calcularLucro(int meses).
     *     A função calcularLucro deve ser calculada pela seguinte fórmula de juros compostos:
     *     Exemplo:
     *     Se um investimento possui valorInicial = R$1.000,00 , jurosMensais = 4% , o retorno em 2 meses
     *     será de:
     *     Crie duas classes herdando a classe Investimento: InvestimentoComIR e InvestimentoSemIR.
     * • A função calcularLucro classe InvestimentoComIR deve aplicar descontos de Imposto de
     *     Renda de acordo com os meses passados no parâmetro:
     *             • Menos de 6 meses: 22,5%
     *             • Maior ou igual a 6 meses e menor que 12 meses: 20%
     *             • Maior ou igual a 12 meses e menor que 24 meses: 17,5%
     *             • Maior ou igual a 24 meses: 15%
     *             • Utilizando o exemplo anterior, no caso de um lucro de R$81,60 em 2 meses, deve ser
     *     descontado 22,5%, tendo um lucro final igual a R$63,24.
     *             • A classe InvestimentoSemIR deve manter a fórmula inicial, porém caso o valorInicial seja
     *     menor que R$1000 , uma mensagem deve ser exibida: “O valor Inicial não pode ser menor que
     *     R$1000”
     *             • No caso do valorInicial abaixo de R$1000, o retorno da função calcularLucro, deve ser
     *     sempre 0.
     *
     * @author Everton Dutra
     */


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
