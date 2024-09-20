
public class Teacher {
    private String firstname;
    private String lastname;
    private String ID;
    private String password;
    private Subject subject;

    public Teacher(String ID, String password, String firstname, String lastname, Subject subject) {
        setFirstname(firstname);
        setLastname(lastname);
        setID(ID);
        setPassword(password);
        setSubject(subject);
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
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

    public void summitGrade(Student std, Subject subject, String grade) {
        for (int i = 0; i < std.getAllSubjectThatRegistered().length; i++){
            if (std.getSubjectThatRegisteredAt(i) == null) break;
            if (std.getSubjectThatRegisteredAt(i).equals(subject))
                std.getSubjectThatRegisteredAt(i).setGrade(grade);
        }
    }
}
