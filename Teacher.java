
public class Teacher {
    private String firstname;
    private String lastname;
    private String ID;
    private String password;
    private Subject teachingSubject;

    public Teacher(String ID, String password, String firstname, String lastname, Subject subject) {
        setFirstname(firstname);
        setLastname(lastname);
        setID(ID);
        setPassword(password);
        setTeachingSubject(subject);
    }

    public Subject getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(Subject subject) {
        teachingSubject = subject;
        System.out.printf("%s %s %s is successfully assigned to teach %s\n", getID(), getFirstname(), getLastname(),
                subject.getSubjectName());
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstName) {
        this.firstname = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastName) {
        this.lastname = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addHomework(Student std, Subject subject, String detail) {
        boolean isTeached = checkTeacingSubject(subject);
        if (isTeached) {
            for (int i = 0; i < std.getAllSubjectThatRegistered().size(); i++) {
                if (std.getAllSubjectThatRegistered().get(i) == null)
                    break;
                if (std.getAllSubjectThatRegistered().get(i).equals(subject)) {
                    std.getAllSubjectThatRegistered().get(i).addHomework(detail);
                    return;
                }
            }
            System.out.printf("%s hasn't registered %s %s\n", std.getStdFirstName(), subject.getSubjectID(),
                    subject.getSubjectName());
        }
    }

    public void submitGrade(Student std, Subject subject, String grade) {
        boolean isTeached = checkTeacingSubject(subject);
        if (isTeached) {
            for (int i = 0; i < std.getAllSubjectThatRegistered().size(); i++) {
                if (std.getAllSubjectThatRegistered().get(i) == null)
                    break;
                if (std.getAllSubjectThatRegistered().get(i).equals(subject)) {
                    std.getAllSubjectThatRegistered().get(i).setGrade(grade);
                    return;
                }
            }
            System.out.printf("%s hasn't registered %s %s\n", std.getStdFirstName(), subject.getSubjectID(),
                    subject.getSubjectName());
        }
    }

    public boolean checkTeacingSubject(Subject subject) {
        if (subject == teachingSubject)
            return true;
        System.out.printf("%s doesn't teach %s %s\n", getID(), subject.getSubjectID(), subject.getSubjectName());
        return false;
    }
}
