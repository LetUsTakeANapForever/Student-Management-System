public class Register {
    

    public Register(Student student,Subject subject){
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
    public void RegisterSubject(Student student,Subject subject){
        boolean Check = CheckRegistered(student, subject);
        if (Check==false) {
            student.setSubjectThatRegistered(subject);
        }
    }
}
