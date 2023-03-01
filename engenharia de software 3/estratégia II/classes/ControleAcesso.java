package padraoestrategia;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ControleAcesso {
    
    private List<Usuario> usuarios;
    private Administrador administrador;
    private Assistente assistente;
    private Padrao padrao;
    
    public ControleAcesso(){
        usuarios = new ArrayList<Usuario>();
        administrador = new Administrador();
        assistente = new Assistente();
        padrao = new Padrao();
    }
    
    public List<Usuario> getUsuarios(){
        return usuarios;
    }
    
    public void setUsuarios(List<Usuario> usuarios){
        this.usuarios = usuarios;
    }
    
    public List<Usuario> getUsuariosByTipoUsuario(TipoUsuario tipoUsuario){
        return usuarios.stream().filter(r -> r.getTipoUsuario() == tipoUsuario).collect(Collectors.toList());
    }
    
    public Usuario getUsuarioByNome(String nome){
        return usuarios.stream().filter(r -> r.getNome().equalsIgnoreCase(nome)).findFirst().get();
    }
    
    public Administrador getTipoUsuarioAdministrador(){
        return administrador;
    }
    
    public Assistente getTipoUsuarioAssistente(){
        return assistente;
    }
    
    public Padrao getTipoUsuarioPadrao(){
        return padrao;
    }
}
