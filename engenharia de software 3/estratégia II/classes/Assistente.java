package padraoestrategia;

import java.util.List;

public class Assistente implements TipoUsuario {
    
    public void acessar(){
        List<Usuario> usuariosAssistente = PadraoEstrategia.getControleAcesso().getUsuariosByTipoUsuario(PadraoEstrategia.getControleAcesso().getTipoUsuarioAssistente());
        if(!usuariosAssistente.isEmpty()){   
            usuariosAssistente.stream()
                    .forEach(item -> {
                        item.adicionarNotificacao(String.format("O assistente %s acessou o sistema!", item.getNome()));
                    });
        }
    }
}
