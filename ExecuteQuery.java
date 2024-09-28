import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class ExecuteQuery {
    public static void main(String[] args) {

        
        
        String jdbcUrl = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "";
        
        // or String connectionURL = "jdbc:mysql://localhost:3306/student-management?user=root&password=";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password); // connectionURL as argument instead
            // The Statement interface is used to execute static SQL queries.
            Statement statement = connection.createStatement(); // Create a new Statement object for sending SQL statements to the database
            
            System.out.println("Query executed successfully!");


            // Example Query
            String query = "SELECT * FROM users";
            // A ResultSet is a table of data 
            ResultSet result = statement.executeQuery(query); // Execute the statement
            
            JFrame f = new JFrame();
            JButton b = new JButton("Fetch");
            String[] columns = {"ID", "Name", "Age"};
            DefaultTableModel tModel = new DefaultTableModel(columns, 0);
            JTable t = new JTable(tModel);
            JScrollPane scrollPane = new JScrollPane(t);
            f.getContentPane().setLayout(new BorderLayout());
            f.getContentPane().add(b, BorderLayout.CENTER);
            f.getContentPane().add(scrollPane, BorderLayout.SOUTH);
            b.addActionListener((e) -> {
                try{
                    while(result.next()){
                        String user_id = result.getString("user_id");
                        String user_name = result.getString("user_name");
                        int user_age = result.getInt("user_age");
                        System.out.printf("ID : %s | Name : %s | Age : %d \n", user_id, user_name, user_age);
                    
                    ArrayList <String> dataArrayList = new ArrayList<>();
                    String[] data = {user_id, user_name, user_age+""};
                    tModel.addRow(data);
                    dataArrayList.add(user_id);
                    dataArrayList.add(user_name);
                    dataArrayList.add(user_age+"");
                }
                    // It's a must to handle SQLException for ResultSet object
                }catch (SQLException ex){ System.out.println("SQLException"+ex.getMessage());}
        });
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
