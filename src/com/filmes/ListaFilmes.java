package com.interfaces;

import javax.management.RuntimeErrorException;



class RepFilmesLista implements InterfaceLista {
    private Filmes filme;
    private RepFilmesLista proximo;

    RepFilmesLista() {
        this.filme = null;
        this.proximo = null;

    }

    public void inserir(Filmes novoFilme) {
        if (this.filme == null) {
            this.filme = novoFilme;
            this.proximo = new RepFilmesLista();
        } else {
            this.proximo.inserir(novoFilme);
        }
    }

    public void remover(Filmes filmeRemover){
        if(this.filme != null){
        if(this.filme.getNome().equals(filmeRemover.getNome())) {
            this.filme=this.proximo.filme;
            this.proximo=this.proximo.proximo;
        } else{
            this.proximo.remover(filmeRemover);        
        }
    }else {
        throw new RuntimeErrorException("Error. Filme nao encontrado.");
    }

    }

    public boolean buscar(Filmes filmeBuscar) { // implementar busca
        if (this.filme != null) {

        } else {
            throw new RuntimeErrorException("Error. Filme nao encontrado.");
        }

        return null;
    }

}