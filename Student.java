public class Student {
    private String stdFirstName;
    private String stdLastName;
    private String stdID;
    private String stdPassword;
    private Register subjectThatRegistered;

    public Student(String id, String password, String firstname, String lastname, Register regisSystem) {
        setStdID(id);
        setStdPassword(password);
        setStdFirstName(firstname);
        setStdLastName(lastname);
        setRegisterSystem(regisSystem);
    }

    public void setRegisterSystem(Register subjectThatRegistered) {
        this.subjectThatRegistered = subjectThatRegistered;
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

}
