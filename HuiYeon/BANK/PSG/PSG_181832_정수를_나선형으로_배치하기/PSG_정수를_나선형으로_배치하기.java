class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        boolean[][] visited = new boolean[n][n]; // 방문 체크 배열

        // dir에 따라서 오른쪽(0), 아래(1), 왼쪽(2), 위(3)
        // (0,1) (1,0) (0,-1), (-1,0)
        int[] dx = {0, 1, 0, -1}; // 세로 이동
        int[] dy = {1, 0, -1, 0}; // 가로 이동

        int x = 0, y = 0, dir = 0;
        
        // n**2까지 순회
        for (int i = 1; i <= n * n; i++) {
            //현재 위치는 빈 곳이니까 숫자넣기
            answer[x][y] = i;
            visited[x][y] = true;

            // 다음 좌표 계산
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            //오른쪽으로 가기 -> dir 0 (0,1)
            //오른쪽으로 다 갔으면 아래로 가기 -> dir 1증가 (1,0)
            //아래로 다 갔으면 왼쪽으로 가기 -> dir 1증가 (0,-1)
            //왼쪽으로 다 갔으면 위로 가기 -> dir 1증가 (-1, 0)
            
            // 범위를 벗어나거나 이미 방문했다면 방향 전환
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || visited[nx][ny]) {
                dir = (dir + 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
        }

        return answer;
    }
}
