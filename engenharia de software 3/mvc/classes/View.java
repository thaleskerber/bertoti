public class View implements Observer{
  private Brinde brinde;
  private List<Produto> produtos;
  
  public void setBrinde(Brinde b){
    this.brinde = b;
  }
  
  public void update(List<Produto> l){
    this.produtos = l;
  }
  
}
