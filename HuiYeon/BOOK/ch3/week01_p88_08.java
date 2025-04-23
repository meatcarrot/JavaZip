package ch3;

public class test1 {
    public static void main(String[] args){
        int mathScore = 90;
        int engScore = 70;
        int koScore = 100;

        int totalScore = mathScore + engScore + koScore;
        System.out.println(totalScore);

        double avgScore = totalScore / 3.0;
        System.out.println(avgScore);
    }
}
