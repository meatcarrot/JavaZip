package textbook.Week09.Chapter3_자료구조;

import java.io.*;
import java.util.*;

public class _009_DNA_비밀번호_P12891 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int size = Integer.valueOf(st.nextToken());;

        char[] insert = new char[num];
        insert = br.readLine().toCharArray();

        int[] check = new int[4];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 4; i++) {
            check[i] = Integer.valueOf(st.nextToken());
        }

        int[] insert_arr = new int[4];
    }
}
