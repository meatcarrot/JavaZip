import java.util.*;

class Dog {
    private String name;
    private String type;

    public Dog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String showDogInfo() {
        return name + ", " + type;
    }
}

public class Week03_p240_05 {
    public static void main(String[] args) {
        Dog[] dogList = new Dog[5];

        dogList[0] = new Dog("Bella", "Bulldog");
        dogList[1] = new Dog("Lucy", "Beagle");
        dogList[2] = new Dog("Cooper", "Beagle");
        dogList[3] = new Dog("Buddy", "Poodle");
        dogList[4] = new Dog("Bailey", "Shih Tzu");

        // for문
        for(int i=0; i<5; i++) {
            System.out.println(dogList[i].showDogInfo());
        }
        // 향상된 for문
        for(Dog dog : dogList) {
            System.out.println(dog.showDogInfo());
        }

        // 5번 문제
        System.out.println("5번 문제");
        List<Dog> dogArrayList = new ArrayList<>();

        dogArrayList.add(new Dog("뭉치", "말티즈"));
        dogArrayList.add(new Dog("초코", "푸들"));
        dogArrayList.add(new Dog("보리", "시바견"));
        dogArrayList.add(new Dog("해피", "웰시코기"));
        dogArrayList.add(new Dog("누렁이", "진돗개"));

        // for문
        for(int i=0; i<dogArrayList.size(); i++) {
            System.out.println(dogArrayList.get(i).showDogInfo());
        }
        // 향상된 for문
        for(Dog dog : dogArrayList) {
            System.out.println(dog.showDogInfo());
        }
    }
}
