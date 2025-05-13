package textbook.Week03;

public class Week03_p209_09 {
    public static void main(String[] args) {
        Student Jihyun = new Student("Jihyun");
        Student Hani = new Student("Hani");
        Student Huiyeon = new Student("Huiyeon");
        Student Joongi = new Student("Joongi");

        Jihyun.studentInfo();
        Hani.studentInfo();
        Huiyeon.studentInfo();
        Joongi.studentInfo();
    }
}

class Student {
    private String name;
    private int CardNumber;
    private static int studentID = 1000;

    public Student(String name) {
        this.name = name;
        CardNumber = studentID + 100;
        studentID++;
    }

    public void studentInfo() {
        System.out.println(name + "님의 학번은 " + (CardNumber- 100) + "이고 카드 번호는" + CardNumber + "입니다.");
    }
}