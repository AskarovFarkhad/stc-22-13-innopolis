package homework_28.repository.impl;

import homework_10.Human;
import homework_28.repository.CrudRepository;

import java.util.List;

public class CrudRepositoryImpl implements CrudRepository<Human> {

    @Override
    public List<Human> getAll() {
        return null;
    }

    @Override
    public Human getById(int id) {
        return null;
    }

    @Override
    public void create(Human entity) {

    }

    @Override
    public void update(Human entity) {

    }

    @Override
    public void delete(Human entity) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public long count() {
        return 0;
    }
}
