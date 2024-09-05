package br.com.fiap.porto.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "usuario",
                    "senha");

            System.out.println("Conectado!");

            conn.close(); // fecha conexão
        } catch (ClassNotFoundException e) {
            System.out.println("O driver JDBC não foi encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar no banco de dados");
            e.printStackTrace();
        }
        return null;
    }

}
