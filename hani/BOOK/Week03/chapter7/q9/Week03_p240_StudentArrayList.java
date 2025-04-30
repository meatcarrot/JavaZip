package chapter7.q9;
import java.util.ArrayList;

public class Week03_p240_StudentArrayList {
    public static void main(String[] args) {
        ArrayList<Week03_p240_Student> students = new ArrayList<Week03_p240_Student>();
        students.add(new Week03_p240_Student(1001, "James"));
        students.add(new Week03_p240_Student(1002, "Tomas"));
        students.add(new Week03_p240_Student(1003, "Ed"));

        for (Week03_p240_Student student : students) {
            student.showStudentInfo();
        }
    }
}