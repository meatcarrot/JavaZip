// 유일한 객체 생성하는 싱글톤 패턴
class CardCompany {
    // 2. static으로 클래스 내부에 유일한 인스턴스 생성
    private static CardCompany instance = new CardCompany();

    // 1. private 생성자 만들기
    private CardCompany() {}

    // 3. 외부에서 참조할 수 있는 public 메소드 만들기
    public static CardCompany getInstance() {
        if(instance == null) {
            instance = new CardCompany();
        }
        return instance;
    }
}

class Card {
    public static int serialNum = 1000;
    public int cardID;
    public String cardName;

    public Card() {
        serialNum++;
        cardID = serialNum;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
}

public class Week03_p208_07 {
    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();

        System.out.println("1번 카드 시리얼: " + card1.cardID);
        System.out.println("2번 카드 시리얼: " + card2.cardID);

        // 유일한 객체인지 확인
        CardCompany company1 = CardCompany.getInstance();
        CardCompany company2 = CardCompany.getInstance();
        System.out.println(company1 == company2);
    }
}
