import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class testAddHomework {

    static Scanner sc = new Scanner(System.in);
    static Connection connection = MySQLConnect.getConnection();
    static String teacherIDInput;

    public static void input(){
        System.out.print("Student ID : ");
        String stdIDInput = sc.nextLine();
        System.out.print("Subject ID : ");
        String subjectID = sc.nextLine();
        System.out.print("Description : ");
        String description = sc.nextLine();
        System.out.print("DUE DATE : ");
        String dueDateInput = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dueDate = LocalDate.parse(dueDateInput, formatter);

        addHomework(stdIDInput, subjectID, description, dueDate);

        sc.close();
    }

    public static void addHomework(String std_id, String subject_id, String description, LocalDate dueDate){
        Date sqlDate = Date.valueOf(dueDate);
        try{
            Statement statement = connection.createStatement();
            String checkStd = String.format("SELECT std_id FROM students WHERE std_id = \"%s\"", std_id);
            ResultSet rs = statement.executeQuery(checkStd);
            if (!rs.next()) return;

            String insertionQuery = String.format("INSERT INTO homework (assigned_date, due_date, subject_id, description, assigned_to_std, assigned_by_teacher) VALUES (CURRENT_DATE(), \" %s\", \"%s\", \"%s\", \"%s\", \"%s\");", sqlDate, subject_id, description, std_id, teacherIDInput);
            statement.executeUpdate(insertionQuery);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static boolean teacherLogin() {
        
        System.out.print("Teacher ID : ");
        teacherIDInput = sc.nextLine();
        System.out.print("Password : ");
        String pwInput = sc.nextLine();

        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(String.format("SELECT teacher_id FROM teachers WHERE teacher_id = \"%s\" AND teacher_password = \"%s\";", teacherIDInput, pwInput));
            if (rs.next()){
                System.out.println("Exist : " + rs.getString("teacher_id"));
                return true;
            }
            System.out.println("Incorrect id or password");
            return false;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public static void main(String[] args) {
        if(teacherLogin())
            input();
    }
}
