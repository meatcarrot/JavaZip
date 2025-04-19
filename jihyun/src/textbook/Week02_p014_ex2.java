package textbook;

public class Week02_p014_ex2 {
    public static void main(String[] args) {

        String medal = "Gold";

        String message = switch(medal) {
            case "Gold" -> "금메달입니다.";
            case "Silver" -> "은메달입니다.";
            case "Bronze" -> "동메달입니다.";
            default -> "메달이 없습니다.";
        }; // 세미콜론 필수!
        // message 변수에 메달의 색을 입력하고 조건에 맞는 결과를 출력한다.
        // 이것을 하나의 문장처럼 수행하는 switch-case 표현식이라 한다.
        // 맨 마지막에 식의 끝을 나타내는 ;를 반드시 붙여야 한다.

        System.out.println(message);

        System.out.println("🧪 " + Week02_p014_ex2.class.getSimpleName() + " 실행!");
    }
}
