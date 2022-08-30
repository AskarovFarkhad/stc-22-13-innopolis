package pro;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DBUtil {


    private static Connection con;
    private static final String ALL_FIND = "SELECT * FROM";
    private static final String FIND_BY_ID = "SELECT * FROM ? WHERE id = ?";

    public DBUtil() throws SQLException {
        con = createConnection();
    }

    public static Connection createConnection() throws SQLException {
        if (con == null) {
            Properties properties = new Properties();
            try {
                FileInputStream fileInputStream = new FileInputStream("src/main/resources/db.properties");
                properties.load(fileInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return DriverManager.getConnection(
                    properties.getProperty("db.url"),
                    properties.getProperty("db.user"),
                    properties.getProperty("db.password"));
        }
        return con;
    }

    public ResultSet getById(Class clazz, int id) throws SQLException {
        String test = FIND_BY_ID.replaceFirst("\\?", clazz.getSimpleName()).replaceFirst("\\?", String.valueOf(id));
        PreparedStatement preparedStatement = con.prepareStatement(test);

        return preparedStatement.executeQuery();
    }

    public ResultSet getAll(Class clazz) throws SQLException {
        PreparedStatement preparedStatement = con.prepareStatement(ALL_FIND + " " + clazz.getSimpleName().toLowerCase());
        return preparedStatement.executeQuery();
    }
}
