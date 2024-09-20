// Case that both teachers and students log in here

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.Statement;

public class testUnseperatedLogin {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID:");
        String idInput = sc.nextLine();
        System.out.print("Password:");
        String passwordInput = sc.nextLine();

        Connection connection = MySQLConnect.getConnection();

        try{
            Statement statement = connection.createStatement();
            String fetchStudent = "SELECT * FROM students";
            String fetchTeacher = "SELECT * FROM teachers";

            ResultSet stdSet = statement.executeQuery(fetchStudent);
            while(stdSet.next()) {
                String std_id = stdSet.getString("std_id");
                String std_pass = stdSet.getString("std_password");
                
                if (std_id.equals(idInput) && std_pass.equals(passwordInput)){
                    System.out.println("Welcom student " + std_id);
                    return;
                } 
            }
            
            ResultSet tSet = statement.executeQuery(fetchTeacher);
            while (tSet.next()) {
                String t_id = tSet.getString("t_id");
                String t_pass = tSet.getString("t_password");

                if (t_id.equals(idInput) && t_pass.equals(passwordInput)) {
                    System.out.println("Welcome teacher " + t_id);
                    return;  
                }
            }

            System.out.println("User not found");

        }catch (Exception e){
            e.printStackTrace();
        } 
        sc.close();
    }
}
