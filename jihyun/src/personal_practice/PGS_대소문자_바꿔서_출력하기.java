package personal_practice;
import java.util.Scanner;

public class PGS_대소문자_바꿔서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        char ch;

        for (int i = 0; i < a.length(); i++) {
            ch = a.charAt(i);

            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            }
        }

        System.out.println(result);
    }
}
