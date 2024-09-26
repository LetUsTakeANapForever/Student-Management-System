import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class testRegisterSubject {
    static Scanner sc = new Scanner(System.in);

    public static void displayMenu() {
        System.out.println("---Menu---");
        System.out.println("1.create subject table");
        System.out.println("2.add registered student");
        System.out.println("3.display data");
        System.out.println("4.add all registered students");
    }

    public static void createTable(String tableName) {
        Connection connection = MySQLConnect.getConnection();
        try {
            Statement statement = connection.createStatement();
            String query = String.format(
                    "CREATE TABLE IF NOT EXISTS %s (std_id VARCHAR(15), std_firstname VARCHAR(30), std_lastname VARCHAR(30), grade CHAR(1));",
                    tableName);
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addStudent(String tableName) {
        System.out.print("std_id : ");
        String std_id = sc.nextLine();
        System.out.print("std_firstname : ");
        String std_firstname = sc.nextLine();
        System.out.print("std_lastname : ");
        String std_lastname = sc.nextLine();

        if (!doesExist(std_id, std_firstname, std_lastname)) return;

        Connection connection = MySQLConnect.getConnection();
        try {
            Statement statement = connection.createStatement();
            String query = String.format(
                    "INSERT INTO %s(std_id, std_firstname, std_lastname) VALUES(\"%s\", \"%s\", \"%s\");", tableName,
                    std_id, std_firstname, std_lastname);
            statement.executeUpdate(query);
            System.out.println("Added");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean doesExist(String idInput, String firstName, String lastName){
            Connection connection = MySQLConnect.getConnection();
            try{
                Statement statement = connection.createStatement();
                ResultSet stdSet = statement.executeQuery("SELECT * FROM students");
                while(stdSet.next()) {
                    String std_id = stdSet.getString("std_id");
                    String std_firstname = stdSet.getString("std_firstname");
                    String std_lastname = stdSet.getString("std_lastname");
                    
                    if (std_id.equals(idInput) && std_firstname.equals(firstName) && std_lastname.equals(lastName)){
                        System.out.println("Exist : " + std_id);
                        return true;
                    }
                }
                System.out.println("Student doesn't exist in the system.");
                return false;
            }catch (SQLException e){
                e.printStackTrace();
                return false;
            }
    }

    public static void displayStudent(String tableName) {
        Connection connection = MySQLConnect.getConnection();
            try{
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery("SELECT * FROM " + tableName);
                while(rs.next()) {
                    String std_id = rs.getString("std_id");
                    String std_firstname = rs.getString("std_firstname");
                    String std_lastname = rs.getString("std_lastname");
                    String grade = rs.getString("grade");
                    
                    System.out.printf("%s %s %s %s\n", std_id, std_firstname, std_lastname, grade);
                }   
            }catch (SQLException e){
                e.printStackTrace();
            }
    }

    public static void addAllStudents(String tableName) {
        List<String>stdList = new ArrayList<>();
        Connection connection = MySQLConnect.getConnection();
        try {
            Statement statement = connection.createStatement();
            
            String fecthStudents = "SELECT * FROM students";
            ResultSet rs = statement.executeQuery(fecthStudents);

            while (rs.next()){
                String id = rs.getString("std_id");
                String firstName = rs.getString("std_firstname");
                String lastName = rs.getString("std_lastname");
                stdList.add(String.format("\"%s\", \"%s\", \"%s\"", id, firstName, lastName));
            }

            for (int i = 0; i < stdList.size(); i ++){
                    String insertionQuery = String.format(
                    "INSERT INTO %s(std_id, std_firstname, std_lastname) VALUES(%s);", tableName,
                    stdList.get(i));
                    System.out.println(insertionQuery);
                    statement.executeUpdate(insertionQuery);
                    System.out.println("Added " + (i + 1));
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        displayMenu();
        System.out.print("Choice : ");
        String choice = sc.nextLine();
        System.out.print("Input table name : ");
        String subjectName = sc.nextLine();

        switch (choice) {
            case "1":
                createTable(subjectName);
                break;
            case "2":
                addStudent(subjectName);
                break;
            case "3":
                displayStudent(subjectName);break;
            case "4":
                addAllStudents(subjectName);break;
            default:
                System.out.println("Invalid chocie");
        }

        sc.close();
    }
}