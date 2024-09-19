import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


// Test Connection
public class MySQLConnect {
    public static void main(String[] args) {
        // Database credentials
        String jdbcUrl = "jdbc:mysql://localhost:3306/test"; // form : "jdbc:mysql://localhost:3306/database name"
        String username = "root"; // MySQL username
        String password = ""; // MySQL password

        // Establish connection
        try {
            @SuppressWarnings("unused") // It's fine, it's intentional.
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password); 
            // The Connection interface represents a connection to a specific database (in this case, my MySQL database).
            // DriverManager is a class which responsible for establishing a connection to the database.
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}

