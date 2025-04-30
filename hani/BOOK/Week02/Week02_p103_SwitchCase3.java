package Week02;

public class Week02_p103_SwitchCase3 {
    public static void main(String[] args) {
        String medal = "Gold";

        switch (medal) {
            case "Gold" -> System.out.println("금메달"); // 명령문 실행 연산자 : -> 사용
            case "Silver" -> System.out.println("은메달");
            default -> System.out.println("메달이 없습니다.");
        }
    }
}
