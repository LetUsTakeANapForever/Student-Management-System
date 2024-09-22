import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class testStoringData {
    public static void main(String[] args) {

        test t = new test();
        t.setNum(1);
        t.setName("Alien2");
        t.setColor("Black");

        Connection connection = MySQLConnect.getConnection();   
        try{
            Statement statement = connection.createStatement();
            String query = "INSERT INTO aliens(alien_name, alien_color)VALUES " + t.JDBCToString() + ";";
            System.out.println(query);
            statement.executeUpdate(query);
            System.out.println("Succeeded");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
