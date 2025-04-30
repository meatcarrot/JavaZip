package ch5.test;
import ch5.Student;
public class week03_p174_12 {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.address = "금천구";
        studentLee.setStudentName("이상원");

        System.out.println(studentLee.getStudentName());
    }
}

//package ch5;
//
//public class Student {
//
//    int studentID;
//    private String studentName;
//    int grade;
//    public String address;
//
//    public String getStudentName() {
//        return studentName;
//    }
//
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }
//
//}


