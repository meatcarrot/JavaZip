package DataStructure;
import java.io.BufferedReader;
import java.io.InputStream;
import  java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class week09_p44_003 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 기본은 공백문자열로 분리하는 거라고 한다
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int intNum = Integer.parseInt(tokenizer.nextToken());
        int windowSize = Integer.parseInt(tokenizer.nextToken());

        int[] sum = new int[intNum+1];

        // 다음줄 읽어야 하니까 새로 파기
        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 1; i <= intNum; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(tokenizer.nextToken());
        }

        for (int q = 0; q < windowSize; q++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int i = Integer.parseInt(tokenizer.nextToken());
            int j = Integer.parseInt(tokenizer.nextToken());
            System.out.println(sum[j] - sum[i - 1]);
        }
    }
}
