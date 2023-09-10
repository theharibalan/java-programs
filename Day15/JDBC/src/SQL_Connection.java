import java.sql.*;
public class SQL_Connection {
    public static void main(String[] args) {
        String jdbcURL= "jdbc:derby:myDB;create=true";

        try{
            Connection con = DriverManager.getConnection(jdbcURL);
            System.out.println("Database has been created...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
