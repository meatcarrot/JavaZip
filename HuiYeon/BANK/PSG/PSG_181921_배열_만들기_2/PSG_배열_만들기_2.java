import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        
        ArrayList<Integer> list = new ArrayList<>();
        // add하려면 필요
        
        for (int num = l; num <= r; num++) {
            // 숫자 범위 돌기
            String str = Integer.toString(num);
            //문자열로 만들기
            boolean valid = true;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch != '0' && ch != '5') {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                list.add(num);
            }
        }

        // 없음
        if (list.isEmpty()) return new int[]{-1};

        // 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
