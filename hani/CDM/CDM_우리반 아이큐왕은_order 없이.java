// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class Main {
    static class Student {
        String name;
        int iq;

        Student(String name, int iq) {
            this.name = name;
            this.iq = iq;
        }
    }
    
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 줄바꿈 처리

        List<Student> students = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int iq = Integer.parseInt(input[1]);
            students.add(new Student(name, iq));
        }

        // iq 기준 내림차순 정렬
        students.sort((a, b) -> b.iq - a.iq);

        for (int i = 0; i < 3 && i < students.size(); i++) {
            System.out.println(students.get(i).name);
        }

    }
}
