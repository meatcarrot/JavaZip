package textbook.Week01;

public class Week01_p88_08 {
    public static void main(String[] args) {
        int korScore = 88;
        int mathScore = 90;
        int engScore = 70;

        int totalScore = mathScore + engScore + korScore;
        System.out.println(totalScore);

        double avgScore = totalScore / 3.0;
        System.out.printf("%.2f\n", avgScore);

        // System.out.println() : 그냥 값을 출력하고 줄바꿈
        // System.out.printf() : 형식을 지정해서 출력 가능
        System.out.println("🧪 " + Week01_p88_08.class.getSimpleName() + " 실행!");
    }
}
