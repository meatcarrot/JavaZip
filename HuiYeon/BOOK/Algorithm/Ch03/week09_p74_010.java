package DataStructure;
import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class week09_p74_010 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력용
        StringTokenizer st = new StringTokenizer(br.readLine()); // 첫 줄(N, L) 읽기

        int N = Integer.parseInt(st.nextToken()); // N 숫자 갯수
        int L = Integer.parseInt(st.nextToken()); // L 윈도우 크기
        st = new StringTokenizer(br.readLine()); // 두 번째 줄(숫자들) 읽기

        // 덱 생성. Node 객체를 저장, Node는 값과 인덱스를 가짐.
        Deque<Node> mydeque = new LinkedList<>();

        // N개의 숫자를 하나씩 처리
        for (int i = 0; i < N; i++) { // i는 현재 숫자의 인덱스 0부터 N-1까지
            int now = Integer.parseInt(st.nextToken()); // 현재 윈도우에 들어올 숫자

            // 덱의 마지막 원소부터 현재 'now'보다 큰 값들을 제거
            // 이 부분이 중요! 'now'보다 큰 값들은 'now'가 들어오는 이상 절대 최솟값이 될 수 없음.
            // 예를 들어 덱에 [2, 5]가 있고 now가 3이라면, 5는 3보다 크므로 덱에서 제거
            // 덱은 [2]가 되고, 이제 3을 추가할 준비 (-> [2, 3])
            while (!mydeque.isEmpty() && mydeque.getLast().value > now) {
                mydeque.removeLast(); // 큰 값 제거
            }

            // 현재 숫자 'now'를 덱의 마지막에 추가
            // 항상 덱의 앞부터 뒤까지 오름차순으로 정렬되도록 유지
            mydeque.addLast(new Node(now, i));

            // 덱의 맨 앞(최솟값)이 윈도우 범위 밖으로 나갔는지 확인
            // 윈도우 범위: [i - L + 1, i]
            // 덱의 첫 번째 원소(가장 작은 값)의 인덱스가 현재 윈도우의 시작점보다 작거나 같으면
            // (즉, 윈도우의 시작점은 포함되고, 시작점보다 작은 인덱스는 윈도우 밖임)
            // 해당 원소는 윈도우에서 벗어났으므로 덱에서 제거
            if (mydeque.getFirst().index <= i - L) { // i-L+1 이 현재 윈도우의 시작 인덱스.
                // i-L은 '바로 윈도우 바깥쪽' 인덱스.
                // 그래서 <= i-L 이면 윈도우 범위를 벗어난 것.
                mydeque.removeFirst();
            }

            // 덱의 맨 앞에는 항상 현재 윈도우 내의 최솟값이 있음
            // 그 값을 버퍼에 쓰고 공백 추가
            bw.write(mydeque.getFirst().value + " ");
        }
        // 버퍼에 남아있는 내용 모두 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
    }

    // 숫자의 값(value)과 원래 인덱스(index)를 함께 저장하기 위한 클래스
    // 인덱스가 필요한 이유는 윈도우 범위를 벗어났는지 확인해야 하기 때문
    static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
