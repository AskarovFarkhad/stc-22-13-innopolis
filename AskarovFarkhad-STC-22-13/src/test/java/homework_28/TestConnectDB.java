package homework_28;

import homework_28.services.ConnectDB;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class TestConnectDB {

    private static Connection connection;

    @Before
    public void init() {
        connection = ConnectDB.getConnection();
    }

    @After
    public void close() throws SQLException {
        connection.close();
    }

    @Test
    public void ShouldGetJdbcConnection() throws SQLException {
        assertTrue(connection.isValid(1));
        assertFalse(connection.isClosed());
    }

    @Test
    public void ShouldGetProperties() throws IOException {
        assertFalse(ConnectDB.initProperties().isEmpty());
    }
}
