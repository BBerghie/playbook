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
        try {
            con = DriverManager.getConnection(Constants.CONNECTION.DATA_BASE_URL, Constants.CONNECTION.DB_USER, Constants.CONNECTION.DB_PW);
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
