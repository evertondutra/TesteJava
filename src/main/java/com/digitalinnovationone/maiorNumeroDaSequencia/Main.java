package com.digitalinnovationone.maiorNumeroDaSequencia;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Maior número da sequência
 *         Faça um programa que leia uma string com sequência de números separados por 1 espaco
 *         cada e imprima no console:
 *         O valor do maior número.
 *         A soma de todos os valores de entrada.
 *         Escrever alguns exemplos para serem demonstrados no console da aplicação.
 *         Exemplo:
 *         Input: “1 2 3 44 5”
 *         Output:
 *         “O maior número é 44”
 *         “A soma dos valores é 55”
 *         Testar com as entradas abaixo:
 *         “55 2 1 854 963 520 1 0 98 8”
 *         “”
 *         “2 3 5 44 8 99 6 55 72 3 01 25”
 *         “98 99 100 101 102 103 105 105”
 *         “1”
 * @author Everton Dutra
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maior = 0;
        int soma = 0;
        int num = 0;

        System.out.println("Digite números separados com 'espaço'");
        String texto = scan.nextLine();

        System.out.println(texto);
        String[] textoSeparado = texto.split(" ");
//        System.out.println(Arrays.toString(textoSeparado));
        for (String numero : textoSeparado){
            try {
                num = Integer.parseInt(numero);

            }catch (NumberFormatException ignored){}
            soma += num;
            if(num > maior){
                maior = num;
            }

        }
        System.out.println("O maior número é "+maior);
        System.out.println("A soma dos valores é "+soma);


    }

}
