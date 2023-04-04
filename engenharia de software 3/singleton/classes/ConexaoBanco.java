package padraosingleton;

public class ConexaoBanco {
    
    private ConexaoBanco instance;
  
    private ConexaoBanco(){
    }
  
    public ConexaoBanco getInstance(){
      if(instance == null){
        instance = new ConexaoBanco();
      }
      return instance;
    }
}
