import java.util.List;
import java.util.ArrayList;

public class Student {
    private String stdFirstName;
    private String stdLastName;
    private String stdID;
    private String stdPassword;
    private Register subjectsThatRegistered;

    public Student(String id, String password, String firstname, String lastname) {
        setStdID(id);
        setStdPassword(password);
        setStdFirstName(firstname);
        setStdLastName(lastname);
        subjectsThatRegistered = new Register();
    }

    public void register(Subject subject) {
        subjectsThatRegistered.RegisterSubject(subject);
    }

    public List<Subject> getAllSubjectThatRegistered() {
        return subjectsThatRegistered.subjects;
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

    public List<String> ShowAllHomework(Subject subject) {
        List<String> hwList = new ArrayList<>();
        for (int i = 0; i < subject.showHomework().size(); i++) {
            hwList.add(subject.showHomeworkDetailAt(i) + " " + subject.showHomeworkDeadLineAt(i));
        }
        return hwList;
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
