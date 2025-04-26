package es.poc.javaSqlPlaybook;

import es.poc.javaSqlPlaybook.Infrestructure.DatabaseConnection;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

@Log4j2
class JavaSqlPlaybookApplicationTests {

    @Test
    public  void close_connection() throws SQLException {
        boolean connectionIsClosen = false;

        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        Connection connection = databaseConnection.getConnection();

        log.info("JavaSqlPlaybookApplicationTests.close_connection --> " + connection.isClosed());
        if (!connection.isClosed()) {
            connection.close();
        }

        if (connection.isClosed()) {
            connectionIsClosen = true;
        }

        Assertions.assertTrue(connectionIsClosen, "Connection is not closed");
    }
}
