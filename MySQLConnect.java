import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


// Test Connection
public class MySQLConnect {
    
    private static Connection connection;
    public static Connection getConnection() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/test2";
        String username = "root";
        String password = "";

        try{
            connection = DriverManager.getConnection(jdbcUrl, username, password);
        }catch (SQLException e){
            e.printStackTrace();
        }

        return connection;
    }
}

