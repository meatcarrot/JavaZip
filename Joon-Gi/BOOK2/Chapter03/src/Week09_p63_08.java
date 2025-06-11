import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Week09_p63_08 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        long[] A = new long[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(A);
        for (int i = 0; i < N; i++) {
            long k = A[i];
            int start_index = 0;
            int end_index = N-1;

            while (start_index < end_index) {
                if (A[start_index] + A[end_index] == k) {
                    // start_index와 end_index가 서로 다른 수를 가리켜야 함
                    if (start_index != i && end_index != i) {
                        count++;
                        break;
                    } else if (start_index == k) {
                        start_index++;
                    } else if (end_index == k) {
                        end_index--;
                    }
                } else if (A[start_index] + A[end_index] < k) {
                    start_index++;
                } else {
                    end_index--;
                }
            }
        }
        System.out.println(count);
        bf.close();
    }
}
