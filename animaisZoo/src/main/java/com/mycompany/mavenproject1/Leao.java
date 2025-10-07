package com.mycompany.mavenproject1;

public class Leao extends Animal {

    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O " + this.nome + " faz: " + "Arrr!!!");
    }
    
}
