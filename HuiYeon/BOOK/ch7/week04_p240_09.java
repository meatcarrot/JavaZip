package ch7;

class Student {
    int studentID;
    String name;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public void showStudentInfo() {
        System.out.println( studentID + ", " + name);
    }
}
public class week04_p240_09 {
    public static void main(String[] args) {
        Student[] List = new Student[3];
        List[0] = new Student(1001, "James");
        List[1] = new Student(1002, "Tomas");
        List[2] = new Student(1003, "Edward");

        for(Student s : List){
            s.showStudentInfo();
        }
    }
}
