package padraoestrategia;

import java.util.List;

public class Administrador implements TipoUsuario {
    
    public void acessar(){
        List<Usuario> usuariosAdministrador = PadraoEstrategia.getControleAcesso().getUsuariosByTipoUsuario(PadraoEstrategia.getControleAcesso().getTipoUsuarioAdministrador());
        if(!usuariosAdministrador.isEmpty()){   
            usuariosAdministrador.stream()
                    .forEach(item -> {
                        item.adicionarNotificacao(String.format("O administrador %s acessou o sistema!", item.getNome()));
                    });
        }
    }
}
