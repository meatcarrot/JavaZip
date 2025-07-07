package textbook.Week10.Chapter3_자료구조;

import java.io.*;
import java.util.*;

public class _009_DNA_비밀번호_P12891 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken()); // DNA 문자열의 길이
        int size = Integer.valueOf(st.nextToken());; // 부분 문자열의 길이

        char[] insert = new char[num]; // 입력받는 DNA 문자열
        insert = br.readLine().toCharArray();

        int[] check = new int[4]; // 부분 문자열에 포함해야 할 A, C, G, T의 최소 개수
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 4; i++) {
            check[i] = Integer.valueOf(st.nextToken());
        }

        int[] count = new int[4]; // 슬라이딩 윈도우 안의 부분 문자열의 A, C, G, T 개수
        int result = 0; // 개수

        // 1. 초기 윈도우 설정
        for(int i = 0; i < size; i++) {
            add(insert[i], count);
        }

        // 초기 윈도우 조건 확인
        if(checkCondition(check, count)) result++;

        // 2. 슬라이딩 윈도우 이동
        // size 부터 num 까지 한 칸씩 이동할 때마다 더하고 빼면서 개수 맞는지 확인
        for(int i = size; i < num; i++) {
            remove(insert[i - size], count);
            add(insert[i], count);

            if(checkCondition(check, count)) result++;
        }

        System.out.println(result);
    }

    private static int charToIndex(char c) { // 문자에 해당하는 인덱스로 변환
        if(c == 'A') return 0;
        else if(c == 'C') return 1;
        else if(c == 'G') return 2;
        else if(c == 'T') return 3;
        else return -1;
    }

    // add, remove 메서드는 우측으로 이동하면서 작동하는 메서드
    private static void add(char ch, int[] count) {
        int temp = charToIndex(ch);
        if(temp != -1) count[temp]++;
    }

    private static void remove(char ch, int[] count) {
        int temp = charToIndex(ch);
        if(temp != -1) count[temp]--;
    }

    private static boolean checkCondition (int[] check, int[] count) {
        for(int i = 0; i < 4; i++) {
            if(check[i] > count[i]) return false;
        }
        return true;
    }
}
