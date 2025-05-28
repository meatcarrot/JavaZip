import java.util.*;

public class PGS_영어끝말잇기 {
    public static int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        Set<String> usedWords = new HashSet<>();
        usedWords.add(words[0]);

        for (int i=1; i<words.length; i++) {
            if ((words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1)) || usedWords.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;

                return answer;
            }

            usedWords.add(words[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        System.out.println("답: " + Arrays.toString(solution(3, words)));
    }
}
