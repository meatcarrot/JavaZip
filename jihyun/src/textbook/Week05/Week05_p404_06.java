package textbook.Week05;

public class Week05_p404_06 {
    public static void main(String[] args) {
        Student student = new Student("a071111", "김지현");
        System.out.println(student);
    }
}

class Student {
    String studentID;
    String studentName;

    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String toString() {
        return "학생의 이름 : " + studentName + "\n학생의 학번 : " + studentID;
    }
}