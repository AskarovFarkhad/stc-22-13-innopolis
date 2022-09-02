package homework_28.services;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

@Slf4j
public class ConnectDB {

    private static Connection connection;

    private ConnectDB() {
    }

    public static Connection getConnection() {
        if (connection == null) connection = connectionDB();
        return connection;
    }

    public static Connection connectionDB() {
        try {

            Properties dbProperties = new Properties();
            dbProperties.load(new FileInputStream("src/main/resources/humans_db.properties"));

            return DriverManager.getConnection(
                    dbProperties.getProperty("humans_db.url"),
                    dbProperties.getProperty("humans_db.user"),
                    dbProperties.getProperty("humans_db.password"));

        } catch (IOException e) {
            log.error("Ошибка при доступе к файлу с данными для соединения к СУБД: " + e.getMessage());
            return null;
        } catch (SQLException e) {
            log.error("Ошибка при подключении к СУБД: " + e.getMessage());
            return null;
        }
    }
}
