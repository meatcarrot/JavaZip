package DataStructure;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class week09_p52_005{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(reader.readLine());

        // 누적합 배열 (S[i] = A[0] + ... + A[i])
        // S[0]은 A[0]
        // S[i] = S[i-1] + A[i]
        long[] S = new long[N]; // 누적합은 int 범위를 넘어설 수 있으므로 long으로 한다고 한다
        long[] R = new long[M]; //

        long answer = 0;

        // 초기 합은 0이라고 가정
        // 가상의 S[-1] = 0, 나머지가 0
        // 이거 있어야지 A0 ~ An이 M으로 나누어떨어지는 경우를 셀 수 있다
        R[0]++;


        // 어떤 숫자 두 개를 뺀 값이 M으로 나눠진다면, 그 두 숫자를 각각 M으로 나눴을 때 나머지가 같다
        // 첫 번째 숫자 처리
        S[0] = Integer.parseInt(tokenizer.nextToken());
        int remainder = (int) (S[0] % M);
        R[remainder]++;

        // 나머지 숫자 처리
        for (int i = 1; i < N; i++) {
            S[i] = S[i-1] + Integer.parseInt(tokenizer.nextToken());
            remainder = (int) (S[i] % M);
            R[remainder]++;
        }

        // 각 나머지에 대해 조합 (nC2) 계산
        for (int i = 0; i < M; i++) {
            if (R[i] > 1) { // 해당 나머지를 가진 누적합이 2개 이상일 때만 조합 계산
                answer += (R[i] * (R[i] - 1) / 2); // long 타입으로 계산
            }
        }
        System.out.println(answer);
    }
}