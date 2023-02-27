<h2 align=center>Padrão Estratégia II (27/02/23)</h2>


<h4>. Diagrama UML</h4>
<br />
<div align="center">
  <img height="500px" alt="Diagrama UML" src="./images/stratyPattern.png">
</div>

<br />
<br />
<br />

<h4>. Implementação em Java</h4>
<br />
<br />

Classe Main
```java
public class Main {

  public static void main(String[] args) {
    Administrador administrador = new Administrador();
  
    Acesso acesso = new Acesso(administrador);
    acesso.acessar();
  }
}
```

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
