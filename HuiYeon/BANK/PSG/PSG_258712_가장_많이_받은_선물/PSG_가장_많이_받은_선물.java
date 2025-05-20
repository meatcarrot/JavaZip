import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        int[][] giftMap = new int[n][n]; // i가 j에게 준 선물 수
        
        // 선물지수 계산용
        int[] giftGiven = new int[n]; // 각 사람이 준 선물 수
        int[] giftReceived = new int[n]; // 각 사람이 받은 선물 수
         
        int[] nextMonthGifts = new int[n]; // 다음 달에 받을 선물 수

        //hashmap으로 친구 이름들 매핑
        // 이름을 키로 인덱스를 가져오기
        // muzi -> 0, ryan -> 1
        Map<String, Integer> nameToIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            nameToIndex.put(friends[i], i);
        }

        // 기록 1개 단위로 처리
        for (String record : gifts) {
            String[] parts = record.split(" ");
            
            // 준 사람, 받은사람 인덱스 처리
            int giver = nameToIndex.get(parts[0]);
            int receiver = nameToIndex.get(parts[1]);
            
            // 선물 지수 계산용 
            giftMap[giver][receiver]++;
            
            // 선물 횟수 업데이트
            giftGiven[giver]++;
            giftReceived[receiver]++;
        }

        // 선물 지수 계산
        int[] giftIndex = new int[n];
        for (int i = 0; i < n; i++) {
            // 준 횟수 - 받은 횟수
            giftIndex[i] = giftGiven[i] - giftReceived[i];
        }

        // 다음 달에 받을 선물 계산
        // 2 사람의 관계를 봐야하니까 2중 for문
        for (int i = 0; i < n; i++) { // 친구 i
            for (int j = i + 1; j < n; j++) { // 친구 j
                
                int giveToJ = giftMap[i][j]; // i가 j한테 준 선물 갯수
                int getFromJ = giftMap[j][i]; // j가 i에게 준 선물 갯수
                    
                // 더 많이 줬으면 다음달에 받는다
                if (giveToJ > getFromJ) {
                    nextMonthGifts[i]++;          
                } else if (giveToJ < getFromJ) {
                    nextMonthGifts[j]++;
                } else {
                    // 선물 지수 비교
                    if (giftIndex[i] > giftIndex[j]) {
                        nextMonthGifts[i]++;
                    } else if (giftIndex[i] < giftIndex[j]) {
                        nextMonthGifts[j]++;
                    }
                }
            }
        }

        // 다음달에 가장 많이 받는 선물 수 리턴
        int maxGifts = 0;
        for (int cnt : nextMonthGifts) {
            maxGifts = Math.max(maxGifts, cnt);
        }

        return maxGifts;
    }
}
