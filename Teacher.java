
public class Teacher{
    private String firstname;
    private String lastname;
    private String ID;
    private String password;
    // private Subject subject;

    public Teacher(String firstname, String lastname, String ID, String password) { // Subject subject
        setFirstname(firstname);
        setLastname(lastname);
        setID(ID);
        setPassword(password);
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
    public String grade(){ //Student std, Subject subject
        // TODO: Create Student class and Subject class
        return "";
    }
}
