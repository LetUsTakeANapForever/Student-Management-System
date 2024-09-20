package Code;

/**
 * Subject
 */
public class Subject {
    private String[] Subject_ID = {"01418211","01418231","01418233","01417111","01418233"};
    private String[] Subject_Name = {"Software Construction","Data Structures and Algorithms","Computer Architecture","Calculus I",
                                    "English for Opport"};
    private int index_for_ID=0;
    private int index_for_Name=0;
    public Subject(){
         
    }
    public void setSubjectID(String Subject_ID){
        while (this.Subject_ID[index_for_ID]!=null) {
            if (this.Subject_ID[index_for_ID]==null) {
                this.Subject_ID[index_for_ID++] = Subject_ID;
                break;
            }
         }
    }
    public void setSubjectName(String Subject_Name){
        while (this.Subject_Name[index_for_Name]!=null) {
            if (this.Subject_Name[index_for_Name]==null) {
                this.Subject_Name[index_for_Name++] = Subject_Name;
                break;
            }
         }
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
    public void show(){
        for(int i=0;i<Subject_ID.length;i++)
            System.out.println(""+Subject_ID[i]+"\t"+Subject_Name[i]);

    }

    public static void main(String[] args) {
        Subject s = new Subject();
        s.show();
    }
    
}