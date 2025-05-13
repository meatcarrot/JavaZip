import java.util.Scanner;

public class CDM_주사위의합 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i=1; i<7; i++) {
            if(n-i > 6 || n-i < 1) {
                continue;
            } else {
                System.out.println(i + " " + (n-i));
            }
        }

    }
}
