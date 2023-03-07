package padraoobserver;

public class ObserverSMS implements Observer {
    
    public void enviarMensagem(String msg){
        System.out.println(msg);
    }
}
