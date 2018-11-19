import dados.filmes.Filmes;

public interface RepFilme{
    void inserir(Filmes novoFilme);
    void remover(Filmes filmeRemover);
    boolean buscar(String nome);
    
}