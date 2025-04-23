package Chapter03;

public class Week01_p88_08 {
    public static void main(String[] args) {
        int mathScore = 90;
        int engScore = 70;
        int korScore = 60;

        int totalScore = mathScore + engScore + korScore;
        System.out.println("총점: " + totalScore);

        double avgScore = (double)totalScore / (double)3.0F;
        System.out.println("평균: " + avgScore);
    }
}