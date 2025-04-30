import java.io.*;
import java.util.*;

public class CDM_가장큰나머지 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int result = 0;

        if((a%5)>=(a%7)) {
            result = (a%5);
        } else {
            result = (a%7);
        }

        System.out.println(result);
    }
}
