package personal_practice;
import java.io.*;
import java.util.*;

public class CDM_계단 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int i;

        for(i = 1; ; i++) {
            if((a += 3) > b)
                break;
        }

        while(a != b) {
            a -= 1;
            i++;
        }

        System.out.println(i);
    }
}