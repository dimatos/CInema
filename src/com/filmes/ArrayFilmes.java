//package com.interfaces;

class ArrayFilmes implements InterfaceArray{
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

    public void remover(){

    }

    public boolean buscar(){

    }

    public void duplicarArray(){
        Filmes[] arrayAux = new Filmes[n];
        for(int i=0; i<n; i++){
            arrayAux[i]=arrayFilmes[i];
        }
        arrayFilmes = new ArrayFilmes(arrayAux, n*2);
    }

}