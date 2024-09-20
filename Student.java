public class Student  {
    private String Stud_name;
    private String Stud_lastname;
    private String StudId;
    private String Password;
    private Subject[] SubjectThatRegistered;
    private int index=0;
        public Subject[] getAllSubjectThatRegistered() {
            return SubjectThatRegistered;
        }
        public Subject getSubjectThatRegistered(int index) {
            return SubjectThatRegistered[index];
        }
        public void RegisterSubject(Subject subject) {
            SubjectThatRegistered[index++] = subject;
        }
    public Student(String id,String password,String name,String lastname){
        setStudID(id);
        setPassWord(password);        
        setStudName(name);
        setStudLastname(lastname);
    }
    public void setStudID(String id){
        this.StudId = id;
    }
    public String getStudID(){
        return this.StudId;
    }
    public void setPassWord(String password){
        this.Password = password;
    }
    public String getPassWord(){
        return this.Password;
    }
    public void setStudName(String name){
        this.Stud_name = name;
    }
    public String getStudName(){
        return this.Stud_name;
    }
    public void setStudLastname(String lastname){
        this.Stud_lastname = lastname;
    }
    public String getStudLastname(){
        return this.Stud_lastname;
    }
}
