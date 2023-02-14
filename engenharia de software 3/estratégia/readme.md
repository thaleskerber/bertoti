<h2 align=center>Padrão Estratégia (13/02/23)</h2>


<h4>. Diagrama UML</h4>
<br />
<div align="center">
  <img width="700px" alt="Diagrama UML" src="./images/umlStrategyPattern.png">
</div>

<br />
<br />
<br />

<h4>. Implementação em Java</h4>
<br />
<br />

Classe Acesso
```java
public class Acesso {
  private TipoAcesso tipoAcesso;
  
  public Acesso(TipoAcesso tipoAcesso){
    this.tipoAcesso = tipoAcesso;
  }
  
  public void acessar(){
    this.tipoAcesso.acessar();
  }
}
```

Interface TipoAcesso
```java
public interface TipoAcesso {

  public void acessar();
  
}
```

Classe Administrador
```java
public class Administrador implements TipoAcesso {
  public void acessar(){
    System.out.print("Acessado com um administrador!");
  }
}
```

Classe Usuario
```java
public class Usuario implements TipoAcesso {
  public void acessar(){
    System.out.print("Acessado com um usuário!");
  }
}
```
