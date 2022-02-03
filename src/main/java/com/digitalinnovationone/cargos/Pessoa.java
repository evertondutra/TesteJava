package com.digitalinnovationone.cargos;


import java.util.List;

public class Pessoa {
    private String nome;
    private String cargo;

    public String capitalize(String nome){
        return nome.substring(0,1).toUpperCase() + nome.substring(1).toLowerCase();
    }

    public int contarRepeticao(List<Pessoa> array, String valorProcurado){
        int contador = 0;
        for (Pessoa item : array){
            if(item.getCargo().equals(valorProcurado)){
                contador++;
            }
        }
        return contador;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}


