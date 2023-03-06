package padraoobserver;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Inscritos> inscritos;
    private List<Filme> filmes;
    
    public Locadora(){
        this.inscritos = new ArrayList<>();
        this.filmes = new ArrayList<>();
    }
    
    public void addInscrito(Inscritos inscrito){
        this.inscritos.add(inscrito);
    }
    
    public void removeInscritos(Inscritos inscrito){
        this.inscritos.remove(inscrito);
    }
    
    public List<Inscritos> getInscritos(){
        return this.inscritos;
    }
    
    public void notificarInscritos(String msg){
        this.inscritos.stream().forEach(item -> {
            System.out.println(msg);
        });
    }
    
    public void addFilme(Filme filme){
        this.filmes.add(filme);
        notificarInscritos(String.format("Olá, o filme %s foi adicionado ao nosso catálogo!", filme.getTitulo()));
    }
    
    public void removeFilme(Filme filme){
        this.filmes.remove(filme);
        notificarInscritos(String.format("Olá, o filme %s foi removido do nosso catálogo =(!", filme.getTitulo()));
    }
    
    public List<Filme> getFilmes(){
        return this.filmes;
    }
}
