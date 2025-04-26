package es.poc.javaSqlPlaybook.connection;

import es.poc.javaSqlPlaybook.Infrestructure.Constants;
import es.poc.javaSqlPlaybook.Infrestructure.DatabaseConnection;
import es.poc.javaSqlPlaybook.Infrestructure.DbConnection2;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Log4j2
@DisplayName("A special test case")
public class SQLConnectorTest {

    private static final String BD_PRODUCT_NAME = "MariaDB";

    @Test
    @DisplayName("Basic connection")
    void basic_connection_checker() {
        boolean thereIsAConnection = false;

        try (Connection connection = DriverManager.getConnection(Constants.CONNECTION.DATA_BASE_URL
                , Constants.CONNECTION.DB_USER
                , Constants.CONNECTION.DB_PW)) {

            thereIsAConnection = connection.getMetaData().getDatabaseProductName().equals(BD_PRODUCT_NAME);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        assertTrue(thereIsAConnection);
    }

    @Test
    @DisplayName("With Singleton connector")
    void singelton_connector_Checker() throws SQLException {

        String dataProductName = null;

        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        Connection connection = databaseConnection.getConnection();

        dataProductName = connection.getMetaData().getDatabaseProductName();

        assertNotNull(dataProductName, "Error en coexión a BBDD");
    }
}
