public class Student  {
    private String stdFirstName;
    private String stdLastName;
    private String stdID;
    private String stdPassword;
    private Subject[] subjectThatRegistered;
      public Student(String id,String password,String firstname,String lastname){
        setStdID(id);
        setStdPassWord(password);        
        setStdName(firstname);
        setStdLastname(lastname);
    }
    public Subject[] getAllSubjectThatRegistered() {
            return SubjectThatRegistered;
        }
    public Subject getSubjectThatRegistered(int index) {
            return SubjectThatRegistered[index];
        }
    public void subjectThatRegistered(Register subjectThatRegistered) {
            SubjectThatRegistered[index++] = subject;
        }
    public void setStdID(String id){
        this.StudId = id;
    }
    public String getStdID(){
        return this.stdId;
    }
    public void setStdPassWord(String password){
        this.Password = password;
    }
    public String getStdPassWord(){
        return this.Password;
    }
    public void setStdFirstName(String name){
        this.Stud_name = name;
    }
    public String getStdFirstName(){
        return this.Stud_name;
    }
    public void setStdLastname(String lastname){
        this.Stud_lastname = lastname;
    }
    public String getStdLastname(){
        return this.Stud_lastname;
    }
}
