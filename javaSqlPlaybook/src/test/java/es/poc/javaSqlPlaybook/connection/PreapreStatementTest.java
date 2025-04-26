package es.poc.javaSqlPlaybook.connection;

import es.poc.javaSqlPlaybook.Infrestructure.DbConnection2;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class PreapreStatementTest {

    static Connection con = DbConnection2.getConnection();

    @Test
    public void query_with_srepared_statement(){

    }
}
