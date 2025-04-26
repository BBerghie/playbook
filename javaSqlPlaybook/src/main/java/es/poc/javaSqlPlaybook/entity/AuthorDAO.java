package es.poc.javaSqlPlaybook.entity;

import es.poc.javaSqlPlaybook.entity.pojo.AuthorPOJO;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashSet;
import java.util.Optional;

public interface AuthorDAO {

    /**
     * @author Bogdan Berghie
     * get all entities of author's table
     *
     * @return HashSet of autors
     **/
    HashSet<AuthorPOJO> getAll();

    /**
     * @author Bogdan Berghie
     *
     * @param id athorId bigint primary key AUTO_INCREMENT.
     *
     * get an author by the id
     **/
    Optional<AuthorPOJO> getById(long id);

    boolean deleteById(long id);

    void updateAuthor(AuthorPOJO oldAuthor, AuthorPOJO newAuthor);

    Optional<AuthorPOJO> addAuthor(String name, String lastName, Date birthDate) throws SQLException;
}
