package Week06_p464_05;

public class Student {
    private String studentId;
    private String studentName;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(studentId);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            if (student.studentId.equals(this.studentId)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {

        return  studentId + ": " + studentName;
    }
}
