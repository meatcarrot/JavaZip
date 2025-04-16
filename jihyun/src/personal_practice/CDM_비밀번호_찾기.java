package personal_practice;

import java.util.*;

public class CDM_비밀번호_찾기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String insert = sc.nextLine();
        String[] arr = insert.split(" ");

        for (String ch : arr){
            System.out.print(ch + " ");
            if (ch.equals("c")) break;
        }
        System.out.println();
        System.out.println("🧪 " + CDM_비밀번호_찾기.class.getSimpleName() + " 실행!");
    }
}
