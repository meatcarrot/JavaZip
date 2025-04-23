package textbook.Week02;

public class Week02_p103_ex1 {
    public static void main(String[] args) {
        String medal = "gold";

        switch(medal){
            case "gold" -> System.out.println("금메달입니다.");
            case "silver" -> System.out.println("은메달입니다.");
            case "bronze" -> System.out.println("동메달입니다.");
            default -> System.out.println("메달이 없습니다.");
        }

        // 원래 switch-case문 쓰려면 case에 항상 break;를 써야 하는데,
        // :대신 ->를 사용하면 break를 쓰지 않아도 된다는 것을 배웠다.
        System.out.println("🧪 " + Week02_p103_ex1.class.getSimpleName() + " 실행!");
    }
}
