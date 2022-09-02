package homework_28.repository;

import java.sql.SQLException;
import java.util.List;

public interface CrudRepository<T> {

    List<T> getAll() throws SQLException;

    T getById(int id) throws SQLException;

    void create(T entity) throws SQLException;

    void update(T entity) throws SQLException;

    void delete(T entity) throws SQLException;

    void deleteById(int id) throws SQLException;

    void deleteAll() throws SQLException;

    long count() throws SQLException;
}