import java.util.*;

public class CDM_최대공약수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = (a>=b) ? b : a;
        int result = 1;

        scanner.nextLine();

        for(int i=2; i<=n; i++) {
            if((a%i==0) && (b%i==0)) {
                result = i;
            }
        }
        System.out.println(result);
    }
}
