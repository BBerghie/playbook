package es.poc.javaSqlPlaybook.aplication;

import es.poc.javaSqlPlaybook.Infrestructure.DatabaseConnection;
import es.poc.javaSqlPlaybook.entity.AuthorDAO;
import es.poc.javaSqlPlaybook.entity.pojo.AuthorPOJO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashSet;
import java.util.Optional;

@Log4j2
@Service
public class AuthorService implements AuthorDAO {

    @Override
    public HashSet<AuthorPOJO> getAll() {
        return null;
    }

    @Override
    public Optional<AuthorPOJO> getById(long id) {
        return Optional.empty();
    }

    @Override
    public boolean deleteById(long id) {
        return false;
    }

    @Override
    public void updateAuthor(AuthorPOJO oldAuthor, AuthorPOJO newAuthor) {

    }

    @Override
    public Optional<AuthorPOJO> addAuthor(String name, String lastName, Date birthDate) throws SQLException {

        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        Connection connection = databaseConnection.getConnection();

        String sql = " INSERT INTO author(name, lastName, birthDate) VALUES (?, ?, ?)";

        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setString(1, name);
        stmt.setString(2, lastName);
        stmt.setDate(3, new java.sql.Date(birthDate.getTime()));

        stmt.executeUpdate();

        return Optional.empty();
    }
}
