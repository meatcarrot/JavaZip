package arraylist;
//import javax.security.auth.Subject;
import java.util.ArrayList;

public class Week03_p236_Student {
    int studentID;
    String studentName;
    ArrayList<Week03_p237_Subject> subjectList;

    public Week03_p236_Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Week03_p237_Subject>();
    }

    public void addSubject(String name, int score) {
        Week03_p237_Subject subject = new Week03_p237_Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        for(Week03_p237_Subject s: subjectList) {
            total += s.getScorePoint();
            System.out.println("학생 "+studentName+"의"+s.getName() +" 과목 성적은"+s.getScorePoint()+ "입니다.");
        }
    }
}
