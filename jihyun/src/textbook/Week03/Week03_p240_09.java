package textbook.Week03;
import java.util.ArrayList;

public class Week03_p240_09 {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<Student1>();

        list.add(new Student1("James"));
        list.add(new Student1("Tomas"));
        list.add(new Student1("Edward"));

        for(Student1 i : list){
            i.studentInfo();
        }
    }
}

class Student1 {
    private static int number = 1000;
    private int studentID;
    private String name;

    public Student1(String name) {
        this.name = name;
        number++;
        this.studentID = number;
    }

    public void studentInfo() {
        System.out.println(studentID + ", " + name);
    }
}