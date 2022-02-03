package com.digitalinnovationone.listaDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();
        List<Integer> acimaDez = new ArrayList<>();
        List<Integer> acimaCinquenta = new ArrayList<>();

        int contador = 0;
        double media = 0;
        double soma = 0;
        int numero = 0;
        boolean loopcontinue = true;


        while(listaNumeros.size() <= 4){
            System.out.println("Informe um número: ");

            do {
                try {
                    numero = scan.nextInt();
                    loopcontinue = false;
                    if (listaNumeros.contains(numero)){
                        System.out.println("Não pode repetir o números! digite novamente: ");
                        loopcontinue = true;
                    }
                }catch (NumberFormatException e){
                    System.out.println("Digite somente números");
                }
            }while (loopcontinue);

            listaNumeros.add(numero);
        }
        for (Integer num : listaNumeros) {
            soma +=  num;
            if (num > 10 && num <= 50){
                acimaDez.add(num);
            }else if (num > 50){
                acimaCinquenta.add(num);
            }
        }
        System.out.println("------respostas--------");
        System.out.println("O maior número é " + Collections.max(listaNumeros));
        System.out.println("O menor número é " + Collections.min(listaNumeros));
        System.out.printf("A média aritimética é %.1f \n", soma / 5);
        System.out.println("Existe '" + acimaDez.size() + "' acima de dez e é (são) "+ acimaDez );
        System.out.println("Existe '" + acimaCinquenta.size() + "' acima de dez e é (são) "+ acimaCinquenta );



    }
}
