package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class week15_p148_023 {
    static ArrayList<Integer>[] A;
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        A = new ArrayList[n+1];
        visited = new boolean[n + 1];

        // 인접 리스트 초기화
        for (int i = 1; i < n+1; i++){
            A[i] = new ArrayList<Integer>();
        }
        // 인접 리스트 업데이트
        for ( int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            // 각각 노드 연결하기
            A[s].add(e);
            A[e].add(s);

        }

        int count = 0;
        // 탐색시작
        // 모든 노드를 하나씩 보면서 방문 안한 친구가 있으면
        // 그걸 새로운 시작점으로 고르고 새로운 덩어리 탐색 시작
        for (int i = 1; i < n + 1; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }
    // 스택 대신 재귀로
    // 이미 방문했으면 종료
    // 방문 안 한 노드면 방문표시하고 재귀
    static void DFS(int v){
        if (visited[v]){
            return;
        }
        visited[v] = true;
        for(int i : A[v]){
            if (visited[i] == false){
                DFS(i);
            }
        }
    }
}

