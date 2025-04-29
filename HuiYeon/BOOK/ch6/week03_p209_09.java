package ch6;

class Student2 {

    private static int serialNum = 1000;
    int studentID;
    String studentName;
    int grade;
    String address;

    public Student2(){
        serialNum++;
        studentID = serialNum;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public static int getSerialNum() {
        int i = 10;
        //studentName = "aaa";   //¿À·ù ³²
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student2.serialNum = serialNum;
    }
}
public class week03_p209_09 {
    public static void main(String[] args) {
        Student2 student1 = new Student2();
        student1.setStudentName("Kim");
        System.out.println(student1.getSerialNum());
        Student2 student2 = new Student2();
        student2.setStudentName("Lee");
        System.out.println(student2.getSerialNum());

    }
}
