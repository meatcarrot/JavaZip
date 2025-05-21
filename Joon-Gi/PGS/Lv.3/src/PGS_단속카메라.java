import java.util.Arrays;

public class PGS_단속카메라 {
    public static int solution(int[][] routes) {
        // 선택 정렬
        for (int i=0; i<routes.length-1; i++) {
            int min = i;
            for (int j=i+1; j<routes.length; j++) {
                if (routes[j][1]<routes[min][1]) {
                    min = j;
                }
            }
            int[] temp = routes[i];
            routes[i] = routes[min];
            routes[min] = temp;
        }

        // Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));

//        for(int[] route : routes) {
//            for(int i=0; i<2; i++) {
//                System.out.print(route[i] + " ");
//            }
//            System.out.println();
//        }

        // 첫 번째 카메라 설치
        int answer = 1;
        // 첫 번째 차량의 진출 지점에 카메라 설치
        int camerapos = routes[0][1];

        // 나머지 차량들 확인
        for (int i=1; i<routes.length; i++) {
            // 현재 차량의 진입 지점이 마지막 카메라 위치보다 뒤에 있다면
            if (routes[i][0] > camerapos) {
                // 새 카메라 설치
                answer++;
                camerapos = routes[i][1];
            }
            // 현재 차량은 이미 설치된 카메라로 감시 가능하므로 넘어감
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] routes;
        routes = new int[][] {{-20, -15}, {-14, -5}, {-18, -13}, {-5, -3}};

        System.out.println("return: " + solution(routes));
    }
}

