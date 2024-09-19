public class Student  {
    private String Stud_name;
    private String Stud_lastname;
    private String ID;
    public Student(String id,String n,String ln){
        this.ID = id;
        this.Stud_name = n;
        this.Stud_lastname = ln;
    }
    public void setID(String id){
        this.ID = id;
    }
    public String getID(){
        return this.ID;
    }
    
    public void setStudName(String n){
        this.Stud_name = n;
    }
    public String getStudName(){
        return this.Stud_name;
    }
    
    public void setStudLastname(String ln){
        this.Stud_lastname = ln;
    }
    public String getStudLastname(){
        return this.Stud_lastname;
    }
    public static void main(String[] args){
        Student s1 = new Student("ID" , "Name" , "Lastname");
        
    }
}
