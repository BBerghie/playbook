package es.poc.javaSqlPlaybook.connection;

import es.poc.javaSqlPlaybook.Infrestructure.DbConnection2;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

@Log4j2
public class PreapreStatementTest {

    static Connection con = DbConnection2.getConnection();

    @Test
    public void query_with_srepared_statement(){

    }
}
