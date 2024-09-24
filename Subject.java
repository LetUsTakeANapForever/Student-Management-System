import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Subject {
    private String Subject_ID;
    private String Subject_Name;
    private String grade;
    private List<Homework> homeworks = new ArrayList<>();
    private LocalDateTime deadline;
    public Subject(String Subject_ID, String Subject_Name) {
        setSubjectID(Subject_ID);
        setSubjectName(Subject_Name);
    }

    public void setSubjectID(String Subject_ID) {
        this.Subject_ID = Subject_ID;
    }

    public void setSubjectName(String Subject_Name) {
        this.Subject_Name = Subject_Name;
    }

    public String getSubjectID() {
        return Subject_ID;
    }

    public String getSubjectName() {
        return Subject_Name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
    public void addHomework(Homework homework){ // parameter เป็น String detail
        // ตรงนี้ต้องสร้างวัตถุคลาสการบ้านขึ้นมาแล้วส่งค่า detail ที่รับparameterมาใส่ตอนสร้างทันที
        homeworks.add(homework); // บรรทัดนี้ .add(ชื่อตัวแปรวัตถุการบ้านเมื่อกี้)
    }
    public ArrayList showHomework(){ // return type ควรเป็น List<Homework>
        return homeworks;
    }

    // เพิ่ม method 
    // showHomeworkDetailAt(index, int) : String
    // ตรง return ให้เป็น ดึงค่า homeworks ที่เป็น list มา get ตาม index แล้วดึง detail ของแต่ละการบ้านออกมา 
     
    private class Homework{
        //DeadLine:LocalDateTime
        private String Detail;

        // เพิ่ม default Constructor  Homework(String detail) แล้ว setDetail ข้างใน
        
        public Homework(String detail,/*LocalDateLine deadline*/){
            setDetail(detail);
        }
        public String getDetail() {
            return Detail;
        }
        public void setDetail(String detail) {
            Detail = detail;
        }
    }

}
