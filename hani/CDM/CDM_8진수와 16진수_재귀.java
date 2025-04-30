// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class Main {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int a = scanner.nextInt();
        
        System.out.println(Change(a, 8) + " " + Change(a, 16));
    }
    // 어떤 N을 B진수로 바꾸려면 N/B를 재귀 호출
    // N % B를 결과 뒤에 붙이는 방식
    public static String Change(int n, int base) {
        if(n < base) {
            return digit(n); // 나눌 수 없을 때 기본 값 반환
        }
        // 숫자 덧셈이 아니라 문자열 연결
        return Change(n/base, base) + digit(n%base);
    }
    
    // 10 ~ 15는 A~F
    public static String digit(int n) {
        if (n<10) {
            return Integer.toString(n);
        }
        else
        // valueOf : 값을 문자열로 변환
            return String.valueOf((char) ('A' + (n-10)));
    }
}
