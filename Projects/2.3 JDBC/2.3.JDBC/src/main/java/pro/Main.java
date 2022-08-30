package pro;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
       DBUtil dbUtil = new DBUtil();
       dbUtil.getById(Car.class, 3);
       ResultSet resultSet = dbUtil.getAll(Car.class);

       while (resultSet.next()) {
           System.out.println(resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getString(4));
       }
    }
}
