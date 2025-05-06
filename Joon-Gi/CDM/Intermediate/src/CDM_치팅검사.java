import java.util.*;
import java.io.*;

public class CDM_치팅검사 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int n = input.length();
        boolean isCheated = false;
        String answer = "";

        for(int i=1; i<=n/2; i++) {
            String firstPart = input.substring(0, i);
            String firstPartTarget = input.substring(i, 2*i);

            String secondPart = input.substring(2*i, 2*i+(n/2-i));
            String secondPartTarget = input.substring(2*i+(n/2-i), n);

            if(firstPart.equals(firstPartTarget) && secondPart.equals(secondPartTarget)) {
                answer = input.substring(i, 2*i+(n/2-i)); // first
                isCheated = true;

                break;
            }
        }

        if(isCheated) {
            System.out.println("YES");
            System.out.print(answer);
        } else {
            System.out.print("NO");
        }
    }
}
