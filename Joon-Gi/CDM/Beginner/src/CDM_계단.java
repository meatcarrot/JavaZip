import java.util.Scanner;

public class CDM_계단 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 0;

        int i = a;
        while(i<b) {
             result++;
             i += 3;
        }

        if(i==b) {
            System.out.println(result);
        } else {
            result = result + (i - b);
            System.out.println(result);
        }
    }
}