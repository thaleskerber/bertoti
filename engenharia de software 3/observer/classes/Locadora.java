package padraoobserver;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Observer> observers;
    private List<Filme> filmes;
    
    public Locadora(){
        this.observers = new ArrayList<>();
        this.filmes = new ArrayList<>();
    }
    
    public void addObserver(Observer observer){
        this.observers.add(observer);
    }
    
    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }
    
    public List<Observer> getObservers(){
        return this.observers;
    }
    
    public void notificarTodos(String msg){
        this.observers.stream().forEach(item -> {
            System.out.println(msg);
        });
    }
    
    public void addFilme(Filme filme){
        this.filmes.add(filme);
        notificarTodos(String.format("Olá, o filme %s foi adicionado ao nosso catálogo!", filme.getTitulo()));
    }
    
    public void removeFilme(Filme filme){
        this.filmes.remove(filme);
        notificarTodos(String.format("Olá, o filme %s foi removido do nosso catálogo =(!", filme.getTitulo()));
    }
    
    public List<Filme> getFilmes(){
        return this.filmes;
    }
}
