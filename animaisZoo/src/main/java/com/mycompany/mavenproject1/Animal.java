package com.mycompany.mavenproject1;

public abstract class Animal {
    
    protected int idade;
    protected String nome;
    
    public Animal(String nome,int idade){
        this.setIdade(idade);
        this.nome = nome;
    }
    
    public void exibirInfo(){
        System.out.println("Nome Animal: "+getNome() + "\nIdade Animal: " + getIdade());
        System.out.println("------------------------------------------");
        
    }

    public abstract void emitirSom();


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade>0){
        this.idade = idade;
    }else{
            System.out.println("ERRO: Essa idade não é válida.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
