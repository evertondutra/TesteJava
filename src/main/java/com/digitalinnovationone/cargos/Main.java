package com.digitalinnovationone.cargos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
