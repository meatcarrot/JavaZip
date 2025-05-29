import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PGS_서버증설횟수 {
    public static int solution(int[] players, int m, int k) {
        int answer = 0;
        int addServer = 0;
        List<Server> serverList = new ArrayList<>();

        for (int i=0; i<players.length; i++) {
            // 1. 시간 다 돼서 닫아야 할 서버 닫기
            // ConcurrentModificationException 발생 -> 순회하는 컬렉션에 직접 수정을 가해서
//            if (serverList.size() > 0) {
//                for (Server server : serverList) {
//                    if (i == server.getEndTime()) {
//                        serverList.remove(server);
//                    }
//                }
//            }
            Iterator<Server> ir = serverList.iterator();
            while (ir.hasNext()) {
                Server server = ir.next();
                if (i == server.getEndTime()) {
                    ir.remove();
                }
            }

            // 2. 서버 추가
            // quot: 증설될 필요가 있는 서버 개수
            int quot = (int) players[i] / m;
            if (quot > serverList.size()) {
                // addServer: 이번 시간에 증설될 서버 개수 (quot - 이미 증설된 서버 개수)
                addServer = quot - serverList.size();
                // 서버 추가로 증설 횟수 증가
                for (int j=0; j<addServer; j++) {
                    serverList.add(new Server(i, k, answer));
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] players = {0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5};
        int m = 3;
        int k = 5;

        System.out.println("답: " + solution(players, m, k));
    }
}

class Server {
    private int startTime;
    private int endTime;
    private String serverName;

    public Server(int time, int k, int i) {
        this.serverName = i + "번째 서버";
        this.startTime = time;
        this.endTime = this.startTime + k;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return serverName + " " + ", 시작 시간: " + startTime + ", 끝 시간: " + endTime;
    }
}