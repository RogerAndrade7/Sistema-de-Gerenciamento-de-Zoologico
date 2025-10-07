/*Author: Roger Bruno A. Santos*/
package com.mycompany.mavenproject1;


public class Main {

    public static void main(String[] args) {

        Zoologico zoo = new Zoologico();
        
        //Criar Animais diferentes
        
        Animal leao =  new Leao("Simba", 5);
        Animal cachorro = new Cachorro("Hachiko", 6, 3);
        Animal gato = new Gato("Ney", 4);
        
        
        
        zoo.adicionarAnimal(gato);
        zoo.adicionarAnimal(cachorro);
        zoo.adicionarAnimal(leao);
        
        zoo.listarAnimais();
    }
    
       
    
}
