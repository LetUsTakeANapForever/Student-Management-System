public class Register {
    private Subject[] subjects;
    private int index=0;
    public Register(Student student,Subject subject){
        subjects = new Subject[5];
        RegisterSubject(student, subject);
    }

    public boolean CheckRegistered(Student student,Subject subject){
        for(int i=0;i<student.getAllSubjectThatRegistered().length;i++){
            if (student.getSubjectThatRegistered(i).equals(subject)) {
                return true;
            }
        }
        return false;
    }
    public void register(Subject subject){
        subjects[index++] = subject;
    }
    public void RegisterSubject(Student student,Subject subject){
        boolean Check = CheckRegistered(student, subject);
        if (Check==false) {
            register(subject);
            student.RegisterSubject(subject);
        }
    }
    public Subject[] getAllSubjects(){
        return subjects;
    }
    public Subject getSubjectAt(int index){
        return subjects[index];
    }
}
