public class BrindeChaveiro implements Brinde{
  private View view;
  private Ecommerce ecommerce;
  
  public void receberBrinde(){
    System.out.println("Você ganhou um chaveiro de brinde!");
  }
  
  public void setView(View v){
    this.view = v;
  }
  
}
