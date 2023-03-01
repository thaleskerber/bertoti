package padraoestrategia;

public class PadraoEstrategia{
    
    private static ControleAcesso controleAcesso;
    public static ControleAcesso getControleAcesso(){
        return controleAcesso;
    }
    
    public static void main(String[] args) {
     
        controleAcesso = new ControleAcesso();
        
        Usuario usuario = new Usuario("João", controleAcesso.getTipoUsuarioAdministrador());
        Usuario usuario2 = new Usuario("Maria", controleAcesso.getTipoUsuarioAssistente());
        Usuario usuario3 = new Usuario("Sergio", controleAcesso.getTipoUsuarioPadrao());
        
        usuario.acessar();
        usuario2.acessar();
        usuario3.acessar();
        
        controleAcesso.getUsuarios().stream().forEach(item -> {
            System.out.println("-----------------");
            System.out.println("Nome: " + item.getNome());
            System.out.println("Notificações: ");
            item.getNotificacoes().forEach(n -> {System.out.println("  . " + n);});
        });
    }
}