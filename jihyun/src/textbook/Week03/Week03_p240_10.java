package textbook.Week03;

public class Week03_p240_10 {
    public static void main(String[] args) {
        char[][] alphabets = new char[13][2];
        char ch = 'a';

        for(int i = 0; i < 13; i++) {
            alphabets[i][0] = ch++;
            alphabets[i][1] = ch++;
        }

        for(int i = 0; i < 13; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(alphabets[i][j] + " ");
            }
            System.out.println();
        }
    }
}