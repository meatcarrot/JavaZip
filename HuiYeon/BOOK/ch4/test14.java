package ch4;

public class test14 {
    public static void main(String[] args) {

        int dan;
        int times;

        for(dan = 3; dan <=7; dan++){
            for(times = 1; times <=9; times++){
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println();
        }
    }
}
