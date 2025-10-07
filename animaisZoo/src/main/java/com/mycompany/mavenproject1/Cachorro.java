package com.mycompany.mavenproject1;

public class Cachorro extends Animal {

    private double peso;

    public Cachorro(String nome, int idade, double peso) {
        super(nome, idade);
        this.setPeso(peso);
    }

    @Override
    public void emitirSom() {
        System.out.println("O " + this.nome + " faz: Au Au!");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Peso Cachoro: " + this.getPeso() + "Kg");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 1) {
            this.peso = peso;
        } else {
            System.out.println("Insira um peso válido!");
        }
    }
}
