package textbook.Week03;

public class Week03_p208_06 {
    public static void main(String[] args) {
        Card card1 = new Card("Kim");
        Card card2 = new Card("Lee");

        System.out.println(card1.getName()+ "님의 카드 번호는 " + card1.getCardNumber() + "입니다.");
        System.out.println(card2.getName()+ "님의 카드 번호는 " + card2.getCardNumber() + "입니다.");
    }
}

class Card {
    private static int serialNum = 1000;
    private int cardNumber;
    private String name;

    public Card(String name) {
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