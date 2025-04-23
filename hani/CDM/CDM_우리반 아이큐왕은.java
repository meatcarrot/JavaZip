// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class Main {
    static class Student {
        String name;
        int iq;
        int order; // 입력 순서 기억
        
        Student(String name, int iq, int order) {
            this.name = name;
            this.iq = iq;
            this.order = order;
        }
    }
    public static void main(String[] args) throws IOException { 
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Student> students = new ArrayList<>(); // student 객체들 담은 리스트
        
        for(int i=0;i<n;i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int iq = Integer.parseInt(input[1]);
            students.add(new Student(name, iq, i));
        }
        // iq 내림차순
        // sort에서는 비교 대상 둘을 비교해서 리턴값
        // - 음수면 -> 첫번째 요소 앞에
        // - 0이면 -> 순서 유지
        // - 양수면 -> 첫번째 요소 뒤에
        
        // numbers = (5, 2, 9, 1, 7)
        // Collections.sort(numbers, (a,b)->a-b);
        // -> 출력 결과 : (1, 2, 5, 7, 9)
        
        // Collections.sort(numbers, (a,b)->b-a);
        // -> 출력 결과 : (9, 7, 5, 2, 1)
        
        students.sort((a, b) -> {
            if(b.iq != a.iq) {
                // b의 iq가 더 크면 음수가 돼서 b가 앞으로 옴
                // 내림차순
                return b.iq - a.iq;
            }
            // iq가 같을 경우 입력 순서로 비교
            // a.order < b.order면 a가 먼저 입력된거니까 앞에 나와야됨
            // 입력 순서대로 정렬
            return a.order - b.order;
        });
        
        for(int i=0; i<3; i++) {
            System.out.println(students.get(i).name);
        }
    }
}
