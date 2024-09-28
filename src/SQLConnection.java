import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
    static Connection connection;
    public static Connection getConnection1(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management?user=root&password=");
            System.out.println("Connection Successful");
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    /* TODO : Add a new connection
    public static Connection getConnection2(){
        try{
            connection = DriverManager.getConnection();
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
    */
}
