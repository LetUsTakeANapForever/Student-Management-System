public class Subject {
    private String[] Subject_ID;
    private String[] Subject_Name;
    private int index_for_ID=0;
    private int index_for_Name=0;
    
    public Subject(String Subject_ID,String Subject_Name){
         setSubjectID(Subject_ID);
         setSubjectName(Subject_Name);
    }
    public void setSubjectID(String Subject_ID){
        this.Subject_ID[index_for_ID++] = Subject_ID;   
    }
    public void setSubjectName(String Subject_Name){
        this.Subject_Name[index_for_Name++] = Subject_Name;
    }
    public String[] getAllSubjectID(){
        return Subject_ID;
    }
    public String getSubjectID(int index){
        return Subject_ID[index];
    }

    public String[] getAllSubjectName(){
        return Subject_Name;
    }
    public String getSubjectName(int index){
        return Subject_Name[index];
    }
    
    
}
