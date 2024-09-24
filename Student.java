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

    public void setRegisterSystem(Register subjectThatRegistered) {
        this.subjectThatRegistered = subjectThatRegistered;
    }

    public void register(Subject subject) {
        subjectThatRegistered.RegisterSubject(this, subject);;
    }

    public Subject[] getAllSubjectThatRegistered() {
        return subjectThatRegistered.getAllSubjects();
    }

    public Subject getSubjectThatRegisteredAt(int index) {
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
    public void ShowAllHomework(Subject subject){
        subject.showHomework();
    }

    private class Register {
        private Subject[] subjects;
        private final static int MAX_SUBJECT_PER_TERM = 5;
        private int index;
    
        public Register() {
            subjects = new Subject[MAX_SUBJECT_PER_TERM];
        }
    
        public boolean CheckRegistered(Student student, Subject subject) {
            for (int i = 0; i < student.getAllSubjectThatRegistered().length; i++) {
                if (student.getSubjectThatRegisteredAt(i) == null) break;
                if (student.getSubjectThatRegisteredAt(i).equals(subject)) {
                    return true;
                }
            }
            return false;
        }
    
        public void RegisterSubject(Student student, Subject subject) {
            boolean Check = CheckRegistered(student, subject);
            if (Check == false && index < MAX_SUBJECT_PER_TERM) {
                subjects[index++] = subject;
                System.out.printf("%s %s %s successfully registered %s\n", student.getStdID(), student.getStdFirstName(), student.getStdLastName(), subject.getSubjectName());
                student.setRegisterSystem(this);
            }else
                System.out.printf("Error: %s already registered %s\n", student.getStdID(), subject.getSubjectName());
        }
    
        public Subject[] getAllSubjects() {
            return subjects;
        }
    
        public Subject getSubjectAt(int index) {
            return subjects[index];
        }
    }

}
