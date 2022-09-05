package homework_28;

import homework_28.entity.Human;
import homework_28.repository.impl.CrudRepositoryImpl;
import homework_28.services.ConnectDB;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.sql.SQLException;

@Slf4j
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestCrudRepository {

    private static final CrudRepositoryImpl repository = new CrudRepositoryImpl();
    private static Connection connection;

    @Test
    @Order(1)
    public void createTable() {
        log.info("createTable running ... ");
        connection = ConnectDB.getConnection();
        repository.createTable();
        Assertions.assertNotNull(connection);
    }

    @Test
    @Order(2)
    public void shouldSaveEntity() {
        log.info("ShouldSaveEntity running ... ");

        int hasResult = repository
                .save(new Human("admin0", "admin0", "admin0", "admin0"));
        repository
                .save(new Human("admin1", "admin1", "admin1", "admin1"));
        repository
                .save(new Human("admin3", "admin3", "admin3", "admin3"));
        repository
                .save(new Human("admin4", "admin4", "admin4", "admin4"));

        Assertions.assertEquals(1, hasResult);
    }

    @Test
    @Order(3)
    public void shouldGetAllEntity() {
        log.info("shouldGetAll running ... ");
        Assertions.assertEquals(4, repository.getAll().size());
    }

    @Test
    @Order(4)
    public void shouldGetById() {
        log.info("shouldSelectData running ... ");
        Assertions.assertNotNull(repository.getById(1));
    }

    @Test
    @Order(5)
    public void shouldGetByIdException() {
        log.info("shouldSelectDataException running ... ");
        Assertions.assertNull(repository.getById(100));
    }

    @Test
    @Order(6)
    public void shouldDeleteById() {
        log.info("shouldDeleteData running ... ");
        Assertions.assertEquals(1, repository.deleteById(1));
    }

    @Test
    @Order(7)
    public void shouldDeleteByIdException() {
        log.info("shouldDeleteDataException running ... ");
        Assertions.assertEquals(0, repository.deleteById(100));
    }

    @Test
    @Order(8)
    public void shouldDeleteByEntity() {
        log.info("shouldDeleteByEntity running ... ");
        Assertions
                .assertEquals(1, repository
                        .delete(new Human("admin1", "admin1", "admin1", "admin1")));
    }

    @Test
    @Order(9)
    public void shouldDeleteByEntityException() {
        log.info("shouldDeleteByEntityException running ... ");
        Assertions
                .assertEquals(0, repository
                        .delete(new Human("admin100", "admin100", "admin100", "admin100")));
    }

    @Test
    @Order(10)
    public void shouldUpdateEntity() {
        log.info("shouldUpdateEntity running ... ");
        Human human = new Human(4, "admin4", "admin4", "admin4", "admin4");

        human.setName("user");
        human.setLastName("user");
        human.setCity("user");
        human.setNumberPassport("user");

        Assertions.assertEquals(1, repository.update(human));
    }

    @Test
    @Order(11)
    public void shouldDeleteAllEntity() {
        log.info("shouldDeleteAllEntity running ... ");
        Assertions.assertEquals(2, repository.deleteAll());
    }

    @Test
    @Order(12)
    public void dropTable() {
        log.info("dropTable running ... ");
        try {
            connection
                    .prepareStatement("DROP TABLE IF EXISTS humans")
                    .execute();
            connection.close();
            Assertions.assertTrue(connection.isClosed());
        } catch (SQLException e) {
            log.error("Ошибка при удалении таблицы: " + e.getCause());
        }
    }
}
