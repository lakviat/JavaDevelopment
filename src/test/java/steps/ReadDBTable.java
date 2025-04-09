package steps;

import io.cucumber.java.en.Given;
import utilities.Config;

import java.sql.*;

public class ReadDBTable {
    @Given("This function allows to read a given table")
    public void this_function_allows_to_read_a_given_table() {

    }
    @Given("User should be able to return the output of the table {string}")
    public void user_should_be_able_to_return_the_output_of_the_table(String tableName) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Config.getProperty("mysql.url"), Config.getProperty("mysql.username"), Config.getProperty("mysql.password"));

            // Create a statement object to execute the query
            Statement stmt = conn.createStatement();

            // Execute a query
            String query = "SELECT * FROM " + tableName;
            ResultSet rs = stmt.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) System.out.print(",  ");
                    String columnValue = rs.getString(i);
                    System.out.print(columnValue + " " + rsmd.getColumnName(i));
                }
                System.out.println("");
            }

            // Process the results
            while (rs.next()) {
                // Access data using column names or indexes
                int id = rs.getInt("id"); // Assuming 'id' is a column in the table
                String name = rs.getString("name"); // Assuming 'name' is a column in the table
                // You can retrieve other columns in a similar way

                // Do something with the data
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Don't forget to close the ResultSet, Statement, and Connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
