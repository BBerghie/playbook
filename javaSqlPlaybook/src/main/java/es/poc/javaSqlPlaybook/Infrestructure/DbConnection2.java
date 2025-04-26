package es.poc.javaSqlPlaybook.Infrestructure;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection2 {
    private static Connection con = null;

    static
    {
        final String DATA_BASE_URL = "jdbc:mariadb://localhost:3306/social_media";
        final String DB_USER = "root";
        final String DB_PW = "web";
        try {
            con = DriverManager.getConnection(DATA_BASE_URL, DB_USER, DB_PW);
        }
        catch (SQLException e) {
            Logger.getLogger(DbConnection2.class.getName()).log(Level.SEVERE, "There is no way to create a Connection :( ");
            throw new RuntimeException();
        }
    }
    public static Connection getConnection()
    {
        return con;
    }
}
