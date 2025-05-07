import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        for(int i=0; i<query.length; i++){
            int idx = query[i];
            if(i%2 == 0){
                answer = Arrays.copyOfRange(answer, 0, idx+1);
            }
            else{
                answer = Arrays.copyOfRange(answer, idx, answer.length);
            }
        }
        return answer;
    }
}