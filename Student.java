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

    public void setRegisterSystem(Register subjectThatRegistered) { // ลบทิ้ง
        this.subjectThatRegistered = subjectThatRegistered;
    }

    public void register(Subject subject) {
        subjectThatRegistered.RegisterSubject(this, subject);; // argument มีแค่ subject อย่างเดียว, ลบ this ออก
    }

    public Subject[] getAllSubjectThatRegistered() { // return type แก้เป็น List<Subject>
        return subjectThatRegistered.getAllSubjects(); // บรรทัดนี้ return subjectsThatRegistered.subjects;
    }

    public Subject getSubjectThatRegisteredAt(int index) { // ลบทิ้ง
        return subjectThatRegistered.getSubjectAt(index);
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
    public void ShowAllHomework(Subject subject){ // แก้ return type จาก void เป็น List<String>, parameter เป็น Subject ถูกแล้ว
        // ข้างใน
        // 1. สร้าง list เก็บ String hwDetail
        // 2. วนลูป ดึงเอาดีเทลการบ้าน i มา add ลง hwDeatail
        // 3. หลังวนลูปเสร็จ return hwDetail ที่เป็นข้อมูลชนิด List
        subject.showHomework(); // ลบบรรทัดนี้ออก
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
