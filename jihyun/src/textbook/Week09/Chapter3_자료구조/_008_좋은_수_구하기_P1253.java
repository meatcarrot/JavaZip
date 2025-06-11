package textbook.Week09.Chapter3_자료구조;

import java.io.*;
import java.util.*;

public class _008_좋은_수_구하기_P1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // int 는 21억까지 가능
        }

        Arrays.sort(arr);

        int target;
        int count = 0;

        for(int i = 0; i < size; i++){
            target = arr[i];
            int start_idx = 0;
            int end_idx = size - 1;

            while(start_idx < end_idx) {
                if(arr[start_idx] + arr[end_idx] == target) {
                    if(start_idx != i && end_idx != i) { // 자기 자신이 아니라면
                        count++;
                        break; // 좋은 수 찾으면 바로 나가기 (그 뒤는 중요하지 않음)
                    }
                    else if (start_idx == i) {
                        start_idx++;
                    } else { // end_idx 가 i랑 같은 경우
                        end_idx--;
                    }
                } else if(arr[start_idx] + arr[end_idx] > target) {
                    end_idx--;
                } else { // 두 수의 합이 target 보다 작은 경우
                    start_idx++;
                }
            }

        }

        System.out.println(count);
    }
}
// 4
// 0 0 0 1