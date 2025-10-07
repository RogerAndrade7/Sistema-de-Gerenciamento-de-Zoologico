package com.mycompany.mavenproject1;
import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animais = new ArrayList<>();
    
    public void adicionarAnimal(Animal a){
        animais.add(a);
    }
    
    public void listarAnimais(){
        System.out.println("====Animais no Zoológico====");
        for (Animal a : animais){
            a.exibirInfo();
            a.emitirSom();
            
            System.out.println("-----------------------");
        }
    }
}
