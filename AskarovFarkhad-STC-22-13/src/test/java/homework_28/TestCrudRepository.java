package homework_28;

import homework_28.entity.Human;
import homework_28.repository.impl.CrudRepositoryImpl;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestCrudRepository {

    private static final CrudRepositoryImpl repository = new CrudRepositoryImpl();

    @Test
    public void save() {
        assertEquals(1, repository.save(new Human("null", "null", "null", "null")));
    }
}
