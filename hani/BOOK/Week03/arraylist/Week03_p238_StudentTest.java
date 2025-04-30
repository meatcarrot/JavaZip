package arraylist;

public class Week03_p238_StudentTest {
    public static void main(String[] args) {
        Week03_p236_Student studentLee = new Week03_p236_Student(1001, "Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 40);

        Week03_p236_Student studentKim = new Week03_p236_Student(1002, "Kim");
        studentKim.addSubject("국어", 60);
        studentKim.addSubject("수학", 87);
        studentKim.addSubject("영어", 100);

        studentLee.showStudentInfo();
        System.out.println("=====");
        studentKim.showStudentInfo();
    }
}
