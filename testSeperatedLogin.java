import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class testSeperatedLogin{

    static Connection connection = MySQLConnect.getConnection();
    static Statement statement;
    static Scanner sc = new Scanner(System.in);
    
    public static String selectChoice(){
        System.out.println("---Menu---");
        System.out.println("1.Teacher");
        System.out.println("2.Student");

        System.out.print("Choice : ");
        return sc.nextLine();
    }

    public static void choiceExecute(String choice){
        switch (choice) {
            case "1":
                teacherLogin();
                break;
            case "2":
                studentLogin();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public static void teacherLogin(){
        System.out.print("ID : ");
        String idInput = sc.nextLine();
        System.out.print("Password : ");
        String pwInput = sc.nextLine();

        try {
            statement = connection.createStatement();
            
            String query = String.format("SELECT teacher_id, teacher_password FROM teachers WHERE teacher_id = \"%s\" AND teacher_password = \"%s\"", idInput, pwInput);
            ResultSet rs = statement.executeQuery(query);

            if (rs.next())
                System.out.println("Loged in successfully");
            else
                System.out.println("Login Failed");

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void studentLogin(){
        try {
            statement = connection.createStatement();

            System.out.print("ID : ");
            String idInput = sc.nextLine();
            System.out.print("Password : ");
            String pwInput = sc.nextLine();
    
            try {
                statement = connection.createStatement();
                
                String query = String.format("SELECT std_id, std_password FROM students WHERE std_id = \"%s\" AND std_password = \"%s\"", idInput, pwInput);
                ResultSet rs = statement.executeQuery(query);
    
                if (rs.next())
                    System.out.println("Loged in successfully");
                else
                    System.out.println("Login Failed");
    
            } catch (SQLException e){
                e.printStackTrace();
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        choiceExecute(selectChoice());
    
    }
}