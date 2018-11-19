public interface InterfaceArray{
    ArrayFilmes();
    ArrayFilmes(Filmes[] filmes, int tamanho);
    void inserir(Filmes newFilme);
    void remover(String nome);
    boolean buscar();
}