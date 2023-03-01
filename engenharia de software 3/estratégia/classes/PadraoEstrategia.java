package padraoestrategia;

public class PadraoEstrategia{
    
    public static void main(String[] args) {
     
        Administrador administrador = new Administrador();
        
        Usuario usuario = new Usuario("João", administrador);
        
        usuario.acessar();
    }
}