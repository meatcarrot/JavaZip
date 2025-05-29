package textbook.Week06;

import java.util.HashSet;

public class Week06_p464_05 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();

        set.add(new Student("100", "홍길동"));
        set.add(new Student("200", "강감찬"));
        set.add(new Student("300", "이순신"));
        set.add(new Student("400", "정약용"));
        set.add(new Student("100", "송중기"));

        System.out.println(set);
    }
}

class Student {
    private String studentId;
    private String studentName;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentId + ":" + studentName;
    }

    @Override
    public int hashCode() {
        return studentId.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student student = (Student)obj;
            if(student.studentId == this.studentId)
                return true;
            else
                return false;
        }
        return false;
    }
    // new String("100") 처럼 새로만든 문자열은 주소가 달라서 false로 나옴
    // new Student("100")은 리터럴로 상수풀에 넣어서 같게 나온 것
    // 안전하게 쓰려면 ==가 아닌 equals로 비교해야 올바름
}

// set을 출력하면 해시코드 나옴 -> toString 오버라이딩 재정의
// 100이 중복되는데 강감찬만 나와야 함 -> hashCode, equals 오버라이딩 재정의