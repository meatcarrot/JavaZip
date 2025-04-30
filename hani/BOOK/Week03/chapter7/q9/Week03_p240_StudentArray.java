package chapter7.q9;

public class Week03_p240_StudentArray {
    public static void main(String[] args) {
        Week03_p240_Student[] students = new Week03_p240_Student[3];
        students[0] = new Week03_p240_Student(1001, "James");
        students[1] = new Week03_p240_Student(1002, "Tomas");
        students[2] = new Week03_p240_Student(1003, "Edward");

        for (Week03_p240_Student student : students) {
            student.showStudentInfo();
        }
    }
}
