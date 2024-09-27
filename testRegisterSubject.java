import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class testRegisterSubject {
    static Scanner sc = new Scanner(System.in);
    static Connection connection = MySQLConnect.getConnection();

    public static void displayMenu() {
        System.out.println("---Menu---");
        System.out.println("1.create subject table");
        System.out.println("2.add registered student");
        System.out.println("3.display data from each subeject table");
        System.out.println("4.add all registered students");
        System.out.println("5.add a subject to system");
        System.out.println("6.add a student to Registration table");
    }

    public static void createTable(String tableName) {
        try {
            Statement statement = connection.createStatement();
            String query = String.format(
                    "CREATE TABLE IF NOT EXISTS %s (std_id VARCHAR(15), grade CHAR(1));",
                    tableName);
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addStudent(String tableName) {
        System.out.print("std_id : ");
        String std_id = sc.nextLine();

        if (!doesExist(std_id)) return;

        Connection connection = MySQLConnect.getConnection();
        try {
            Statement statement = connection.createStatement();
            String query = String.format(
                    "INSERT INTO %s(std_id) VALUES(\"%s\");", tableName,
                    std_id);
            statement.executeUpdate(query);
            System.out.println("Added");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean doesExist(String idInput){
            try{
                Statement statement = connection.createStatement();
                String qeury = String.format("SELECT * FROM students WHERE std_id = \"%s\"", idInput);
                ResultSet stdSet = statement.executeQuery(qeury);
                if(stdSet.next()) {
                    String std_id = stdSet.getString("std_id");
                    System.out.println("Exist : " + std_id);
                    return true;
                }
                System.out.println("Student doesn't exist in the system.");
                return false;
            }catch (SQLException e){
                e.printStackTrace();
                return false;
            }
    }

    public static void displayStudent(String tableName) { // USE JOIN CONCEPT
            try{
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery("SELECT * FROM " + tableName);
                while(rs.next()) {
                    String std_id = rs.getString("std_id");
                    // String std_firstname = rs.getString("std_firstname");
                    // String std_lastname = rs.getString("std_lastname");
                    String grade = rs.getString("grade");
                    
                    System.out.printf("%s %s\n", std_id, grade); //std_firstname, std_lastname,
                }   
            }catch (SQLException e){
                e.printStackTrace();
            }
    }

    public static void addAllStudents(String tableName) {
        List<String>stdList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            
            String fecthStudents = "SELECT std_id FROM students";
            ResultSet rs = statement.executeQuery(fecthStudents);

            while (rs.next()){
                String id = rs.getString("std_id");
                stdList.add(String.format("\"%s\"", id));
            }

            for (int i = 0; i < stdList.size(); i ++){
                    String insertionQuery = String.format(
                    "INSERT INTO %s(std_id) VALUES(%s);", tableName,
                    stdList.get(i));
                    System.out.println(insertionQuery);
                    statement.executeUpdate(insertionQuery);
                    System.out.println("Added " + (i + 1));
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addSubjectToSystem(String tableName){
        System.out.print("subject_id : ");
        String subeject_id = sc.nextLine();
        System.out.print("subject_name : ");
        String subject_name = sc.nextLine();
        System.out.print("teacher_id : ");
        String teacher_id = sc.nextLine();

        Connection connection = MySQLConnect.getConnection();
        try {
            Statement statement = connection.createStatement();

            String query = String.format(
                    "INSERT INTO %s(subject_id, subject_name, teacher_id) VALUES(\"%s\", \"%s\", \"%s\");", tableName,
                    subeject_id, subject_name, teacher_id);
            statement.executeUpdate(query);
            System.out.println("Added");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void registerStudent(String tableName) {
        System.out.print("student_id : ");
        String student_id = sc.nextLine();
        System.out.print("subject_name : ");
        String subject_id = sc.nextLine();

        try {
            Statement statement = connection.createStatement();
            String query = String.format("INSERT INTO %s (std_id, subject_id) VALUES(\"%s\", \"%s\");", tableName, student_id, subject_id);
            statement.executeUpdate(query);
            System.out.println("Added");
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        displayMenu();
        System.out.print("Choice : ");
        String choice = sc.nextLine();
        System.out.print("Input table name : ");
        String tableName = sc.nextLine();

        switch (choice) {
            case "1":
                createTable(tableName);
                break;
            case "2":
                addStudent(tableName);
                break;
            case "3":
                displayStudent(tableName);break;
            case "4":
                addAllStudents(tableName);break;
            case "5" :
                addSubjectToSystem(tableName);break;
            case "6":
                registerStudent(tableName);break;
            default:
                System.out.println("Invalid chocie");
        }

        sc.close();
    }
}