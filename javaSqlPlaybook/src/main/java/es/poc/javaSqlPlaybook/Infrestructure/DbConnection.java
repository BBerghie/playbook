package es.poc.javaSqlPlaybook.Infrestructure;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {
    private static DbConnection instance = null;
    private Connection conn = null;

    private DbConnection() {}

    private void init() throws SQLException {
        final String DATA_BASE_URL = "jdbc:mariadb://localhost:3306/social_media";
        final String DB_USER = "root";
        final String DB_PW = "web";

        conn = DriverManager.getConnection(DATA_BASE_URL, DB_USER, DB_PW);

        Logger.getLogger(DbConnection.getInstance().getClass().getName()).log(Level.INFO, "A Singelton Connection has been created " + instance.hashCode());
    }

    public Connection getConnection() {
        return conn;
    }

    public static DbConnection getInstance() throws SQLException {
        if (instance == null || instance.getConnection().isClosed()) {
            instance = new DbConnection();
            instance.init();
        }
        return instance;
    }
}
