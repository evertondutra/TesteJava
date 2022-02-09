package com.digitalinnovationone.cargos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Cargos
 *         Crie um programa no qual o usuário deverá informar o nome e o cargo de cinco pessoas. O
 *         programa deverá exibir na tela para o usuário quantos Starter, Junior e Sênior foram
 *         informados.
 *         Regras que deverão ser seguidas para a implementação do programa:
 *         • Os únicos cargos válidos são Starter, Junior, Sênior.
 *         • Caso seja informado um cargo diferente o programa deverá definir o cargo como Sênior.
 *         • É obrigatório criar uma classe para representar a Pessoa.
 *         • A classe deverá possuir dois dados privados (propriedades) para representar as características
 *         da Pessoa.
 *         • A classe deverá possuir métodos de acesso para permitir que o usuário armazene/leia os dados
 *         dos dois dados privados (propriedades).
 * @author Everton Dutra
 */

public class Main {
    public static void main(String[] args) {
        List<Pessoa> todos = new ArrayList<>();
        List<String> todosCargos =  new ArrayList<>(Arrays.asList("Starter", "Junior", "Sênior"));
        Scanner scan = new Scanner(System.in);

        for(int c = 0; c <= 4; c++){
            Pessoa pessoa = new Pessoa();
            System.out.printf("Informe o nome da %sª pessoa: ", c+1);
            pessoa.setNome(scan.next());

            System.out.printf("Informe o cargo da %sª pessoa (Starter, Junior, Sênior: ", c+1);
            String cargo = scan.next();
            cargo = pessoa.capitalize(cargo);

            if (todosCargos.contains(cargo)){
                pessoa.setCargo(cargo);
            }else{
                pessoa.setCargo("Sênior");
            }
            todos.add(pessoa);
        }
        Pessoa pessoa = new Pessoa();
        System.out.println(todos);
        System.out.println("Total de pessoas");
        System.out.println("Starter: "+ pessoa.contarRepeticao( todos, "Starter"));
        System.out.println("Junior: "+ pessoa.contarRepeticao( todos, "Junior"));
        System.out.println("Sênior: "+ pessoa.contarRepeticao( todos, "Sênior"));

    }
}
