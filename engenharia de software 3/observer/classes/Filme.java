package padraoobserver;

public class Filme {
  
    private String titulo;
    private String diretor;
    
    public Filme(String titulo, String diretor){
        this.titulo = titulo;
        this.diretor = diretor;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getDiretor(){
        return this.diretor;
    }
}
