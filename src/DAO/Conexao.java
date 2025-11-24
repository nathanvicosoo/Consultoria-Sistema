package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao implements Serializable {

    private static volatile Conexao instancia = null;
    private static Connection connection;

    private static final String USUARIO = "root";
    private static final String SENHA   = "root";
    private static final String URL     = "jdbc:mysql://localhost:3306/consultoria?useSSL=false&serverTimezone=UTC";
    
    private Conexao() {
        try {
            // Driver novo do MySQL
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException e) {
            // NÃO engula a exceção: mostre/logue e converta em RuntimeException
            throw new RuntimeException("Falha ao iniciar conexão com o banco: " + e.getMessage(), e);
        }
    }

    public static Connection getInstance() {
        if (instancia == null) {
            synchronized (Conexao.class) {
                if (instancia == null) {
                    instancia = new Conexao();
                }
            }
        }
        return connection;
    }

    public static void closeInstance() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
        instancia = null;
    }

    public static void setAutoCommit(boolean vlr) throws SQLException {
        getInstance().setAutoCommit(vlr);
    }

    public static void commit() throws SQLException {
        getInstance().commit();
    }

    public static void rollback() throws SQLException {
        getInstance().rollback();
    }
}
