package DataStructure;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class week09_p38_002 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        String line = reader.readLine();
        String[] tokens = line.split(" ");

        int [] numbers = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            numbers[i] = Integer.parseInt(tokens[i]); // 문자열을 정수로 변환
        }
        long sum = 0;
        long max = Arrays.stream(numbers).max().getAsInt();

        for( int i = 0; i < num; i++){
            sum += numbers[i];
        }

        System.out.println(sum * 100.0 / max / num);
    }
}
