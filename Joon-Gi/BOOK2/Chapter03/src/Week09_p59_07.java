import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Week09_p59_07 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());

        int start_index = 0;
        int end_index = N-1;
        int sum = 1;

        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        while (start_index < end_index) {
            if (A[start_index] + A[end_index] == M) {
                count++;
                start_index++;
                end_index--;
            } else if (A[start_index] + A[end_index] > M) {
                end_index--;
            } else {
                start_index++;
            }
        }
        System.out.println(count);
        bf.close();
    }
}
