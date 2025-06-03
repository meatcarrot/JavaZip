package personal_practice;
import java.io.*;
import java.util.*;

public class CDM_문서_통계 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); // 공백 포함 문자열 입력

        int first = input.length(); // 공백을 포함한 글자수
        int second = 0; // 공백을 제외한 글자 수
        int third = 0; // 단어의 수
        int temp = 0; // 공백 개수

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ' ') // input[i] 불가
                temp += 1;
        }

        for(int i = 0; i < input.length() - 1; i++) {
            if(input.charAt(i) != ' ' && input.charAt(i + 1) == ' ') third += 1;
        }

        second = first - temp;
        third += 1;

        System.out.println(first);
        System.out.println(second);
        // System.out.println(third);

        // A B  C DE
        // A B  C D E




        String[] words = input.split("\\s+");
        // \s는 공백 문자 하나(스페이스, 탭, 줄바꿈 등)
        // +는 하나 이상을 의미함
        // \\는 백슬래시가 이스케이프 문자이기 때문에 두번 작성

        int count = words.length;
        System.out.println(count);
    }
}