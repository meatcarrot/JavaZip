class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();

        for (char ch : my_string.toCharArray()) {
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
