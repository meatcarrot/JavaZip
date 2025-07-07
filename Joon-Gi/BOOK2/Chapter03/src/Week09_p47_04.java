import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Week09_p47_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // 2차원 합 배열 만들기
        // S[i][j] = S[i][j-1] + S[i-1][j] - S[i-1][j-1] + A[i][j]
        // --> [i][j]의 합 = 왼쪽 칸 + 윗칸 - 대각선 왼쪽(공통으로 더했으니 1번 뺌) + 현재 값
        long[][] arr = new long[N+1][N+1];
        long[][] sumArr = new long[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                sumArr[i][j] = sumArr[i][j-1] + sumArr[i-1][j] - sumArr[i-1][j-1] + arr[i][j];
            }
        }

        // 2차원 구간 합 구하기
        // (x1, y1) ~ (x2, y2)
        // S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + S[x1-1][y1-1]
        // 큰 수 좌표 - 범위 아닌 윗 부분 - 범위 아닌 왼쪽 부분 + 두 번 뺐으니 겹치는 부분
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(bf.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            long s = sumArr[x2][y2] - sumArr[x1-1][y2] - sumArr[x2][y1-1] + sumArr[x1-1][y1-1];
            System.out.println(s);
        }

    }
}
