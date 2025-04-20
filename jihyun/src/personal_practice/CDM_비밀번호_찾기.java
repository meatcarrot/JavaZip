package personal_practice;

import java.util.*;

public class CDM_비밀번호_찾기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String insert = sc.nextLine();
        char[] arr = insert.toCharArray();

        for (char ch : arr){
            System.out.print(ch);
            if (ch == 'c') break;
        }
        // 파이썬의 for i in arr과 비슷한 문법

        System.out.println();
        System.out.println("🧪 " + CDM_비밀번호_찾기.class.getSimpleName() + " 실행!");
    }
}
// git pull origin main