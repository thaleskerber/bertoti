public class BrindeCaneca implements Brinde{
  private View view;
  private Ecommerce ecommerce;
  
  public void receberBrinde(){
    System.out.println("Você ganhou uma caneca de brinde!");
  }
  
  public void setView(View v){
    this.view = v;
  }
  
}
