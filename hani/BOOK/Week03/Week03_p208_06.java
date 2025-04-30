class Card {
    private int cardNumber;
    private static int serialNum = 10000;

    Card() {
        serialNum++;
        cardNumber = serialNum;
    }
    int getCardNumber() {
        return cardNumber;
    }
    void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}

class cardCompany {
    private static cardCompany instance = new cardCompany();

    private cardCompany() {}
    public static cardCompany getInstance() {
        if(instance == null) {
            instance = new cardCompany();
        }
        return instance;
    }
    public Card createCard() {
        Card card = new Card();
        return card;
    }
}

public class Week03_p208_06 {
    public static void main(String[] args) {
        cardCompany company = cardCompany.getInstance();

        Card myCard = company.createCard();
        Card yourCard = company.createCard();

        System.out.println(myCard.getCardNumber());
        System.out.println(yourCard.getCardNumber());
    }
}
