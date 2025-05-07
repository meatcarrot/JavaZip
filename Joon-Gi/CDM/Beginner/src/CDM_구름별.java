import java.util.Scanner;

public class CDM_구름별 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            System.out.println("**");
        }
    }
}
/*
크기가 2인 구름 별의 모양입니다.
**
 **

다음은 크기가 3인 구름 별의 모양입니다.
**
 **
  **
 */
