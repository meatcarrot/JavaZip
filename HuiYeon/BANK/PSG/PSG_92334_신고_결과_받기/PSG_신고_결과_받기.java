import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 메일갯수 
        int[] answer = new int[id_list.length];
        
        // 같은 유저가 동일 인물에 대해서 여러번 신고해도 1회로 인정
        // 신고 내역을 HashSet으로 변환. 중복제거
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        
        // 각각 신고당한 횟수
        Map<String, Integer> reportCount = new HashMap<>();
        
        // 각각 신고한 유저 목록
        // 여러명을 신고할 수 있으므로 리스트
        Map<String, List<String>> userReportMap = new HashMap<>();
        
        // 중복이 없는 신고리스트 순회
        // 신고자, 피신고자 분리
        for (String rep : reportSet) {
            String[] parts = rep.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            
            // 신고당한 횟수 증가
            // getOrDefault -> key가 존재하면 신고 횟수에 1 더함
            // 없다면 key를  default로 0을 가져옴
            // put은 덮어씌우기 때문에 괜찮다
            reportCount.put(reported, reportCount.getOrDefault(reported, 0) + 1);
            
            // 신고한 사람들 저장
            if (!userReportMap.containsKey(reporter)) {
                userReportMap.put(reporter, new ArrayList<>());
            }
            userReportMap.get(reporter).add(reported);
        }
        
        // 정지된 유저 목록
        Set<String> bannedUsers = new HashSet<>();
        
        // 신고당한 횟수 Map을 Set단위로 돌기
        for (Map.Entry<String, Integer> entry : reportCount.entrySet()) {
            if (entry.getValue() >= k) {
                bannedUsers.add(entry.getKey());
            }
        }
        
        // 받은 메일 갯수
        Map<String, Integer> mailCount = new HashMap<>();
        
        // 모든 유저를 돌면서
        for (String reporter : id_list) {
            int count = 0;
            // 신고한 유저 Map의 List를 받아서
            List<String> reportedList = userReportMap.getOrDefault(reporter, Collections.emptyList());
            // 그 유저가
            for (String reported : reportedList) {
                // 정지 유저 목록에 있으면 메일 카운트 증가
                if (bannedUsers.contains(reported)) {
                    count++;
                }
            }
            mailCount.put(reporter, count);
        }
        
        // 배열로 변환
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailCount.getOrDefault(id_list[i], 0);
        }
        
        return answer;
    }
}
