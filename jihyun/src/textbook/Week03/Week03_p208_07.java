package textbook.Week03;

// 싱글톤이란? 인스턴스를 단 하나만 생성하는 디자인 패턴
// 1. private static으로 클래스 내부에 유일한 인스턴스 생성 (외부에서 인스턴스 생성 못하게)
// 2. 생성자 private 생성 (외부에서 생성자 조작 못하게)
// 3. 외부에서 참조할 수 있는 public static 메서드 만들기
// 4. 싱글톤 객체를 사용하는 코드를 메인에서 만들기

public class Week03_p208_07 {
    public static void main(String[] args) {
        Card_ card1 = new Card_("Kim");
        Card_ card2 = new Card_("Lee");

        System.out.println(card1.getName()+ "님의 카드 번호는 " + card1.getCardNumber() + "입니다.");
        System.out.println(card2.getName()+ "님의 카드 번호는 " + card2.getCardNumber() + "입니다.");

        CardCompany myCompany1 = CardCompany.getInstance();
        CardCompany myCompany2 = CardCompany.getInstance();
        System.out.println(myCompany1 == myCompany2);
    }
}

class CardCompany {
    private static int serialNumber = 1000;
    private int cardNumber;
    private String name;

    // private static CardCompany instance = new CardCompany(); // 즉시 초기화
    private static CardCompany instance;

    private CardCompany () {
    }

    public static CardCompany getInstance() {
        if(instance == null) {
            instance = new CardCompany(); // 지연 초기화
        }
        return instance; // 유일하게 생성한 인스턴스 반환
    }
}

class Card_ {
    private static int serialNum = 1000;
    private int cardNumber;
    private String name;

    public Card_(String name) {
        this.name = name;
        this.cardNumber = serialNum;
        serialNum++;
    }

    public String getName() {
        return name;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}