public class PGS_동영상재생기 {
    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";

        int videoLenSec = stringToSeconds(video_len);
        int posSec = stringToSeconds(pos); // 현재 위치
        int opStartSec = stringToSeconds(op_start);
        int opEndSec = stringToSeconds(op_end);

        for(String cmd : commands) {
            // 현재 위치가 오프닝에 걸쳐있는지 확인
            if(posSec >= opStartSec && posSec <= opEndSec) {
                posSec = opEndSec;
            }

            if(cmd.equals("prev")) {
                posSec = Math.max(0, posSec - 10);
            } else if(cmd.equals("next")) {
                posSec = Math.min(videoLenSec, posSec + 10);
            }

            // 커맨드 수행 후 오프닝에 걸쳐있는지 다시 확인
            if(posSec >= opStartSec && posSec <= opEndSec) {
                posSec = opEndSec;
            }
        }

        answer = secondsToString(posSec);
        return answer;
    }

    // 입력 받은 시간을 계산하기 쉽게 초로 변환
    public static int stringToSeconds(String s) {
        String[] parts = s.split(":");

        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    // 계산한 초를 마지막에 시간 문자열로 변환
    public static String secondsToString(int i) {
        int mm = i / 60;
        int ss = i % 60;

        return String.format("%02d:%02d", mm, ss);
    }

    public static void main(String[] args) {
        String[] commands = {"prev", "next", "next", "next", "prev", "next", "next"};
        String video_len = "27:25";
        String pos = "02:30";
        String op_start = "02:45";
        String op_end = "07:55";

        String result = solution(video_len, pos, op_start, op_end, commands);

        System.out.println(result);
    }
}
