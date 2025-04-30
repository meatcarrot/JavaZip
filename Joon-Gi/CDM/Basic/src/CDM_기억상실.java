import java.io.IOException;
import java.util.Scanner;

public class CDM_기억상실 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

//        String input = scanner.nextLine();
//        String[] tokens = input.split(" ");
//        ArrayList<Integer> list = new ArrayList<>();
//        for(String token : tokens) {
//            list.add(Integer.parseInt(token));
//        }
//
//        int a = list.get(0);
//        int b = list.get(1);
//        int n = list.get(2);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int result = 0, i = 0;
        
        while(i<n) {
            i += a;
            result++;
            if(i<n){
                i -= b;
            } else {
                break;
            }
        }

        System.out.println(result);
    }
}
