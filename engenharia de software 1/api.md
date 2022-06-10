# Códigos feitos para o Projeto Integrador

> Classe para conexão (ConnectionFactory):

```JAVA
package projeto.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private final Connection connection;
    private static ConnectionFactory instance = null;

    public static ConnectionFactory getInstance() throws SQLException{
        if(instance == null) instance = new ConnectionFactory();
        return instance;
    }

    private ConnectionFactory() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:mysql://dbfatec.mysql.database.azure.com:3306/projetoapi?user=fatec&password=projeto@1");
    }

    public Connection getConnection(){
        return this.connection;
    }


    public void closeConnection(){
        try {
            this.connection.close();
        }catch(SQLException e){
        }
    }
}
```

> Classe principal (Main):

```JAVA
package projeto;

import projeto.connection.dao.Manager;
import projeto.connection.ConnectionFactory;
import projeto.GUI.menu.TelaLogin;

import java.sql.SQLException;

public class Main {

    private static ConnectionFactory connectionFactory;
    private static Manager manager;

    public static void main(String[] args){

        try{

            connectionFactory = ConnectionFactory.getInstance();
            manager = Manager.getInstance();

        }catch(SQLException e){
            System.exit(0);
            return;
        }

        manager.criarTabelas();

        new TelaLogin().setVisible(true);

    }

    public static ConnectionFactory getConnectionFactory() {
        return connectionFactory;
    }

    public static Manager getManager() {
        return manager;
    }
}
```

> Classe modelo para mensagens (Mensagem):

```JAVA
package projeto.model;

public class Mensagem {

    private int id;
    private int idDestinatario;
    private String meio;
    private String conteudo;
    private long data;

    public Mensagem(int dest, String meioContato, String mensagem, long horario){
        this.idDestinatario = dest;
        this.meio = meioContato;
        this.conteudo = mensagem;
        this.data = horario;
    }

    public Mensagem(int id, int dest, String meioContato, String mensagem, long horario){
        this.idDestinatario = dest;
        this.meio = meioContato;
        this.conteudo = mensagem;
        this.data = horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public long getData() {
        return data;
    }

    public String getMeio() {
        return meio;
    }

    public int getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(int idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setData(long data) {
        this.data = data;
    }

    public void setMeio(String meio) {
        this.meio = meio;
    }

}
```
