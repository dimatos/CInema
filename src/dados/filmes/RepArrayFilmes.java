package com.filmes;

import javax.management.RuntimeErrorException;

public class RepArrayFilmes implements InterfaceArray{
    private Filmes filme;
    private int posicao;
    private int n;
    private Filmes[] arrayFilmes;
    
    ArrayFilmes(){
        this.n=10;
        arrayfilmes = new Filmes[this.n];
    }
    
    ArrayFilmes(Filmes[] filmes, int tamanho){
        this.n=tamanho;
        arrayFilmes=new Filmes[tamanho];
        for(int i=0; i<tamanho; i++){
            arrayFilmes[i]=filmes[i];
        }
    }

    

    public void inserir(Filmes newFilme){
        if(this.posicao<=n-1){
            arrayFilmes[this.posicao]=newFilme;
        }else {
            duplicarArray();
        }
    }

    public void remover(String nome){
        int i=0;
        while(!arrayFilmes[i].getNome().equals(nome)){
            i++;
        }
        while(i<n && arrayFilmes[i]!=null){
            arrayFilmes[i]=arrayFilmes[i+1];
        }

    }

    public Filmes buscar(String nome){
        int i=0;
        Boolean controle=false;
        for(; i<n && arrayfilmes[i]!=null && !controle; i++){
            if(arrayFilmes[i].getNome().equals(nome)) 
                controle=true;
        }
        if(controle){
            return arrayFilmes[i]; // se houve igualdade, então retorna o objeto
        }else{
            return null;
        }
    }

    public void duplicarArray(){
        Filmes[] arrayAux = new Filmes[n];
        for(int i=0; i<n; i++){
            arrayAux[i]=this.arrayFilmes[i];
        }
        arrayFilmes = new ArrayFilmes(arrayAux, n*2);
    }

}