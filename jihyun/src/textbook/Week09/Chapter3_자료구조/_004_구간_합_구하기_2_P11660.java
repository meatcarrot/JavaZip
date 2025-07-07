package textbook.Week09.Chapter3_자료구조;

// N 배열의 크기 최대 1024 x 1024 -> 100만
// M 질문 개수 최대 10만
// 단순 계산 시 최악의 경우 1조 연산을 수행해야 하므로 구간합 이용

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _004_구간_합_구하기_2_P11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 4 3 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int line = Integer.valueOf(st.nextToken());

        int[][] array = new int[size + 1][size + 1];

        // 배열 입력 받기
        for(int i = 1; i <= size; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= size; j++) {
                array[i][j] = Integer.valueOf(st.nextToken());
            }
        }

        int[][] array_sum = new int[size + 1][size + 1];

        // 구간합 배열 생성하기
        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++) {
                array_sum[i][j] = array_sum[i - 1][j] + array_sum[i][j - 1]
                        - array_sum[i - 1][j - 1] + array[i][j];
            }
        }

        for(int k = 0; k < line; k++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.valueOf(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.valueOf(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = array_sum[x2][y2] - array_sum[x1 - 1][y2]
                    - array_sum[x2][y1 - 1] + array_sum[x1 - 1][y1 - 1];
            System.out.println(result);
        }
    }
}
//1 2 3 4
//2 3 4 5
//3 4 5 6
//4 5 6 7
//
//1  3  6  10
//3  8  15 24
//6  15 27 42
//10 24 42 64

// 3 3 4 4
//24