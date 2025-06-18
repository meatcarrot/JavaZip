// [BOJ] 1377_버블 소트
// 다 정렬된 다음 i를 출력하라
import java.io.*;
import java.util.*;

public class Week10_p104_016 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }

        for (int a : arr) {
            System.out.println(a);
        }
    }
}
