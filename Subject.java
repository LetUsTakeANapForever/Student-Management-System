public class Subject {
    private String Subject_ID;
    private String Subject_Name;
    private String grade;
    
    
    public Subject(String Subject_ID,String Subject_Name){
         setSubjectID(Subject_ID);
         setSubjectName(Subject_Name);
    }
    public void setSubjectID(String Subject_ID){
        this.Subject_ID = Subject_ID;   
    }
    public void setSubjectName(String Subject_Name){
        this.Subject_Name = Subject_Name;
    }
    
    public String getSubjectID(){
        return Subject_ID;
    }
    public String getSubjectName(){
        return Subject_Name;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getGrade() {
        return grade;
    }
    
}
