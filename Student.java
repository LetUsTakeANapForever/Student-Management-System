public class Student  {
    private String Stud_name;
    private String Stud_lastname;
    private String ID;
    private String Password;
    public Student(String id,String pw,String n,String ln){
        setID(id);
        setPassWord(pw);        
        setStudName(n);
        setStudLastname(ln);
    }
    public void setID(String id){
        this.ID = id;
    }
    public String getID(){
        return this.ID;
    }
    public void setPassWord(String pw){
        this.Password = pw;
    }
    public String getPassWord(){
        return this.Password;
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
}
