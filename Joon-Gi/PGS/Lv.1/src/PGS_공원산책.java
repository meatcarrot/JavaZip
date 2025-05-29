import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PGS_공원산책 {
    public static int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        int height = park.length;
        int width = park[0].length();


        // 1. dx, dy 배열 사용
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        char[] d = {'N', 'S', 'W', 'E'};

        // 2. HashMap 사용
        Map<Character, int[]> dMap = new HashMap<>();
        dMap.put('N', new int[]{-1, 0});
        dMap.put('S', new int[]{1, 0});
        dMap.put('W', new int[]{0, -1});
        dMap.put('E', new int[]{0, 1});

        // 시작 위치 찾기
        int x = -1, y = -1;
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;

                    break;
                }
            }
            if (x != -1) {
                break;
            }
        }

        for (String route : routes) {
            String[] temp = route.split(" ");
            char direction = temp[0].charAt(0);
            int distance = Integer.parseInt(temp[1]);

            // 나아가야할 방향 1번 방법
//            int nx = 0;
//            int ny = 0;
//
//            for (int i=0; i<d.length; i++) {
//                if (d[i] == direction) {
//                    nx = dx[i];
//                    ny = dy[i];
//
//                    break;
//                }
//            }

            // 나아가야할 방향 2번 방법
            int[] move = dMap.get(direction);
            int nx = move[0];
            int ny = move[1];

            int tempX = x;
            int tempY = y;
            boolean isMovable = true;

            for (int i=0; i<distance; i++) {
                tempX += nx;
                tempY += ny;

                if (tempX < 0 || tempX >= height || tempY < 0 || tempY >= width) {
                    isMovable = false;
                    break;
                }
                if (park[tempX].charAt(tempY) == 'X') {
                    isMovable = false;
                    break;
                }
            }

            if (isMovable) {
                x = tempX;
                y = tempY;
            }
        }

        answer[0] = x;
        answer[1] = y;

        return answer;
    }

    public static void main(String[] args) {
        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        int[] answer = solution(park, routes);

        System.out.println("답: " + Arrays.toString(answer));
    }
}
