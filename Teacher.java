
public class Teacher {
    private String firstname;
    private String lastname;
    private String ID;
    private String password;
    private Subject[] teachingSubject;
    private final static int MAX_SUBJECT_PER_TERM = 5;
    private int index;

    public Teacher(String ID, String password, String firstname, String lastname) {
        setFirstname(firstname);
        setLastname(lastname);
        setID(ID);
        setPassword(password);
        teachingSubject = new Subject[MAX_SUBJECT_PER_TERM];
    }

    public Subject[] getAllTeachingSubject() {
        return teachingSubject;
    }

    public Subject getTeachingSubjectAt(int index) {
        return teachingSubject[index];
    }

    public void addTeachingSubject(Subject subject) {
        this.teachingSubject[index++] = subject;
        System.out.printf("%s %s %s is successfully assigned to teach %s\n", getID(), getFirstname(), getLastname(), subject.getSubjectName());
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
    public void addHomework(Subject subject,Homework homework){
        subject.addHomework(homework);
    }

    public void submitGrade(Student std, Subject subject, String grade) {
        boolean isTeached = checkTeacingSubject(subject);
        if (isTeached){
            for (int i = 0; i < std.getAllSubjectThatRegistered().length; i++) {
                if (std.getSubjectThatRegisteredAt(i) == null)
                    break;
                if (std.getSubjectThatRegisteredAt(i).equals(subject)) {
                    std.getSubjectThatRegisteredAt(i).setGrade(grade);
                    return;
                }
            }System.out.printf("%s hasn't registered %s %s\n", std.getStdFirstName(), subject.getSubjectID(),
                subject.getSubjectName());
        }
    }

    public boolean checkTeacingSubject(Subject subject) {
        for (int i = 0; i < getAllTeachingSubject().length; i++){
            if (getTeachingSubjectAt(i) == null) break;
            if (subject.equals(getTeachingSubjectAt(i)))
                return true;
        }
        System.out.printf("%s doesn't teach %s %s\n", getID(), subject.getSubjectID(), subject.getSubjectName());
        return false;
    }
}
