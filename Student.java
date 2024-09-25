import java.util.List;
import java.util.ArrayList;

public class Student {
    private String stdFirstName;
    private String stdLastName;
    private String stdID;
    private String stdPassword;
    private Register subjectThatRegistered;

    public Student(String id, String password, String firstname, String lastname) {
        setStdID(id);
        setStdPassword(password);
        setStdFirstName(firstname);
        setStdLastName(lastname);
        subjectThatRegistered = new Register();
    }

    public void register(Subject subject) {
        subjectThatRegistered.RegisterSubject(subject);; // argument มีแค่ subject อย่างเดียว, ลบ this ออก
    }

    public List<Subject> getAllSubjectThatRegistered() { // return type แก้เป็น List<Subject>
        return subjectThatRegistered.subjects(); // บรรทัดนี้ return subjectsThatRegistered.subjects;
    }

    public String getStdFirstName() {
        return stdFirstName;
    }

    public void setStdFirstName(String stdFirstName) {
        this.stdFirstName = stdFirstName;
    }

    public String getStdLastName() {
        return stdLastName;
    }

    public void setStdLastName(String stdLastName) {
        this.stdLastName = stdLastName;
    }

    public String getStdID() {
        return stdID;
    }

    public void setStdID(String stdID) {
        this.stdID = stdID;
    }

    public String getStdPassword() {
        return stdPassword;
    }

    public void setStdPassword(String stdPassword) {
        this.stdPassword = stdPassword;
    }
    public List<String> ShowAllHomework(Subject subject){ // แก้ return type จาก void เป็น List<String>, parameter เป็น Subject ถูกแล้ว
        // ข้างใน
        List<String> hwDetail = new ArrayList<>();// 1. สร้าง list เก็บ String hwDetail
        for(int i=0;i<subject.length;i++){// 2. วนลูป ดึงเอาดีเทลการบ้าน i มา add ลง hwDeatail
            hwDetail.add(subject.get(i).getDetail);
        }
        return hwDetail;// 3. หลังวนลูปเสร็จ return hwDetail ที่เป็นข้อมูลชนิด List
         // ลบบรรทัดนี้ออก
    }

    private class Register {
        private List<Subject> subjects;

        public Register() {
            subjects = new ArrayList<>();
        }

        public boolean checkRegistered(Subject subject) {
            for (int i = 0; i < subjectsThatRegistered.subjects.size(); i++) {
                if (subjectsThatRegistered.subjects.get(i) == null)
                    break;
                if (subjectsThatRegistered.subjects.get(i).equals(subject)) {
                    return true;
                }
            }
            return false;
        }

        public void RegisterSubject(Subject subject) {
            boolean isRegistered = checkRegistered(subject);
            if (!isRegistered) {
                subjects.add(subject);
                System.out.printf("%s %s %s successfully registered %s\n", getStdID(), getStdFirstName(),
                        getStdLastName(), subject.getSubjectName());
            } else
                System.out.printf("Error: %s already registered %s\n", getStdID(), subject.getSubjectName());
        }
    }
}
