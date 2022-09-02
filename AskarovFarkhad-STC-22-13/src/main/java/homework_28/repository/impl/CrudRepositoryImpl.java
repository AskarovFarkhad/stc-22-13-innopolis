package homework_28.repository.impl;

import homework_28.entity.Human;
import homework_28.repository.CrudRepository;
import homework_28.services.ConnectDB;
import homework_28.services.ConverterSetHuman;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Slf4j
@NoArgsConstructor
public class CrudRepositoryImpl implements CrudRepository<Human> {

    /**
     * Create table for entity {@link Human}.
     */
    public void createTable() {
        try (Connection connection = ConnectDB.getConnection()) {
            connection.prepareStatement(
                    "CREATE TABLE IF NOT EXISTS humans " +
                            "(id SERIAL PRIMARY KEY," +
                            "name VARCHAR(30) NOT NULL," +
                            "lastName VARCHAR(30) NOT NULL," +
                            "city VARCHAR(20) NOT NULL," +
                            "numberPassport VARCHAR(20) NOT NULL)"
            ).execute();
        } catch (SQLException e) {
            log.error("Ошибка при создании таблицы: " + e.getCause());
            e.printStackTrace();
        }
    }

    /**
     * Get all humans from database.
     *
     * @return list with all humans.
     */
    @Override
    public List<Human> getAll() {
        try (Connection connection = ConnectDB.getConnection()) {
            ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM humans");
            return ConverterSetHuman.covertSetToList(resultSet);
        } catch (SQLException e) {
            log.error("Ошибка при получении полного списка: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Get human by ID.
     *
     * @param id
     * @return class {@link Human}
     */
    @Override
    public Human getById(int id) {
        try (Connection connection = ConnectDB.getConnection()) {
            ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM humans WHERE id = " + id);
            return ConverterSetHuman.covertSetToList(resultSet).get(0);
        } catch (SQLException e) {
            log.error("Ошибка при создании таблицы: " + e.getCause());
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Creating entity and add in database.
     *
     * @param entity {@link Human}.
     */
    @Override
    public void create(Human entity) {
        try (Connection connection = ConnectDB.getConnection()) {
            connection.createStatement().execute(
                    "INSERT INTO humans VALUES" +
                            "(" + entity.getName() + ", "
                            + entity.getLastName() + ", "
                            + entity.getCity() + ", " +
                            entity.getNumberPassport() + ")"
            );
        } catch (SQLException e) {
            log.error("Ошибка при создании таблицы: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void update(Human entity) throws SQLException {
        Connection connection = ConnectDB.getConnection();

        connection.close();
    }

    /**
     * Delete human from database by object {@link Human}.
     *
     * @param entity class {@link Human}.
     */
    @Override
    public void delete(Human entity) throws SQLException {
        Connection connection = ConnectDB.getConnection();
        connection.createStatement().executeUpdate(
                "DELETE FROM humans" +
                        "WHERE (name = " + entity.getName() +
                        " AND lastName = " + entity.getLastName() +
                        " AND city = " + entity.getCity() +
                        " AND numberpassport = " + entity.getNumberPassport() + ")");
        connection.close();
    }

    /**
     * Delete human from database by ID.
     *
     * @param id
     */
    @Override
    public void deleteById(int id) throws SQLException {
        Connection connection = ConnectDB.getConnection();
        connection.createStatement().executeUpdate("DELETE FROM humans WHERE id = " + id);
        connection.close();
    }

    /**
     * Delete all humans from database.
     */
    @Override
    public void deleteAll() throws SQLException {
        Connection connection = ConnectDB.getConnection();
        connection.createStatement().executeUpdate("DELETE FROM humans");
        connection.close();
    }

    /**
     * Get count rows in database.
     *
     * @return long count rows in database.
     */
    @Override
    public long count() throws SQLException {
        Connection connection = ConnectDB.getConnection();
        ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM humans");
        connection.close();
        return resultSet.getFetchSize();
    }
}
