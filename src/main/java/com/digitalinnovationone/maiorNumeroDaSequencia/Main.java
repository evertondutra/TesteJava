package com.digitalinnovationone.maiorNumeroDaSequencia;

import java.util.Arrays;
import java.util.Scanner;

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
