package textbook.Week03;

import java.util.ArrayList;

public class Week03_p236_ArrayList {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 50);

        Student studentKim = new Student(1002, "Kim");
        studentKim.addSubject("국어", 70);
        studentKim.addSubject("수학", 85);
        studentKim.addSubject("영어", 100);

        studentLee.showStudentInfo();
        System.out.println("===========================");
        studentKim.showStudentInfo();
    }

    public static class Student {
        int studentID;
        String studentName;
        ArrayList<Subject> subjectList;

        public Student(int studentID, String studentName) {
            this.studentID = studentID;
            this.studentName = studentName;
            subjectList = new ArrayList<Subject>();
        }

        public void addSubject(String name, int score) {
            Subject subject = new Subject();
            subject.setName(name);
            subject.setScorePoint(score);
            subjectList.add(subject);
        }

        public void showStudentInfo() {
            int total = 0;
            for (Subject s : subjectList) {
                total += s.getScorePoint(); // 총점 더하기
                System.out.println("학생 " + studentName + "의 " + s.getName() + "과목 성적은 " + s.getScorePoint() + "입니다.");
            }
            System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다.");
        }
    }

    public static class Subject {
        private String name; // 과목이름
        private int scorePoint; // 과목점수

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScorePoint() {
            return scorePoint;
        }

        public void setScorePoint(int scorePoint) {
            this.scorePoint = scorePoint;
        }
    }
}
