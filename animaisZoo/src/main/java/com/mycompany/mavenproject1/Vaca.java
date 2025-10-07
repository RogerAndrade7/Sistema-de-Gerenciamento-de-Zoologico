package com.mycompany.mavenproject1;

public class Vaca extends Animal{

    public Vaca(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A "+ this.nome + " faz: MUUUU!");
    }
    
}
