import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class testSubmitGrade {

    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student ID : ");
        String stdIDInput = sc.nextLine();
        System.out.print("Subject : ");
        String subjectName = sc.nextLine(); // prolly subject_id now
        System.out.print("Grade : ");
        String gradeInput = sc.nextLine();

        submitGrade(stdIDInput, subjectName, gradeInput);

        sc.close();
    }

    public static void submitGrade(String stdIDInput,String subject, String gradeInput){
        Connection connection = MySQLConnect.getConnection();
        try{
            Statement statement = connection.createStatement();
            String query = String.format("UPDATE %s SET grade = \"%s\" WHERE std_id = \"%s\";", subject, gradeInput, stdIDInput);
            System.out.println(query);
            statement.executeUpdate(query);
            System.out.println("Added");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        input();
    }
}
