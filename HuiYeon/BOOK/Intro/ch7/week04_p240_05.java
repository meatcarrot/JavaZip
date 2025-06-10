package ch7;

import java.util.ArrayList;

public class week04_p240_05 {
    public static void main(String[] args) {
        ArrayList<Dog> DogList = new ArrayList<Dog>();
        DogList.add(new Dog("골댕이", "골든리트리버"));
        DogList.add(new Dog("골멍이", "골든리트리버"));
        DogList.add(new Dog("골골이", "골든리트리버"));
        DogList.add(new Dog("뼈다귀", "골든리트리버"));
        DogList.add(new Dog("감자탕", "골든리트리버"));

        for (int i = 0; i < DogList.size(); i++ ){
            System.out.println(DogList.get(i).showDogInfo());
        }
        for (Dog Dog : DogList){
            System.out.println(Dog.showDogInfo());
        }
    }
}
