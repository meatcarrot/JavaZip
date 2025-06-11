package DataStructure;
// 백준 11720
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class week09_p35_001 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        String number = reader.readLine();
        char[] arr = number.toCharArray();
        int sum = 0;

        for(int i = 0; i < N; i++){
            System.out.println(arr[i]);
            sum += arr[i] - '0';
        }

        System.out.print(sum);

    }

}
