import java.util.*;
import java.io.*;

public class CDM_내이름이적힌번호찾기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String[] firstTokens = firstLine.split(" ");
        int n = Integer.parseInt(firstTokens[0]);
        String name = firstTokens[1];

        String secondLine = scanner.nextLine();
        String[] students = secondLine.split(" ");

        int cnt = 0;
        for(String student : students) {
            cnt++;
            if(name.equals(student)) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
