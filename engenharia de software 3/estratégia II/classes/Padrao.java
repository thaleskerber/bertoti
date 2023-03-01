package padraoestrategia;

import java.util.List;

public class Padrao implements TipoUsuario {
    
    public void acessar(){
        List<Usuario> usuariosPadrao = PadraoEstrategia.getControleAcesso().getUsuariosByTipoUsuario(PadraoEstrategia.getControleAcesso().getTipoUsuarioPadrao());
        if(!usuariosPadrao.isEmpty()){   
            usuariosPadrao.stream()
                    .forEach(item -> {
                        item.adicionarNotificacao(String.format("O padrão %s acessou o sistema!", item.getNome()));
                    });
        }
    }
}
