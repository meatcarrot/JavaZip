package personal_practice;
import java.io.*;
import java.util.*;

public class CDM_구름_별 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for(int i = 0; i < a; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("**");
        }

    }
}