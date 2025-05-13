package textbook.Week02;

public class Week02_p174_12 {
    public static void main(String[] args) {
        Student_ studentLee = new Student_();
        studentLee.address = "서울 양천구";
        studentLee.setStudentName("이상원");

        System.out.println(studentLee.getStudentName());
    }
}

class Student_ {
    int studentID;
    private String studentName;
    int grade;
    String address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}