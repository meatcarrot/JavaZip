package ch6;
class Taxi {
    int passengerCount;
    int money;

    public void take(int money)
    {
        this.money += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println("택시 승객은 " + passengerCount +"명이고, 수입은 " + money + "입니다.");
    }
}

class Student {
    public String studentName;     // 학생 이름
    public int grade;              // 학년
    public int money;              // 가진 돈(학생이 가진고 있는 돈)

    public Student(String studentName, int money)
    {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.take(10000);
        this.money -= 10000;

    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");

    }
}
public class week03_p209_08 {
    public static void main(String[] args) {
        Student student1 = new Student("Edward", 20000);
        student1.showInfo();
        Taxi taxi1 = new Taxi();
        student1.takeTaxi(taxi1);
        taxi1.showInfo();
        student1.showInfo();
    }
}
