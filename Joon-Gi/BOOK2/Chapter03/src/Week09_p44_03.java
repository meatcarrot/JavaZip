import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Week09_p44_03 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
        // 입력이 십만 개까지 입력될 수 있으니 스캐너보단 버퍼 리더 사용 추천
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 입력이 매우 많을 경우(입력이 옆으로 길 경우) int형으로 받기 힘듦
        // 이런 경우 일반적으로 StringTokenizer를 이용해 값을 분리함
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // int 대신 long으로! 습관적으로 long으로 쓰기
        long[] arr = new long[N+1];
        long[] sumArr = new long[N+1];

        // 배열 안의 수 받기
        st = new StringTokenizer(bf.readLine());

        for (int k = 1; k <= N; k++) {
            arr[k] = Integer.parseInt(st.nextToken());
            sumArr[k] = sumArr[k-1] + arr[k];
            // arr 없이 바로 합배열 써도 됨
        }

        for (int k = 0; k < M; k++) {
            // i와 j 받기
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(sumArr[j] - sumArr[i-1]);
        }
    }
}
