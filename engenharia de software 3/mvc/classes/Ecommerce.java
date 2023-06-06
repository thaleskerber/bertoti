public class Ecommerce implements Subject{
  private List<Produto> produtos;
  private List<Observer> observers;
  
  public void registerObserver(Observer o){
    this.observers.add(o);
  }
  
  public void notifyObservers(List<Produto> l){
    this.observers.stream().forEach(ob -> {
      System.out.println("Novos produtos adicionados:");
      l.stream().forEach(p -> {
        System.out.println(". " + p.getNome());
      });
    });
  }
  
  public void addProduto(Produto p){
    this.produtos.add(p);
  }
 
  public Produto buscarProduto(String nome){
    return this.produtos.stream().filter(r -> r.getNome().equalsIgnoreCase(nome)).findFirst().get();
  }
}
  
