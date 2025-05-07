package chapter7.q4;
import java.util.ArrayList;

public class Week03_p240_DogTestArrayList {
    public static void main(String[] args) {
        ArrayList<Week03_p239_Dog> list = new ArrayList<Week03_p239_Dog>();
        list.add(new Week03_p239_Dog("동이", "푸들"));
        list.add(new Week03_p239_Dog("뽀삐", "진돗개"));
        list.add(new Week03_p239_Dog("순심이", "삽살개"));
        list.add(new Week03_p239_Dog("철이", "마르티스"));
        list.add(new Week03_p239_Dog("삐쭈", "치와와"));

        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i).showDogInfo());
        }
    }
}
