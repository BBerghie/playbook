package es.poc.javaSqlPlaybook.Infrestructure;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private static Connection connection;

    private DatabaseConnection() throws SQLException {
        this.connection = DriverManager.getConnection(Constants.CONNECTION.DATA_BASE_URL, Constants.CONNECTION.DB_USER, Constants.CONNECTION.DB_PW);
    }

    public Connection getConnection() {
        return connection;
    }

    public static DatabaseConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new DatabaseConnection();
        }

        return instance;
    }

    public static void closeConnection() throws SQLException {
        if (!connection.isClosed()){
            connection.close();
        }
    }
}
