package textbook.Week02;

public class Week02_p105_ex3 {
    public static void main(String[] args) {

        int month = 13;
        int day = switch(month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> {
                if(month < 1 || month > 12) {
                    System.out.println("없는 달입니다.");
                }
                else {
                    System.out.println("알 수 없는 오류입니다.");
                }
                yield 0;
            }
        };
        // yield 쓰는 이유: switch를 값으로 사용하는 표현식일 때는 각 case에서 반드시 값을 돌려줘야 하기 때문.
        // yield = 0: switch 표현식의 결과값으로 0을 반환 == default -> 0;
        // default -> {} 블록을 사용할 경우 단일 값 0; 불가능 하므로 switch 표현식 전용 리턴 키워드인 yield 선언

        System.out.println(month + "월의 날짜는 " + day + "일까지 있습니다.");

        System.out.println("🧪 " + Week02_p105_ex3.class.getSimpleName() + " 실행!");
    }
}
