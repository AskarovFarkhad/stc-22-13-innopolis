package homework_28.repository.impl;

import homework_28.entity.Human;
import homework_28.repository.CrudRepository;
import homework_28.services.ConnectDB;
import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.util.List;

@Slf4j
public class CrudRepositoryImpl implements CrudRepository<Human> {

    public void createTable() throws SQLException {
        Connection connection = ConnectDB.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(
                "CREATE TABLE IF NOT EXISTS humans " +
                        "(id SERIAL PRIMARY KEY," +
                        "name VARCHAR(30) NOT NULL," +
                        "lastName VARCHAR(30) NOT NULL," +
                        "city VARCHAR(20) NOT NULL," +
                        "numberPassport VARCHAR(20) NOT NULL)"
        );
        preparedStatement.execute();
        connection.close();
    }

    @Override
    public List<Human> getAll() throws SQLException {
        Connection connection = ConnectDB.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM humans");
        connection.close();
        return null;
    }

    @Override
    public Human getById(int id) throws SQLException {
        Connection connection = ConnectDB.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM humans WHERE id = " + id);
        //TODO: конвертор
        connection.close();
        return null;
    }

    @Override
    public void create(Human entity) throws SQLException {
        Connection connection = ConnectDB.getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate(
                "INSERT INTO humans VALUES" +
                        "(" + entity.getName() + ", "
                        + entity.getLastName() + ", "
                        + entity.getCity() + ", " +
                        entity.getNumberPassport() + ")"
        );
        connection.close();
    }

    @Override
    public void update(Human entity) throws SQLException {
        Connection connection = ConnectDB.getConnection();

        connection.close();
    }

    @Override
    public void delete(Human entity) throws SQLException {
        Connection connection = ConnectDB.getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate(
                "DELETE FROM humans" +
                        "WHERE (name = " + entity.getName() +
                        " AND lastName = " + entity.getLastName() +
                        " AND city = " + entity.getCity() +
                        " AND numberpassport = " + entity.getNumberPassport() + ")");
        connection.close();
    }

    @Override
    public void deleteById(int id) throws SQLException {
        Connection connection = ConnectDB.getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate("DELETE FROM humans WHERE id = " + id);
        connection.close();
    }

    @Override
    public void deleteAll() throws SQLException {
        Connection connection = ConnectDB.getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate("DELETE FROM humans");
        connection.close();
    }

    @Override
    public long count() throws SQLException {
        Connection connection = ConnectDB.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM humans");
        connection.close();
        return resultSet.getFetchSize();
    }
}
