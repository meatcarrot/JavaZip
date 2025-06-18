package textbook.Week10;

import java.util.*;
import java.io.*;

public class BOJ_문자열_반복_P2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int input = Integer.parseInt(br.readLine());

        for(int i = 0; i < input; i++) {
            st =  new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            StringBuilder sb = new StringBuilder();
            // StringBuilder 클래스는 문자열을 수정하고 이어붙일 수 있게 도와주는 도구

            for(int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                // charAt는 문자열의 특정 위치에 있는 문자 하나를 가져오는 메서드
                // toCharArray() : 문자열을 char 로 변환하여 하나씩 배열에 담음

                for(int k = 0; k < num; k++) {
                    sb.append(c);
                }
            }

            System.out.println(sb);
        }
    }
}
