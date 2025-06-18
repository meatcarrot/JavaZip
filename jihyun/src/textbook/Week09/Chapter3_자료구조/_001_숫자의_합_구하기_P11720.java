package textbook.Week09.Chapter3_자료구조;

import java.util.Scanner;

public class _001_숫자의_합_구하기_P11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // nextInt() : 정수 값 하나만 입력 받을 때 사용
        // nextDouble() : 실수 값 하나만 입력 받을 때 사용
        // next() : 문자열 한 단어만 입력 받음 (공백 전까지)
        // nextLine() : 한 줄 전체 입력 받음 (공백 포함)

        int number = scanner.nextInt();
        String insert = scanner.next();

        int size = insert.length();
        if(number != size) {
            System.out.println("입력 개수 오류");
            return ;
        }

        char[] array = insert.toCharArray();
        // toCharArray() : 문자열을 쪼개어 문자 배열로 바꿔주는 메서드
        int sum = 0;

        for(int i = 0; i < size; i++) {
            sum += array[i] - '0';
        }

        System.out.println(sum);

    }
}
