import java.util.*;

class Person {
    private String name;
    int iq;

    public Person(String name, int iq) {
        this.name = name;
        this.iq = iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIq() {
        return iq;
    }

    public String getName() {
        return name;
    }
}

public class CDM_우리반아이큐왕은 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Person[] ourClass = new Person[n];
        scanner.nextLine(); // 숫자 입력 후 버퍼에 남아있는 \n 지우기

        for(int i=0; i<n; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            int iq = Integer.parseInt(tokens[1]);

            ourClass[i] = new Person(name, iq);
        }

        Arrays.sort(ourClass, (a, b) -> b.iq - a.iq);

        for(int i=0; i<3; i++) {
            System.out.println(ourClass[i].getName());
        }
    }
}

/*
Array 정렬하기
나이 내림차순 정렬 예) Arrays.sort(people, (p1, p2) -> p2.age - p1.age);

ArrayList 정렬하기
people.sort((p1, p2) -> p2.age - p1.age);
 */