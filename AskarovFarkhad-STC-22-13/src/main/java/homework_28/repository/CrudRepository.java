package homework_28.repository;

import java.sql.SQLException;
import java.util.List;

public interface CrudRepository<T> {

    List<T> getAll() throws SQLException;

    T getById(int id) throws SQLException;

    int save(T entity) throws SQLException;

    int update(T entity) throws SQLException;

    int delete(T entity) throws SQLException;

    int deleteById(int id) throws SQLException;

    int deleteAll() throws SQLException;
}