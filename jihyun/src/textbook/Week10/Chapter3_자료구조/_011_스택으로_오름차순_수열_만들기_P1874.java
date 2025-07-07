package textbook.Week10.Chapter3_자료구조;

import java.util.*;

public class _011_스택으로_오름차순_수열_만들기_P1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt(); // 수열의 개수 입력
        int[] arr = new int[size]; // 수열의 개수 만큼 배열 생성

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>(); // Stack 클래스가 담을 정수형 객체 생성
        StringBuilder sb = new StringBuilder(); // +와 -를 담는 객체 생성

        int start = 1; // 스택에 넣는 변수
        int i = 0; // arr 의 인덱스

        stack.push(start); // 일단 하나 넣고 시작
        sb.append("+");

        while(start <= size && i < size) {
            if(stack.isEmpty()) {
                stack.push(start);
                start++;
            }

            if (arr[i] > stack.peek()) {
                start++;
                stack.push(start);
                sb.append("+");
            } else if (arr[i] == stack.peek()) {
                stack.pop();
                i++;
                sb.append("-");
            } else { // arr[i] < stack.peek()
                System.out.println("NO");
                return ;
            }
        }

        String result = sb.toString(); // StringBuilder를 String으로 변환

        for (int j = 0; j < result.length(); j++) {
            System.out.println(result.charAt(j)); // 각 문자를 한 줄씩 출력
        }
    }
}
