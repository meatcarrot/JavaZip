class Solution {
    public String solution(String my_string) {
        String result = "";

        for (char ch : my_string.toCharArray()) {
            
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                result += ch;
            }
        }

        return result;
    }
}
