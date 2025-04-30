import java.util.*;

public class CDM_등차수열 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);

        for(int i=1; i<n; i++) {
            int t = list.get(i-1) + b;
            list.add(t);
        }

        System.out.println(list.get(n-1));
    }
}
