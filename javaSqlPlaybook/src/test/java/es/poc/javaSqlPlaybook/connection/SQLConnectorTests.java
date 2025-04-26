package es.poc.javaSqlPlaybook.connection;

import es.poc.javaSqlPlaybook.Infrestructure.DbConnection;
import es.poc.javaSqlPlaybook.Infrestructure.DbConnection2;
import es.poc.javaSqlPlaybook.dto.UserPOJO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.HashSet;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Log4j2
@DisplayName("A special test case")
public class SQLConnectorTests {

    static Connection con = DbConnection2.getConnection();

    @Test
    @DisplayName("It will show the JDBC connector")
    void connectorJdbcChecker() {

        String dataProductName = null;

        try (Connection connection = con) {
            dataProductName = connection.getMetaData().getDatabaseProductName();
        } catch (Exception e) {
            log.fatal(e.getMessage());
        }
        assertNotNull(dataProductName, "Error en coexión a BBDD");
    }

    @Test
    void get_all_results_of_user_media() {
        HashSet<UserPOJO> userPOJOHashSet = new HashSet<>();

        try (
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(" SELECT ud.id, ud.name, ud.lastName FROM UserData ud LIMIT 1; ")

            ) {

            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString("name");
                String lastName = rs.getString(3);

                userPOJOHashSet.add(new UserPOJO(id, name, lastName));
            }
        } catch (Exception e) {
            Logger.getLogger(SQLConnectorTests.class.getName()).log(Level.SEVERE, "Algo malo ha ocurrido", e);
        }
        assertNotNull(userPOJOHashSet);
    }
}
