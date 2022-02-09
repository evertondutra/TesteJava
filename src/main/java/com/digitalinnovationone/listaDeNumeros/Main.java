package com.digitalinnovationone.listaDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Lista de números
 *         Receba do usuário 10 números e exiba:
 *         • O maior número
 *         • O menor número
 *         • A média aritmética
 *         • Quantos números são acima de 10 e quais são eles
 *         • Quantos números são acima de 50 e quais são eles
 *         O usuário não poderá digitar números repetidos e deve ser validada a entrada apenas de números
 *         inteiros.
 * @author Everton Dutra
 */

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
                    numero = Integer.parseInt(scan.nextLine());
                    loopcontinue = false;
                }catch (NumberFormatException e){
                    System.out.println("Informe somente números!!");

                }
            }while (loopcontinue);

            listaNumeros.add(numero);
        }
        for (Integer num : listaNumeros) {
            soma +=  num;
            if (num > 10 ){
                acimaDez.add(num);
            }
            if (num > 50){
                acimaCinquenta.add(num);
            }
        }
        System.out.println("------respostas--------");
        System.out.println("O maior número é " + Collections.max(listaNumeros));
        System.out.println("O menor número é " + Collections.min(listaNumeros));
        System.out.printf("A média aritimética é %.1f \n", soma / 5);
        System.out.println("Existe '" + acimaDez.size() + "' acima de dez e é (são) "+ acimaDez );
        System.out.println("Existe '" + acimaCinquenta.size() + "' acima de cinquenta e é (são) "+ acimaCinquenta );



    }
}
