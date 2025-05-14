package ch7;

public class week04_p240_10 {
    public static void main(String[] args) {
        char[][] alphabets = new char[13][2];
        char ch = 'a';
        for (int i = 0; i < alphabets.length; i++){
            for (int l = 0; l < alphabets[i].length; l++){
                alphabets[i][l] = ch;
                System.out.print(alphabets[i][l]);
                ch++;
            }
            System.out.println();
        }
    }
}
