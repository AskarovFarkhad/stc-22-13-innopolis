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
        } catch (SQLException | IndexOutOfBoundsException e) {
            log.error("Ошибка при поиске человека по ID: " + e.getCause());
            return null;
        }
    }

    /**
     * Creating entity and add in database.
     *
     * @param entity {@link Human}.
     * @return 1 - успешное добавления, 0 - ошибка.
     */
    @Override
    public int save(Human entity) {
        try (Connection connection = ConnectDB.getConnection()) {
            return connection.createStatement().executeUpdate(
                    "INSERT INTO humans(name, lastname, city, numberpassport) VALUES" +
                            "('" + entity.getName() + "', '"
                            + entity.getLastName() + "', '"
                            + entity.getCity() + "', '" +
                            entity.getNumberPassport() + "')");
        } catch (SQLException e) {
            log.error("Ошибка при добавлении человека в СУБД: " + e.getMessage());
            return 0;
        }
    }

    /**
     * Update data of human.
     *
     * @param entity class {@link Human}.
     * @return 1 - успешное добавления, 0 - ошибка.
     */
    @Override
    public int update(Human entity) {
        try (Connection connection = ConnectDB.getConnection()) {
            return connection.createStatement().executeUpdate(
                    "UPDATE humans SET " +
                            "name = '" + entity.getName() +
                            "', lastName = '" + entity.getLastName() +
                            "', city = '" + entity.getCity() +
                            "', numberpassport = '" + entity.getNumberPassport() + "'" +
                            "WHERE id = " + entity.getId());
        } catch (SQLException e) {
            log.error("Ошибка при добавлении человека в СУБД: " + e.getMessage());
            return 0;
        }
    }

    /**
     * Delete human from database by object {@link Human}.
     *
     * @param entity class {@link Human}.
     */
    @Override
    public int delete(Human entity) {
        try (Connection connection = ConnectDB.getConnection()) {
            return connection.createStatement().executeUpdate(
                    "DELETE FROM humans" +
                            " WHERE humans.name = '" + entity.getName() +
                            "' AND lastName = '" + entity.getLastName() +
                            "' AND city = '" + entity.getCity() +
                            "' AND numberpassport = '" + entity.getNumberPassport() + "'");
        } catch (SQLException e) {
            log.error("Ошибка при удалении человека с СУБД: " + e.getMessage());
            return 0;
        }
    }

    /**
     * Delete human from database by ID.
     *
     * @param id
     */
    @Override
    public int deleteById(int id) {
        try (Connection connection = ConnectDB.getConnection()) {
            return connection.createStatement().executeUpdate("DELETE FROM humans WHERE id = " + id);
        } catch (SQLException | IndexOutOfBoundsException e) {
            log.error("Ошибка при удалении человека с СУБД: " + e.getMessage());
            return 0;
        }
    }

    /**
     * Delete all humans from database.
     */
    @Override
    public int deleteAll() {
        try (Connection connection = ConnectDB.getConnection()) {
            return connection.createStatement().executeUpdate("DELETE FROM humans");
        } catch (SQLException e) {
            log.error("Ошибка при очистке СУБД: " + e.getMessage());
            return 0;
        }
    }
}
