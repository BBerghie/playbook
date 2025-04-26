package es.poc.javaSqlPlaybook.connection;

import es.poc.javaSqlPlaybook.Infrestructure.DatabaseConnection;
import es.poc.javaSqlPlaybook.aplication.AuthorService;
import es.poc.javaSqlPlaybook.entity.pojo.AuthorPOJO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashSet;
import java.util.Optional;

@Log4j2
public class SimpleQueryTest {

    private final AuthorService authorService;

    SimpleQueryTest(){
        this.authorService = new AuthorService();
    }

//    @Test
//    void get_all_results_of_user_media() {
//        HashSet<AuthorPOJO> userPOJOHashSet = new HashSet<>();
//
//        try (
//                Statement stmt = con.createStatement();
//                ResultSet rs = stmt.executeQuery(" SELECT a.authorId, a.name, a.lastName, a.birthDate FROM author a LIMIT 1; ")
//
//            ) {
//
//            while (rs.next()){
//                int id = rs.getInt(1);
//                String name = rs.getString("name");
//                String lastName = rs.getString(3);
//                Date birthDate = rs.getDate(4);
//
//                userPOJOHashSet.add(new AuthorPOJO(id, name, lastName, birthDate));
//            }
//        } catch (Exception e) {
//            Logger.getLogger(SQLConnectorTests.class.getName()).log(Level.SEVERE, "Algo malo ha ocurrido", e);
//        }
//
//        //TODO
//        //assertEquals();
//    }


    @Test
    public void author_insert_query() throws SQLException {

        AuthorPOJO christopher = new AuthorPOJO(-1, "Christopher", "Paolini", new Date(437875200000L));

        log.info(christopher.toString());
        Optional<AuthorPOJO> newAuthorPOJO = authorService.addAuthor(christopher.name(), christopher.lastName(), christopher.date());


        log.info(" Christopher hasCode " + christopher.hashCode());
    }



    @Test
    public void author_update_query(){
        authorService.getAll();
    }

//    @Test
//    public void author_delete_query(){
//
//    }
}
