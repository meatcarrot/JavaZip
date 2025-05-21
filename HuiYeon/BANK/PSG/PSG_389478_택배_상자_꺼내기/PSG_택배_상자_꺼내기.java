class Solution {
    public int solution(int n, int w, int num) {
        // 일단 최대 사이즈 2차원 배열 만들기
        // 가로 101 세로 11
        int[][] map = new int[101][11]; 
        
        // 상자번호
        int current = 1;
        // 층수
        int height = 0;
        // 왼쪽 오른쪽 플래그
        boolean leftToRight = true;

        // 2D 배열에 상자 배치
        // 층 단위로 박스를 채운다
        // 빈 곳도 박스를 채우는 경우를 방지해야 하므로 current <= n
        while (current <= n) {
            //오른쪽으로 갈 때 
            if (leftToRight) {
                for (int i = 0; i < w && current <= n; i++) {
                    map[height][i] = current++;
                }
            } else { // 왼쪽으로 갈 때
                for (int i = w - 1; i >= 0 && current <= n; i--) {
                    map[height][i] = current++;
                }
            }
            height++;
            //방향 반전
            leftToRight = !leftToRight;
        }

        // num 좌표
        int targetRow = 0;
        int targetCol = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < w; j++) {
                if (map[i][j] == num) {
                    // 가로 j, 세로 i
                    targetRow = i;
                    targetCol = j;
                    break;
                }
            }
        }

        // 위에 상자 수 + 본인 = 꺼내야 하는 상자 수
        int count = 0;
        
        for (int i = height - 1; i >= 0; i--) {
            // 0이면 박스가 없는 곳
            // 위에서부터 내려가기
            if (map[i][targetCol] != 0) {
                count++;
                // 타겟 박스면 멈추기
                if (map[i][targetCol] == num) break;
            }
        }

        return count;
    }
}
