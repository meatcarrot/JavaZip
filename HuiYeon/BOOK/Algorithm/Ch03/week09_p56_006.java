package DataStructure;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class week09_p56_006 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        int start = 1;
        int end = 1;
        int sum = 1;
        int count = 1; // end가 num에 도달하면 끝나니까 자기자신은 미리 카운트한다

        while (end < num) {
            if (sum == num) {
                count++;

                sum -= start;
                start++;

                end++;
                sum += end;
            } else if (sum > num) {
                sum -= start;
                start++;
            } else {
                end++;
                sum += end;
            }
        }
        System.out.println(count);
    }
}
