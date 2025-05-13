class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n); // Long.toString(n) : Long 타입의 숫자 n 을 문자열로 바꾸는 메서드
        int [] answer = new int[str.length()]; // str 길이만큼 배열 길이 생성

        for(int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(str.length() - 1 -i) - '0';
        }
        // str.charAt(index) : 문자열 str에서 index 위치에 있는 한 글자를 꺼내주는 메서드

        return answer;
    }
}