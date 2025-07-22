package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class week15_p139_022 {
    public static int[] A;
    public static long result;
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        A = new int[N];
        for (int i = 0; i < N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }
        Radix_sort(A, 5);
        for (int i = 0; i < N; i++){
            sb.append(A[i]).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void Radix_sort(int[] A, int max_size){
        int[] output = new int[A.length];
        int jarisu = 1;
        int count = 0;
        while (count != max_size){
            int[] bucket = new int[10];
            // 자릿수 별로 해당하는 값이 있으면 1씩 증가
            // (A[i] / jarisu) % 10는 현재 자릿수
            // 해당하는 자릿수를 나눠서 몫을 구함 -> 타겟 자릿수를 1의 자릿수로
            // 낮추는 역할. 그리고 나머지 연산을 해서 해당 자릿수의 값 n을 가져옴
            for (int i = 0; i < A.length; i++){
                bucket[(A[i] / jarisu) % 10]++;
            }
            // 0 ~ 9까지 자릿수별로, 몇개 숫자가 있는 누적합 구하기
            // 왜 누적합을 구할까
            // bucket[5]가 7이면 현재 처리 중인 자릿수의 값이
            // 5 이하인 숫자가 총 7개라는 뜻
            // output 배열의 0 ~ 6번자리가 숫자로 이미 채워진거나 마찬가지
            // 따라서 자릿수 값이 5인 숫자는 output 배열의 7번 자리부터
            // 위치할 수 있을 거다. 이런 식으로 위치 계산을 한다.
            for (int i = 1; i < 10; i++){
                bucket[i] += bucket[i-1];
            }
            // 배열을 역으로 순회한다.
            // 왜? 기수 정렬의 안정성을 보장하기 위해서다
            // 예를 들어 [170, 90]이 있었다고 치자.
            // 둘 다 1의 자리 0이라서 bucket[0]에 해당한다
            // 뒤에서 순회하니까 90을 먼저 처리하자
            // bucket[0] = 2니까 90은 output[2 - 1], output[1]이다
            // 그 다음 bucket[0] = 1이 된다( -- 연산에 의해서)
            // 170은 bucket[0] = 1이니까 output[1 - 1], output[0]이다
            // 즉 output 배열에서도 1의 자리 숫자가 같더라도
            // 이전 배열에서의 상대적인 순서가 bucket 안에 들어갔다가 나와도
            // 그대로 유지된다 -> 즉 새로운 자릿수에서 bucket 쓸 때,
            // 이전 자릿수에서 정렬된 순서가 유지가 된다는 의미다
            // 10의 자릿수 처리할 때, 1의 자릿수 순서가 보장이 된다
            // 그래서 안정적이게 된다
            for (int i = A.length - 1; i >= 0; i--){
                output[bucket[(A[i] / jarisu) % 10] - 1] = A[i];
                bucket[(A[i] / jarisu) % 10]--;
            }
            // 다음 자릿수 처리를 위해서 A 배열을 output 배열로 정리해준다
            for (int i = 0; i < A.length; i++){
                A[i] = output[i];
            }
            // 자릿수 증가, 최대 자릿수 전까지 반복, 루프 종료 조건(count)
            jarisu = jarisu * 10;
            count++;
        }
    }
}
