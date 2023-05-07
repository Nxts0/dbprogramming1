package dbprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab13 {
    
    public static void main(String[] args) {
        String URL = "jdbc:mysql://127.0.0.1:3306/mydb1";
        String username = "root";
        String password = "0856530589@Za";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, username, password);
            String sql = "UPDATE student SET email=? "+
                    "WHERE studentID=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "zzzz@gmail.com");
            preparedStatement.setString(2, "1111");
            preparedStatement.executeUpdate();
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Lab12.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
