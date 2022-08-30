package simple;

import pro.Car;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        DBConnection dbConnection = new DBConnection();
        Statement statement = dbConnection.createConnection();
        String id = "3";
        ResultSet resultSet = statement.executeQuery("select * from car where id = " + id);
resultSet.next();
        Car car = new Car(resultSet.getInt("id"), resultSet.getString("brand"), resultSet.getString("model"), resultSet.getString("color"), resultSet.getInt("driver_id"));

        int i = 0;
    }
}
