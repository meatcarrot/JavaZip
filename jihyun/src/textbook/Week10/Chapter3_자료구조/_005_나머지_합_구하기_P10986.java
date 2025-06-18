package textbook.Week10.Chapter3_자료구조;

// 모든 구간을 다 살피면 시간복잡도 O(n^2) -> 너무 오래 걸림
// 누적 합(prefix sum) 사용
// blog.naver.com/jungwon0704/223833556341

import java.util.*;
import java.io.*;

public class _005_나머지_합_구하기_P10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int number = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        long[] sum = new long[size + 1]; // 누적합의 나머지 배열
        long[] check = new long[number]; // M으로 나눈 나머지를 인덱스로 하여 개수 적는 배열

        for(int i = 1; i <= size; i++) {
            sum[i] = sum[i - 1] + Long.parseLong(st.nextToken()); // 누적합
            int temp = (int)((sum[i] % number) + number) % number; // 나머지 양수화하며 구하기
            check[temp]++;
        }

        long count = check[0];

        for(int i = 0; i < number; i++) {
            if(check[i] >= 2) count += (check[i] * (check[i] - 1)) / 2;
        }

        System.out.println(count);
    }
}