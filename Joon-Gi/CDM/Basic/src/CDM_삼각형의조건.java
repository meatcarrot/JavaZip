import java.util.*;

public class CDM_삼각형의조건 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = a + b + c;
        if((sum==180) && (a>0 && b>0 && c>0)) {
            System.out.println("P");
        } else {
            System.out.println("F");
        }
    }
}