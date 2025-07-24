package org.leetcode.database;

import java.sql.*;

public class DatabaseConnector {

    public void databaseConnector(String DB_URL, String USERNAME, String PASSWORD) throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        String sqlQuery = "SELECT * From myDB";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int age = resultSet.getInt("age");
            String name = resultSet.getString("name");
            System.out.println(age + name);
        }

    }


}
