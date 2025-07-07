package textbook.Week10;

import java.io.*;
import java.util.*;


public class BOJ_음계_P2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[8];
        for(int i = 0; i < 8; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }

        if(arr[0] == 1) {
            for(int i = 1; i < 8; i++) {
                if(arr[i] != (i + 1)) {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("ascending");
        } else if(arr[0] == 8) {
            int count = 1;
            for(int i = 7; i > 0; i--) {
                if(arr[i] != count++) {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
