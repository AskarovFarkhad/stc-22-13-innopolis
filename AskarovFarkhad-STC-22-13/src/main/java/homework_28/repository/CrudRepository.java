package homework_28.repository;

import java.util.List;

public interface CrudRepository<T> {

    List<T> getAll();

    T getById(int id);

    void create(T entity);

    void update(T entity);

    void delete(T entity);

    void deleteById(int id);

    void deleteAll();

    long count();
}