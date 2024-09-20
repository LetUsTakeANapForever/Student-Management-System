public class Register {
    private Subject[] subjects;
    private int index;

    public Register() {
        subjects = new Subject[5];
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

    public void register(Subject subject) {
        subjects[index++] = subject;
    }

    public void RegisterSubject(Student student, Subject subject) {
        boolean Check = CheckRegistered(student, subject);
        if (Check == false) {
            register(subject);
            student.setRegisterSystem(this);
        }
    }

    public Subject[] getAllSubjects() {
        return subjects;
    }

    public Subject getSubjectAt(int index) {
        return subjects[index];
    }
}
