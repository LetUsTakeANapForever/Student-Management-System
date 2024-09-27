import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.*;

public class Subject {
    private String Subject_ID;
    private String Subject_Name;
    private String grade;
    private List<Homework> homework = new ArrayList<>();

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

    public void addHomework(String detail, String deadline) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate deadlineDate = LocalDate.parse(deadline, formatter);
        Homework hw = new Homework(detail, deadlineDate);
        homework.add(hw);
    }

    public List<Homework> showHomework() {
        return homework;
    }

    public String showHomeworkDetailAt(int index) {
        return homework.get(index).getDetail();
    }

    public LocalDate showHomeworkDeadLineAt(int index) {
        return homework.get(index).getDeadline();
    }

    private class Homework {
        private LocalDate deadline;
        private String Detail;

        public Homework(String detail, LocalDate deadline) {
            setDetail(detail);
            setDeadline(deadline);
        }

        public String getDetail() {
            return Detail;
        }

        public void setDetail(String detail) {
            Detail = detail;
        }

        public LocalDate getDeadline() {
            return this.deadline;
        }

        public void setDeadline(LocalDate deadline) {
            this.deadline = deadline;
        }
    }

}
