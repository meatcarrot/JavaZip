package chapter7.q4;

public class Week03_p239_DogTest {
    public static void main(String[] args) {
        Week03_p239_Dog[] dogArray = new Week03_p239_Dog[5];

        dogArray[0] = new Week03_p239_Dog("동이", "푸들");
        dogArray[1] = new Week03_p239_Dog("뽀삐", "진돗개");
        dogArray[2] = new Week03_p239_Dog("순심이", "삽살개");
        dogArray[3] = new Week03_p239_Dog("철이", "마르티스");
        dogArray[4] = new Week03_p239_Dog("삐쭈", "치와와");

        for (int i=0;i<dogArray.length; i++) {
            System.out.println(dogArray[i].showDogInfo());
        }
    }
}
