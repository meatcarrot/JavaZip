package textbook.Week09.Chapter3_자료구조;

import java.util.Scanner;

public class _002_평균_구하기_P1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int[] array = new int[number];
        int max = 0;
        float sum = 0;

        for(int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();

            if(max < array[i]) max = array[i];
        }

        for(int i = 0; i < number; i++) {
            sum += array[i] / (float)max * 100;
        }

        System.out.println(sum / number);
    }
}
