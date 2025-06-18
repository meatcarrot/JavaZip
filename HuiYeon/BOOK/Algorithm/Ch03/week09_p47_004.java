package DataStructure;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class week09_p47_004 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 기본은 공백문자열로 분리하는 거라고 한다
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int size = Integer.parseInt(tokenizer.nextToken());
        int num = Integer.parseInt(tokenizer.nextToken());

        int A[][] = new int[size + 1][size + 1];
        for (int i = 1; i <= size; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 1; j <= size; j++) {
                A[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }
        // 0,0 에서 X,Y 까지의 구간합을 S로 저장하자
        // D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j];
        // 빼는건 중복구간

        int D[][] = new int[size + 1][size + 1];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                //부분 합 D[][] 계산
                D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j];
            }
        }

        for (int i = 0; i < num; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int x1 = Integer.parseInt(tokenizer.nextToken());
            int y1 = Integer.parseInt(tokenizer.nextToken());
            int x2 = Integer.parseInt(tokenizer.nextToken());
            int y2 = Integer.parseInt(tokenizer.nextToken());
            //  위쪽, 왼쪽 테두리를 자르고 중복된걸 더한다
            int result = D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1] + D[x1 - 1][y1 - 1];
            System.out.println(result);
        }
    }
}
