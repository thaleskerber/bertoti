package padraoestrategia;

public class Usuario {
   
    private String nome;
    private TipoUsuario tipoUsuario;
    
    public Usuario(String nome,TipoUsuario tipoUsuario){
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNome() {
        return nome;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }
    
    public void acessar(){
        tipoUsuario.acessar();
    }
}
