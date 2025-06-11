package ch6;

class Card {

    public static int serialNum = 1000;
    private int cardNumber;

    Card() {
        serialNum++;
        cardNumber = serialNum;
    }

    public int getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(){
        this.cardNumber = cardNumber;
    }
}


public class week03_p208_06 {
    public static void main(String[] args) {
        Card card1 = new Card();
        System.out.println(card1.getCardNumber());
        Card card2 = new Card();
        System.out.println(card2.getCardNumber());
    }
}
