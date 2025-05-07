package textbook.Week02;

public class Week02_p162_private {
    public static void main(String[] args) {
        Student studentLee = new Student();

        studentLee.setStudentName("이상원");

        System.out.println(studentLee.getStudentName());
    }

    public static class Student {
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
}
