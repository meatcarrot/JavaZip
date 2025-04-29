import java.util.ArrayList;
import java.util.List;

class Student {
    private int studentID;
    private String name;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showStudentInfo() {
        System.out.println(getStudentID() + ", " + getName());
    }
}

public class Week03_p240_11 {
    public static void main(String[] args) {
        // 9번 문제
        System.out.println("9번 문제");
        Student[] students = new Student[3];

        students[0] = new Student(1001, "James");
        students[1] = new Student(1002, "Thomas");
        students[2] = new Student(1003, "Edward");

        for(int i=0; i<3; i++) {
            students[i].showStudentInfo();
        }

        // 11번 문제
        System.out.println("11번 문제");
        List<Student> studentsAL = new ArrayList<>();

        studentsAL.add(new Student(1001, "James"));
        studentsAL.add(new Student(1002, "Thomas"));
        studentsAL.add(new Student(1003, "Edward"));

        for(Student student : studentsAL) {
            student.showStudentInfo();
        }
    }
}
