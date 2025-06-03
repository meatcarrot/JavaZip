import java.util.*;

public class PGS_호텔대실 {
    public static int solution(String[][] book_time) {
        int answer = 0;

        int[][] books = new int[book_time.length][2];
        ArrayList<Integer> rooms = new ArrayList<>(); // 방의 수
        // 내부적으로 힙 자료구조를 사용하므로 요소 추가/삭제 시 자동으로 정렬된 상태 유지
        PriorityQueue<Integer> roomsPQ = new PriorityQueue<>();

        // 시간(문자열) -> 정수로 변환
        for (int i = 0; i < book_time.length; i++) {
            for (int j = 0; j < 2; j++) {
                String[] parts = book_time[i][j].split(":");

                int hour = Integer.parseInt(parts[0]);
                int minute = Integer.parseInt(parts[1]);

                // 끝나는 시간에 청소시간 10분 추가
                books[i][j] = j == 0 ? hour * 60 + minute : hour * 60 + minute + 10;
            }
        }

        // 예약을 시작 시간 기준 오름차순 정렬, 같으면 종료 시간 빠른 순
        Arrays.sort(books, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        for (int[] book : books) {
            // 첫번째 방 무조건 추가, 종료시간만 필요
            if (rooms.isEmpty()) {
                rooms.add(book[1]);
                // roomsPQ.offer(book[1]);
            } else {
                // 종료시간 기준으로 방 정렬
                Collections.sort(rooms);

                // 제일 일찍 끝나는 방이 바로 다음 예약보다 일찍 끝남
                // ==> 바로 다음 예약에서 사용이 가능하다는 뜻이므로 그대로 방 씀
                // IDE에선 getFirst 되는데 프로그래머스에선 안 됨
                if (rooms.get(0) <= book[0]) {
                    rooms.set(0, book[1]);
                }
//                if (roomsPQ.peek() <= book[0]) {
//                    // 기존 방 제거
//                    roomsPQ.poll();
//                    // 새 예약으로 업데이트
//                    roomsPQ.offer(book[1]);
//                }
                // 제일 일찍 끝나는 방이 바로 다음 예약보다 늦다면
                // ==> 다음 예약에서 사용이 불가하므로 방 추가
                else {
                    rooms.add(book[1]);
                    roomsPQ.offer(book[1]);
                }
            }
        }

        // 전체 예약이 M개라 했을 때,
        // ArrayList 사용 시, 매번 Collection.sort (O(N log N)) -> O(M * N log N)
        // PriorityQueue 사용 시, peek과 poll O(log N) -> O(M log N)

        answer = rooms.size();

        return answer;
    }

    public static void main(String[] args) {
        String[][] books = {{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};

        System.out.println(solution(books));
    }
}
