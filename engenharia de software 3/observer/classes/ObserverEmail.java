package padraoobserver;

public class ObserverEmail implements Observer {
    
    public void enviarMensagem(String msg){
        System.out.println(msg);
    }
}
