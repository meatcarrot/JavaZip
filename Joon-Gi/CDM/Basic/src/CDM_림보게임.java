import java.util.*;

public class CDM_림보게임 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] limbos = new int[n];
        int result = 0;
        String s = "";

        for(int i=0; i<n; i++) {
            limbos[i] = scanner.nextInt();
        }

        for(int limbo : limbos) {
            if(limbo<=160) {
                result = limbo;
                s = "I";
                System.out.println(s + " " + result);
                break;
            }
            s = "P";
        }
        if(s.equals("P")) {
            System.out.println(s);
        }
    }
}