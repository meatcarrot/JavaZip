class Solution {
    public int solution(int[] array, int height) {
        int sum = 0;
        for(int num : array){
            if (num > height){
                sum += 1;
            }
        }
        return sum;
    }
}