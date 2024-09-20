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
        public void setSubjectThatRegistered(Subject subject) {
            SubjectThatRegistered[index++] = subject;
        }
    public Student(String id,String pw,String n,String ln){
        setStudID(id);
        setPassWord(pw);        
        setStudName(n);
        setStudLastname(ln);
    }
    public void setStudID(String id){
        this.StudId = id;
    }
    public String getStudID(){
        return this.StudId;
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
