// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class Main {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int N = scanner.nextInt();
        scanner.nextLine();
        
        Set<String> wordSet = new HashSet<>();
        
        for(int i=0;i<N;i++) {
            String word = scanner.nextLine();
            wordSet.add(word);
        }
        
        List<String> wordList = new ArrayList<>(wordSet);
        
        // 길이 기준으로 먼저, 길이가 같으면 사전순으로 정렬
        Collections.sort(wordList, (word1, word2) -> {
            if (word1.length() == word2.length()) {
                return word1.compareTo(word2); // 길이가 같으면 사전순으로 정렬
            }
            return Integer.compare(word1.length(), word2.length()); // 길이 기준으로 정렬
        });
        
        // 정렬된 단어 출력
        for (String word : wordList) {
            System.out.println(word);
        }
    }
}
