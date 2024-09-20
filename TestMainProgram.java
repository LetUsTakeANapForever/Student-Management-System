public class TestMainProgram {
    public static void main(String[] args) {

        Subject s1 = new Subject("01455667", "English");
        Teacher t1 = new Teacher("Somsri", "HueKaow", "t1234", "1234", s1);
        Register regisSystem1 = new Register();
        Student std1 = new Student("b6621601111", "test1234", "KorGai", "Yoonailaow", regisSystem1);

        System.out.println("Before registration:");
        System.out.println(std1.getSubjectThatRegisteredAt(0));
        regisSystem1.RegisterSubject(std1, s1);
        System.out.println("After registration:");
        System.out.println(std1.getSubjectThatRegisteredAt(0).getSubjectName());
        System.out.println();

        t1.summitGrade(std1, s1, "A");

        System.out.println("Student (id, firstname, lastname) : " + std1.getStdID() + " " + std1.getStdFirstName() + " " + std1.getStdLastName());
        System.out.println("Grade : " + std1.getSubjectThatRegisteredAt(0).getGrade() + " for " + std1.getSubjectThatRegisteredAt(0).getSubjectID() + " " + std1.getSubjectThatRegisteredAt(0).getSubjectName());
    }
}
