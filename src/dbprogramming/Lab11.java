package dbprogramming;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Lab11 {

    public static void main(String[] args) {
        String URL = "jdbc:mysql://127.0.0.1:3306/mydb1";
        String username = "root";
        String password = "0856530589@Za";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, username, password);
            Statement statement= connection.createStatement();
            String sql = "DELETE FROM student "+"WHERE studentID='111111'";
            statement.executeUpdate(sql); 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Lab9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
