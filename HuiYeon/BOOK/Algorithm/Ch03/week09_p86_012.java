package DataStructure;
import java.util.*;
import java.io.*;
public class week09_p86_012 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[]A = new int[n];    // 수열 배열
        int[]ans = new int[n]; // 정답 배열
        String[] str = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> myStack = new Stack<>();
        myStack.push(0); // 처음에는 최초 인덱스 0 푸시
        for (int i = 1; i < n; i++) {
            //스택 비어있지 않고 현재 수열이 스택 TOP인덱스 가르키는 수열보다 크면
            while (!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
                ans[myStack.pop()] = A[i];  // 정답 배열에 오큰수 저장하기
            }
            myStack.push(i); // 다음 인덱스 push
        }
        while (!myStack.empty()) {
            // 다 돌고 스택에 남은거 확인
            ans[myStack.pop()] = -1;
            // 남은 인덱스에 -1을 넣기
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            bw.write(ans[i] + " ");

        }
        bw.write("\n");
        bw.flush();
    }
}
