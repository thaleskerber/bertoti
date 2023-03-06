package padraoestrategia;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
   
    private String nome;
    private TipoUsuario tipoUsuario;
    private List<String> notificacoes;
    
    public Usuario(String nome,TipoUsuario tipoUsuario){
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
        this.notificacoes = new ArrayList<String>();
        List<Usuario> usuarios = PadraoEstrategia.getControleAcesso().getUsuarios();
        usuarios.add(this);
        PadraoEstrategia.getControleAcesso().setUsuarios(usuarios);
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
    
    public List<String> getNotificacoes(){
        return notificacoes;
    }
    
    public void adicionarNotificacao(String message){
        notificacoes.add(message);
    }
    
    public void setTipoUsuario(TipoUsuario tipoUsuario){
        this.tipoUsuario = tipoUsuario;
    }
}
