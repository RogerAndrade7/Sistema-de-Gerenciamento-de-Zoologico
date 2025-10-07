package com.mycompany.mavenproject1;

public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O "+ this.nome + " faz: MIAU!");
    }
    
}
