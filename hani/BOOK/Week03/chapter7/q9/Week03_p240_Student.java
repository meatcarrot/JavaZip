package chapter7.q9;

public class Week03_p240_Student {
    int studentID;
    String name;

    public Week03_p240_Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }
    public void showStudentInfo() {
        System.out.println(studentID+ ", " + name);
    }
}
