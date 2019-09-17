//package JDBC;
//import java.sql.*;
//import java.util.List;
//import java.util.Map;
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class jdbcconnections {
//    public static void main(String[] args) throws SQLException {
//
//         hostname  ec2-18-225-34-6.us-east-2.compute.amazonaws.com
//         1521 port number
//        Connection name hr
//         password hr
//        username hr
//
//        /*
//         3 main classes in JDBC
//         1 Connection
//         2 Statement is going to run our query in SQL
//         3 ResultSET class is going to store our table
//
//         This is the syntax to connect jdbc to the database arrow down
//         */
//
//    String oracleURL = "jdbc:oracle:thin:@ec2-18-225-34-6.us-east-2.compute.amazonaws.com:1521:xe";
//    String oralceUserName = "Hr";
//    String oraclePassword = "hr";
//
//        Connection connection = DriverManager.getConnection(oracleURL,oralceUserName,oraclePassword);
//        //Statement is to run the queries in SQL
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("select employee_id, first_name, last_name");
//        resultSet.next();
//        System.out.println("First row: " + resultSet.getObject("employee_id" + "first_name" +"last_name"));
//
//
//        statement.close();
//        connection.close();
//
//
//
//    /*
//    *
//    *
//    |   employee_id | first_name | last_name  | salary |
//    |           100 | Steven     | King       | 24000  |
//    |           101 | Neen       | Kochhar    | 17000  |
//    |           102 | Lex        | De Haan    | 17000  |
//    *
//    * */
//
//
//
//
//            // ec2-52-14-95-169.us-east-2.compute.amazonaws.com
//            // hr
//            // hr
//            // 1521
//            // xe
//            String oracleURL = "jdbc:oracle:thin:@ec2-52-14-95-169.us-east-2.compute.amazonaws.com:1521:xe";
//            String oracleUsername = "hr";
//            String oraclePassword = "hr";
//            /*
//             * 3 main classes in JDBC
//             *
//             * 1. Connection
//             * 2. Statement
//             * 3. ResultSet
//             * */
//
//            Connection connection = DriverManager.getConnection(oracleURL, oracleUsername, oraclePassword );
//            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            ResultSet resultSet = statement.executeQuery("select employee_id, first_name, last_name from employees");
//
//            resultSet.next();
//            resultSet.next();
//            resultSet.next();
//            resultSet.next();
//            resultSet.next();
//            resultSet.next();
//
//
//            System.out.println("First row--> "+resultSet.getObject("employee_id"));
//            System.out.println("First row--> "+resultSet.getObject("first_name"));
//            System.out.println("First row--> "+resultSet.getObject("last_name"));
//
//
//            System.out.println("First row--> "+resultSet.getObject(1));
//            System.out.println("First row--> "+resultSet.getObject(2));
//            System.out.println("First row--> "+resultSet.getObject(3));
//
//            System.out.println("Get row number: "+resultSet.getRow());
//
//            resultSet.beforeFirst();
//            resultSet.next();
//            System.out.println("Get row number: "+resultSet.getRow());
//            System.out.println("First row--> "+resultSet.getObject(1));
//            resultSet.last();
//
//            System.out.println("Number: "+resultSet.getRow());
//
//            ResultSetMetaData metaData = resultSet.getMetaData();
//
//            System.out.println("Column Number: "+metaData.getColumnCount());
//            System.out.println("Column Name: "+metaData.getColumnName(1));
//            System.out.println("Column name is: " + metaData.getCatalogName(1));
//            System.out.println("Column name is: " + metaData.getCatalogName(2));
//            System.out.println("Column name is: " + metaData.getCatalogName(3));
//
//            for (int column = 1; column <= 0 ; column++) {
//                    System.out.println(metaData.getCatalogName(column)+ "-> " + resultSet.getObject(column)) ;
//
//            }
//
//
//
//            statement.close();
//            connection.close();
//
//
//
//        }
//
//
//
//        }
//
//
//
