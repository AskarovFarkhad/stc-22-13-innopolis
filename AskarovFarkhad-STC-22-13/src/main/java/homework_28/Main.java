package homework_28;

import homework_28.repository.impl.CrudRepositoryImpl;

import java.sql.SQLException;

public class Main {

    public static final CrudRepositoryImpl repository = new CrudRepositoryImpl();

    public static void main(String[] args) throws SQLException {
        repository.createTable();
    }
}
