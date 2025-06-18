package textbook.Week09.Chapter3_자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
// import java.util.Scanner;
import java.util.StringTokenizer;

public class _007_주몽의_명령_P1940 {
    public static void main(String[] args) throws IOException {
        // Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int material = Integer.valueOf(br.readLine());
        // scanner.nextLine(); // 개행 문자 삭제
        // Scanner 와 BufferedReader 를 섞어 쓰면 입력 버퍼 문제 생김
        // 남은 개행(‘\n’)을 br.readLine()이 받아 버려서 br.readLine()이 빈 문자열을 반환
        // -> st.nextToken()에서 NoSuchElementException 이 발생
        // ... 개행 날려도 계속 오류남 -> 그냥 섞어쓰지 말고 통일하자

        int[] array = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < size; i++) {
            array[i] = Integer.valueOf(st.nextToken());
        }

        Arrays.sort(array); // 원본 배열을 직접 변경하여 정렬

        int start_idx = 0;
        int end_idx = size - 1;
        int count = 0;

        while(start_idx < end_idx){
            if(array[start_idx] + array[end_idx] == material){
                count++;
                start_idx++;
                end_idx--;
            }else if(array[start_idx] + array[end_idx] > material) {
                end_idx--;
            } else { // material이 큰 경우
                start_idx++;
            }
        }
        System.out.println(count);
    }
}
